/*
 * Ejemplo de sentencia condicional con switch
 * Ejemplo 6
 * Generar un numero aleatorio entre 1 y 3000, mostrando en la pantalla y reportar
 * su equivalente en numero romano
 *
 * @author costy
 */

import java.util.Scanner;
import java.util.Random;

public class condicionalSwitch6 {
    public static void main(String[] args){
        
        Scanner in = new Scanner(System.in);
        int u, d, c, m, n = 0;
        Random rnd = new Random();
        for (int i = 0; i < 3000; i++){
        n = (int)(rnd.nextDouble() * 3000);
        n = n % 3000 + 1;
        }
        System.out.println("El numero generado es: " + n);
        u = n % 10;
        n = n / 10;
        d = n % 10;
        n = n / 10;
        c = n % 10;
        n = n / 10;
        m = n % 10;
        
        //Procesamiento
        switch (m) {
            case 1: System.out.println("M"); break;
            case 2: System.out.println("MM"); break;
            case 3: System.out.println("MMM"); break;
        }
        switch (c) {
            case 1: System.out.println("C"); break;
            case 2: System.out.println("CC"); break;
            case 3: System.out.println("CCC"); break;
            case 4: System.out.println("CD"); break;
            case 5: System.out.println("D"); break;
            case 6: System.out.println("DC"); break;
            case 7: System.out.println("DCC"); break;
            case 8: System.out.println("DCCC"); break;
            case 9: System.out.println("CM"); break;
        }  
        switch (d) {
            case 1: System.out.println("X"); break;
            case 2: System.out.println("XX"); break;
            case 3: System.out.println("XXX"); break;
            case 4: System.out.println("XL"); break;
            case 5: System.out.println("L"); break;
            case 6: System.out.println("LX"); break;
            case 7: System.out.println("LXX"); break;
            case 8: System.out.println("LXXX"); break;
            case 9: System.out.println("XC"); break;
        } 
        switch (u) {
            case 1: System.out.println("I"); break;
            case 2: System.out.println("II"); break;
            case 3: System.out.println("III"); break;
            case 4: System.out.println("IV"); break;
            case 5: System.out.println("V"); break;
            case 6: System.out.println("VI"); break;
            case 7: System.out.println("VII"); break;
            case 8: System.out.println("VIII"); break;
            case 9: System.out.println("IX"); break;
        } 
    }
}
