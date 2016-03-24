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
public class Contar_Numeros {

    public static void main(String[] args) {
        Scanner tecla = new Scanner(System.in);
        
        int num;
        int contador = 0;
        
        System.out.println("Introduce un número: ");
        num = tecla.nextInt();
        
        System.out.println("==================================");
        
        while(num != 0){
            contador += 1;
            
            System.out.println("Introduce otro número: ");
            num = tecla.nextInt();
            System.out.println("==================================");
        }
        
        System.out.println("Se han introducido " + contador + " números");
    }
    
}
