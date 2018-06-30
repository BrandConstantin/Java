/*
* Haz un programa que resuelva un triángulo rectángulo conocidos dos de sus valores:
 * Conocidos sus dos catetos, calcular la hipotenusa, el valor de los dos ángulos distintos a 90º, su superficie y su perímetro.
 */
package tema03;

import java.util.Scanner;

/**
 *
 * @author BrandConstantin
 */
public class Triangulo_rectangular {
    public static void main(String[] args) {

        final double PI = 3.1416;
        double hipotenusa;
        double catetoA;
        double catetoB;
        double area;
        double perimetro;
        double anguloA;
        double anguloB;
        double grados;

        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Resolución de un triángulo rectángulo, conocidos sus dos catetos.");
        System.out.println("=================================================================");
        
        do {
            System.out.print("Introduzca el valor del cateto a:");
            catetoA = teclado.nextDouble();
            if (catetoA <= 0) {
                System.err.println("Debe introducir un valor positivo para el cateto.");
            }
        } while (catetoA <= 0);
        
        do {
            System.out.print("Introduzca el valor del cateto b:");
            catetoB = teclado.nextDouble();
            if (catetoB <= 0) {
                System.err.println("Debe introducir un valor positivo para el cateto.");
            }
        } while (catetoB <= 0);

        //con el teorema de pitágoras  calculamos la hipotenusa
        hipotenusa = Math.sqrt((Math.pow(catetoA, 2) + Math.pow(catetoB, 2)));

        //Pasamos a calcular uno de sus ángulos
        anguloA = Math.asin(catetoB / hipotenusa);
        grados = (180 * anguloA) / PI;
        anguloB = (90 - grados);

        //Cálculo del área y perímetro
        area = (catetoA * catetoB) / 2; 
        perimetro = catetoA + catetoB + hipotenusa;

        //Imprimimos por pantalla todos los valores calculados
        System.out.printf("Datos de entrada: cateto a = %.2f . cateto b = %.2f .\n", catetoA, catetoB);
        System.out.printf("La hipotenusa es: %.2f\n", hipotenusa);
        System.out.printf("Uno de sus ángulos es A = %.0f\n", grados);
        System.out.printf("El otro ángulo es B = %.0f\n", anguloB);
        System.out.printf("El valor del área es: %.2f\n", area);
        System.out.printf("Y el perímetro: %.2f\n", perimetro);
    }    
}
