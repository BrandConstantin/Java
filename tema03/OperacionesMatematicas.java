/*
 * Escribe un programa que sume, reste, multiplique y divida dos números introducidos por
 * teclado.
 *
 * @author Costy
 */
import java.util.Scanner;
public class OperacionesMatematicas {
    public static void main (String[] args){
        Scanner tecla = new Scanner(System.in);
        
        System.out.print("Introduce el primer numero:");
        int num1 = tecla.nextInt();
        System.out.print("Introduce el segundo numero:");  
        int num2 = tecla.nextInt();
        
        System.out.printf("Operaciones que vamos a hacer con %d y %d\n", num1, num2);
        System.out.print("===================================================\n"); 
        
        System.out.println("Suma:" + num1 + " + " + num2 + " = " + (num1 + num2)); 
        System.out.println("Resta:" + num1 + " - " + num2 + " = " + (num1 - num2)); 
        System.out.println("Multiplicación:" + num1 + " * " + num2 + " = " + (num1 * num2)); 
        System.out.println("División:" + num1 + " / " + num2 + " = " + (double)(num1 / num2)); 
    }
}