package oop;

import java.util.*;

public class Empleado {
	
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
	public double getSueldo() {
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
}
