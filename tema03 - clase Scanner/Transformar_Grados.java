package tema03;

/*
 *  Haz un programa que lea una cantidad de grados centígrados y la pase a grados Fahrenheit, mostrando
 * convenientemente el resultado con un mensaje en pantalla.
 * La fórmula correspondiente es: F = 32 + ( 9 * C / 5) 
 *
 * @author BrandConstantin
 */
import java.util.Scanner;
public class Transformar_Grados {
 
    public static void main(String[] args) {
        
        float grados;
        float resultado;
 
        Scanner teclado = new Scanner( System.in );
        System.out.println("Conversión de grados Celcius en grados Fahrenheit.");
        System.out.println("=================================================="); 
        System.out.print ("Introduzca los grados:");
        grados = teclado.nextFloat();
       
        resultado = 32 + ((9*grados)/5);
        System.out.printf ("%.2f Grados Celsius corresponden a %.2f Grados Fahrenheit \n", grados ,resultado);
    }
}
