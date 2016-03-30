/*
 * Mostrar todos los numeros de 1 al numero introducido
 */
package tema.pkg0.b.condicionales.y.bucles;
import java.util.Scanner;
/**
 *
 * @author BrinCo
 */
public class De_1_a_Num {

    public static void main(String[] args) {
        Scanner tecla = new Scanner(System.in);
        
        int num;
        int x = 0;
        
        System.out.println("Introduce numero para mostrarte todos hasta el:");
        System.out.println("==================================");
        
        System.out.println("Introduce número: ");
        num = tecla.nextInt();
        System.out.println("==================================");
        
        while(x <= num){
            System.out.print(x + " ");
            x++;
        } 
    }
}
