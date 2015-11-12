/**
 * Escribe un programa que calcule el volumen de un cono según la fórmula 
 * 
 * 
 * @author Costy
 */

public class Ejer9 {
  public static void main(String[] args) {
    
  System.out.println("Calcula el volumen de un cono? "); 
  System.out.println("Indica el radio "); 
    int r = Integer.parseInt(System.console().readLine()); 
    
  System.out.println("Indica la altura "); 
    int h = Integer.parseInt(System.console().readLine()); 

    double volumen = (3.14 * (r*r) * h) / 3;
    
    System.out.println(" El volumen es " + volumen);
                         
  }
}
