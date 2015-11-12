/*
 * Ejemplo de sentencia condicional con switch
 * Ejemplo 5
 * Ingrese el numero de mes y el año y reporte el numero de dias que tiene ese 
 * mes
 *
 * @author costy
 */

import java.util.Scanner;

public class condicionalSwitch5 {
    public static void main(String[] args){
        
        Scanner in = new Scanner(System.in);
        int mes, anio;
        
        System.out.println("Ingrese el numero de mes de 1 a 12:");
        mes = in.nextInt();
        System.out.println("Ingrese el año:");
        anio = in.nextInt();
        
        //Procesamiento
        switch (mes) {
            case 1: case 3: case 5: case 7: case 8: case 10: case 12:
                System.out.println("El mes tiene 31 dias");
                break;
            case 4: case 6: case 9: case 11:
                System.out.println("El mes tiene 30 dias");
                break;
            case 2:
                if ((anio % 4 == 0 && anio % 100 != 0) || anio % 400 == 0)
                System.out.println("El mes tiene 29 dias");
                else 
                System.out.println("El mes tiene 28 dias");               
                break;
            default: System.out.println("Numero escogido fuera de rango"); break;
        }
    }
}
