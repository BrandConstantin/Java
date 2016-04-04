/*
 * Cargar un array y trasponerlo en el segundo
 */
package tema.pkg0.e.array.bidimensionales;

//import java.util.Scanner;

/**
 *
 * @author BrinCo
 */
public class Transponer_2_Array {
    public static void main(String[] args) {
        //Scanner tec = new Scanner(System.in);
        
        int a[][] = new int [5][9];
        int b[][] = new int [9][5];
        int i;
        int j;
        
        System.out.println("Trasponer 2 Array");
        System.out.println("============================================");
        
        for(i = 0; i < 5; i++){
            for(j = 0; j < 9; j++){
                //System.out.print("Elemento[" + (i + 1) + "][" + (j +1) + "]: ");
                //a[i][j] = tec.nextInt();
                a[i][j] = (int)(Math.random() * 46) + 1;
            }
        }
        
        //mostramos array
        System.out.println("Array Original: ");
        for(i = 0; i < 5; i++){
            System.out.println("");
            for(j = 0; j < 9; j++){
                System.out.print("\t|_" + a[i][j] + "_|");
            }
        }
                
        System.out.println("·········································");
        
        //tranponemos
        for(i = 0; i < 5; i++){
            for(j = 0; j < 9; j++){
                b[j][i] = a[i][j];
            }
        }
        
        //mostramos el array inversado
        System.out.println("Array Inversado: ");
        for(i = 0; i < 9; i++){
            System.out.println("");
            for(j = 0; j < 5; j++){
                System.out.print("\t|_" + b[i][j] + "_|");
            }
        }
    }
}
