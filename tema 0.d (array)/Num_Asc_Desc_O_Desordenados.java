/*
 * To change this license header, choose License Headers in Project Properties.
 * Leer 10 numeros y decir si están ordenados ascendentes, descendentes o 
 * desordenados
 */
package tema.pkg0.d.array;

import java.util.Scanner;

/**
 *
 * @author BrinCo
 */
public class Num_Asc_Desc_O_Desordenados {
    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);
        
        int a[] = new int[10];
        int i;
        boolean asc = true;
        boolean desc = true;
        
        System.out.println("Decir de que forma esta los números ordenados");
        System.out.println("============================================");
        
        for(i = 0; i < 10; i++){
            System.out.println("Introduce número: ");
            a[i] = tec.nextInt();
        }
        
        for(i = 0; i < 9; i++){
            if(a[i] > a[i + 1]){
                asc = false;
            }else if(a[i] < a[i + 1]){
                desc = false;
            }else{
                asc = desc;
            }
        }
        
        if(asc == true && desc == false){
            System.out.println("CRECIENTE");
        }else if(asc == false && desc == true){
            System.out.println("DESCRECIENTE");
        }else if(asc == false && desc == false){
            System.out.println("DESORDENADOS");
        }else if(asc == true && desc == true){
            System.out.println("IGUALES");
        }
    }
}
