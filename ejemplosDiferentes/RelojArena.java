/* 
* Triangulo invertido
*
* 
* @author costy
*
*/
import java.util.Scanner;
public class RelojArena {
    public static void main( String [] args ) {
        
        Scanner dato = new Scanner(System.in);
        
        System.out.println("Introduzca el caracter a dibujar:");
        String caracter = dato.next();
        System.out.println("Cuantas lineas quieres que mida tu triangulo?");
        int linea = dato.nextInt();
        System.out.print("===================================================================\n");
        
        int i;
        int k;
        int j;


        for (i = linea; i > 0; i--){
            for (k = linea; k > i; k--){
                System.out.print(" ");
            }
            for (j = 1; j <= i; j++){
                System.out.print(caracter + " ");
            }
            System.out.println();
        }
        
        for (i = 1; i <= linea; i++){
            for (k = linea; k > i; k--){
                System.out.print(" ");
            }
             for ( j = 1; j <= i; j++){
                 System.out.print(caracter + " ");
             }
             System.out.println();
        }
    }
}
