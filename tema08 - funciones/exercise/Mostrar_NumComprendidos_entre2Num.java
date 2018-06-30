/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package git;

import java.util.Scanner;

/**
 *
 * @author brand
 */
public class Mostrar_NumComprendidos_entre2Num {

    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);

        int a;
        int b;

        System.out.println("Numeros comprendidos entre dos valores");
        System.out.println("···············································");
        System.out.println("Introduce primer número: ");
        a = tec.nextInt();
        System.out.println("Introduce el segundo número: ");
        b = tec.nextInt();
        System.out.println("\n·················································");
        functions.Functions.numComprendidos(a, b);
    }
}
