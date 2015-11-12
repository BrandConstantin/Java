/**
 * Escribe un programa que calcule el salario semanal de un empleado en base a 
 * las horas trabajadas, a razón de 12 euros la hora.
 * 
 * @author Costy
 */

public class Ejer8 {
  public static void main(String[] args) {
    
  System.out.println("Quieres saber cuanto vas a cobrar esta semana? "); 
  System.out.println("Cuantas horas has trabajado esta semana? "); 
    int totalHoras = Integer.parseInt(System.console().readLine()); 
    
    double hora  = 12;
    double totalSemana = (totalHoras  * hora);
    
    System.out.printf("Horas trabajadas .............%d   \n", totalHoras);
    System.out.println("Pago x hora  ................12");
    System.out.printf("Total semana .................%4.2f   ", totalSemana);
                         
  }
}
