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
public class Doblar_Valor {

    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);

        int num;

        System.out.println("Doblar valor");
        System.out.println("···············································");
        System.out.println("Introduce número: ");
        num = tec.nextInt();
        System.out.println("\n·················································");
        functions.Functions.dobleValor(num);
    }
}
