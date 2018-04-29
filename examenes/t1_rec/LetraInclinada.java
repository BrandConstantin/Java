/*
El nuevo partido político Izquierda Hacia la Izquierda nos ha pedido una aplicación que genere su
logotipo. El logotipo de este partido es la letra I inclinada hacia la izquierda. Se debe pedir por teclado
la altura del logotipo. La anchura siempre es de 4 asteriscos.
 */
package t1_rec;

import java.util.Scanner;

/**
 *
 * @author brand
 */
public class LetraInclinada {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Introduce la altura del logotipo: ");
        int altura = teclado.nextInt();

        int espacios = 1;

        for (int i = 0; i < altura; i++) {
            for (int k = 0; k < espacios; k++) {
                System.out.print(" ");
            }            
            System.out.println("####");
            espacios++;
        }
    }
}
