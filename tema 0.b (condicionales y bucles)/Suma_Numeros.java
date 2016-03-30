/*
 * Suma numeros
 */
package tema.pkg0.b.condicionales.y.bucles;
import java.util.Scanner;
/**
 *
 * @author BrinCo
 */
public class Suma_Numeros {

    public static void main(String[] args) {
        Scanner tecla = new Scanner(System.in);
        
        double num;
        double suma = 0;
        
        System.out.println("Introduce numeros para sumar (programa acaba " + 
                "cuando se introduce un 0):");
        System.out.println("==================================");
        
        do{
            System.out.println("Introduce número: ");
            num = tecla.nextDouble();
            System.out.println("==================================");
            
            suma += num;
        }while(num != 0);
        
        System.out.println("La suma de los numeros es " + suma);
    }
    
}
