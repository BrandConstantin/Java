package tema03;

/**
 *
 * @author BrandConstantin
 *
 * Calcula el área del trapecio sabiendo que es igual a la suma de sus dos bases, multiplicado por la altura, y dividido por dos.
 */
import java.util.Scanner;
public class Area_Trapecio {    
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        
        System.out.println("Escriba el valor de la primera base: ");
        float base1 = lector.nextFloat() ;
        System.out.println("Escriba el valor de la segunda base: ");
        float base2 = lector.nextFloat() ;
        System.out.println("Escriba el valor de la altura: ");
        float h = lector.nextFloat() ;
        System.out.println("================================================================");

        float area = ((base1 + base2) * h)/2 ;
       
        System.out.println("El área del trapecio es: " + area);
    }
}