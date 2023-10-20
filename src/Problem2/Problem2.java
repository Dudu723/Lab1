package Problem2;

public class Problem2 {

    public  static int findMax(int[] array, int n) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            if (array[i] > max)
                max = array[i];
        }
        return max;
    }

    public static int findMin(int[] array, int n) {
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < n; i++) {
            if (array[i] < min)
                min = array[i];
        }
        return min;
    }

    public static int findMaxSum(int[] array, int n) {
        int min = Integer.MAX_VALUE;
        int sum = 0;

        for (int i = 0; i < n; i++) {
            sum += array[i];
            if (array[i] < min) {
                min = array[i];
            }
        }

        return sum - min;
    }

    public static int findMinSum(int[] array, int n) {
        int max = Integer.MAX_VALUE;
        int sum = 0;

        for (int i = 0; i < n; i++) {
            sum += array[i];
            if (array[i] > max) {
                max = array[i];
            }
        }

        return sum - max;
    }
}
