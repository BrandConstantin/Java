/*
 * Programa que pida números hasta que uno sea cero. En cada iteración (desde la segunda) debe imprimir la suma 
 * de los dos últimos números.
 *
 * @author costy
 */

import java.util.Scanner;
public class SumaUltimosNumeros {
   
    public static void main(String[] args) {
 
        System.out.println("Escriba un número: ");
        Scanner lector = new Scanner(System.in);
        int primerNumero = lector.nextInt() ;
 
        int numero = -1 ;
        while (numero != 0) {
 
            System.out.println("Escriba otro número: ");
            numero = lector.nextInt() ;
 
            int resultado = primerNumero + numero ;
            System.out.println("Resultado de los dos últimos números es = " + primerNumero + " + " + numero + " = " + resultado);
 
            if (numero != 0)
                primerNumero = numero ;
         }
    }
}