/*
 * Ejemplo de sentencia condicional con switch
 * Ejemplo 3
 * Ingrese un numero entero y si este termina en 2, 5 u 8 reportar el cuadrado 
 * del numro, si este termina en 4, 7 o 9 reportar el numro multiplicado por 5,
 * y reportar el mismo numero en otro casos.
 *
 * @author costy
 */

import java.util.Scanner;

public class condicionalSwitch3 {
    public static void main(String[] args){
        
        Scanner in = new Scanner(System.in);
        System.out.println("Ingrese un numero entero:");
        int num = in.nextInt();
        
        //Procesamiento
        switch (num%10) {
            case 2: case 5: case 8: 
                System.out.println("El cuadrado del numero es: " + (num * num));
                break;
            case 4: case 7: case 9:
                System.out.println("El numero multiplicado por 5 es: " + 
                        (num * 5));
                break;
            default: System.out.println("El numero es: " + num); break;
        }
    }
}
