/**
 * Escribe un programa que diga cuál es la primera cifra de un número entero introducido
por teclado. Se permiten números de hasta 5 cifras.
 * 
 * @author costy
 */
import java.util.Scanner;
public class PrimeraCifraIntroducida {
  public static void main(String[] args) {   
    Scanner tecla = new Scanner(System.in);
  
    System.out.println("PRIMERA CIFRA INTRODUCIDA POR TECLADO (numero formado por 5 cifras)");
    System.out.println("================================================");

    System.out.println("Introduce un numero de hasta 5 digitos");
    int num = tecla.nextInt();
    
    int digito;
    
    if((num > 0) && (num < 10)){
        digito = num;
        System.out.printf("La primera cifra introducida ha sido %d ", digito);
    } else if ((num > 10) && (num < 100)){
        digito = num / 10;
        System.out.printf("La primera cifra introducida ha sido %d ", digito);
    } else if ((num > 100) && (num < 1000)){
        digito = num / 100;
        System.out.printf("La primera cifra introducida ha sido %d ", digito);
    } else if ((num > 1000) && (num < 10000)){
        digito = num / 1000;
        System.out.printf("La primera cifra introducida ha sido %d ", digito);
    } else if ((num > 10000) && (num < 100000)){
        digito = num / 10000;
        System.out.printf("La primera cifra introducida ha sido %d ", digito);
    } else {
        System.err.print("Error: No se permiten mas de 5 digitos!");
    }
    
  }
}
