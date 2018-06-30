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
public class Es_Primo {
    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);

        int num;
        boolean primo;

        System.out.println("Introduce un número: ");
        num = tec.nextInt();
        System.out.println("\n·················································");
        primo = functions.Functions.numPrimo(num);
    }    
}
