/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg20_manejadorexcepciones;

import java.util.Random;

/**
 *
 * @author brand
 */
public class Hilo extends Thread{
//clase que implementa el hilo

	//constructor
	public Hilo(String nombre) {
		super(nombre);
	}

	//
	public void run() {
		Random numero = new Random();
		//crea un objeto Random
		int division = 100 / numero.nextInt(4);
		//divide 100 entre el número pseudoaleatorio entre 0 y 4
		System.out.println("Division: " + division);
		//muestra el valor de la división
	}
}
