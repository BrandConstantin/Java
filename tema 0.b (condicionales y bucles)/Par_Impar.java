/*
 * Leer un numero y mostrar si es par o impar
 * Leer numeros hasta que se introduce un 0
 */
package tema.pkg0.b.condicionales.y.bucles;
import java.util.Scanner;
/**
 *
 * @author BrinCo
 */
public class Par_Impar {

    public static void main(String[] args) {
        Scanner tecla = new Scanner(System.in);
        
        int num;
        
        System.out.println("Introduce un número: ");
        num = tecla.nextInt();
        
        System.out.println("==================================");
        
        while(num != 0){
            if(num % 2 == 0){
                System.out.println("Número par!");
            }else{
                System.out.println("Número impar!");
            }
            
            System.out.println("Introduce otro número: ");
            num = tecla.nextInt();
        }
    }
    
}
