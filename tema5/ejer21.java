/**
 * Realiza un programa que vaya pidiendo números hasta que se introduzca un 
 * numero negativo y nos diga cuantos números se han introducido, la media de
 * los impares y el mayor de los pares. El número negativo sólo se utiliza para
 * indicar el final de la introducción de datos pero no se incluye en el cómputo.
 * 
 * @author costy
 */

public class ejer21 {
  public static void main(String[] args) {   
    
    System.out.println("Introduce numeros (el programa finaliza con un numero " + 
        " con un numero negativo ):");
    
    //int numIntrod;
    int num = 0;
    int pares = 0;
    int impares = 0;
    int suma = 0;
    
    do {
      int numIntrod = Integer.parseInt(System.console().readLine());
      num++;

      if ((numIntrod % 2) == 1){
        suma += numIntrod;
        impares++;
      } else {
        if (numIntrod > pares){
          pares = numIntrod;
        }
      }
    } while (numIntrod >= 0);
    System.out.println("Se han introducido " + (num - 1) + " numeros");
    System.out.println("Media de los impares es " + (suma / impares));
    System.out.println("El mayor de los pares es " + pares);
  }
}
