/*
* 
*
* @author costy
*/
import java.util.Scanner;

public class CaracterZ {
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);

        System.out.println ("Construie una Z con el caracter que introduces:");
       System.out.print("===================================================================\n");
       
        int altura = 0;
        int posicion = 0;
        
       System.out.println ("Introduce una altura mas grande que 4:");
       altura = teclado.nextInt();
       System.out.println ("Introduce el caracter:");
       String caracter = teclado.next();
       System.out.print("===================================================================\n");
       
       if (altura > 4) {
            for (int i = 1; i <= altura; i++) {
                if (i == 1 || i == altura) {
                    while (posicion < altura) {
                        System.out.print (caracter);
                        posicion++;
                    }
                } else {
                     while (posicion < (altura - i)) {
                         System.out.print (" ");
                         posicion++;
                      }
                     while (posicion == altura - i) {
                        System.out.print (caracter);
                         posicion++;
                     }
               }
                System.out.println ();
                posicion = 0;
            }   
        } else {
            System.err.println ("NO has introducido una altura mas grande que 4!");
       }
    }
}
