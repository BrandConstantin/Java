/*
 * Insertar numeros, luego pedir número y posición para insertar y desplazar 
 * los que están detrás
 */
package tema.pkg0.d.array;

import java.util.Scanner;

/**
 *
 * @author BrinCo
 */
public class Desplazar_Num_Detras {
    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);
        
        int b[] = new int[6];
        int elemento;
        int posicion;
        int i;
        
        System.out.println("Desplazar numeros de detras");
        System.out.println("============================================");
        
        for(i = 1; i <= 4; i++){
            System.out.println("Introduce número: ");
            b[i] = tec.nextInt();
        }
        
        System.out.println("============================================");       
        
        //pedimos número para insertar
        System.out.println("Introduce nuevo elemento: ");
        elemento = tec.nextInt();
        //pedimos posición donde insertarlo
        System.out.println("Introduce posición del nuevo elemento (de 1 a 5)");
        posicion = tec.nextInt();
        
        if(posicion <= 5){
            //desplazamos los elementos del array desde posición hasta el último (3-1)
            for(i = 2; i >= posicion; i--){
                b[i + 2] = b[i];
            }

            //insertamos nuevo elemento
            b[posicion] = elemento;
            
            System.out.println("RESULTADO:");
            System.out.println("==========================================");
            for(i = 1; i < 6; i++){
            System.out.println(b[i]);
        }
        }else{
            System.out.println("Se ha introducido una posición más grande "
                    + "de lo que permite el array");
        }
    }
}
