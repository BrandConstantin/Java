/* crea solo la ala izquierda
* 
*/
import java.util.Scanner;

public class CaracterX {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        int altura=0;
        int aux = altura;
        int i;
        int k;
        int j = 0;
        int l;
        int m;
        int a;
        int espacios = 1;
        
        System.out.println("Este programa creara una X");
        System.out.print("Por favor introduce la altura \n");
        System.out.print("===================================================================\n");
        altura = teclado.nextInt();
        System.out.print("===================================================================\n");

        for(i = 0; i < altura; i++){
            if (i < (altura / 2)){
                for (j = 0; j < espacios; j++){
                    System.out.print(" ");
                }          
                System.out.print("*");
                for (l = j; l < (i / 2); l++){
                }
                for (a = l; a < l / 2; a++){
                    System.out.print("*");
                }
            } else {
                 for (k = j; k > 0; k--){
                    System.out.print(" ");
                  }
                 System.out.print("*");
                 for (m = k; m < aux; m++){
                     System.out.print(" ");
                 }
                 System.out.print("*");
                 aux += 2;
                  j--;
            }
            espacios++;
            System.out.println(" ");
        }
    }
}


