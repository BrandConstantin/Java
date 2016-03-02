/*
 * Realiza un programa que pida dos números y que luego muestre el resultado de su
 * multiplicación.
 */

/**
 *
 * @author Costy
 */
import java.util.Scanner;
public class PedirNumeros {
    public static void main (String[] args){
        Scanner tecla = new Scanner(System.in);
        
        System.out.println("Escribe el primer numero: ");
        int num1 = tecla.nextInt();
        System.out.println("Escribe el segundo numero: ");
        int num2 = tecla.nextInt();
        
        System.out.println("El resultado de los dos numeros multiplicados es: " + (num1 * num2));
    }
}
