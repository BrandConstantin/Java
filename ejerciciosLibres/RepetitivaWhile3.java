/* 
 * Introducir numeros por teclado para calcular suma y media. 
 * Los numeros tienen que ser positivos, al leer uno negativo vuelve a pedir
 * Los 0 no se tienen en cuenta. Aparte de suma y media se mostrará total inten-
 * tos y cantidad numeros leidos
 * @author costy
 */

import java.util.Scanner;

public class RepetitivaWhile3 {
    public static void main(String[] args){
        
        int numero;
        int totalParaLeer;
        int intentosDeLectura = 0;
        int numLeidos = 0;
        int sumaNum = 0;
        float media = 0.0f;

        System.out.println("Cuantos numeros no nulos quieres leer?");
        
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce un numero no negativo:");
        totalParaLeer = teclado.nextInt();

        if (totalParaLeer < 0) {
            System.err.println("Error no se puede leer una cantidad negativa");
        } else {
            if (totalParaLeer == 0){
                System.out.println("No quieres leer ningun numero!");
            } else {
                while (numLeidos < totalParaLeer){
                    System.out.print("Numero " + (numLeidos + 1) + " - ");
                    numero = teclado.nextInt();
                    intentosDeLectura++;
                    if (numero >= 0){
                        numLeidos++;
                        sumaNum += numero;
                    } else {
                        System.out.println("El numero " + numLeidos + " es neg" +
                                "ativo y se descarta");
                    }
                }
                media = ((float) sumaNum) / numLeidos;
                System.out.println("Se han realizado " + intentosDeLectura + 
                        " intentos de lectura, de los cuales leido han sido " + 
                        numLeidos + ". Suma es de " + sumaNum + " y media de " + 
                        media);
            }
        }
    }
}