/*
 * Vamos a ampliar uno de los ejercicios de la relación anterior para considerar las horas
 * extras. Escribe un programa que calcule el salario semanal de un trabajador teniendo en
 * cuenta que las horas ordinarias (40 primeras horas de trabajo) se pagan a 12 euros la hora.
 * A partir de la hora 41, se pagan a 16 euros la hora.
 *
 * @author Costy
 */
import java.util.Scanner;
public class HorasExtrasTrabajadas {
    public static void main (String[] args){
        Scanner tecla = new Scanner(System.in);
        
        System.out.println("CALCULAR SALARIO SEMANAL");
        System.out.println("====================================================");
        
        int salarioTotal;
        
        System.out.println("Cuantas horas has trabajado esta semana?");
        int horas = tecla.nextInt();
        
        if (horas <= 40){
            salarioTotal = horas * 12;
            System.out.println("Tu salario esta semana es de " + salarioTotal);
        } else {
            salarioTotal = ((40 * 12) + ((horas - 40) * 16));
            System.out.println("Tu salario esta semana es de " + salarioTotal);
        }
    }
}
