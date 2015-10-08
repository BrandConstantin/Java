/**
 * Realiza un programa que resuelva una ecuación de primer grado 
 * (del tipo ax + b = 0).
 *
 * @author costy
 */

public class Ejer5 {
  public static void main(String[] args) {   
  
    System.out.println("Resuelva la ecuación de primer grado");
    
    System.out.println("Dime el a");
    int a = Integer.parseInt(System.console().readLine());
    
    System.out.println("Dime el b");
    int b = Integer.parseInt(System.console().readLine());
    
    double x = (0 - b) / a;
    
    System.out.println("El resultado de la ecuación de primer grado es: " + x);
  }
}

