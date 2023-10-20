package Problem4;

public class Problem4Test {

    public static void findCheapestKeyboardTest() {
        int[] keyboards = {45, 35, 60, 30, 80};

        int expectedCheapest = 30;
        int result = Problem4.findCheapestKeyboard(keyboards);
        assert result == expectedCheapest;

        int unexpectedCheapest = 60;
        int incorrectResult = Problem4.findCheapestKeyboard(keyboards);
        assert incorrectResult != unexpectedCheapest;
    }

    public static void findMostExpensiveDeviceTest() {
        int[] keyboards = {45, 35, 60, 30, 80};
        int[] usbs = {25, 50, 40, 70, 60};

        int expectedMostExpensive = 80;
        int result = Problem4.findMostExpensiveDevice(keyboards, usbs);
        assert result == expectedMostExpensive;

        int unexpectedMostExpensive = 70;
        int incorrectResult = Problem4.findMostExpensiveDevice(keyboards, usbs);
        assert incorrectResult != unexpectedMostExpensive;
    }

    public static void findBudgetUsbTest() {
        int[] usbs = {25, 50, 40, 70, 60};
        int budget = 45;

        int expectedBudgetUsb = 40;
        int result = Problem4.findBudgetUsb(usbs, budget);
        assert result == expectedBudgetUsb;

        int unexpectedBudgetUsb = 25;
        int incorrectResult = Problem4.findBudgetUsb(usbs, budget);
        assert incorrectResult != unexpectedBudgetUsb;
    }

    public static void findMostExpensiveSetInBudgetTest() {
        int[] keyboards = {45, 35, 60, 30, 80};
        int[] usbs = {25, 50, 40, 70, 60};
        int budget = 100;

        int expectedMaxSpend = 95;
        int result = Problem4.findMostExpensiveSetInBudget(keyboards, usbs, budget);
        assert result == expectedMaxSpend;

        int unexpectedMaxSpend = 80;
        int incorrectResult = Problem4.findMostExpensiveSetInBudget(keyboards, usbs, budget);
        assert incorrectResult != unexpectedMaxSpend;
    }
}
