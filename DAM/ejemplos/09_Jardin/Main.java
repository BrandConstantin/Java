/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg09_jardin;

/**
 *
 * @author brand
 */
public class Main {

	/**
	 * @param args the command line arguments
	 */
	public static void main(String[] args) {
		RecursoJardin jardin = new RecursoJardin();
		//crea un objeto RecursoJardín

		for (int i = 1; i <= 10; i++) {
			(new Entra_Jardin("Entra" + i, jardin)).start();
		}//entrada de 10 hilos al jardín

		for (int i = 1; i <= 15; i++) {
			(new Sale_Jardin("Sale" + i, jardin)).start();
		}//salida de 15 hilos al jardín
	}

}
