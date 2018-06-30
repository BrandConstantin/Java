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
public class Num_DivisoresPrimos_enTabla {
    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);
        
        int num = 1;
        int div[] = functions.Functions.divisores(num);
        
        System.out.println("Divisores primos");
        System.out.println("···············································");
        System.out.println("Introduce un número: ");
        num = tec.nextInt();
        System.out.println("\n·················································");
        System.out.println("Los divisores de " + num + " son: ");
        for(int i = 0; i < functions.Functions.divisores(num).length; i++){
            System.out.println("|_" + functions.Functions.divisores(num) + "_|");
        }
        System.out.println();
    }    
}
