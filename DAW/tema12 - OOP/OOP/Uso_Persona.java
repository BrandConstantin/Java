package oop;

import java.util.Date;
import java.util.GregorianCalendar;

public class Uso_Persona {
	public static void main(String[] args) {
		Persona[] lasPersonas = new Persona[2];
		
		lasPersonas[0] = new Empleado2("Jesus Vasquez", 50000, 2009, 2, 23);
		lasPersonas[1] = new Alumno("Maria Luisma", "Biologia");
		
		for (Persona persona : lasPersonas) {
			System.out.println(persona.getNombre() + "\t" + persona.getDescripcion());
		}
	}
}

abstract class Persona{
	private String nombre;
	
	public Persona(String nombre) {
		this.nombre = nombre;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public abstract String getDescripcion();
}

class Empleado2 extends Persona{	
	private double sueldo;
	private int agno;
	private int mes;
	private int dia;
	private Date altaContrato;
	private int id;
	private static int addId = 1;
	
	public Empleado2(String nombre, double sueldo, int agno, int mes, int dia) {
		super(nombre);
		this.sueldo = sueldo;
		this.agno = agno;
		this.mes = mes - 1;
		this.dia = dia;
		id = addId;
		addId++;

		GregorianCalendar calendario = new GregorianCalendar(agno, mes, dia);
		altaContrato = calendario.getTime();
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
	
	public String getDescripcion() {
		return "Este empleado tiene el id: " + id + " y un sueldo " + sueldo;
	}
}

class Alumno extends Persona{
	private String carrera;
	
	public Alumno(String nombre, String carrera) {
		super(nombre);
		this.carrera = carrera;
	}
	
	public String getDescripcion() {
		return "Este alumno esta estudiando " + carrera;
	}
}
