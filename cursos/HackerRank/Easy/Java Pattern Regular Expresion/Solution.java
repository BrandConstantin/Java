import java.util.Scanner;
class UsernameValidator {
    /*
     * Username consists of 8 to 30 characters inclusive uppercase and lowercase and digits 0-9
     * Username contain alphanumeric characters and anderscores (_)
     * The first character must be a-z | A-Z | 0-9
     */
    public static final String regularExpression = "([a-zA-Z])(\\w){7,29}";
    
}


public class Solution {
    private static final Scanner scan = new Scanner(System.in);
    
    public static void main(String[] args) {
        int n = Integer.parseInt(scan.nextLine());
        while (n-- != 0) {
            String userName = scan.nextLine();

            if (userName.matches(UsernameValidator.regularExpression)) {
                System.out.println("Valid");
            } else {
                System.out.println("Invalid");
            }           
        }
    }
}