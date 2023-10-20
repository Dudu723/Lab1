package Problem2;

public class Problem2Test {

    public void testFindMax() {
        int[] array = {1, 2, 3, 4};
        int n = array.length;
        int expectedResult = 4;
        int incorrectExpectedResult = 2;
        assert Problem2.findMax(array, n) == expectedResult;
        assert Problem2.findMax(array, n) != incorrectExpectedResult;
    }

    void findMinTest() {
        int[] array = {3, 7, 1, 6, 4, 2};
        int n = array.length;


        int expectedMin = 1;
        int result = Problem2.findMin(array, n);
        assert result == expectedMin;


        int incorrectExpectedMin = 5;
        int incorrectResult = Problem2.findMin(array, n);
        assert incorrectResult != incorrectExpectedMin;
    }

    void findMaxSumTest() {
        int[] array = {3, 7, 1, 6, 4, 2};
        int n = array.length;


        int expectedMaxSum = 23;
        int result = Problem2.findMaxSum(array, n);
        assert result == expectedMaxSum;


        int incorrectExpectedMaxSum = 20;
        int incorrectResult = Problem2.findMaxSum(array, n);
        assert incorrectResult != incorrectExpectedMaxSum;
    }

    void findMinSumTest() {
        int[] array = {3, 7, 1, 6, 4, 2};
        int n = array.length;


        int expectedMinSum = 16;
        int result = Problem2.findMinSum(array, n);
        assert result == expectedMinSum;


        int incorrectExpectedMinSum = 20;
        int incorrectResult = Problem2.findMinSum(array, n);
        assert incorrectResult != incorrectExpectedMinSum;
    }


}
