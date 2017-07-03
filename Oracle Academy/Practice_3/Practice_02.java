package Practice_3;

import java.util.Scanner;

/*
 * Escriba las siguientes fórmulas matemáticas en Java
 */

public class Practice_02 {
	public static void main(String[] args) {
		Scanner t = new Scanner(System.in);
	
		double x = 4.0;
		double y = 6.2;
		double z = 9.9;
		
		double a = (Math.sqrt(Math.scalb(x, 5) - 6)) / 4;
		System.out.printf("A: %.3f \n", a);
		System.out.println("________________________");
		
		double b = (Math.scalb(x, (int) y)) - (Math.scalb(6, (int) y));
		System.out.printf("B: %.3f \n", b);
		System.out.println("________________________");
		
		double c = 4 * Math.acos(z / 5) - (Math.asin(Math.scalb(x, 2)));
		System.out.printf("C: %.3f \n", c);
		System.out.println("________________________");
		
		double d = (Math.scalb(x, 4)) - (Math.sqrt((6 * x) - (Math.scalb(y, 3))));
		System.out.printf("D: %.3f \n", d);
		System.out.println("________________________");
		
		double e = 1 / (y - (1 / x - (Math.scalb(2, (int) y))));
		System.out.printf("E: %.3f \n", e);
		System.out.println("________________________");
		
		double f = 7 * (Math.acos(Math.sqrt(5 - (Math.asin(Math.sqrt((3 * x) - 4))))));
		System.out.printf("F: %.3f \n", f);
		System.out.println("________________________");
	}
}
