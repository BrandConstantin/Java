package proyecto_seccion_5;

import java.util.Scanner;

import proyecto_seccion_5.Product;

public class ProductTaster {
	public static void main(String[] args) {
		Scanner r = new Scanner(System.in);
		
		//Product prod1 = new Product(1, "Altavoces" , 1200, 600);
		System.out.println("Introduce número producto para inventario: ");
		int numElementos = r.nextInt();
		System.out.println("Introduce nombre producto: ");
		String nombreProd = r.next();
		System.out.println("Introduce números de unidades: ");
		int unidadProd = r.nextInt();
		System.out.println("Introduce precio por unidad: ");
		double precioProd = r.nextDouble();
		
		numElementos = Product.setNumElementos(numElementos);
		System.out.print("Num Inventario: " + Product.setNumElementos(numElementos) + " ");
		
		nombreProd = Product.setNombreProd(nombreProd);
		System.out.print("Nombre: " + Product.setNombreProd(nombreProd) + " \t");
		
		unidadProd = Product.setUnidadProd(unidadProd);
		System.out.print("Unidades: " + Product.setUnidadProd(unidadProd) + " \t");
		
		precioProd = Product.setPrecioUnidad(precioProd);
		System.out.print("Precio/Unidad: " + Product.setPrecioUnidad(precioProd) + "€ \t");
		
		System.out.println("\nValor Producto: " + Product.getValorProducto(unidadProd, precioProd) + "€ ");
	}
}
