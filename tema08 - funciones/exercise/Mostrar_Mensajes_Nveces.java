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
public class Mostrar_Mensajes_Nveces {

    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);

        int num;
        System.out.println("Introduzca un número: ");
        num = a.nextInt();
        System.out.println("·················································");
        functions.Functions.mostrarMensajes(num);
        System.out.println("·················································");
    }
}
