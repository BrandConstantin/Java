/**
 * Realiza un programa que pinte una pirámide por pantalla. La altura se debe
 * pedir por teclado. El carácter con el que se pinta la pirámide también se
 * debe pedir por teclado.
 * 
 * @author costy
 */
import java.util.Scanner;

public class ejer19 {
  public static void main(String[] args) {   
    
    Scanner teclado = new Scanner(System.in);
    
    System.out.println("Introduce la altura:");
    int altura;
    altura = teclado.nextInt();
    System.out.println("Introduce el simbolo con cual quieres dibujar:");
    String simbolo;
    simbolo = teclado.next();
    
    int fila = 1;
    int espacio = (altura - 1);
      
    while (fila <= altura) {
        for (int a = 1; a <= espacio; a++){
          System.out.print("  ");
        }
        for (int c = 1; c <= (altura * 2); c++){
          System.out.println(simbolo);
        }
        altura--;
        fila++;
        espacio--;
        System.out.println();
    }
  }
}
