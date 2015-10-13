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
    
    if ((notas1 >= 0) && (notas1 <= 10) &&
       (notas2 >= 0) && (notas2 <= 10) &&
       (notas3 >= 0) && (notas3 <= 10)) {    
    System.out.printf("La media obtenida es %.2f ", (notas1 + notas2 + notas3) / 3);
  } else {
    System.out.println("Datos incorrectos");
  }
  }
}
