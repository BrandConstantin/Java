/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg05_estado_hilo;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author brand
 */
public class Main {

	/**
	 * @param args the command line arguments
	 */
	public static void main(String[] args) {
		Hilo_Auxiliar hilo1 = new Hilo_Auxiliar();
		//Crea un nuevo hilo. El hilo está en estado Nuevo (new)

		System.out.println("Hilo Auxiliar Nuevo: Estado=" + hilo1.getState()
				+ ",¿Vivo? isAlive()=" + hilo1.isAlive());
		//Obtenemos el estado del thread hilo1 y si está vivo o no

		hilo1.start();
		//Inicia el thread hilo1 y pasa al estado Ejecutable

		System.out.println("Hilo Auxiliar Iniciado: Estado="
				+ hilo1.getState()
				+ ",¿Vivo? isAlive()=" + hilo1.isAlive() + "\n");

		try {
			hilo1.join();
			//espera a que el thread hilo1 muera
		} catch (InterruptedException e) {
			System.out.println(e);
		}
		System.out.println("\n Hilo Auxiliar Muerto: Estado="
				+ hilo1.getState()
				+ ",¿Vivo? isAlive()=" + hilo1.isAlive());
	}

}
