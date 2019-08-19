package utilities;

public class MathHelper {
    private int total;

    public int getTotal() {
        return total;
    }

    public int addNumber(String prompt) throws NumberFormatException {
        String input = InputHelper.getInput(prompt);
        int value = Integer.parseInt(input);
        total += value;
        return value;
    }
}
