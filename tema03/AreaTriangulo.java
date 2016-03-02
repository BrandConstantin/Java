/*
 * Escribe un programa que calcule el área de un triángulo.
 *
 * @author Costy
 */
import java.util.Scanner;
public class AreaTriangulo {
    public static void main (String[] args){
        Scanner tecla = new Scanner(System.in);
        
        System.out.print("CALCULAR EL AREA DEL TRIÁNGULO (calculados en m)\n"); 
        System.out.print("===================================================\n"); 
  
        System.out.println("Dime la base : ");    
        double base = tecla.nextDouble();

        System.out.println("Dime la altura : ");
        double altura = tecla.nextDouble();

        double area = ((base * altura) / 2);
        
        System.out.printf("El area del triángulo con %.2f de altura y %.2f de base es %.2f m\n", altura, base, area);
        System.out.print("===================================================\n"); 
    }
}