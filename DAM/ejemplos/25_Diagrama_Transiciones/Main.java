/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg25_diagrama_transiciones;

/**
 *
 * @author brand
 */
public class Main {

	/**
	 * @param args the command line arguments
	 */
	public static void main(String[] args) {
		int estado = 1;

		do {
			switch (estado) {

				case 1:
					flujo_salida.writeUTF("Introduce comando (ls/get/exit)");
					comando = flujo_entrada.readUTF();

					if (comando.equals("ls")) {
						System.out.println("\tEl cliente quiere ver el contenido del directorio");
						// Muestro el directorio

						estado = 1;
						break;
					} else if (comando.equals("get")) {
						// Voy al estado 3 para mostrar el fichero
						estado = 3;
						break;
					} else {
						estado = 1;
					}
					break;

				case 3://voy a mostrar el archivo
					flujo_salida.writeUTF("Introduce el nombre del archivo");
					String fichero = flujo_entrada.readUTF();
					// Muestor el fichero

					estado = 1;
					break;
			}

			if (comando.equals("exit")) {
				estado = -1;
			}
		} while (estado != -1);
	}

}
