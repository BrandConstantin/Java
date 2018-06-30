package practice_05;

import java.util.Scanner;

public class Practice_02_b {
	public static void main(String[] args) {
		Scanner t = new Scanner(System.in);
		
		System.out.println("Escribe el primer número (coma flotante): ");
		double a = t.nextDouble();
		System.out.println("Escribe el segundo número (coma flotante): ");
		double b = t.nextDouble();
		System.out.println("Escribe el operando: ");
		char caracter = t.next().charAt(0);
		
		System.out.println("-----------------------------------");
		
		double respuesta = 0;
		
		switch(caracter) {
			case '/':
				respuesta = a / b;
				System.out.println(respuesta);
				break;
			case '*':
				respuesta = a * b;
				System.out.println(respuesta);
				break;
			case '-':
				respuesta = a - b;
				System.out.println(respuesta);
				break;
			case '+':
				respuesta = a + b;
				System.out.println(respuesta);
				break;
			default:
				System.out.println("Error");
		}
	}
}
