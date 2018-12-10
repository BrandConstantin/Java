/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg05_estado_hilo;

/**
 *
 * @author brand
 */
public class Hilo_Auxiliar extends Thread {
//código del hilo

	@Override
	public void run() {
		for (int i = 10; i >= 1; i--) {
			System.out.print(i + ",");
		}
	}
}
