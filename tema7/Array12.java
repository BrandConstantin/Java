/*
 * Realiza un programa que pida 10 números por teclado y que los almacene en un array. A 
 * continuación se mostrará el contenido de ese array junto al índice (0 – 9). Seguidamente el 
 * programa pedirá dos posiciones a las que llamaremos “inicial” y “final”. Se debe comprobar que 
 * inicial es menor que final y que ambos números están entre 0 y 9. El programa deberá colocar el
 * número de la posición inicial en la posición final, rotando el resto de números para que no se 
 * pierda ninguno. Al final se debe mostrar el array resultante. 
 * Por ejemplo, para inicial = 3 y final = 7:
 * 
 * 
 *@Costy 
 */
 
import java.util.Scanner;

public class Array12 {
  public static void main(String[] args) {
    
    Scanner num = new Scanner(System.in);
    
    int[] numero = new int[10];
    int[] numCambiado = new int[10];
    String verde = "\033[32m";
    String azul = "\033[34m";
    String naranja = "\033[33m";
    int i;
    int inicial = 0;
    int finala = 0;
    
    System.out.println("Escribe 10 numeros:");
    System.out.println("===================================================");
    
    //Se guardan los numeros en un array
    for (i = 0; i < numero.length; i++) {
      System.out.print((i + 1) + " numero:");
      numero[i] = Integer.parseInt(num.nextLine());
    }
    
    System.out.println(naranja + "=======================================================================");

    //Mostras el indice y sus numeros guardados en el array
    for (i = 0; i < numero.length; i++){
      System.out.print(verde + i + "\t");
    }
    System.out.println("\n-----------------------------------------------------------------------\n");
    for (i = 0; i < numero.length; i++){
      System.out.print(azul + numero[i] + "\t");
    }
    
    do {        
        if (((inicial > 0) || (inicial < 9)) && ((finala > 0) || (finala < 9))){
            System.out.println("\nIntroduce la posicion inicial:");
            inicial = Integer.parseInt(num.nextLine());
            System.out.println("Introduce la posicion final(mayor que el numero inicial):");
            finala = Integer.parseInt(num.nextLine());
            for (i = 0; i < numero.length; i++){
                numCambiado[i] = numero[i];
            }
            
            numCambiado[inicial] = numero[finala];
            
            for (i = finala + 1; i < 10; i++){
                numCambiado[i] = numero[i - 1];
            }
            
            numCambiado[0] = numero[9];
            
            for (i = 0; i < inicial; i++){
                numCambiado[i + 1] = numero[i];
            }
            
            numCambiado[finala] = numCambiado[inicial];
        }
    } while (finala < inicial);
      
    //Mostras el indice y sus numeros guardados en el array cambiado
    for (i = 0; i < numero.length; i++){
      System.out.print(verde + i + "\t");
    }
    System.out.println("\n-----------------------------------------------------------------------\n");
    for (i = 0; i < numero.length; i++){
      System.out.print(azul + numCambiado[i] + "\t");
    }
  }
}
