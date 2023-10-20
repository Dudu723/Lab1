package Problem3;

public class Problem3 {


    public static int[] sum(int[] a, int[] b) {

        int[] result = new int[a.length + 1];
        int sum, carry = 0;

        for (int i = a.length - 1; i >= 0; i--) {
            sum = a[i] + b[i] + carry;
            result[i] = sum % 10;
            carry = sum / 10;
        }

        result[0] = carry;
        return result;

    }

    public static int[] diff(int[] a, int[] b) {
        int[] result = new int[a.length];
        int diff, carry = 0;

        for (int i = a.length - 1; i >= 0; i--) {
            diff = a[i] - b[i] - carry;
            if (diff < 0) {
                diff += 10;
                carry = 1;
            } else
                carry = 0;

            result[i] = diff;
        }

        return result;
    }


    public static int[] multiply(int[] arr, int nr) {
        int[] result = new int[arr.length];
        int mul, carry = 0;

        for (int i = arr.length - 1; i >= 0; i--) {
            mul = arr[i] * nr + carry;
            result[i] = mul % 10;
            carry = mul / 10;
        }

        return result;
    }


    public static int[] div(int[] arr, int nr) {
        int[] result = new int[arr.length];
        int remainder = 0;

        for (int i = 0; i < arr.length; i++) {
            int current = remainder * 10 + arr[i];
            result[i] = current / nr;
            remainder = current % nr;
        }

        return result;
    }


}
