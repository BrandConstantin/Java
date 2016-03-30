/*
 * To change this license header, choose License Headers in Project Properties.
 * Desplazar los elementos de un array una posición despues de introducir por 
 * teclado los numeros
 */
package tema.pkg0.d.array;

import java.util.Scanner;

/**
 *
 * @author BrinCo
 */
public class Desplazar_Una_Posicion {
    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);
        
        int c[] = new int[6];
        int ultimo;
        int i;
        
        System.out.println("Desplazar numeros de detras");
        System.out.println("============================================");
        
        for(i = 0; i < 6; i++){
            System.out.println("Introduce número: ");
            c[i] = tec.nextInt();
        }
        
        System.out.println("============================================");
        for(i = 0; i < 6; i++){
            System.out.print(c[i] + " ");
        }
        
        System.out.println("\n============================================");
        //guardamos el ultimo elemento
        ultimo = c[5];
        
        //desplazamos los elementos hacia ultima posición
        //al desplazarlo perdemos el ultimo valor, por esto lo hemos guardado
        for(i = 4; i >= 0; i--){
            c[i + 1] = c[i];
        }
        
        //el ultimo valor pasa a ser primero
        c[0] = ultimo;
        
        //mostrar resultado
        for(i = 0; i < 6; i++){
            System.out.print(c[i] + " ");
        }
    }
}
