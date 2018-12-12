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
public class Main {

	/**
	 * @param args the command line arguments
	 */
	public static void main(String[] args) {
		//se crean dos hilos: hrojo y hazul
		Color hrojo = new Color("Rojo");
		Color hazul = new Color("Azul");
		//se inician los hilos para su ejecución
		hrojo.start();
		hazul.start();
	}

}
