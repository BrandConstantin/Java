/**
 * Escribe un programa que diga si un número introducido por teclado es o no 
 * primo. Un número primo es aquel que sólo es divisible entre él mismo y la 
 * unidad.
 * 
 * @author costy
 */

public class ejer16 {
  public static void main(String[] args) {   
    
    System.out.println("Escribe un numero y te digo si es primo o no");
    int num = Integer.parseInt(System.console().readLine());
    
    int contador = 2;
    boolean primo = true;
    boolean numPrimo = true;
    
    if ((num == 1) || (num == 2) || (num == 3)){
      System.out.println("El numro es primo!");
    } else {
      while ((contador < num) && (primo)){
        if (num % contador == 0){
          primo = false;
        } else {
          primo = true;
        }
        contador++;
      } 
      if (primo){
        System.out.println("Numero primo!");
      } else {
        System.out.println("Numero no primo!");
      }
    }

  }
}
