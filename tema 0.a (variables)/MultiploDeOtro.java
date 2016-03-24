/*
 * Pedir un numero y decir si es multiplo de otro
 */
package tema.pkg0.a;
import java.util.Scanner;
/**
 *
 * @author BrinCo
 */
public class MultiploDeOtro {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        int num1;
        int num2;
        
        System.out.print("Introduce un número: ");
        num1 = teclado.nextInt();
        System.out.print("Introduce otro número: ");
        num2 = teclado.nextInt();
        
        if((num1 % num2 == 0)){
            System.out.println("Son multiplos!");
        } else {
            System.out.println("No son múltiplos!");
        }
    }
    
}
