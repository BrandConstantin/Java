/**
 * Realiza un programa que nos diga cuántos dígitos tiene un número entero que
 * puede ser positivo o negativo. Se permiten números de hasta 5 dígitos.
 * 
 * @author costy
 */

public class Ejer19 {
  public static void main(String[] args) {   
    
    System.out.println("Escribe cualquier numero y te digo la primera cifra");
    System.out.println("Se permiten numeros solo hasta 5 cifras");
    
    int numero = Math.abs(Integer.parseInt(System.console().readLine()));
    
    int digitos;
    
    if (((numero > 10000) && (numero < 100000)) &&
       ((numero < -10000) && (numero > -100000))){
      System.out.println("El numero tiene 5 digitos ");
    } else if (((numero > 1000) && (numero < 10000)) && 
              ((numero > -1000) && (numero < -10000))){
      System.out.println("El numero tiene 4 digitos ");
    } else if (((numero > 100) && (numero < 1000)) && 
               ((numero > -100) && (numero < -1000))){
      System.out.println("El numero tiene 3 digitos ");
    } else if (((numero > 10) && (numero < 100)) &&
              ((numero > -10) && (numero < -100))){
      System.out.println("El numero tiene 2 digitos ");
    } else if (((numero > 1) && (numero < 10)) &&
              ((numero > -1) && (numero < -10))){
      System.out.println("El numero tiene 1 digitos ");
    } else {
      System.out.println("NO SE PERMITEN NUMEROS DE MAS DE 6 CIFRAS !!! ");
    }
  }
}
