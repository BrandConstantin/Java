/**
 * Muestra la tabla de multiplicar de un número introducido por teclado.
 * 
 * @author costy
 */

public class ejer08 {
  public static void main(String[] args) {   
    
    System.out.println("Tabla multiplicación");
    System.out.println("Elije numero a multiplicar");
    
    int num = Integer.parseInt(System.console().readLine());
    int multiplicar = 0;
    int contador = 0;
    
    do {
      contador++;
      multiplicar = num * contador;
      System.out.println(num + " x " + contador + " = "+ multiplicar);
    } while  (contador < 10);
  }
}
