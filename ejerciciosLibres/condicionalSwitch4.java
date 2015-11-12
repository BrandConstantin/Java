/*
 * Ejemplo de sentencia condicional con switch
 * Ejemplo 4
 * Ingrese 2 numero y escoger la operación que se quiere hacer con ellos
 *
 * @author costy
 */

import java.util.Scanner;

public class condicionalSwitch4 {
    public static void main(String[] args){
        
        Scanner in = new Scanner(System.in);
        double num1, num2, resto;
        int opcion;
        
        System.out.println("Ingrese primer numero:");
        num1 = in.nextDouble();
        System.out.println("Ingrese segundo numero:");
        num2 = in.nextDouble();
        
        System.out.println("Que operación quieres hacer?");
        System.out.println("[1] Suma");
        System.out.println("[2] Resta");
        System.out.println("[3] Multiplica");
        System.out.println("[4] Divide");
        System.out.println("Escoge solo de 1 a 4");
        opcion = in.nextInt();
        
        //Procesamiento
        switch (opcion) {
            case 1: resto = num1 + num2;
                System.out.println("La suma es " + resto);
                break;
            case 2: resto = num1 - num2;
                System.out.println("La resta es " + resto);
                break;
            case 3: resto = num1 * num2;
                System.out.println("La multiplicación es " + resto);
                break;
            case 4: if (num2 != 0){
                resto = num1 / num2;
                System.out.println("La division es " + resto);
            } else{
                System.out.println("No se puede dividir entre 0");
                break; 
            }

            default: System.out.println("Numero escogido fuera de rango"); break;
        }
    }
}
