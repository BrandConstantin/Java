/*
 * Un array rellendo de 0 con el borde de 1, un array de 9x9x9
 */
package tema.pkg0.e.array.bidimensionales;

/**
 *
 * @author BrinCo
 */
public class Array_De_0_Con_Bordes_De_1_9x9x9 {
    public static void main(String[] args) {

        int t[][][] = new int [9][9][9];
        int i;
        int j;
        int k;
        
        System.out.println("Array de 9x9x9");
        System.out.println("============================================");
        
        for(i = 0; i < 9; i++){
            for(j = 0; j < 9; j++){
                for(k = 0; k < 9; k++){
                    if(i == 0 || i == 8  || j == 0 || j == 8 || k == 0 || k == 8){
                        t[i][j][k] = 1;
                    }
                }
            }
        }
        
        //mostramos array
        System.out.println("Array: ");
        for(i = 0; i < 9; i++){
            System.out.println("Capa: " + (i + 1));
            for(j = 0; j < 9; j++){
                for(k = 0; k < 9; k++){
                    System.out.print("\t|_" + t[i][j][k] + "_|");
                }
                System.out.println("");
            }
            System.out.println("\n·········································································");
        }
    }
}