/*
 * Escribe un programa que pinte una pirámide rellena con un carácter introdu-
 * cido por teclado que podrá ser una letra, un número o un símbolo como *, +,
 *  -, $, &, etc. El programa debe permitir al usuario mediante un menú elegir si
 * el vértice de la pirámide está apuntando hacia arriba, hacia abajo, hacia la
 * izquierda o hacia la derecha.
 */
package tema04;

import java.util.Scanner;

/**
 *
 * @author BrandConstantin
 */
public class PiramideRellena {
    public static void main(String[] args) {
        Scanner t = new Scanner (System.in);
        
        //System.out.println("Introduce el carácter a dibujar: ");
        String caracter = "@";//t.next();
        int altura = 9;
        String espacios = " ";
        
        System.out.println("Elige la dirección del vertice: ");
        System.out.println("1. Arriba");
        System.out.println("2. Derecha");
        System.out.println("3. Izquierda");
        System.out.println("4. Abajo");
        
        //opcion de dibujar la piramide
        int opcion = t.nextInt();
        
        System.out.println("////////////////////////////////////////");
        
        switch(opcion){
            case 1:
                for (int i = 1; i <= altura; i++) {
                    for (int j = i; j <= 10; j++) {
                        System.out.print(espacios);
                    }

                    for (int j = i; j >= 1; j--) {
                        System.out.print(caracter + " ");
                    }

                    System.out.println(" ");
                } 
                break;
            case 2:
                //la parte de arriba
                for (int i = 1; i <= altura; i++) {          
                    for (int j = i; j > (altura / 2); j--) {
                        System.out.print(caracter + " ");
                    } 

                    System.out.println(" ");         
                }   

                //la parte de abajo
                for (int i = 1; i <= altura; i++) {             
                    for (int j = (altura / 2); j >= i; j--) {
                        System.out.print(caracter + " ");
                    }

                    System.out.println(" ");            
                }   
                break;
            case 3:
                int astericos = 0;

                //la parte de arriba
                for(int i = 0; i <= altura; i++){     
                    for(int j = 0; j < astericos; j++){
                        System.out.print(caracter);
                    }

                    System.out.println("");
                    astericos++;

                    for(int j = altura; j > astericos; j--){
                        System.out.print(" ");
                    }  
                }

                //la parte de abajo                  
                for(int i = 0; i <= altura; i++){     
                    for(int j = 1; j < astericos; j++){
                        System.out.print(caracter);
                    }

                    System.out.println("");
                    astericos--;

                    for(int j = altura; j >= astericos; j--){
                        System.out.print(" ");
                    }  
                }
                break;
            case 4: 
                for (int i = altura; i >= 1; i--) {
                    for (int j = i; j <= 10; j++) {
                        System.out.print(espacios);
                    }

                    for (int j = i; j >= 1; j--) {
                        System.out.print(caracter + " ");
                    }

                    System.out.println(" ");
                }
                break;
        }
    }
}
