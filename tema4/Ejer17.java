/**
 * Escribe un programa que diga cuál es la última cifra de un número entero 
 * introducido por teclado.
 * 
 * @author costy
 */

public class Ejer17 {
  public static void main(String[] args) {   
  
    System.out.println("Numeros Enteros");
    
    System.out.println("Escribe cualquier numero y te digo la ultima cifra");
    
    int cifra = Integer.parseInt(System.console().readLine());
    int ultimaCifra = (cifra % 10) ;
    
    System.out.println("La ultima cifra es " + ultimaCifra);
  
    
  }
}
