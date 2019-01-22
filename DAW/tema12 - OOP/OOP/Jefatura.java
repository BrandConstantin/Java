package oop;

public class Jefatura extends Empleado{
	public Jefatura(String nombre, double sueldo, int agno, int mes, int dia) {
		super(nombre, sueldo, agno, mes, dia);
	}
	
	public void estableceIncentivo(double d) {
		incentivo = d;
	}
	
	// método que sobreescribe el metodo de la clase padre getSueldo()
	public double getSueldo() {
		double sueldoJefe = super.getSueldo();
		
		return sueldoJefe + incentivo;
	}
	
	private double incentivo;
	
	
}
