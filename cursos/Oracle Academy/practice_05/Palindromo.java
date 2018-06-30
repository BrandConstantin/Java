package practice_05;

import java.util.Scanner;

public class Palindromo {
	public static void main(String[] args){	
		Scanner r = new Scanner(System.in);
		
		System.out.println("Introduce una palabra");
		String palabra = r.next();
		
		int primeraPosicion = 0;
		int ultimaPosicion = palabra.length() - 1;
		boolean esPalindromo = true;
		
		while(primeraPosicion < ultimaPosicion) {
			if(palabra.charAt(primeraPosicion) != palabra.charAt(ultimaPosicion)) {
				esPalindromo = false;
				primeraPosicion++;
				ultimaPosicion--;
			}
		}
		
		if(esPalindromo) {
			System.out.println("La palabra es un palindromo");
		}else {
			System.out.println("La palabra NO es un palindromo");
		}
	}
}
