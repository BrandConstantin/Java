/*
 * Sacar los pares e impares de un array. Se trabaja con los valores
 */
package tema.pkg0.d.array;

import java.util.Scanner;

/**
 *
 * @author BrinCo
 */
public class Mostrar_Pares_e_Impares_Valores {
    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);
        
       int f[] = new int[10];
        int i;
        int par[];
        int impar[];
        int contarPares = 0;
        int contarImpares = 0;
        
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

        //contamos los pares e impares
        for(i = 0; i < f.length; i++){
            if(f[i] % 2 == 0){
                contarPares++;
            }else{
                contarImpares++;
            }
        }
        
        //introducimos los pares e impares en array despues de crear los array
        par = new int[contarPares];
        impar = new int[contarImpares];
        
        contarPares = 0;
        contarImpares = 0;
       
       for(i = 0; i < f.length; i++){
            if(f[i] % 2 == 0){
                par[contarPares] = f[i];
                contarPares++;
            }else{
                impar[contarImpares] = f[i];
                contarImpares++;
            }
        }
        
        System.out.println("\nTABLA PARES:");   
        for(i = 0; i < contarPares; i++){
            System.out.print("|_" + par[i] + "_|");
        }
        System.out.println("\nTABLA IMPARES:");   
        for(i = 0; i < contarImpares; i++){
            System.out.print("|_" + impar[i] + "_|");
        }
    }
}
