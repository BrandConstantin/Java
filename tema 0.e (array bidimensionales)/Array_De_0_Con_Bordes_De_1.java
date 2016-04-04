/*
 * Un array rellendo de 0 con el borde de 1
 */
package tema.pkg0.e.array.bidimensionales;

/**
 *
 * @author BrinCo
 */
public class Array_De_0_Con_Bordes_De_1 {
    public static void main(String[] args) {
        //Scanner tec = new Scanner(System.in);
        
        int t[][] = new int [8][6];
        int i;
        int j;
        
        System.out.println("Array con bordes de 1 y interior con 0");
        System.out.println("============================================");
        
        for(i = 0; i < 8; i++){
            for(j = 0; j < 6; j++){
                //System.out.print("Elemento[" + (i + 1) + "][" + (j +1) + "]: ");
                //a[i][j] = tec.nextInt();
                //a[i][j] = (int)(Math.random() * 46) + 1;
                if(i == 0 || i == 7){
                    t[i][j] = 1;
                }else if(j == 0 || j == 5){
                    t[i][j] = 1;
                }
            }
        }
        
        //mostramos array
        System.out.println("Array: ");
        for(i = 0; i < 8; i++){
            System.out.println("");
            for(j = 0; j < 6; j++){
                System.out.print("\t|_" + t[i][j] + "_|");
            }
        }
    }
}
