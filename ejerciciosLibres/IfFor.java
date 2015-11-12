/* Lee 10 numeros enteros desde teclado y indicar cuantos de ellos son positivos
 * y cuantos negativos y cuantos 0 hay. Tambien se calcula la suma de los negati-
 * os y su media, la suma de los positivos y su media y la suma de los 100 u media
 *
 * @author costy
 */

import java.util.Scanner;

public class IfFor {
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