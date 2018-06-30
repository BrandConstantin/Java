/*
 *  Escribe un programa que calcule el área de un rectángulo.
 */
package tema03;

import java.util.Scanner;

/**
 *
 * @author BrandConstantin
 */
public class AreaRectangulo {
    public static void main(String[] args) {
        Scanner t = new Scanner(System.in);
        
        int base;
        int altura;
        
        System.out.print("Introduce la base del rectangulo:");
        base = t.nextInt();
        System.out.print("Introduce la altura del rectangulo:");
        altura = t.nextInt();
        
        double area = (double)(base * altura);
        System.out.println("El area del rectangulo es de " + area + " cm cuadrados");
    }
}
