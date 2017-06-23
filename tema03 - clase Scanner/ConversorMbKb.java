/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema03;

import java.util.Scanner;

/**
 *
 * @author BrandConstantin
 */
public class ConversorMbKb {
    public static void main(String[] args) {
        Scanner t = new Scanner(System.in);
        
        int mb;
        
        System.out.println("Introduce el tamaño de Mb: ");
        mb = t.nextInt();
        
        int kb = mb * 1024;
        
        System.out.println("-----------------------------------------------------");
        System.out.printf("%d Mb == %d Kb\n", mb, kb);
    }
}
