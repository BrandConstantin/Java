package oop;

import javax.swing.*;

public class Uso_Coche {
	public static void main(String[] args) {
		Coche Renault = new Coche();		
		
		System.out.println("Este coche tiene " + Renault.getRuedas() + " ruedas");
		
		Renault.setColor(JOptionPane.showInputDialog("Introduce color: "));
		System.out.println("Este coche tiene el color " + Renault.getColor());
		
		Renault.setColor("rojo");
		System.out.println("Pero lo voy a pintar de color " + Renault.getColor());
		
		Renault.setAsientos_cuerro(JOptionPane.showInputDialog("Tiene asientos de cuerro: "));
		System.out.println(Renault.isAsientos_cuerro() + ".");
		
		Renault.setClimatizador(JOptionPane.showInputDialog("Tiene climatizador: "));
		System.out.println(Renault.isClimatizador());
		
		System.out.println(Renault.datos_generales());
		System.out.println("El precio total del coche es de " + Renault.precioTotal());
	}
}
