/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package excepciones;

import java.util.Scanner;
import java.io.*;

/**
 *
 * @author brand
 */
public class try_catch {

    public static void main(String[] args) {
        BufferedReader teclado = new BufferedReader(new InputStreamReader(System.in));

        String linea;
        int num = -1;
        int intentos = 0;

        do {
            try {
                System.out.print("Introduzca un número de 1 a 8: ");
                linea = teclado.readLine();
                num = Integer.parseInt(linea);
            } catch (IOException e) {
                System.out.print("Error al leer por teclado");
            } catch (NumberFormatException e) {
                System.out.println("Debes introducir un número, no otro tipo de carácter");
            } finally {
                intentos++;
            }
        } while (num < 0 || num > 8);
        
        System.out.println("El número introducido es " + num);
        System.out.println("El número de intentos es de " + intentos);
    }
}
