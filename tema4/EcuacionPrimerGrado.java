/*
 * Realiza un programa que resuelva una ecuación de primer grado (del tipo ax + b = 0).
 *
 * @author Costy
 */
import java.util.Scanner;
public class EcuacionPrimerGrado {
        public static void main (String[] args){
        Scanner tecla = new Scanner(System.in);
        
        System.out.println("ECUACIÓN I GRADO");
        System.out.println("====================================================");
        
        System.out.println("Dime cuanto es el a:");
        int a = tecla.nextInt();
        System.out.println("Dime cuanto es el b:");
        int b = tecla.nextInt();
        
        double x = (double)(0 - b) / a;
        System.out.printf("Según la fórmula \"ax + b = 0\" el resultado es %.2f", x);
    }
}
