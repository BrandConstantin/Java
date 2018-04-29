/*
 *Escribe una función que genere la versión tacaña de un número a partir de otro que se pasa como
parámetro. La versión tacaña es aquella que contiene los mismos dígitos o menos que el número
original y en el mismo orden. A efectos prácticos es como quitarle dígitos de forma aleatoria a un
número. Por ejemplo, versionTacana(746812) podría devolver 462, o bien 7482, o bien 61, etc.
La cabecera de la función es la siguiente:
public static long versionTacana(long x)
 */
package t2c2_b;

import java.util.Scanner;

/**
 *
 * @author BrinCo
 */
public class VersionTacania {
    public static void main(String[] args) {
        Scanner t = new Scanner (System.in);
        System.out.println(" VERSION TACAÑIA DE UN NÚMERO ");
        System.out.println("-----------------------------------------------------------------------------");
        System.out.println("Introduzca un número: ");
        long num = t.nextLong();
        System.out.println("------------------------------------------------------------------------------");
        
        long nuevoNum = versionTacania(num);
        System.out.println("Versión Tacaña: " + nuevoNum);
    }      
    
    public static long versionTacania(long num){             
        long numInvertido = 0;
        int digito = 0; 

        //invertir número
        while (num > 0){
          digito = (int) (num % 10);
          numInvertido = (numInvertido * 10) + digito;
          num /= 10;
        }
        
        //invertir otra vez el número, para sacarlo en el orden escrito, pero sacando solo algunos digitos
        boolean encontrado = false;
        int aleatorio = 0;
        long nuevoNum = 0;

        while (numInvertido > 0){
            digito = (int) (numInvertido % 10);
            aleatorio = (int)(Math.random() * 2);

            if(aleatorio == 1){
              nuevoNum = (nuevoNum * 10) + digito;
              encontrado = true;
            }

            numInvertido /= 10;
        }

        return(nuevoNum);
    }
}
