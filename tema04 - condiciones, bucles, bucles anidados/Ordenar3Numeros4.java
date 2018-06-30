/*
 * Haz un programa que lea tres números enteros por teclado, que normalmente se suministrarán desordenados, 
 * aunque no lo sabemos, y los muestre ordenados, primero de mayor a menor, y luego de menor a mayor.
 * 
 *
 */
package tema04;

import java.util.Scanner;

/**
 *
 * @author BrandConstantin
 */
public class Ordenar3Numeros4 {
    public static void main(String[] args) {
        
        int numero1;
        int numero2;
        int numero3;
        int menor;
        int medio;
        int mayor;
 
        Scanner teclado = new Scanner( System.in );
       
        System.out.print("Introduzca un número: ");
        numero1 = teclado.nextInt();
        System.out.print("Introduzca otro número: ");
        numero2 = teclado.nextInt();
        System.out.print("Introduzca otro número más: ");
        numero3 = teclado.nextInt();
        
        if(numero1 > numero2){
            if(numero1 > numero3){ 
                mayor=numero1;
                if(numero2>numero3){
                    medio=numero2;
                    menor=numero3;
                }else{
                    medio=numero3;
                    menor=numero2;
                }
            }else{ 
                mayor=numero3;
                medio=numero1;
                menor=numero2;
            }
        }else{
            if(numero2>numero3){ 
                mayor=numero2;
                if(numero1>numero3){
                    medio=numero1;
                    menor=numero3;
                }else{
                    medio=numero3;
                    menor=numero1;
                }
            }else{ 
                mayor=numero3;
                medio=numero2;
                menor=numero1;
            }
        }
        System.out.println ("Los números ordenados de mayor a menor serían: "+mayor+", "+medio+", "+menor);
        System.out.println ("Los números ordenados de menor a mayor serían: "+menor+", "+medio+", "+mayor);
    }     
}
