package practice_05;

import java.util.Scanner;

public class Practice_06 {
	public static void main(String[] args){
		double altura;
		double largo;
		double ancho;
		
		Scanner r = new Scanner(System.in);
		
		System.out.println("Introduce la altura de la habitación: ");
		altura = r.nextDouble();
		System.out.println("Introduce el largo de la habitación: ");
		largo = r.nextDouble();
		System.out.println("Introduce el ancho de la habitación: ");
		ancho = r.nextDouble();
		
		System.out.println("-------------------------------------");
		
		double a = (largo + ancho) / 2;
		double b = a * altura;
		
		System.out.println("La habitación tiene: " + b + " metros cuadrados");
		System.out.println("Que bote de pintura quieres comprar : ");
		System.out.println("1. Tamaño: 5L Precio: 15$ Para: 1500m2");
		System.out.println("2. Tamaño: 1L Precio: 4$ Para: 300m2");
		int respuesta = r.nextInt();
		
		if(respuesta == 1) {
			if(b > 1500) {
				int c = (int)b - 1500;
				System.out.println("Te va a faltar pintura para " + c + " metros cuadrados");
			}else if(b == 1500) {
				System.out.println("Tienes la cantidad optima de pintura!");
			}else {
				int c = (int)(1500 - b);
				System.out.println("Te va a sobrar pintura para " + c + " metros cuadrados");
			}
		}else if(respuesta == 2) {
			if(b > 300) {
				int c = (int)b - 300;
				System.out.println("Te va a faltar pintura para " + c + " metros cuadrados");
			}else if(b == 300) {
				System.out.println("Tienes la cantidad optima de pintura!");
			}else {
				int c = (int)(300 - b);
				System.out.println("Te va a sobrar pintura para " + c + " metros cuadrados");
			}
		}else {
			System.out.println("Opción erronea!");
		}
	}
}
