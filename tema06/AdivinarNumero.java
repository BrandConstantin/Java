/**
 * Escribe un programa que piense un número al azar entre 0 y 100. El usuario 
 * debe adivinarlo y tiene para ello 5 oportunidades. Después de cada intento 
 * fallido, el programa dirá cuántas oportunidades quedan y si el número 
 * introducido es menor o mayor que el número secreto. 
 * 
 * @author costy
 */
import java.util.Scanner;

public class AdivinarNumero {
  public static void main(String[] args) {
    
    Scanner num = new Scanner(System.in);
    
    int numAleatorio = (int)(Math.random()*101) + 0;
    int oportunidades = 5;
    int numIntrod = 0;
    boolean encontrado = true;
    
    System.out.println("Tienes SOLO 5 oportunidades de adivinarlo!! ");
    System.out.println("Introduce un numero");
    
    do { 
      for (oportunidades = 0; oportunidades < 5; oportunidades++){
        numIntrod = num.nextInt();
        
        if (numIntrod == numAleatorio){
          System.out.println("Has acertado el numero!!");
          encontrado = true;
        } else {
          if (numIntrod > numAleatorio){
            System.out.println("Tienes que ser un numero mas pequeño!!");
          } else {
            System.out.println("Tiene que ser un numero mas grande!!");
          }
        }
      } 
      System.out.println("Lo siento no hay mas intentos!!");
      System.out.println("El numero es " + numAleatorio);
    } while ((oportunidades > numAleatorio) && !encontrado);
  }
}
