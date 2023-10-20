package Problem3;

import java.util.Arrays;

public class Problem3Test {

    void sumTest() {
        int[] a = {1, 2, 3};
        int[] b = {1, 2, 3};
        int[] expectedResult = {2, 4, 6};
        int[] unexpectedResult = {5, 6, 7};

        assert Arrays.equals(expectedResult, Problem3.sum(a, b));

        assert !Arrays.equals(unexpectedResult, Problem3.sum(a, b));

    }

    void differenceTest() {
        int[] a = {4, 6, 9, 5};
        int[] b = {1, 2, 3, 4};
        int[] expectedResult = {3, 4, 6, 1};
        int[] unexpectedResult = {5, 7, 7, 7};

        assert Arrays.equals(expectedResult, Problem3.diff(a, b));
        assert !Arrays.equals(unexpectedResult, Problem3.diff(a, b));
    }


    void multiplyTest() {
        int[] a = {1, 2, 3};
        int b = 5;
        int[] expectedProduct = {0, 6, 1, 5};
        int[] unexpectedProduct = {1, 2, 4, 5};

        assert Arrays.equals(expectedProduct, Problem3.multiply(a, b));
        assert !Arrays.equals(unexpectedProduct, Problem3.multiply(a, b));
    }


    void divideTest() {
        int[] a = {4, 6, 9, 5};
        int b = 3;
        int[] expectedResult = {1, 5, 3, 1};
        int[] unexpectedResult = {1, 2, 3, 4};

        assert Arrays.equals(expectedResult, Problem3.div(a, b));
        assert !Arrays.equals(unexpectedResult, Problem3.div(a, b));
    }



}
