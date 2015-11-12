/**
 * Escribe un programa en el que se declaren las variables enteras x e y . 
  *Asignales los valores 144 y 999 respectivamente. A continuación, muestra por
  *pantalla el valor de cada variable, la suma, la resta, la división y la 
  *multiplicación.
 *
 * @author Costy
 */

public class Ejer1 {
  public static void main(String[] args) {

    int x = 144;
    int y = 999;
    int suma;
    int resta;
    int division;
    int multiplicación;

    suma = x + y;
    resta = x - y;
    division = x / y;
    multiplicación = x * y;
    multiplicación = x * y;

    System.out.println("El resultado de 144 y 999 sumados es " + suma); 
    System.out.println("El resultado de 144 y 999 restados es " + resta);     
    System.out.println("El resultado de 144 y 999 divididos es " + division); 
    System.out.println("El resultado de 144 y 999 multiplicados es " + 
                        + multiplicación);   
  }
}
