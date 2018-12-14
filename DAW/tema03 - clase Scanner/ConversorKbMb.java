/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema03;

import java.util.Scanner;

/**
 *
 * @author Vindous
 */
public class ConversorKbMb {
    public static void main(String[] args) {
        Scanner t = new Scanner(System.in);
        
        int kb;
        
        System.out.println("Introduce el tamaño de kb: ");
        kb = t.nextInt();
        
        int mb = kb / 1024;
        
        System.out.println("-----------------------------------------------------");
        System.out.printf("%d Kb == %d Mb\n", kb, mb);
    }
}
