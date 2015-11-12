/**
* @author costy
* 
* 
* Este programa creara una N dandole nosotros la altura por teclado.            
* 
*/
import java.util.Scanner;

public class CaracterN {

    public static void main(String[] args) {
        
        Scanner dato = new Scanner(System.in);

        System.out.println("Este programa creara una N pasándole nosotros por teclado la altura y el caracter a" + 
          " dibujar");
        System.out.println("Introduzca el caracter a dibujar:");
        String caracter = dato.next();
        System.out.println("Cuantas lineas quieres que mida tu letra?");
        int linea = dato.nextInt();

        int i=0;
        int k=1;
        int j=0;
        int l=0;

        for(i = 0; i < linea; i++){
            for (j=0; j<linea/2; j++){
                System.out.print(" ");
            }
            System.out.print(caracter);

            if (i != 0){
                for (k = 1; k < i; k++){
                    System.out.print(" ");
                }
                System.out.print(caracter);
            } else { 
            System.out.print(" ");
            }

            for (l = k; l < linea - 2; l++){
                System.out.print(" ");
            }

            if (l == linea - 1){
                 System.out.print(" ");
            } else {
                System.out.print(caracter);
            }
            System.out.println(" ");
        }
    }
}
