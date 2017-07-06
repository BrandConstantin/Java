/*
 * Mostrar número al revés
 */
package tema04;

import java.util.Scanner;

/**
 *
 * @author BrandConstantin
 */
public class Voltear_Numero {
     public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);   
        
        int num, decenasMillar, unidadesMillar, centena, decena, unidad;
        
        System.out.print("Introduce un número de hasta 99.999: ");
        num = teclado.nextInt();
        
        System.out.println("-------------------------------------");
        if(num >= 0 && num < 10){
            //unidades
            unidad = num % 10;
            num /= 10;
             System.out.println(unidad);
        }else  if(num >= 10 && num < 100){
            //unidades
            unidad = num % 10;
            num /= 10;
            //decenas
            decena = num % 100;
            num /= 100;
             System.out.println(unidad + "" + decena);
        }else if(num >= 100 && num < 1000){
            //unidades
            unidad = num % 10;
            num /= 10;
            //decenas
            decena = num % 10;
            num /= 10;
            //centenas
            centena = num % 10;
            num /= 10;
             System.out.println(unidad + "" + decena + "" + centena);
        }else if(num >= 1000 && num < 10000){
            //unidades
            unidad = num % 10;
            num /= 10;
            //decenas
            decena = num % 10;
            num /= 10;
            //centenas
            centena = num % 10;
            num /= 10;
            //unidadesMillar
            unidadesMillar = num % 10;
            num /= 10;
            System.out.println(unidad + "" + decena + "" + centena + "" + unidadesMillar);
        }else if(num >= 10000 && num < 100000){
            //unidades
            unidad = num % 10;
            num /= 10;
            //decenas
            decena = num % 10;
            num /= 10;
            //centenas
            centena = num % 10;
            num /= 10;
            //unidadesMillar
            unidadesMillar = num % 10;
            num /= 10;
            //decenasMillar
            decenasMillar = num % 10;
            num /= 10;
           System.out.println(unidad + "" + decena + "" + centena + "" + unidadesMillar + "" + decenasMillar);        
        }else{
            System.out.println("Demasiada cifras introducidas!");
        }  
     }
}
