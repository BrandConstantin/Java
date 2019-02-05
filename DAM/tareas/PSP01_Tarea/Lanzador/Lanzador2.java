/*
 * Tercera parte. Implementa una aplicación para que lance como máximo 10 instancias
 * de la aplicación 'array'. El usuario indicará el número de instancias (respetando el máximo 
 * establecido) y el número de cadenas a generar cada instancia. La aplicación se llamará 'lanzador'.
 */
package lanzador;

import java.lang.Process;
import java.lang.Runtime;
import java.util.Scanner;

/**
 *
 * @author brand
 */
public class Lanzador2 {

	/**
	 * @param args the command line arguments
	 */
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);

		int number = 12;
		int cadenas;

		while (number > 10 || number < 1) {
			System.out.print("Introduzca cantidad de instancias de la aplicación array (menor de 10): ");
			number = teclado.nextInt();
		}

		System.out.print("Indica el número de cadenas a generar: ");
		cadenas = teclado.nextInt();

		for (int k = 0; k < number; k++) {
			//Instancias la clase.
			Lanzador lanzarLanzador = new Lanzador();
			//ejecutas el metodo de la clase.
			lanzarLanzador.Lanzador2();
		}
	}

	public void Lanzador2() {
		String nombreFichero = "";

		Process nuevoProceso;

		try {
			//Obtenemos el nombre del SO
			String osName = System.getProperty("os.name");

			if (osName.toUpperCase().contains("WIN")) { //Windows
				nombreFichero = "C:\\Users\\brand\\Documents\\NetBeansProjects\\array\\dist\\Array.jar";
				nuevoProceso = Runtime.getRuntime().exec("java -jar " + nombreFichero);
			} else {                                      //Linux
				nombreFichero = "/home/brand/NetBeansProjects/array/dist/Array.jar";
				nuevoProceso = Runtime.getRuntime().exec("java -jar " + nombreFichero);
			}

			nuevoProceso = Runtime.getRuntime().exec("java -jar " + nuevoProceso);
			System.out.println(nuevoProceso);
			System.out.println(nombreFichero);
		} catch (SecurityException ex) {
			System.out.println("Ha ocurrido un error de Seguridad."
					+ "No se ha podido crear el proceso por falta de permisos.");
		} catch (Exception ex) {
			System.out.println("Ha ocurrido un error, descripción: "
					+ ex.toString());
		}

	}
}
