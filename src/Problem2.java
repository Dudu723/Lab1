public class Problem2 {

    int findMax(int[] array, int n) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            if (array[i] > max)
                max = array[i];
        }
        return max;
    }

    int findMin(int[] array, int n) {
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < n; i++) {
            if (array[i] < min)
                min = array[i];
        }
        return min;
    }

    int findMaxSum(int[] array, int n) {
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

    int findMinSum(int[] array, int n) {
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
