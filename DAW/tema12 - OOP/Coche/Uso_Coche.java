package oop;

public class Uso_Coche {
	public static void main(String[] args) {
		Coche Renault = new Coche();
		
		System.out.println("Este coche tiene " + Renault.getRuedas() + " ruedas");
		
		Renault.setColor("azul");
		System.out.println("Este coche tien el color " + Renault.getColor());
	}
}
