/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package git;

import java.util.Scanner;

/**
 *
 * @author brand
 */
public class Mostrar_Maxim_2Num {

    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);

        int max;
        int a;
        int b;

        System.out.println("Introduzca un número: ");
        a = tec.nextInt();
        System.out.println("Introduzca otro número: ");
        b = tec.nextInt();
        System.out.println("·················································");
        System.out.println("El número mayor es " + functions.Functions.maximo(a, b));
        System.out.println("·················································");
    }
}
