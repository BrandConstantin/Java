/* Un programa que calcule el salario semanal
 * las primeras 40 horas se pagana 7.5 euros/hora
 * las horas extra se pagan un 50% mas
 * los impuestos se pagan: los primeros 150 sin impuesto, los siguente 150 euros 
 *   un 15%, el resto 30%
 * Se tiene que escribir nombre trabajador, sueldo bruto, impuestos a pagar y 
 *   sueldo neto
 * @author costy
 */

import java.util.Scanner;

public class RepetitivaIfElse2 {
    public static void main(String[] args){
        
        Scanner teclado = new Scanner(System.in);
        final float tarifaNormal = 7.5f; 
        String nombreEmpleado = "";
        int horas = 0;
        double sueldoBruto;
        double sueldoNeto;
        double impuesto;
        
        System.out.println("Escribe nombre del trabajador:");
        nombreEmpleado = teclado.nextLine();
        
        do{
            System.out.println("Introduce el numero de horas trabajadas:");  
            horas = teclado.nextInt();
        } while (horas < 0);
        
        if (horas < 40){
            sueldoBruto = horas + tarifaNormal;
        } else {
            sueldoBruto = 40 * tarifaNormal + (horas - 40) * tarifaNormal *1.5f;
        }
        if (sueldoBruto <= 150){
            impuesto = 0;
        } else {
            if (sueldoBruto <= 300){
                impuesto = 0.15d *(sueldoBruto - 150);
            } else {
                impuesto = 150 *0.15d +(sueldoBruto - 300) * 0.35d;
            }
        }
        
        sueldoNeto = sueldoBruto - impuesto;
        
        System.out.println("Li quidación semanal para  " + nombreEmpleado + 
            " con " + horas + " horas trabajadas, es de  " + sueldoBruto + 
                " euros");
        System.out.println("El salario neto es de " + sueldoNeto + " euros");
    }
}