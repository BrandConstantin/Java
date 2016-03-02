/*
 * Realiza un programa que calcule el tiempo que tardará en caer un objeto desde una altura
 * h. Aplica la fórmula t = √2hg siendo g = 9:81m/s2
 *
 * @author Costy
 */
import java.util.Scanner;
public class CalcularTiempoCaidaObjeto {
        public static void main (String[] args){
        Scanner tecla = new Scanner(System.in);
        
        System.out.println("CALCULAR TIEMPO CAIDA DE UN OBJETO");
        System.out.println("====================================================");
        
        System.out.println("Dime a cuanto metros de altura esta el objeto:\n");
        int altura = tecla.nextInt();
        
        double g = 9.81;
        double tiempo = Math.sqrt((2 * altura) / g);
        
        System.out.printf("El teimpo de caida del objeto es de %.2f segundos", tiempo);
    }
}
