/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg08_hilos_egoistas;

/**
 *
 * @author brand
 */
public class Color extends Thread{
	//clase que extiende a Thread

	String color;

	public Color(String c) {
		color = c;
	}

	public void run() {
		//se imprime 100 veces el valor de: color + i
		for (int i = 1; i <= 10; i++) {
			System.out.println(color + i);
		}
		yield(); //llamada a yield()
	}
}
