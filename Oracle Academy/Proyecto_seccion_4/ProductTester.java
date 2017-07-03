package Proyecto_seccion_4;

public class ProductTester {
	public static void main(String[] args) {
		//Product prod6 = new Product();
		//Product prod5 = new Product();
		
		Product prod4 = new Product(4, "Televisores" , 200, 1600);
		Product prod3 = new Product(3, "Ordenadores" , 500, 1000);
		Product prod2 = new Product(2, "Radios" , 20, 60);
		Product prod1 = new Product(1, "Altavoces" , 1200, 600);
		
		System.out.println(prod1);
		System.out.println(" ");
		System.out.println(prod4);
	}
}
