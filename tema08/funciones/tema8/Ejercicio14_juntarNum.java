/*
 * 
 * Pega dos números para formar uno.
 */
package tema8;

import java.util.Scanner;

/**
 *
 * @author BrinCo
 */
public class Ejercicio14_juntarNum {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Introduce un número");
        long numInicial = teclado.nextInt();
        System.out.println("introduce otro número");
        long numFinal = teclado.nextInt();

        System.out.println("-------------------------------------------------------");


        System.out.println("Los dos número juntos son\n:" + funciones.VariasMate.juntarNumeros(numInicial, numFinal));

  }
}
