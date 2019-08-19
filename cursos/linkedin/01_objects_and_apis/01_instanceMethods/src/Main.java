import utilities.InputHelper;

public class Main {
    public static void main(String[] args) {

        InputHelper helper = new InputHelper();

        String input = helper.getInput("Enter value 1: ");
        System.out.println("You entered: " + input);
        input = helper.getInput("Enter value 2: ");
        System.out.println("You entered: " + input);
    }
}
