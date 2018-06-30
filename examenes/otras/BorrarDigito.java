/*
 * Escribe una función que le borre un determinado dígito a un número. Si el dígito aparece varias veces
en el número, se borran todas las ocurrencias. Se pasan dos parámetros: el número y el dígito que se
quiere eliminar. Por ejemplo, borra(7486812, 8) devuelve el 74612 y borra(390331, 3) devuelve
el 901.
La cabecera de la función es la siguiente:
public static long borra(long x, int d)
 */
package repesca_2016;

import java.util.Scanner;

/**
 *
 * @author BrinCo
 */
public class BorrarDigito {
    public static void main(String[] args) {
        Scanner s = new Scanner (System.in);
        System.out.println("Introduce un numero:");
        long numIntro = s.nextLong();
        System.out.println("Que digito quieres eliminar: ");
        int digito = s.nextInt();
        
        long nuevoNum = borraNum(numIntro, digito);
        System.out.println("El nuevo número es " + nuevoNum);
    }
    
    public static long borraNum(long numIntro, int digito){
        long num = numIntro;
        int borraNum = digito;
        long dig = 0;
        long nuevoNum = 0;
        long numInvertido = 0;
        
        while(num > 0){
            dig = (int)(num % 10);
            numInvertido = (numInvertido * 10) + dig;
            num /= 10; 
        }
        
        while(numInvertido > 0){
            dig = numInvertido % 10;
            numInvertido = numInvertido / 10;
            
            if(dig != borraNum){
                nuevoNum = nuevoNum * 10 + dig;
            }
        }
        
        return nuevoNum;
    }
}
