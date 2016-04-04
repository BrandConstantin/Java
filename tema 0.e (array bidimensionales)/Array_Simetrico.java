/*
 * Tabla simetrica
 */
package tema.pkg0.e.array.bidimensionales;

import java.util.Scanner;

/**
 *
 * @author BrinCo
 */
public class Array_Simetrico {
    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);
        
        int t[][] = new int[4][4];
        int i;
        int j = 0;
        boolean simetrica = true;
        
        System.out.println("Tabla Simetrica");
        System.out.println("============================================");
        
        for(i = 0; i < t.length; i++){
            for(j = 0; j < t.length; j++){
                System.out.print("Introduce elemento [" + (i + 1) + "][" + (j +1) + "]: ");
                t[i][j] = tec.nextInt();
            }
        }
        for(i = 0; i < t.length; i++){
            System.out.println("");
            for(j = 0; j < t.length; j++){
                System.out.print("|_" + t[i][j] + "_|");
            }
        }
                
        System.out.println("\n··················································");
        while(i < 4 && simetrica == true){
            while(j < i && simetrica == true){
                if(t[i][j] != t[j][i]){
                    simetrica = false;
                }else{
                    simetrica = true; 
                
                }j++;
            }
            i++;
        }
        if(simetrica != false){
            System.out.println("SIMETRICA");
        }else{
            System.out.println("NO SIMETRICA");
        }
    }
}
