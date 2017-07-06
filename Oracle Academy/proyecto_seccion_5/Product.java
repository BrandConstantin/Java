package proyecto_seccion_5;

public class Product {
	private static int numElementos;
	private String nombreProd;
	private int unidadProd;
	private double precioUnidad;
	
	//constructores
	public Product(int numElementos, String nombreProd, int unidadProd, double precioUnidad) {
		numElementos = numElementos;
		nombreProd = nombreProd;
		unidadProd = unidadProd;
		precioUnidad = precioUnidad;
	}	
	
	//getters
	public static int getNumElementos() {
		return numElementos;
	}

	public String getNombreProd() {
		return nombreProd;
	}

	public int getUnidadProd() {
		return unidadProd;
	}

	public double getPrecioUnidad() {
		return precioUnidad;
	}
	
	//	setters
	public static int setNumElementos(int numElementos) {
		return numElementos = numElementos;
	}

	public static String setNombreProd(String nombreProd) {
		return nombreProd = nombreProd;
	}

	public static int setUnidadProd(int unidadesExistentes) {
		return unidadesExistentes = unidadesExistentes;
	}

	public static double setPrecioUnidad(double precioUnidad) {
		return precioUnidad = precioUnidad;
	}
	
	public String toString() {
		String prod1 = "";
		
		prod1 = " Número Producto: " + getNumElementos() +
				"\n Nombre Producto: " + getNombreProd() +
				"\n Unidades Existente: " + getUnidadProd() + 
				"\n Precio Unidad: " + getPrecioUnidad();
		
		return prod1;
	}
	
	public static double getValorProducto(int unidadProd, double precioUnidad) {
		int unidadProd1 = unidadProd;
		double precioUnidad1 = precioUnidad;
		double valor = unidadProd1 * precioUnidad1;
		
		return valor;
	}
}
