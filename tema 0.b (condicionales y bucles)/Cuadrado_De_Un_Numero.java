/*
 * Leer un numero y mostrar su cuadrado
 * Leer numeros hasta que se introduce un negativo
 */
package tema.pkg0.b.condicionales.y.bucles;
import java.util.Scanner;
/**
 *
 * @author BrinCo
 */
public class Cuadrado_De_Un_Numero {

    public static void main(String[] args) {
        Scanner tecla = new Scanner(System.in);
        
        int num;
        int cuadrado;
        
        System.out.println("Introduce un número positivo: ");
        num = tecla.nextInt();
        
        System.out.println("==================================");
        
        while(num >= 0){
            cuadrado = num * num;
            System.out.println(num + " * " + num + " = " + cuadrado);
            System.out.println("Introduce otro número: ");
            num = tecla.nextInt();
        }
    }
    
}
