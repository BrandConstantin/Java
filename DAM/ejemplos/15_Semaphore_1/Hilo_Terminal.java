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
public class Hilo_Terminal extends Thread {
//clase derivada de Thread que define un hilo

	private ServidorWeb servidor;
	private Semaphore semaforo;

	public Hilo_Terminal(ServidorWeb s, Semaphore se) {
		this.servidor = s;
		this.semaforo = se;
	}

	@Override
	public void run() {
		//la tarea del hilo es invocar a incrementaCuenta()simulando un acceso
		// al servidor

		for (int i = 1; i <= 10; i++) //se simulan 10 accesos al servidor
		{
			try {
				semaforo.acquire();
				//en cada acceso se adquiere el recurso 
				//y si está ocupado se bloquea
			} catch (InterruptedException ex) {
			}

			servidor.incrementaCuenta();
			//adquirido el recurso, invoca a este método para simular el acceso 
			//al servidor incrementado la cuenta de accesos
			semaforo.release();
			//libera el recurso o permiso
			yield();
		}

	}
}
