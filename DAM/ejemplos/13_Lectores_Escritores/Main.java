/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg13_lectores_escritores;

/**
 *
 * @author brand
 */
public class Main {

	/**
	 * @param args the command line arguments
	 */
	public static void main(String[] args) {
		Semaforo smfro = new Semaforo();
		//semáforo de control

		//pone 5 lectores a leer y 2 escritores a escribir, controlados por
		//el mismo semáforo
		for (int i = 1; i <= 5; i++) {
			new HiloLector("Lector" + i, smfro).start();
		}

		for (int i = 1; i <= 2; i++) {
			new HiloEscritor("Escritor" + i, smfro).start();
		}
	}

}
