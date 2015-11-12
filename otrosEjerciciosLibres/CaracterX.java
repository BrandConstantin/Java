/* crea solo la ala izquierda
* 
*/
import java.util.Scanner;

public class CaracterX {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        int altura=0;
        int aux = altura;
        int i=0;
        int k=0;
        int j=0;
        int l=0;
        int m=0;
        int alturaIntroducida = 0;
        int espacios = 1;
        int asteriscos = 0;
        
        System.out.println("Este programa creara una X");
        System.out.print("Por favor introduce la altura ");
        altura = teclado.nextInt();

        for(i = 0; i < altura; i++){
            if (i < (altura / 2) + 1){
                for (j = 0; j < espacios; j++){
                    System.out.print(" ");
                }
                System.out.print("*");
                for ( l = aux - 2; l > 0; l--){//espacio interior superior
                    System.out.print(" ");
                }
                
                if (i < (altura / 2)){//brazo derecho superior
                    System.out.print("*");
                }
                aux -= 2;
            } else {
                 for (k = j - 1; k > 0; k--){
                    System.out.print(" ");
                  }
                 System.out.print("*");
                 for (m = k - 2; m < aux; m++){
                     System.out.print(" ");
                 }
                 System.out.print("*");
                 aux+=2;
                  j--;
            }
            espacios++;
            System.out.println("");
        }
    }
}


