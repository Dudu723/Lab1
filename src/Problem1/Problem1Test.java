package Problem1;

import java.util.ArrayList;
import java.util.Arrays;

public class Problem1Test {
    public static void insufficientGradesTest() {
        int[] grades = {45, 35, 60, 30, 80};

        ArrayList<Integer> expectedInsufficientGrades = new ArrayList<>(Arrays.asList(35, 30));
        ArrayList<Integer> result = Problem1.insufficientGrades(grades);
        assert result.equals(expectedInsufficientGrades);

        ArrayList<Integer> unexpectedInsufficientGrades = new ArrayList<>(Arrays.asList(45, 60, 80));
        ArrayList<Integer> incorrectResult = Problem1.insufficientGrades(grades);
        assert !incorrectResult.equals(unexpectedInsufficientGrades);
    }

    public static void averageGradeTest() {
        int[] grades = {75, 85, 92, 60, 78};


        int expectedAverage = 78;
        int result = Problem1.averageGrade(grades);
        assert result == expectedAverage;


        int unexpectedAverage = 75;
        int incorrectResult = Problem1.averageGrade(grades);
        assert incorrectResult != unexpectedAverage;
    }

    public static void roundedGradesTest() {
        int[] grades = {43, 57, 69, 77, 85};

        ArrayList<Integer> expectedRoundedGrades = new ArrayList<>(Arrays.asList(45, 57, 70, 77, 85));
        ArrayList<Integer> result = Problem1.roundedGrades(grades);
        assert result.equals(expectedRoundedGrades);

        int[] input = {38, 49, 61, 72, 84};
        ArrayList<Integer> unexpectedRoundedGrades = new ArrayList<>(Arrays.asList(38, 49, 61, 72, 84));
        ArrayList<Integer> incorrectResult = Problem1.roundedGrades(input);
        assert !incorrectResult.equals(unexpectedRoundedGrades);
    }

    public static void maxRoundedGradesTest() {
        int[] grades = {43, 57, 69, 77, 85};

        int result = Problem1.maxRoundedGrades(grades);
        int expectedResult = 85;
        assert result == expectedResult;


        int[] input = {38, 49, 61, 72, 84};
        int unexpectedResult = 20;
        int incorrectResult = Problem1.maxRoundedGrades(input);
        assert unexpectedResult != incorrectResult;

    }


}
