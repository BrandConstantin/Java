/**
 * Escribe un programa que calcule el área de un rectángulo.
 *
 * @author Costy
 */

public class Ejer5 {
  public static void main(String[] args) {
    
  System.out.println("Quieres averiguar el área de un rectángulo en m? "); 
  
  System.out.println("Dime la base : ");    
    double base = Double.parseDouble(System.console().readLine());  
    
  System.out.println("Dime la altura : ");
    double altura = Double.parseDouble(System.console().readLine()); 
    
      System.out.print("El área de un rectángulo es " + base +
                         " x " + altura + " = " + (base * altura) );
                         
  }
}
