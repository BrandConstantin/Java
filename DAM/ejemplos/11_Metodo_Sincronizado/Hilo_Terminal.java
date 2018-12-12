/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg11_metodo_sincronizado;

/**
 *
 * @author brand
 */
public class Hilo_Terminal extends Thread {
//clase derivada de Thread que define un hilo

	private ServidorWeb servidor;

	public Hilo_Terminal(ServidorWeb s) {
		this.servidor = s;
	}

	@Override
	public void run() {
		//método que incrementa la cuenta de accesos
		for (int i = 1; i <= 10; i++) //se simulan 10 accesos
		{
			servidor.incrementaCuenta();
			yield();
		}
	}
}
