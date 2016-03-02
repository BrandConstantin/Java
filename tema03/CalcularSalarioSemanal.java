/*
 * Escribe un programa que calcule el salario semanal de un empleado en base a las horas
 * trabajadas, a razón de 12 euros la hora.
 *
 * @author Costy
 */
import java.util.Scanner;
public class CalcularSalarioSemanal {
    public static void main (String[] args){
        Scanner tecla = new Scanner(System.in);
        
        System.out.println("CALCULAR SALARIO SEMANAL"); 
        System.out.println("==================================================="); 
  
        System.out.println("Cuantas horas has trabajado esta semana?");    
        int horas = tecla.nextInt();
        
        System.out.println("La hora se paga a 12 euros");
        int totalCobrar = (horas * 12);
        
        System.out.printf("Por %d horas trabajadas has ganado %d euros \n", horas, totalCobrar);
        System.out.print("===================================================\n"); 
    }
}