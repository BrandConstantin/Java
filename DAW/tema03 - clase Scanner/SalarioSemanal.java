/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema03;

import java.util.Scanner;

/**
 *
 * @author BrandConstantin
 */
public class SalarioSemanal {
    public static void main(String[] args) {
        Scanner t = new Scanner(System.in);
        
        int horas;
        
        System.out.println("Cuantas horas tiene el trabajador?");
        horas = t.nextInt();
        
        int salario = horas * 12;
        
        System.out.println("------------------------------------------------------");
        System.out.println("Tu salario semanal es de " + salario);
    }
}
