/**
 * Realiza un programa que calcule la media de tres notas.
 * 
 * @author costy
 */

public class Ejer7 {
  public static void main(String[] args) {   
  
    System.out.println("Dime las notas que has obtenido en esta asignatura");
    
    double notas1 = Double.parseDouble(System.console().readLine());
    double notas2 = Double.parseDouble(System.console().readLine());
    double notas3 = Double.parseDouble(System.console().readLine());
    
    System.out.println("La media obtenida es: " + (notas1 + notas2 + notas3) / 3);
  }
}
