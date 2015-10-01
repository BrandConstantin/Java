/**
 * Escribe un programa que convierta los kb en mb
 * 
 * 
 * @author Costy
 */

public class Ejer11 {
  public static void main(String[] args) {
    
  System.out.println("CONVERSOR \"KB\" EN \"MB\" "); 
  System.out.println("Introduce los KB a convertir "); 
  
    int kb = Integer.parseInt(System.console().readLine()); 

    int conversor = kb / 1024;
    
    System.out.println(" Rezultado: " + conversor);
                         
  }
}
