package proyecto_seccion_5;

public class Product {
	private static int numElementos;
	private String nombreProd;
	private int unidadesExistentes;
	private double precioUnidad;
	
	//constructores
	public Product(int nu, String no, int u, double p) {
		numElementos = nu;
		nombreProd = no;
		unidadesExistentes = u;
		precioUnidad = p;
	}	
	
	//getters
	public static int getNumElementos() {
		return numElementos;
	}

	public String getNombreProd() {
		return nombreProd;
	}

	public int getUnidadesExistentes() {
		return unidadesExistentes;
	}

	public double getPrecioUnidad() {
		return precioUnidad;
	}
	
	//	setters
	public static int setNumElementos(int numElementos) {
		return numElementos = numElementos;
	}

	public void setNombreProd(String nombreProd) {
		this.nombreProd = nombreProd;
	}

	public void setUnidadesExistentes(int unidadesExistentes) {
		this.unidadesExistentes = unidadesExistentes;
	}

	public void setPrecioUnidad(double precioUnidad) {
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
