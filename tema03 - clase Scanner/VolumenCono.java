/*
Escribe un programa que calcule el volumen de un cono según la fórmula V =
1
2
3 πr h
 */
package tema03;

import java.util.Scanner;

/**
 *
 * @author BrandConstantin
 */
public class VolumenCono {
    public static void main(String[] args) {
        Scanner t = new Scanner(System.in);
        
        double pi = 3.14;
        int radio;
        int altura;
        
        System.out.println("Introduce el radio: ");
        radio = t.nextInt();
        System.out.println("Introduce la altura: ");
        altura = t.nextInt();
        
        double volumen = (pi * (radio * radio) * (altura)) / 3;
        
        System.out.println("................................................");
        System.out.printf("El volumen del cono con radio %d y altura %d es de %.2f centimetros"
                + " cubicos \n", radio, altura, volumen);
    }
}
