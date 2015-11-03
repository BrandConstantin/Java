/**
 * Igual que el ejercicio anterior pero esta vez se debe pintar una pirámide 
 * hueca.
 * 
 * @author costy
 */

public class ejer20 {
  public static void main(String[] args) {   
    
    System.out.println("Introduce la altura:");
    int altura = Integer.parseInt(System.console().readLine());
    System.out.println("Introduce el simbolo con cual quieres dibujar:");
    String simbolo = System.console().readLine();
    
    int espacio;
    
    if (espacio = altura - 1){
      
      while (simbolo < altura) {
        for (int a = 0; a < espacio; a++){
          System.out.print("  ");
        }
      for (int c = 0; c <= (simbolo * 2); c++){
          System.out.println(simbolo);
      }
        simbolo++;
        espacio--;
        espacio = espacio +2;
        System.println();
      }
    }
  }
}
