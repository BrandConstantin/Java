/**
 * Realiza un programa que nos diga cuántos dígitos tiene un número entero que puede ser
 * positivo o negativo. Se permiten números de hasta 5 dígitos.
 * 
 * @author costy
 */
import java.util.Scanner;
public class ContarDigitosNumero {
  public static void main(String[] args) {   
    Scanner tecla = new Scanner(System.in);
  
    System.out.println("PRIMERA CIFRA INTRODUCIDA POR TECLADO (numero formado por 5 cifras)");
    System.out.println("================================================");

    System.out.println("Introduce un numero de hasta 5 digitos");
    int num = tecla.nextInt();
    
    if(((num > 0) && (num < 10)) || ((num > -1) && (num < -10))){
        System.out.println("El numero tiene 1 digito");
    } else if (((num > 10) && (num < 100)) || ((num > -10) && (num < -100))){
        System.out.println("El numero tiene 2 digitos");
    } else if (((num > 100) && (num < 1000)) || ((num > -100) && (num < -1000))){
        System.out.println("El numero tiene 3 digitos");
    } else if (((num > 1000) && (num < 10000)) || ((num > -1000) && (num < -10000))){
        System.out.println("El numero tiene 4 digitos");
    } else if (((num > 10000) && (num < 100000)) || ((num > -10000) && (num < -100000))){
        System.out.println("El numero tiene 5 digitos");
    } else {
        System.err.print("Error: No se permiten mas de 5 digitos!");
    }
    
  }
}
