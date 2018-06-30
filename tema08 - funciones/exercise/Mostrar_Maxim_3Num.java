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
public class Mostrar_Maxim_3Num {

    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);

        int a;
        int b;
        int c;

        System.out.println("Introduzca I número: ");
        a = tec.nextInt();
        System.out.println("Introduzca II número: ");
        b = tec.nextInt();
        System.out.println("Introduzca III número: ");
        c = tec.nextInt();
        System.out.println("·················································");
        int max = functions.Functions.maximo(a, b, c);
        System.out.println("El número mayor es " + max);
        System.out.println("·················································");
    }
}
