
import numpy as np
import argparse
import imutils
import cv2
import video
import common
from common import anorm2, draw_str
from time import clock
# construct the argument parse and parse the arguments
ap = argparse.ArgumentParser()
ap.add_argument("-v", "--video",
    help="path to the (optional) video file")
ap.add_argument("-b", "--buffer", type=int, default=64,
    help="max buffer size")
args = vars(ap.parse_args())
lower_green = np.array([29,86,6])
upper_green = np.array([64,255,255])

# if a video path was not supplied, grab the reference
# to the webcam
if not args.get("video", False):
    camera = cv2.VideoCapture(0)
if camera.isOpened():
    print "Successful"

# otherwise, grab a reference to the video file
else:
    camera = cv2.VideoCapture(args["video"])

lk_params = dict( winSize  = (15, 15),
                  maxLevel = 2,
                  criteria = (cv2.TERM_CRITERIA_EPS | cv2.TERM_CRITERIA_COUNT, 10, 0.03),
                  minEigThreshold=1e-4)

feature_params = dict( maxCorners = 10,
                       qualityLevel = 0.3,
                       minDistance = 10,
                       blockSize = 25 )

class App:
    def __init__(self, camera):
        self.track_len = 10
        self.detect_interval = 5
        self.tracks = []
        self.cam = video.create_capture()
        self.frame_idx = 0

    def run(self):
        while True:
            ret,frame = self.cam.read()
            frame_gray = cv2.cvtColor(frame, cv2.COLOR_BGR2GRAY)
            frame_hsv=cv2.cvtColor(frame,cv2.COLOR_BGR2HSV)
            vis = frame.copy()

            if len(self.tracks) > 0:
                img0, img1 = self.prev_gray, frame_gray
                p0 = np.float32([tr[-1] for tr in self.tracks]).reshape(-1, 1, 2)
                p1, st, err = cv2.calcOpticalFlowPyrLK(img0, img1, p0, None, **lk_params)
                p0r, st, err = cv2.calcOpticalFlowPyrLK(img1, img0, p1, None, **lk_params)
                d = abs(p0-p0r).reshape(-1, 2).max(-1)
                good = d < 1000
                new_tracks = []
                for tr, (x, y), good_flag in zip(self.tracks, p1.reshape(-1, 2), good):
                    if not good_flag:
                        continue
                    tr.append((x, y))
                    if len(tr) > self.track_len:
                        del tr[0]
                    new_tracks.append(tr)
                self.tracks = new_tracks
                cv2.polylines(vis, [np.int32(tr) for tr in self.tracks], False, (0, 0, 128),2,8)
                draw_str(vis, (200, 200), 'track count: %d' % len(self.tracks))

            if self.frame_idx % self.detect_interval == 0:
                mask = np.zeros_like(frame_gray)
                mask[:] = 255
                mask = cv2.inRange(frame_hsv, lower_green, upper_green)
                mask = cv2.erode(mask, None, iterations=2)
                mask = cv2.dilate(mask, None, iterations=2)

                # find contours in the mask and initialize the current
                # (x, y) center of the ball
                cnts = cv2.findContours(mask.copy(), cv2.RETR_EXTERNAL,cv2.CHAIN_APPROX_SIMPLE)[-2]
                center = None
                xValue=0
                yValue=0
                # only proceed if at least one contour was found
                if len(cnts) > 0:
                # find the largest contour in the mask, then use
                # it to compute the minimum enclosing circle and
                # centroid
                    c = max(cnts, key=cv2.contourArea)
                    ((x, y), radius) = cv2.minEnclosingCircle(c)
                    M = cv2.moments(c)
                    center = (int(M["m10"] / M["m00"]), int(M["m01"] / M["m00"]))
                    print center
                    xcenter=center[0]
                    ycenter=center[1]
                    xValue=xcenter
                    yValue=ycenter
                    cv2.circle(mask, (xcenter, ycenter), 5, 0, -1)
        
                    self.tracks=[]
                    self.tracks.append([(xcenter, ycenter)])
                    

                                    


                # Bitwise-AND mask and original image
                res = cv2.bitwise_and(frame,frame, mask= mask)
                cv2.polylines(res, [np.int32(tr) for tr in self.tracks], False, (0, 255, 0),2,8)
                draw_str(res, (200, 200), 'track count: %d' % len(self.tracks))
                    
                #p = cv2.goodFeaturesToTrack(frame_gray, mask = mask, **feature_params)
                #if p is not None:
                    #for x, y in np.float32(p).reshape(-1, 2):
                #self.tracks.append([(x, y)])


            self.frame_idx += 1
            self.prev_gray = frame_gray
            cv2.imshow('res',res)
            cv2.imshow('lk_track', vis)

            ch = 0xFF & cv2.waitKey(1)
            if ch == 27:
                break

App(camera).run()
cv2.destroyAllWindows()
