/*
 * Tabla multiplicar
 */
package tema.pkg0.b.condicionales.y.bucles;
import java.util.Scanner;

/**
 *
 * @author BrinCo
 */
public class Tabla_Multiplicar {
    public static void main(String[] args) {
        Scanner tecla = new Scanner(System.in);

        int num;
        int x;
        
        System.out.println("Tabla multiplicar");    
        System.out.println("Introduce un numero:");
        System.out.println("==================================");
        
        num = tecla.nextInt();
        for(int i = 1; i <= 10; i++){           
            System.out.println(num + " * " + i + " = " + (num * i));
        }
    }
}
