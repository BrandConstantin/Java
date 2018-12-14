/*
 * Teniendo en cuenta que un ángulo de 360º equivale a 2π radianes, hacer un programa que pida un valor entero de 
 * x grados por pantalla y escriba a cuantos radianes equivale.
 */
package tema03;

import java.util.Scanner;

/**
 *
 * @author BrandConstantin
 */
public class Gradosa_Radianes {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        
        System.out.print("Escriba el número de grados a pasar a radianes: ");
        int grados = lector.nextInt() ;

        float resultado = (float) (2 * Math.PI * grados / 360) ;

        System.out.println("\n" + grados + "º equivalen a: " + resultado + " radianes");
    }    
}
