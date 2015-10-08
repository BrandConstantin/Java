/**
 * Vamos a ampliar uno de los ejercicios de la relación anterior para considerar
 * las horas extras. Escribe un programa que calcule el salario semanal de un 
 * trabajador teniendo en cuenta que las horas ordinarias (40 primeras horas de
 * trabajo) se pagan a 12 euros la hora. A partir de la hora 41, se pagan a 16 
 * euros la hora.
 *
 * @author costy
 */

public class Ejer4 {
  public static void main(String[] args) {   
  
    System.out.println("Sabes cuanto vas a cobrar esta semana?");
    System.out.println("Dime, cuantas horas has trabajado esta semana?");
    
    int horas = Integer.parseInt(System.console().readLine());
    int horasExtra = horas - 40;
    int sueldo;
    int sueldoExtra;
    
    if (horas <= 40){
      sueldo = horas * 12;
      System.out.printf("Aqui tienes tu sueldo de %d", sueldo);
    } else if(horas > 40){
      sueldoExtra = (horas * 12) + (horasExtra * 16);
      System.out.printf("Aqui tienes tu sueldo de %d", sueldoExtra);
    } 
  }
}
