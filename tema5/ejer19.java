/**
 * Realiza un programa que pinte una pirámide por pantalla. La altura se debe
 * pedir por teclado. El carácter con el que se pinta la pirámide también se
 * debe pedir por teclado.
 * 
 * @author costy
 */

public class ejer19 {
  public static void main(String[] args) {   
    
    System.out.println("Introduce la altura:");
    int altura = Integer.parseInt(System.console().readLine());
    System.out.println("Introduce el simbolo con cual quieres dibujar:");
    String simbolo = System.console().readLine();
    
    //int filaSimbolo;
    int espacio;
    
    if (espacio = altura - 1){
      
      while (simbolo <= altura) {
        for (int a = 0; a < espacio; a++){
          System.out.print("  ");
        }
      for (int c = 0; c <= (simbolo * 2); c++){
          System.out.println(simbolo);
      }
        simbolo++;
        espacio--;
        System.println();
      }
    }
  }
}
