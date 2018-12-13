/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg15_semaphore_1;
import java.util.concurrent.Semaphore;

/**
 *
 * @author brand
 */
public class Main {

	/**
	 * @param args the command line arguments
	 */
	public static void main(String[] args) {
		Semaphore semaforo = new Semaphore(1);
		//semáforo para las secciones críticas de esta clase (permisos 1)
		ServidorWeb servidor = new ServidorWeb();
		//crea un objeto ServidorWeb
		Hilo_Terminal hterminal1 = new Hilo_Terminal(servidor, semaforo);
		Hilo_Terminal hterminal2 = new Hilo_Terminal(servidor, semaforo);
		Hilo_Terminal hterminal3 = new Hilo_Terminal(servidor, semaforo);
		Hilo_Terminal hterminal4 = new Hilo_Terminal(servidor, semaforo);
		//Se crean cuatro hilos

		hterminal1.start();
		hterminal2.start();
		hterminal3.start();
		hterminal4.start();
		//se inician los cuatro hilos
	}

}
