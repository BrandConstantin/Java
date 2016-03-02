/*
 * Realiza un conversor de Mb a Kb.
 *
 * @author Costy
 */
import java.util.Scanner;
public class ConversorKB {
    public static void main (String[] args){
        Scanner tecla = new Scanner(System.in);
        
        System.out.println("CONVERSOR \"MB\" EN \"KB\""); 
        System.out.println("==================================================="); 
  
        System.out.println("Indica cuantos MB quieres convertir:");    
        int mb = tecla.nextInt();
        
        int kb = mb * 1024;
        
        System.out.printf("\nLos %d mb transformados en kb son %d kb:\n", mb, kb);
        System.out.println("==================================================="); 
    }
}