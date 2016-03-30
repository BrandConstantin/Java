/*
 * Dibujar cuadrado
 */
package tema.pkg0.c.bucles.anidados;

import java.util.Scanner;

/**
 *
 * @author BrinCo
 */
public class Dibujo_Cuadrado {
        public static void main(String[] args) {
        Scanner tecla = new Scanner(System.in);
        
        int tamanio;
        String caracter;
        int fila;
        int columna;
        
        System.out.println("Dibujar cuadrado");
        System.out.println("==================================");
        
        System.out.println("Introduce el tamaño del cuadrado: ");
        tamanio = tecla.nextInt();
        System.out.println("Introduce caracter a dibujar: ");
        caracter = tecla.next();
        System.out.println("==================================");
        
        for(fila = 1; fila <= tamanio; fila++){ 
            for(columna = 1; columna <= tamanio; columna++){
                System.out.print(caracter + " ");    
            }
            System.out.println(" ");
        }
    }
}
