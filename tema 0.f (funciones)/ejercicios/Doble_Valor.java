/*
 * Doblar el valor del parametro pasado por pantalla
 */
package ejercicios;

import java.util.Scanner;

/**
 *
 * @author BrinCo
 */
public class Doble_Valor {
    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);
        
        int num;
        
        System.out.println("Doblar valor");
        System.out.println("···············································");
        System.out.println("Introduce número: ");
        num = tec.nextInt();
        System.out.println("\n·················································");
        funciones.Varias.dobleValor(num);
    }
}
