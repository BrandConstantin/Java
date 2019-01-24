package interfaces;

import java.util.*;

public class Empleado implements Comparable, Trabajadores{
	
	public Empleado(String nombre, double sueldo, int agno, int mes, int dia) {
		super();
		this.nombre = nombre;
		this.sueldo = sueldo;
		this.agno = agno;
		this.mes = mes - 1;
		this.dia = dia;

		GregorianCalendar calendario = new GregorianCalendar(agno, mes, dia);
		altaContrato = calendario.getTime();
	}
	
	public Empleado(String nombre, double sueldo) {
		this.nombre = nombre;
		this.sueldo = sueldo;
	}	
	
	// sobre carga de constructores
	public Empleado(String nombre) {
		//this.nombre = nombre;
		//para crear un objeto con valores por defecto
		//si no se le introducen en el constructor todos los valores
		this(nombre, 45000, 2000, 01, 01);
	}
	
	private String nombre;
	private double sueldo;
	private int agno;
	private int mes;
	private int dia;
	private Date altaContrato;
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public double getSueldo() { // se utiliza final para no poder implementar un método con el mismo nombre en subclases
		return sueldo;
	}
	public void setSueldo(double sueldo) { 
		this.sueldo = sueldo;
	}
	public Date getAltaContrato() {
		return altaContrato;
	}
	public void setAltaContrato(Date altaContrato) {
		this.altaContrato = altaContrato;
	}
	
	public void subeSueldo(double porcentaje) {
		double aumento = sueldo * porcentaje / 100;
		
		sueldo += aumento;
	}
	
	// crear el método compareTo
	public int compareTo(Object miObjecto) {
		Empleado otroEmpleado = (Empleado) miObjecto;
		
		if(this.sueldo < otroEmpleado.sueldo) {
			return -1;
		}
		
		if(this.sueldo > otroEmpleado.sueldo) {
			return 1;
		}
		
		return 0;
	}
	
	public double estableceBonus(double gratificacion) {
		return Trabajadores.bonusBase + gratificacion;
	}
}
