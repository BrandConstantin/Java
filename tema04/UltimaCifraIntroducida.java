/**
 * Escribe un programa que diga cuál es la última cifra de un número entero introducido por
 * teclado.
 * 
 * @author costy
 */
import java.util.Scanner;
public class UltimaCifraIntroducida {
  public static void main(String[] args) {   
    Scanner tecla = new Scanner(System.in);
  
    System.out.println("ULTIMA CIFRA INTRODUCIDA POR TECLADO");
    System.out.println("================================================");

    System.out.println("Introduce un numero");
    long num = tecla.nextLong();
    
    int cifra = (int)(num % 10);
    
    System.out.printf("La ultima cifra introducida ha sido %d ", cifra);
  }
}
