/*
 * Escribe un programa que calcule el volumen de un cono según la fórmula 
 * V = 1/3*3.14*r^2*h
 *
 * @author Costy
 */
import java.util.Scanner;
public class VolumenCono {
    public static void main (String[] args){
        Scanner tecla = new Scanner(System.in);
        
        System.out.println("CALCULAR VOLUMEN CONO"); 
        System.out.println("==================================================="); 
  
        System.out.println("Indica el radio:");    
        double r = tecla.nextDouble();
        
        System.out.println("Indica la altura:");
        double h = tecla.nextDouble();
       
        double resultado = (3.14 * (r * r) * h) / 3;
        
        System.out.println("Segun la formula:\n");
        System.out.printf("(pi(3.14) * (radio * radio) * altura) el resultado es: %.2f\n", resultado);
       
        System.out.println("==================================================="); 
    }
}