/*
 * Escribe un programa que calcule el área de un rectángulo.
 *
 * @author Costy
 */
import java.util.Scanner;
public class AreaRectangulo {
    public static void main (String[] args){
        Scanner tecla = new Scanner(System.in);
        
        System.out.print("CALCULAR EL AREA DEL RECTÁNGULO (calculados en m)\n"); 
        System.out.print("===================================================\n"); 

        System.out.println("Introduce la altura del rectangulo:");
        double altura = tecla.nextDouble();
        System.out.println("Introduce la base del rectangulo:");  
        double base = tecla.nextDouble();
        
        double area = (altura * base);
        
        System.out.printf("El area del rectángulo con %.2f de altura y %.2f de base es %.2f m\n", altura, base, area);
        System.out.print("===================================================\n"); 
    }
}