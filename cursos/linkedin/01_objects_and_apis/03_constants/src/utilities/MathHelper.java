package utilities;

public class MathHelper {
    public static final int ADD = 1001;
    public static final int SUBTRACT = 1002;

    private int total;

    public MathHelper(int total) {
        this.total += total;
    }

    public int getTotal() {
        return total;
    }

    public int doMath(String prompt, int operation) throws NumberFormatException {
        String input = InputHelper.getInput(prompt);
        int value = Integer.parseInt(input);

        switch (operation) {
            case ADD:
                total += value;
                break;
            case SUBTRACT:
                total -= value;
                break;

        }

        return value;
    }
}
