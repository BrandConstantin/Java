/*
 * Sacar los pares e impares de un array. Se trabaja con los indices
 */
package tema.pkg0.d.array;

import java.util.Scanner;

/**
 *
 * @author BrinCo
 */
public class Mostrar_Pares_e_Impares_Indices {
    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);
        
        int f[] = new int[10];
        int i;
        int par[] = new int[10];
        int impar[] = new int[10];;
        
        System.out.println("Sacar pares e impares de un array");
        System.out.println("============================================");
        
        for(i = 0; i < f.length; i++){
            System.out.print("Introduce número: ");
            f[i] = tec.nextInt();
        }
        
        System.out.println("============================================");
        
        for(i = 0; i < f.length; i++){
            System.out.print("|_ " + f[i] + " _|");
        }
      
        System.out.println("\n============================================");

        //copiasmos los vaores en tabla adecuada
        for(i = 0; i < f.length; i += 2){
            par[i/2] = f[i];
        }
        for(i = 1; i < f.length; i += 2){
            impar[i / 2] = f[i];
        }
        
        System.out.println("\nTABLA PARES:");   
        for(i = 0; i < f.length; i++){
            System.out.print("|_" + par[i] + "_|");
        }
        System.out.println("\nTABLA IMPARES:");   
        for(i = 0; i < f.length; i++){
            System.out.print("|_" + impar[i] + "_|");
        }
    }
}
