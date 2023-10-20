package Problem4;

public class Problem4 {

    static int findCheapestKeyboard(int[] keyboards) {
        int cheapestKeyboard = Integer.MAX_VALUE;
        for (int i = 0; i < keyboards.length - 1; i++) {
            if (keyboards[i] < cheapestKeyboard)
                cheapestKeyboard = keyboards[i];
        }
        return cheapestKeyboard;
    }

    static int findMostExpensiveDevice(int[] keyboards, int[] usbs) {
        int expensiveKeyboard = Integer.MIN_VALUE;
        int expensiveUsb = Integer.MIN_VALUE;

        for (int i = 0; i < keyboards.length; i++) {
            if (keyboards[i] > expensiveKeyboard)
                expensiveKeyboard = keyboards[i];
        }

        for (int i = 0; i < usbs.length; i++) {
            if (usbs[i] > expensiveUsb)
                expensiveUsb = usbs[i];
        }

        if (expensiveKeyboard > expensiveUsb)
            return expensiveKeyboard;
        else
            return expensiveUsb;

    }

    static int findBudgetUsb(int[] usbs, int budget) {
        int maxBudgetUsb = Integer.MIN_VALUE;
        for (int i = 0; i < usbs.length; i++) {
            if (usbs[i] > maxBudgetUsb)
                if (usbs[i] < budget)
                    maxBudgetUsb = usbs[i];
        }

        return maxBudgetUsb;
    }

    static int findMostExpensiveSetInBudget(int[] keyboards, int[] usbs, int budget) {
        int maxSpend = -1;
        for (int i = 0; i < keyboards.length; i++) {
            for (int j = 0; j < usbs.length; j++) {
                int totalCost = keyboards[i] + usbs[j];
                if (totalCost <= budget && totalCost > maxSpend)
                    maxSpend = totalCost;
            }
        }

        return maxSpend;
    }


}
