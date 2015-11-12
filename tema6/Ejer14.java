/**
 * Realiza un programa que haga justo lo contrario a lo que hace el ejercicio 6.
 * El programa intentará adivinar el número que estás pensando - un número entre
 * 0 y 100 - teniendo para ello 5 oportunidades. En cada intento fallido, el 
 * programa debe preguntar si el número que estás pensando es mayor o menor que 
 * el que te acaba de decir.
 * @author costy
 */
import java.util.Scanner;
public class Ejer14 {
  public static void main(String[] args){
      
    Scanner teclado = new Scanner(System.in);
    
    int numAleatorio;
    int oportunidades = 5;
    int mayor =100;
    int menor = 0;
    boolean encontrado = false;
    String respuesta = "";
    
    System.out.println("Voy a adivinar el numero que estas pensando! ");
    System.out.println("Responde con s si es si la respuesta o con n si es " + 
      " no");
    
    do { 
        numAleatorio  = (int)(Math.random()* (mayor - menor)) + menor;
        System.out.println("Es el numero adivinado " + numAleatorio + " ?");
        respuesta = teclado.next();
        oportunidades--;

            if ((respuesta.equals("s")) || (respuesta.equals("S"))){
                System.out.println("Has acertado el numero!!");
                encontrado = true;
            } else {
                if (oportunidades > 0){
                  System.out.println(numAleatorio + " es un numero mayor o menor?");
                  respuesta = teclado.next();
                } 
                if (respuesta.equals(">")){
                  mayor = numAleatorio;
                } else if (respuesta.equals("<")){
                    menor = numAleatorio + 1;
                }
              }
            if (oportunidades > 0){
                System.out.println("Te quedan " + oportunidades);
            }
    } while ((oportunidades > 0) && !encontrado);
    if (encontrado){
        System.out.println("He acertado! Un aplauzo para mi!");
    } else {
        System.out.println("Valienete pc mas retrasado soy!");
    }
  }
}
