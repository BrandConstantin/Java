/**
 *
 * @author costy
 *
 */
import java.util.Scanner;

public class ArbolNavidad {
    public static void main(String[] args) {
        
        Scanner datos = new Scanner(System.in);

        System.out.print("Introduzca la altura del arbol:\n ");
        int alturaIntrod = datos.nextInt();
        System.out.print("Dibuja bombillas en el arbol:\n");
        String bombilla = datos.next();
        System.out.print("===================================================================\n");
        
        int altura = 1;
        int espacio = (alturaIntrod - 1);
        int x;
        int espacioInterno = 0;
        int numero;

        while (altura < alturaIntrod) {

            for (x = 1; x <= espacio; x++)
            System.out.print(" ");
             System.out.print("#");

            for (x = 1; x < espacioInterno; x++) {
                numero = (int)(Math.random() * espacioInterno);
                if (numero == (int)(Math.random() * espacioInterno) + 1) {
                    System.out.print(bombilla);
                } else {
                   System.out.print(" ");
                 }
            }

            if (altura > 1)
                System.out.print("#");
                 System.out.println();		
                espacioInterno += 2;
                altura++;
                espacio--;
        }
        for (x = 1 ; x <= espacioInterno; x++)
        System.out.print("#");
    }
}
