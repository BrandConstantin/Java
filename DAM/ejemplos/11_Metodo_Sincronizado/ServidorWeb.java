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
public class ServidorWeb {
	//clase que simula los accesos a un servidor

	private int cuenta;

	public ServidorWeb() {
		cuenta = 0;
	}

	public synchronized void incrementaCuenta() {
		//método sincronizado (monitor)
		System.out.println("hilo " + Thread.currentThread().getName()
				+ "----- Entra en Servidor");
		//muestra le hilo que entra en el método
		cuenta++;
		System.out.println(cuenta + " accesos");
		//cuenta cada acceso al servidor y muestra el número de accesos
	}
}
