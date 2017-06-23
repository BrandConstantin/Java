/*
 * Escribe un programa que calcule el área de un triángulo.
 */
package tema03;

import java.util.Scanner;

/**
 *
 * @author BrandConstantin
 */
public class AreaTriangulo {
    public static void main(String[] args) {
        Scanner t = new Scanner(System.in);
        
        int base;
        int altura;
        
        System.out.print("Introduce la base del triangulo: ");
        base = t.nextInt();
        System.out.print("Introduce la altura del triangulo: ");
        altura = t.nextInt();
        
        double area = (double)(base * altura) / 2;
        System.out.println("El area del triangulo es de " + area + " cm cuadrados");
    }
}
