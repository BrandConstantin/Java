/*
 * Crea un array bidimensional de 5x5
 */
package tema.pkg0.e.array.bidimensionales;

import java.util.Scanner;

/**
 *
 * @author BrinCo
 */
public class Cinco_X_Cinco {
    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);
        
        int t[][] = new int[5][5];
        int i;
        int j;
        
        System.out.println("Tabla bidimensional 5X5");
        System.out.println("============================================");
        
        for(i = 0; i < t.length; i++){
            for(j = 0; j < t.length; j++){
                t[i][j] = i + j;
            }
        }
        for(i = 4; i >= 0; i--){
            System.out.println("");
            for(j = 0; j < t.length; j++){
                System.out.print("|_" + t[i][j] + "_|");
            }
        }
    }
}
