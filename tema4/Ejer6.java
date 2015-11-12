/**
 * Realiza un programa que √ calcule el tiempo que tardará en caer un objeto  
 * desde una altura h. Aplica la fórmula t = 2h g siendo g = 9.81m/s 2  *
 * 
 * @author costy
 */

public class Ejer6 {
  public static void main(String[] args) {   
  
    System.out.println("Cuanto tiempo tarda un objecto en caer desde una altura");
    
    System.out.println("Dime la altura en metros ");
    double h = Double.parseDouble(System.console().readLine());
    
    double g = 9.81;
    double t = Math.sqrt((2 * h) / g);
    
    System.out.println("El tiempo es de " + t);
  }
}
