/*
 * To change this license header, choose License Headers in Project Properties.
 * Meter 5 valores de forma ordenada. Leemos un número en el lugar indicado,
 * y que la tabla siga ordenada
 */
package tema.pkg0.d.array;

import java.util.Scanner;

/**
 *
 * @author Milan Touch
 */
public class Meter_Valor_Array_Sigue_Creciente {
    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);
        
        int d[] = new int[6];
        int num;
        int i;
        int posicion = 0;
        int j = 0;
        
        System.out.println("Meter valor y la tabla que sigua ordenada");
        System.out.println("============================================");
        
        for(i = 0; i < 5; i++){
            System.out.println("Introduce número:(de forma creciente) ");
            d[i] = tec.nextInt();
        }
        
        for(i = 0; i < 6; i++){
            System.out.print(d[i] + " ");
        }
        
        System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
        System.out.println("Inserta un número en la tabla: ");
        num = tec.nextInt();
        
        while(d[j] < num && j <= 4){
            posicion++;
            j++;
        }
        
        //desplazamos los valores desde posición hasta el final del array
        for(i = 4; i >= posicion; i--){
            d[i + 1] = d[i];
        }
        //ponemos el número en su sitio
        d[posicion] = num;
        
        System.out.println("RESULTADO");
        System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
        for(i = 0; i < 5 + 1; i++){
            System.out.print(d[i] + " ");
        }
    }
}
