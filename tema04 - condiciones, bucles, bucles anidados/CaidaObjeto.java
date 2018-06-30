/*
 * Realiza un programa que calcule el √ tiempo que tardará en caer un objeto desde
* una altura h. Aplica la fórmula t = 2h g siendo g = 9.81m/s
 */
package tema04;

import java.util.Scanner;

/**
 *
 * @author BrandConstantin
 */
public class CaidaObjeto {
    public static void main(String[] args) {
        Scanner t = new Scanner(System.in);
        
        System.out.print("Dime la altura? ");
        int h = t.nextInt();
        
        System.out.println("-------------------------------------");
        
        double g = 9.81;
        double tiempo;
        
        tiempo = Math.sqrt((2 * h) / g);
        
        System.out.printf("El tiempo que tarda el objeto en caer es de %.2f segundos \n", tiempo);
    }
}
