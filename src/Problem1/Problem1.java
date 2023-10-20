package Problem1;

import java.util.ArrayList;

public class Problem1 {

    static ArrayList<Integer> insufficientGrades(int[] grades) {
        ArrayList<Integer> insufficientGradesList = new ArrayList<>();
        for (int i = 0; i < grades.length - 1; i++) {
            if (grades[i] < 40)
                insufficientGradesList.add(grades[i]);
        }

        return insufficientGradesList;
    }

    static int averageGrade(int[] grades) {
        int averageGrade = 0;
        for (int i = 0; i < grades.length - 1; i++) {
            averageGrade += grades[i];
        }

        return averageGrade / grades.length;
    }

    static ArrayList<Integer> roundedGrades(int[] grades) {
        int roundedGrade = 0;
        ArrayList<Integer> roundedGrades = new ArrayList<>();
        for (int i = 0; i < grades.length - 1; i++) {
            if (grades[i] > 38) {
                int difference = grades[i] % 5;
                if (difference >= 3)
                    roundedGrade = grades[i] + (5 - difference);
            }
            roundedGrades.add(roundedGrade);
        }

        return roundedGrades;
    }

    public static int maxRoundedGrades(int[] grades) {
        int roundedGrade = 0;
        ArrayList<Integer> roundedGrades = new ArrayList<>();
        for (int i = 0; i < grades.length - 1; i++) {
            if (grades[i] > 38) {
                int difference = grades[i] % 5;
                if (difference >= 3)
                    roundedGrade = grades[i] + (5 - difference);
            }
            roundedGrades.add(roundedGrade);
        }

        int max = Integer.MIN_VALUE;
        for (int i = 0; i < roundedGrades.size(); i++) {
            if (roundedGrades.get(i) > max)
                max = roundedGrades.get(i);
        }

        return max;
    }
}


