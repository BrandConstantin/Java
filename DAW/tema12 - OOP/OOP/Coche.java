package oop;

public class Coche {
	// se utiliza private para encapsular los datos
	// no permite que se modifiquen de fuera
	private int ruedas;
	private int largo;
	private int ancho;
	private int motor;
	private int peso_plataforma;
	
	// propriedades variable 
	private String color;
	private int peso_total;
	private boolean asientos_cuerro, climatizador;
	
	public Coche() {
		ruedas = 4;
		largo = 2000;
		ancho = 400;
		motor = 1600;
		peso_plataforma = 500;
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

	public void setPeso(int peso_plataforma) {
		this.peso_plataforma = peso_plataforma;
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

	public int getPesoPlataforma() {
		return peso_plataforma;
	}

	// los setters y getters publicos
	public void setColor(String color) {
		this.color = color;
	}

	public String getPeso_total() { // es un setter y getter a la vez
		int peso_caroceria = 500;
		peso_total = peso_plataforma + peso_caroceria;
		
		if(asientos_cuerro == true) {
			peso_total += 50;
		}
		if(climatizador == true) {
			peso_total += 20;
		}
		
		return "peso: " + peso_total;
	}

	public void setAsientos_cuerro(String asientos_cuerro) {
		if(asientos_cuerro.equals("si") || asientos_cuerro.equals("SI")) {
			this.asientos_cuerro = true;
		}else {
			this.asientos_cuerro = false;
		}
	}

	public void setClimatizador(String climatizador) {
		if(climatizador.equalsIgnoreCase("si")) {
			this.climatizador = true;
		}else {
			this.climatizador = false;
		}
	}

	public String getColor() {
		return color;
	}

	public String isAsientos_cuerro() {
		if(asientos_cuerro) {
			return "Coche con asientos de cuerro";
		}else {
			return "Coche sin asientos de cuerro";
		}
	}

	public String isClimatizador() {
		if(climatizador) {
			return "El coche incorpora climatizador";
		}else {
			return "No tiene climatizador.";
		}
	}
	
	public String datos_generales() {
		return "La plataforma del vehiculo tiene " + ruedas + " ruedas. Mide "
				+ largo/1000 + " metros con un ancho de " + ancho + " cm "
						+ "y un peso total de " + getPeso_total() + " kg";
	}
	
	public int precioTotal() {
		int precio_final = 10000;
		
		if(asientos_cuerro == true) {
			precio_final += 2000;
		}
		if(climatizador == true) {
			precio_final += 600;
		}
		
		return precio_final;
	}
	
}
