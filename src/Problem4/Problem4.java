package Problem4;

public class Problem4 {

    int findCheapestKeyboard(int[] keyboards) {
        int cheapestKeyboard = Integer.MAX_VALUE;
        for (int i = 0; i < keyboards.length - 1; i++) {
            if (keyboards[i] < cheapestKeyboard)
                cheapestKeyboard = keyboards[i];
        }
        return cheapestKeyboard;
    }

    int findExpensiveDevice(int[] keyboards, int[] usbs) {
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

    int findBudgetUsb(int[] usbs, int budget) {
        int maxBudgetUsb = Integer.MIN_VALUE;
        for (int i = 0; i < usbs.length; i++) {
            if (usbs[i] > maxBudgetUsb)
                if (usbs[i] < budget)
                    maxBudgetUsb = usbs[i];
        }

        return maxBudgetUsb;
    }



}
