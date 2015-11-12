/**
 * Escribe un programa que calcule el volumen de un cono según la fórmula 
 * 
 * 
 * @author Costy
 */

public class Ejer10 {
  public static void main(String[] args) {
    
  System.out.println("CONVERSOR \"MB\" EN \"KB\" "); 
  System.out.println("Introduce los MB a convertir "); 
  
    int mb = Integer.parseInt(System.console().readLine()); 

    int conversor = mb * 1024;
    
    System.out.println(" Rezultado: " + conversor);
                         
  }
}
