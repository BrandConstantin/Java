/**
 * Igual que el ejercicio anterior pero esta vez se debe pintar una pirámide 
 * hueca.
 * 
 * @author costy
 */
import java.util.Scanner;

public class ejer20 {
  public static void main(String[] args) {   
    
    Scanner teclado = new Scanner(System.in);
    
    System.out.println("Introduce la altura:");
    int alturaMetida = teclado.nextInt();
    
    System.out.println("Introduce el simbolo con cual quieres dibujar:");
    String fila = teclado.next();
    
    int espacio = (alturaMetida - 1);
    int altura = 1;
    int alturaInterna = 0;
    int b = 0;
      
    while (altura < alturaMetida) {
        for (int a = 1; a <= espacio; a++){
            System.out.print("  ");
        }
        
        System.out.println(fila);
        for (int a = 1; a <= alturaInterna; a++){
        System.out.println(" ");
        }
        
        if (altura > 1){
            System.out.println(fila);
        }
        
        System.out.println();
        altura++;
        espacio--;
        alturaInterna += 2;
    } 
    for (b = 1; b < (altura*2); b++) {
    System.out.print(fila);
    }
  }
}
