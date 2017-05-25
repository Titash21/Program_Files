public class TrainProblem {

    public static int minPlatforms(int[] arr, int[] dep) {
        int i = 0;
        int j = 0;
        int c = 0;
        int max = c;
        while (i < arr.length && j < dep.length) {
            float min = Math.min(arr[i], dep[j]);
            if (min == arr[i]) {
                i++;
                c++;
                if (c > max) max = c;
            } else if (min == dep[j]) {
                j++;
                c--;
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int[] arr = new int[]{900,957, 940, 950, 1100, 1500, 1800};
        int[] dep = new int[]{910, 1134, 1200, 1120, 1130, 1900, 2000};

        System.out.println(minPlatforms(arr, dep));
    }
}