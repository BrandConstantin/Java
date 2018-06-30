package Proyecto_seccion_4;

public class Product {
	private int numElementos;
	private String nombreProd;
	private int unidadesExistentes;
	private int precioUnidad;
	
	//constructores
	public Product(int nu, String no, int u, int p) {
		numElementos = nu;
		nombreProd = no;
		unidadesExistentes = u;
		precioUnidad = p;
	}	
	
	//getters
	public int getNumElementos() {
		return numElementos;
	}

	public String getNombreProd() {
		return nombreProd;
	}

	public int getUnidadesExistentes() {
		return unidadesExistentes;
	}

	public int getPrecioUnidad() {
		return precioUnidad;
	}
	
	//	setters
	public void setNumElementos(int numElementos) {
		this.numElementos = numElementos;
	}

	public void setNombreProd(String nombreProd) {
		this.nombreProd = nombreProd;
	}

	public void setUnidadesExistentes(int unidadesExistentes) {
		this.unidadesExistentes = unidadesExistentes;
	}

	public void setPrecioUnidad(int precioUnidad) {
		this.precioUnidad = precioUnidad;
	}
	
	public String toString() {
		String prod1 = "";
		
		prod1 = " Número Producto: " + getNumElementos() +
				"\n Nombre Producto: " + getNombreProd() +
				"\n Unidades Existente: " + getUnidadesExistentes() + 
				"\n Precio Unidad: " + getPrecioUnidad();
		
		return prod1;
	}
}
