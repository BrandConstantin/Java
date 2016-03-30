/*
 * Eliminar elemento de la posición indicada
 */
package tema.pkg0.d.array;

import java.util.Scanner;

/**
 *
 * @author BrinCo
 */
public class Eliminar_Elemento {
        public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);
        
        int e[] = new int[6];
        int i;
        int posicion = 0;
        
        System.out.println("Eliminar elemento");
        System.out.println("============================================");
        
        for(i = 0; i < 6; i++){
            System.out.print("Introduce número: ");
            e[i] = tec.nextInt();
        }
        
        System.out.println("============================================");
        
        for(i = 0; i < 6; i++){
            System.out.print(e[i] + "| ");
        }
        
        System.out.println("");
        
        System.out.println("Elimina la posición: (número de 0 a 5)");
        posicion = tec.nextInt();
        
        //desplazamos todos los elementos desde la posicion hasta el final
        //la i llega hasta la penúltima posición 
        for(i = posicion; i < 5; i++){
            e[i] = e[i + 1];
        }
        
        System.out.println("==========================================");
        
        for(i = 0; i < 5; i++){
            System.out.print(e[i] + "| ");
        }
    }
}
