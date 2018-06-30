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
public class Num_DivisoresPrimos {

    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);

        int num;
        int div;

        System.out.println("Divisores primos");
        System.out.println("···············································");
        System.out.println("Introduce un número: ");
        num = tec.nextInt();
        System.out.println("\n·················································");
        div = functions.Functions.numDivisores(num);
        System.out.println("El numero tiene " + div + " divisores");
    }
}
