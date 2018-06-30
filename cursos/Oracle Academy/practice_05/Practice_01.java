package practice_05;

import java.util.Scanner;

public class Practice_01 {
	public static void main(String[] args) {
		Scanner t = new Scanner(System.in);
		
		System.out.println("Introduce un número para ver si es superior a 10");
		int num = t.nextInt();
		
		if(num == 10) {
			System.out.println("Iguales");
		}else {		
			boolean x = num > 10 ? true : false;
			
			System.out.println(x);
		}		
	}
}
