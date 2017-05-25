public class TrainProblem {

    public static int minPlatforms(float[] arr, float[] dep) {
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
        float[] arr = new float[]{9.f, 9.4f, 9.5f, 11.f, 15.f, 18.f};
        float[] dep = new float[]{9.1f, 12f, 11.2f, 11.3f, 19.f, 20.f};

        System.out.println(minPlatforms(arr, dep));
    }
}