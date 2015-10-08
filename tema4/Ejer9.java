/**
 * Realiza un programa que resuelva una ecuación de segundo grado 
 * (del tipo ax 2 + bx + c = 0)
 * 
 * @author costy
 */

public class Ejer9 {
  public static void main(String[] args) {   
  
    System.out.println("Resolver ecuación de segundo grado");
    
    System.out.println("Dime el a");
    int a = Integer.parseInt(System.console().readLine());
    
    System.out.println("Dime el b");
    int b = Integer.parseInt(System.console().readLine());
    
    System.out.println("Dime el c");
    int c = Integer.parseInt(System.console().readLine());
    
    double resultado1;
    double resultado2;
    
    if (a != 0 && a >0){ 
    resultado1 = (-b) + Math.sqrt((b * b) - 4 * a * c) / 2 * a;
    System.out.println("El resultado positivo de la ecuación de segundo grado" + 
    " es: " + resultado1);
    resultado2 = (-b) - Math.sqrt((b * b) - 4 * a * c) / 2 * a;
    System.out.println("El resultado negativo de la ecuación de segundo grado" + 
    " es: " + resultado2);
  } else {
    System.out.println("a no puede ser menor o igual a 0");
  }
  }
}
