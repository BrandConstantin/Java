/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg19_executor;

import java.util.Random;

/**
 *
 * @author brand
 */
public class NumerosAleatorios implements Runnable {

	/**
	 * ************************************************************************
	 * compone una cadena de diez números aleatorios menores que 50, separados
	 * por ','
	 */
	public void run() {

		String strReturn = "";
		Random random = new Random();

		for (int i = 0; i < 10; i++) {
			strReturn += random.nextInt(50) + ", ";
			Thread.yield();
		}

		System.out.println("Números aleatorio obtenidos por "
				+ Thread.currentThread().getName() + ": " + strReturn);
	}
}
