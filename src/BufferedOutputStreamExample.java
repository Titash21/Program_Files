import java.io.BufferedOutputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;

/**
 * Created by TITASH MANDAL on 5/7/2017.
 */
public class BufferedOutputStreamExample {
    public static void main(String[] args) throws Exception {
            ByteArrayOutputStream baos = null;
            BufferedOutputStream bos = null;

            try {

                // create new output streams.
                baos = new ByteArrayOutputStream();
                bos = new BufferedOutputStream(baos);

                // assign values to the byte array
                byte[] bytes = {1, 2, 3, 4, 5};

                // write byte array to the output stream
                bos.write(bytes, 0, 5);

                // flush the bytes to be written out to baos
                bos.flush();

                for (byte b:baos.toByteArray()) {

                    // prints byte
                    System.out.print(b);
                }
            } catch(IOException e) {

                // if any IOError occurs
                e.printStackTrace();
            } finally {

                // releases any system resources associated with the stream
                if(baos!=null)
                    baos.close();
                if(bos!=null)
                    bos.close();
            }
        }
    }

