import Problem1.Problem1Test;
import Problem2.Problem2Test;
import Problem3.Problem3Test;
import Problem4.Problem4Test;

public class Main {
    public static void main(String[] args) {
        Problem1Test.insufficientGradesTest();
        Problem1Test.averageGradeTest();
        Problem1Test.roundedGradesTest();

        Problem2Test.findMinTest();
        Problem2Test.findMaxTest();
        Problem2Test.findMaxSumTest();
        Problem2Test.findMinSumTest();

        Problem3Test.differenceTest();
        Problem3Test.divideTest();
        Problem3Test.multiplyTest();
        Problem3Test.sumTest();

        Problem4Test.findBudgetUsbTest();
        Problem4Test.findCheapestKeyboardTest();
        Problem4Test.findMostExpensiveDeviceTest();
        Problem4Test.findMostExpensiveSetInBudgetTest();


        System.out.println("Finished tests");
    }

}




