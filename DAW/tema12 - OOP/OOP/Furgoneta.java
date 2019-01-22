package oop;

public class Furgoneta extends Coche {
	private int capacidad_extra;
	private int plazas_extra;
	
	public Furgoneta(int capacidad_extra, int plazas_extra) {
		super(); // llama al constructor de la clase padre
		this.capacidad_extra = capacidad_extra;
		this.plazas_extra = plazas_extra;
	}

	public int getCapacidad_extra() {
		return capacidad_extra;
	}

	public int getPlazas_extra() {
		return plazas_extra;
	}

	public void setCapacidad_extra(int capacidad_extra) {
		this.capacidad_extra = capacidad_extra;
	}

	public void setPlazas_extra(int plazas_extra) {
		this.plazas_extra = plazas_extra;
	}
	
	public String getDatosFurgo() {
		return "La capacidad de carga es " + capacidad_extra + " y las plazas extra de " + plazas_extra;
	}
}
