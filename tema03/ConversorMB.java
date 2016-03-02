/*
 * Realiza un conversor de Kb a Mb.
 *
 * @author Costy
 */
import java.util.Scanner;
public class ConversorMB {
    public static void main (String[] args){
        Scanner tecla = new Scanner(System.in);
        
        System.out.println("CONVERSOR \"KB\" EN \"MB\""); 
        System.out.println("==================================================="); 
  
        System.out.println("Indica cuantos KB quieres convertir:");    
        int kb = tecla.nextInt();
        
        int mb = kb / 1024;
        
        System.out.printf("\nLos %d kb transformados en mb son %d mb:\n", kb, mb);
        System.out.println("==================================================="); 
    }
}