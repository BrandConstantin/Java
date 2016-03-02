/*
 *   Dado un año, indicar si es bisiesto o no. Para ello se debe tener en cuenta lo siguiente:
 *  -El año introducido debe ser posterior al 1582, año en que se instauró el calendario Gregoriano que usamos actualmente.
 *  -La gran mayoría de los años que sean divisibles entre 4 son bisiestos. No lo son si su divisibilidad es entre 100
 *   (como los años 1700, 1800, 1900 y 2100), a no ser que además sean divisibles entre 400 (como los años 1600, 2000 y 2400).
 *   En 400 años debe haber 97 años bisiestos. De esa manera el año del calendario Gregoriano se mantiene muy parecido al año
 *   solar, dura 365 días +1/4 -1/100 +1/400 = 365,2425 días (más que el año trópico, cuya duración es de 365,242198 días).
 * 
 * @author costy
 */
import java.util.Scanner;
public class AnioBisiesto {
 
    public static void main(String[] args) {
 
        String cadena;
        int anio;
 
        Scanner teclado = new Scanner( System.in );
        System.out.println("Calcular si un año introducido por teclado es bisiesto o no.");
        System.out.println("============================================================");              
        System.out.print ("Introduzca un año: ");
        cadena = teclado.nextLine();
        anio = Integer.parseInt(cadena);
        
        if(anio>1582){
            if(anio%4==0 && (anio%100!=0 || anio%400==0)){
                System.out.println ("El año introducido es bisiesto.");
            }else{
                System.out.println ("El año introducido no es bisiesto.");
            } 
        }else{
            System.out.println ("¡ERROR! El año debe ser posterior al año 1582, en que se instauró el calendario Gregoriano vigente.");
        }
    } 
} 

