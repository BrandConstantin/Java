package Practice_3;

import java.util.Scanner;
/*
 * Escriba un programa que tome la base y altura de un triángulo y calcule y muestre la superficie de este utilizando la
 * fórmula a continuación.
 * 
 */
public class Practice_01 {
	public static void main(String[] args) {
		Scanner t = new Scanner(System.in);
		
		System.out.println("Cual es la base: ");
		double base = t.nextDouble();
		System.out.println("Cual es la altura: ");
		double altura = t.nextDouble();
		
		System.out.println("______________________");
		
		double area = (1 / 2.0) * base * altura;
		
		System.out.println("La superficie del triangulo es " + area);
	}
}
