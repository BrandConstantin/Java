/**
* Escribe un programa que pida un número entero y un dígito y que diga a continuación cuántas veces aparece el
* dígito dentro del número.
* Ejemplo 1:
* Por favor, introduzca un número entero con 5 dígitos como máximo: 3667
* Introduzca un dígito: 6
* El 6 aparece 2 veces dentro de 3667.
* 
* @author costy
 */
import java.util.Scanner;

public class DigitosDentroNumero {

public static void main(String[] args) {
Scanner teclado = new Scanner(System.in);
    
    long numIntrod;
    long digito;
    long reves = 0;
    int posicion = 1;
    //int vecesNum = 0;

    System.out.println("Introduce un numero");
    numIntrod = teclado.nextLong();
    
    System.out.println("Introduce un digito");
    digito = teclado.nextLong();
    
    do {
        reves = (reves * 10) + (numIntrod % 10);
        numIntrod = numIntrod / 10;
    } while (numIntrod > 0);
    do {
        if ((reves % 10) == digito){
        System.out.println("El digito aparece en las posiciones:" +  posicion);
        }
        reves = reves / 10;
        posicion++;
    } while (reves > 0);
  }
}