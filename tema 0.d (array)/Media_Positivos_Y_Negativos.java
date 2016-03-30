/*
 * meter 10 numeros y hacer media positivo, negativos y contar los ceros
 */
package tema.pkg0.d.array;

import java.util.Scanner;

/**
 *
 * @author BrinCo
 */
public class Media_Positivos_Y_Negativos {
    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);
        
        int t[] = new int[10];
        int contarPositivos = 0;
        int contarNegativos = 0;
        int sumaPositivos = 0;
        int sumaNegativos = 0;
        int mediaPositivos = 0;
        int mediaNegativos = 0;
        int contarCeros = 0;

        for(int i = 0; i < 10; i++){
            System.out.println("Introduzca un número: ");
            t[i] = Integer.parseInt(tec.nextLine());
        }
        
        System.out.println("Los numeros introducidos son: ");
        System.out.println("================================");
        
        for(int i = 0; i < t.length; i++){
            System.out.print(t[i] + " ");
        }

        for(int i = 0; i < t.length; i++){
            if(t[i] == 0){
                contarCeros++;
            }else if(t[i] < 0){
                contarNegativos++;
                sumaNegativos += t[i];
            }else{
                contarPositivos++;
                sumaPositivos += t[i];
            }
        }
        
        mediaNegativos = sumaNegativos / contarNegativos;
        mediaPositivos = sumaPositivos / contarPositivos;
        
        System.out.println("\nSe han introducido " + contarCeros + " ceros");
        System.out.println("Se han introducido " + contarNegativos + " numeros negativos");
        System.out.println("Se han introducido " + contarPositivos + " numeros positivos");
        System.out.println("La suma de los negativos es " + sumaNegativos);
        System.out.println("La suma de los positivos es " + sumaPositivos);
        System.out.println("La media de los negativos es " + mediaNegativos);
        System.out.println("La media de los positivos es " + mediaPositivos);
    }
}
