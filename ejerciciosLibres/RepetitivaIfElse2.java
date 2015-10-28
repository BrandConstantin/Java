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
        
        Scanner tecla = new Scanner(System.in);
        int conta;
        int num;
        int mediaNegativ;
        int mediaTotal; 
        int numPositiv = 0; 
        int numNegativ = 0;
        int numCero = 0;
        int sumTotal = 0;
        int sumPositiv = 0; 
        int sumNegativ = 0;
        float mediaPositiv = 0;
        
        for (conta = 1; conta <= 10; conta++){        
        System.out.println("Nº " + conta + " :");
        num = tecla.nextInt();
        
        sumTotal += num;
        
        if (num < 0){
            numNegativ++;
            sumNegativ += num;
        } else {
            if (num == 0){
                numCero++;
          } else {
            numPositiv++;
            sumPositiv += num;
            }
          }
        }
        mediaPositiv = sumPositiv / numPositiv;
        mediaNegativ = sumNegativ / numNegativ;
        mediaTotal = sumTotal / 10;
        
        System.out.println("Los numeros negativos son " + numNegativ);
        System.out.println("Los numeros positivos son " + numPositiv);
        System.out.println("Los numeros negativos son " + numNegativ);
        System.out.println("Los numeros sceros son " + numCero);
        System.out.printf("Las medias son: para numeros positivos %d " + 
                "para numeros negativos %d y numeros ceors %d", numPositiv, numNegativ,
                numCero);
    }
}