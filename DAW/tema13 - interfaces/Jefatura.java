package interfaces;

public class Jefatura extends Empleado implements Jefes{ // con la palabra final delante ya no se pueden crear subclases para Jefatura
	public Jefatura(String nombre, double sueldo, int agno, int mes, int dia) {
		super(nombre, sueldo, agno, mes, dia);
	}
	
	public void setIncentivo(double d) {
		incentivo = d;
	}	
	
	public double getIncentivo() {
		return incentivo;
	}

	// método que sobreescribe el metodo de la clase padre getSueldo()
	public double getSueldo() {
		double sueldoJefe = super.getSueldo();
		
		return sueldoJefe + incentivo;
	}
	
	private double incentivo;
	
	public String tomarDecisiones(String decision) {
		return " tomó la decisión de " + decision;
	}
	
	public double estableceBonus(double gratificacion) {
		double prima = 2000;
		return Trabajadores.bonusBase + gratificacion + prima;
	}
	
}
