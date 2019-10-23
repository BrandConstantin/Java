/*
 * Tercera parte. Implementa una aplicación para que lance como máximo 10 number
 * de la aplicación 'array'. El usuario indicará el número de number (respetando el máximo 
 * establecido) y el número de chains a generar cada instancia. La aplicación se llamará 'lanzador'.
 */
package lanzador;

import java.io.*;
import java.util.*;

/**
 *
 * @author brand
 */
public class Lanzador {

	//máximo de instancias.
	final static int MAXINST = 10;
	//Mínimo constante tanto para number como chains.
	final static int MININSTCAD = 1;

	/**
	 * @param number número de number
	 * @param chains número de chains
	 */
	public static void lanzador(int number, int chains) {
		while (number > 0) {
			try {
				// Se lanza el ejecutable.
				Process p = Runtime.getRuntime().exec("java -jar array.jar " + chains);
				
				// Obtiene la salida del programa.
				InputStream inp = p.getInputStream();
				BufferedReader br = new BufferedReader(new InputStreamReader(inp));
				
				// Se lee la primera línea 
				String line = null;
				
				// El bucle es recorrido mientras haya líneas
				while ((line = br.readLine()) != null && !line.isEmpty()) {
					System.out.println(line);
				}//close while.
				
				System.out.println();
				//Resta 1 a las instacias.
				number--;
			} catch (IOException ex) {
				System.err.println("Ha ocurrido un error de Seguridad.");
			}//close try-catch
		}//close while. 
	}//close Lanzador

	/**
	 *
	 * @param args
	 */
	public static void main(String[] args) {
		int number = 0;
		int chains = 0;
		
		switch (args.length) {
			case 0:
				number = readNumber();
				chains = readChain();
				break;
			case 1:
				System.out.println("solo se paso un párametro por comando,"
						+ " será considerado como número de number.");
				number = readNumber(args[0]);
				chains = readChain();
				break;
			case 2:
				System.out.println("Párametros recibidos por comando");
				number = readNumber(args[0]);
				chains = readChain(args[1]);
		}//close switch.

		lanzador(number, chains);
	}//close main.

	/**
	 * lee los datos para la variable cadena y comprueba que sean válidos.
	 *
	 * @return
	 */
	public static int readNumber() {
		Scanner sc = null;
		int number = 0;
		boolean check = false;
		
		do {
			System.out.print("¿Cuantas instancias deseas?	");
			try {
				sc = new Scanner(System.in);
				number = sc.nextInt();

				if (number >= MININSTCAD && number <= MAXINST) {
					check = true;
				} else {
					System.out.println("Error, el número debe ser mayor que 0 "
							+ "y menor o igual que 10.");
				}
			} catch (InputMismatchException e) {
				System.out.println("Error, debe ser un número entero.");
			}//close try-catch.    
		} while (!check);//close do-while.

		return number;
	}//close function.

	/**
	 * lee los datos para la variable instancia y comprueba que sean válidos, si
	 * no son validos los vuelve a pedir.
	 *
	 * @param inst number
	 * @return
	 */
	public static int readNumber(String inst) {
		//en caso de ser nulo o fuera de rango se volvera a pedir el valor. 
		int number = 0;

		try {
			number = Integer.parseInt(inst);
		} catch (NumberFormatException e) {
			System.out.println("Error, debe ser un número entero.");
		}//close try-catch.  
		
		if (number >= MININSTCAD && number <= MAXINST) {
			return number;
		} else {
			System.out.println("Error, el número debe ser mayor que 0 y "
					+ "y menor o igual que 10.");
			return readNumber();
		}
	}//close function.

	/**
	 * lee los datos para la variable cadena y comprueba que sean válidos.
	 *
	 * @return
	 */
	public static int readChain() {
		Scanner sc = null;
		int chains = 0;
		boolean check = false;

		do {
			System.out.print("¿Cuantas cadenas deseas?	");
			try {
				sc = new Scanner(System.in);
				chains = sc.nextInt();

				if (chains >= MININSTCAD) {
					check = true;
				} else {
					System.out.println("Error, el número debe ser mayor que 0");
				}
			} catch (InputMismatchException e) {
				System.out.println("Error, debe ser un número entero.");
			}//close try-catch.

		} while (!check);//close do-while.
		return chains;
	}//close function.

	/**
	 * lee los datos para la variable cadena y comprueba que sean válidos. si no
	 * son validos los vuelve a pedir.
	 *
	 * @param cad chains
	 * @return
	 */
	public static int readChain(String cad) {
		//en caso de ser nulo o fuera de rango se volvera a pedir el valor. 
		int chains = 0;

		try {
			chains = Integer.parseInt(cad);
		} catch (NumberFormatException e) {
			System.out.println("Error, debe ser un número entero.");
		}//close try-catch.

		if (chains >= MININSTCAD) {
			return chains;
		} else {
			System.out.println("Error, el número debe ser mayor que 0");
			return readChain();
		}
	}//close function.

	void Lanzador2() {
		throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
	}
}//close class.
