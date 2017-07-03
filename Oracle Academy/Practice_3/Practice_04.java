package Practice_3;

public class Practice_04 {
	public static void main(String[] args) {
		
		int i=5;
		int j=6;
		boolean true_false;
		
		true_false = (j < 5);
		System.out.println("1. " + true_false);
		
		true_false = (j > 3);
		System.out.println("2. " + true_false);
		
		true_false = (j < i);
		System.out.println("3. " + true_false);
		
		true_false = (i < 5);
		System.out.println("4. " + true_false);
		
		true_false = (j <= 5);
		System.out.println("5. " + true_false);
		
		true_false = (6 < 6);
		System.out.println("6. " + true_false);
		
		true_false = (i != j);
		System.out.println("7. " + true_false);
		
		true_false = (i == j || i < 50);
		System.out.println("8. " + true_false);
		
		true_false = (i == j && i < 50);
		System.out.println("9. " + true_false);
		
		true_false = (i > j || true_false && j >= 4);
		System.out.println("10. " + true_false);
		
		true_false = (!(i < 2 && j == 5));
		System.out.println("11. " + true_false);
		
		true_false =! true_false;
		System.out.println("12. " + true_false);
	}
}
