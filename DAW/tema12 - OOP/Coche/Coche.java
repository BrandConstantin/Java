package oop;

public class Coche {
	// se utiliza private para encapsular los datos
	// no permite que se modifiquen de fuera
	private int ruedas;
	private int largo;
	private int ancho;
	private int motor;
	private int peso;
	
	// propriedades variable 
	String color;
	int peso_total;
	boolean asientos_cuerro, climatizador;
	
	public Coche() {
		ruedas = 4;
		largo = 2000;
		ancho = 400;
		motor = 1600;
		peso = 500;
	}

	// para poder acceder a los datos privados se utilizan los getters y setters
	public void setRuedas(int ruedas) {
		this.ruedas = ruedas;
	}

	public void setLargo(int largo) {
		this.largo = largo;
	}

	public void setAncho(int ancho) {
		this.ancho = ancho;
	}

	public void setMotor(int motor) {
		this.motor = motor;
	}

	public void setPeso(int peso) {
		this.peso = peso;
	}

	public int getRuedas() {
		return ruedas;
	}

	public int getLargo() {
		return largo;
	}

	public int getAncho() {
		return ancho;
	}

	public int getMotor() {
		return motor;
	}

	public int getPeso() {
		return peso;
	}

	// los setters y getters publicos
	public void setColor(String color) {
		this.color = color;
	}

	public void setPeso_total(int peso_total) {
		this.peso_total = peso_total;
	}

	public void setAsientos_cuerro(boolean asientos_cuerro) {
		this.asientos_cuerro = asientos_cuerro;
	}

	public void setClimatizador(boolean climatizador) {
		this.climatizador = climatizador;
	}

	public String getColor() {
		return color;
	}

	public int getPeso_total() {
		return peso_total;
	}

	public boolean isAsientos_cuerro() {
		return asientos_cuerro;
	}

	public boolean isClimatizador() {
		return climatizador;
	}
	
	
}
