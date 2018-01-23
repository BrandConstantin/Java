package practice_05;

import java.util.Scanner;

public class Practice_03 {
	public static void main(String[] args) {
		Scanner t = new Scanner(System.in);
		
		System.out.println("Cual es tu peso: ");
		double peso = t.nextDouble();
		System.out.println("Escoge un planeta para ver cuanto pesarias alli: ");
		String planeta = t.next().toUpperCase();
		
		System.out.println("-----------------------------------");
		
		double respuesta = 0;
		
		switch(planeta) {
			case "MERCURIO": case "MARTE":
				respuesta = peso * 0.38;
				System.out.println("Tu peso en este planeta es de " + respuesta);
				break;
			case "VENUS": 
				respuesta = peso * 0.91;
				System.out.println("Tu peso en Venus es de " + respuesta);
				break;
			case "JUPITER": 
				respuesta = peso * 2.36;
				System.out.println("Tu peso en Jupiter es de " + respuesta);
				break;
			case "SATURNO": 
				respuesta = peso * 0.92;
				System.out.println("Tu peso en Saturno es de " + respuesta);
				break;
			case "URANO": 
				respuesta = peso * 0.89;
				System.out.println("Tu peso en Urano es de " + respuesta);
				break;
			case "NEPTUNO": 
				respuesta = peso * 1.13;
				System.out.println("Tu peso en Neptuno es de " + respuesta);
				break;
			default: 
				System.out.println("Planeta inexistente!");
				break;
		}
	}
}
