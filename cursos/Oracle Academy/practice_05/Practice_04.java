package practice_05;

import java.util.Scanner;

public class Practice_04 {
	public static void main(String[] args) {
		Scanner t = new Scanner(System.in);
		
		System.out.println("Que requisito cumples para entrar en la universidad de Mountville tienes que cumplir uno de los siguientes requisitos: ");
		System.out.println("1. Tienes la clasificaci�n m�s alta o la segunda m�s alta de un instituto con m�s de 1400 alumnos?");
		System.out.println("2. Tienes la nota igual o superior a 4.0 y una puntuaci�n SAT igual o superior a 1100?");
		System.out.println("3. Tienes la nota igual o superior a 3.5 y una puntuaci�n SAT igual o superior a 1300?");
		System.out.println("4. Tienes la nota igual o superior a 3.0 y una puntuaci�n SAT igual o superior a 1500?");
		System.out.println("5. Ninguna de las anteriores");
		
		
		int respuesta = t.nextInt();
		
		switch(respuesta) {
			case 1: case 2: case 3: case 4:
				System.out.println("Enhorabuena puedes hacer la m�tricula");
				break;
			case 5:
				System.out.println("Lo sentimos no cumples con nuestros requisitos");
				break;
			default:
				System.out.println("Has introducido una opci�n incorrecta");
				break;
		}
	}
}
