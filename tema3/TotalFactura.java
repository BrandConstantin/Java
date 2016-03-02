/*
 * Escribe un programa que calcule el área de un triángulo.
 *
 * @author Costy
 */
import java.util.Scanner;
public class TotalFactura {
    public static void main (String[] args){
        Scanner tecla = new Scanner(System.in);
        
        System.out.println("CALCULAR FACTURA"); 
        System.out.println("==================================================="); 
  
        System.out.println("Dime cuanto te costó el producto: ");    
        double prod = tecla.nextDouble();

        System.out.println("El iva es de 21%");
        int iva = (int)(prod * 21) / 100;

        double totalFactura = (double)(iva + prod);
        
        System.out.printf("El total de la factura es de %.2f \n", totalFactura);
        System.out.print("===================================================\n"); 
    }
}