/**
 * Escribe un programa que calcule la media de un conjunto de números positivos 
 * introducidos por teclado. A priori, el programa no sabe cuántos números se 
 * introducirán. El usuario indicará que ha terminado de introducir los datos 
 * cuando meta un número negativo.
 * 
 * @author costy
 */
import java.util.Scanner;

public class ejer10 {
  public static void main(String[] args) {   
    
    double num = 0;
    double suma = 0;
    double media;
    double contador = 0;
    
    do {
      System.out.println("Introduce los numeros positivos que quieres hacer la " +
        " media");
    Scanner teclado = new Scanner(System.in);
    num = teclado.nextInt();
      contador++;
      suma += num;
    } 
    while (num > 0 && num < 100000);
      System.out.println("Has introducido un numero negativo, el programa " + 
        " termina aqui!!! ");
    System.out.println("La media es " + (media = (suma - num) / (contador -1)));
  }
}
