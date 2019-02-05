/*
 * Implementa una aplicación, llamada 'array', que genere cadenas formadas por 
 * caracteres del alfabeto. La cantidad de cadenas será indicada por el usuario al
 * ejecutar la aplicación y su longitud será de 10 caracteres. Las cadenas se deben 
 * escribir en su salida estándar.
 */
package array;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Random;

/**
 *
 * @author brand
 */
public class Array {

	/**
	 * @param args the command line arguments
	 */
	public static void main(String[] args) {
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader bf = new BufferedReader(isr);

		char array[] = new char[26];
		int number;
		int randomCharacter = 0;
		char letter;
		String chain[] = null;

		try {
			try {
				System.out.print("Introduzca cantidad de cadenas: ");
//			number = Integer.parseInt(bf.readLine());
				number = Integer.parseInt(bf.readLine());

				// crear el array con las letras del abecedario
				for (int i = 0; i < 26; i++) {
					array[i] = (char) ('A' + i);
				}

				for (int y = 0; y < number; y++) {
					//saco los 10 caracteres
					for (int i = 0; i < 10; i++) {
						randomCharacter = new Random().nextInt(array.length);
						letter = array[randomCharacter];

						System.out.print(letter);
					}

					//Close the scanner.
					bf.close();
					System.out.println("");
				}

			} catch (IOException ex) {
				System.out.print("Se ha producido un error de E/S.");
			}

		} catch (NumberFormatException ex) {
			System.out.print("Error al leer por teclado, se necesita un número");
		}
	}

}

/*
    public static String creaCad(){
        StringBuilder texto= new StringBuilder();
        //String con el abecedario.
        final String LETRAS = "abcdefghijklmnñopqrstuvwxyz";
        //Instancia para generar números aleatorios.
        SecureRandom rnd = new SecureRandom ();
        //bucle que itera hasta crear unas cadena de 10 letras.
        do{
            texto.append(LETRAS.charAt(rnd.nextInt(LETRAS.length())));
        }while(texto.length() < 10);

        return texto.toString(); 
    }//close function.
 */
