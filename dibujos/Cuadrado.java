/*
 * Dibujar un cuadrado
 */
package dibujos;

import java.util.Scanner;

/**
 *
 * @author BrandConstantin
 */
public class Cuadrado {
    public static void main(String[] args) {
        Scanner tecla = new Scanner(System.in);
        
        int tamanio;
        String caracter;
        int fila;
        int columna;   
        
        System.out.print("Introduce tamaño del cuadrado: ");
        tamanio = tecla.nextInt();
        System.out.print("Introduce carácter a dibujar: ");
        caracter = tecla.next();
        
        for(fila = 1; fila <= tamanio; fila++){
            //System.out.print(caracter);
            
            for(columna = 1; columna <= tamanio; columna++){
                System.out.print(caracter + " ");
            }
            
            System.out.println("");
        }
    }
}
