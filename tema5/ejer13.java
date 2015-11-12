/**
 * Escribe un programa que lea una lista de diez números y determine cuántos son
 *  positivos y cuántos son negativos.
 * 
 * @author costy
 */
import java.util.Scanner;

public class ejer13 {
  public static void main(String[] args) {   
    
    int positivos = 0;
    int negativos = 0;
    int contador = 0;
    
    System.out.println("Escribe 10 numeros y te digo cuantos hay positivos " +
      " y cuantos negativos");
    
    do {
      System.out.println("Escribe un numero");
      int num;
      Scanner teclado = new Scanner(System.in);
      num = teclado.nextInt();

      if (num < 0){
        negativos++;
      } else {
        positivos++;
      }
      contador++;
    } while (contador < 10);

    System.out.println("Hay " + positivos + " numeros poisitivos y " +
      negativos + " numeros negativos");
  }
}
