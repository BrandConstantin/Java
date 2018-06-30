/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package array_unidimensional;

import java.util.Scanner;

/**
 *
 * @author brand
 */
public class example {
public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);
        
        int a[] = new int[5];
        int b[] = new int[5];
        int c[] = new int[10];
        int i;
        int j = 0;
        int k = 0;
        
        System.out.println("Unir 2 array en un tercero crecientemente");
        System.out.println("============================================");
        
        //I array
        System.out.println("TABLA A");
        for(i = 0; i < a.length; i++){
            System.out.print("Introduce número (de forma ascendente):");
            a[i] = tec.nextInt();
        }
        //II array
        System.out.println("TABLA B");
        for(i = 0; i < b.length; i++){
            System.out.print("Introduce número (de forma ascendente):");
            b[i] = tec.nextInt();
        }
        
        System.out.println("============================================");
        
        //III array
        //fusionamos arrays
        while((i < 5) && (j < 5)){
            if(a[i] < b[j]){
                c[k] = a[i];
                i++;
            }else{
                c[k] = b[j];
                j++;
            }
            k++;
        }
        
        //copiamos el array a en c y el array b en c
        if(i == 5){
            while (j < 5){
                c[k] = b[j];
                j++;
                k++;
            }
        }else{
            while (i < 5){
                c[k] = a[i];
                i++;
                k++;
            }
        }
        
        System.out.println("RESULTADO");
        for(k = 0; k < c.length; k++){
            System.out.print("|_" + c[k] + "_|");
        }
        System.out.println("");
    }    
}
