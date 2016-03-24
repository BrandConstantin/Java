/*
 * Leer un numeros y contarlos
 * Leer numeros hasta que se introduce un 0
 */
package tema.pkg0.b.condicionales.y.bucles;
import java.util.Scanner;
/**
 *
 * @author BrinCo
 */
public class Adivinar_Numero {

    public static void main(String[] args) {
        Scanner tecla = new Scanner(System.in);
        
        int num;
        int numAdivinar = (int)(Math.random() * 100) + 1;
        int intentos = 0;
        
        System.out.println("Adivina el número (de 0 a 100): ");
        num = tecla.nextInt();
        
        System.out.println("==================================");
        
        while(num != numAdivinar){
            if(num > numAdivinar){
                System.out.println("Introduce un número MENOR");
            }else{
                System.out.println("Introduce un número MAYOR");
            }
            
            intentos++; 
            
            System.out.println("Introduce otro número: ");
            num = tecla.nextInt();
            System.out.println("==================================");
        }
        
        System.out.println("Has acertado!! ");
        System.out.println("Necesitaste " + (intentos + 1) + " intentos");
    }
    
}
