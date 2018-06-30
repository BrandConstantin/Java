/*
* 
* Este programa creara una N dandole nosotros la altura por teclado.   
 */
package dibujos;

import java.util.Scanner;

/**
 *
 * @author BrandConstantin
 */
public class Caracter_N {
    public static void main(String[] args) {
        Scanner dato = new Scanner(System.in);

        System.out.println("Introduzca el caracter a dibujar:");
        String caracter = dato.next();
        System.out.println("Que altura tendrá tu letra?");
        int altura = dato.nextInt();

        System.out.println("--------------------------------------------------------------------");
        int i = 0;
        int j = 0;
        int k = 0;
        int l = 0;

        //el palo izquierdo
        for(i = 0; i < altura; i++){
            System.out.print(caracter);

            //los espacios en blanco ante de la barra diagonal
            for (k = 0; k < i; k++){
                System.out.print(" ");
            }

            //la barra diagonal
            System.out.print(caracter);

            //los espacios en blanco despues de la barra diagonal
            for (l = k; l < (altura - 1); l++){
                System.out.print(" ");
            }

            //el palo derecha
            System.out.println(caracter);
        }
    }
}
