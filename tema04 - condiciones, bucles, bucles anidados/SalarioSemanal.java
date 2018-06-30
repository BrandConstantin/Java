/*
 * Vamos a ampliar uno de los ejercicios de la relación anterior para considerar
 * las horas extras. Escribe un programa que calcule el salario semanal de un
 * trabajador teniendo en cuenta que las horas ordinarias (40 primeras horas de
 * trabajo) se pagan a 12 euros la hora. A partir de la hora 41, se pagan a 16
 * euros la hora.
 */
package tema04;

import java.util.Scanner;

/**
 *
 * @author BrandConstantin
 */
public class SalarioSemanal {
     public static void main(String[] args) {
        Scanner t = new Scanner(System.in);
        
         System.out.println("Cuantas horas trabajadas esta semana tiene usted? ");
         int horas = t.nextInt();
         
         System.out.println("------------------------------------------------");
         
         int totalCobrar;
         int horasExtras = horas - 40;
         
         if(horas == 40){
             totalCobrar = 40 * 12;
         }else{
             totalCobrar = (40 * 12) + (horasExtras * 16);
         }
         
         System.out.println("Aqui tiene su sueldo semanal de " + totalCobrar);
     }
}
