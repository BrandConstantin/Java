/*
 * Escribe un programa que sume, reste, multiplique y divida dos números
 * introducidos por teclado.
 */
package tema03;

import java.util.Scanner;

/**
 *
 * @author BrandConstantin
 */
public class OperacionesMatematicas {
    public static void main(String[] args) {
        Scanner t = new Scanner(System.in);
        
        int suma;
        int resta;
        int multiplica;
        double divide;
        int numUno;
        int numDos;
        
        System.out.println("Introduce I número entero: ");
        numUno = t.nextInt();
        System.out.println("Introduce II número entero: ");
        numDos = t.nextInt();
        
        System.out.println("--------------------------------------------------------------");
        
        suma = numDos + numUno;
        resta = numUno - numDos;
        multiplica = numDos * numUno;
        divide = (double)(numUno / numUno);
        
        System.out.println("Suma : " + suma);
        System.out.println("Resta: " + resta);
        System.out.println("División: " + divide);
        System.out.println("Multiplicación: " + multiplica);
    }
}
