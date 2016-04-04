/*
 * Un array donde se rellena los elementos de la diagonal principal con 1 y el 
 * resto con 0
 */
package tema.pkg0.e.array.bidimensionales;

import java.util.Scanner;

/**
 *
 * @author BrinCo
 */
public class Diagonal_1_Resto_0 {
    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);
        
        int t[][] = new int [7][7];
        int i;
        int j;
        
        System.out.println("Diagonal 1 resto 0");
        System.out.println("============================================");
        
        for(i = 0; i < t.length; i++){
            for(j = 0; j < t.length; j++){
                if(i == j){
                    t[i][j] = 1;
                }else{
                    t[i][j] = 0;
                }
            }
        }
        
        //mostramos array
        System.out.println("Matriz: ");
        for(i = 0; i < t.length; i++){
            System.out.println("");
            for(j = 0; j < t.length; j++){
                System.out.print("|_" + t[i][j] + "_|");
            }
        }
    }
}
