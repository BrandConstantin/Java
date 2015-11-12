/**
 * Escribe un programa que pida una base y un exponente (entero positivo) y que 
 * calcule la potencia.
 * 
 * @author costy
 */
import java.util.Scanner;

public class ejer14 {
  public static void main(String[] args) {   
    
    System.out.println("Escribe el base (numero entero positivo)");
    int base;
    Scanner teclado = new Scanner(System.in);
    base = teclado.nextInt();
    
    System.out.println("Escribe la exponente (numero entero positivo)");
    int expo;
    expo = teclado.nextInt();
    
    int potencia = 1;
    
        for (int i = 1; i <= expo; i++)
            potencia *= base;

    System.out.println(base + " ^ " + expo + " = " + potencia);
  }
}
