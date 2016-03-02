/*
 * Realiza un programa que calcule el tiempo que tardará en caer un objeto desde una altura
 * h. Aplica la fórmula t = √2hg siendo g = 9:81m/s2
 *
 * @author Costy
 */
import java.util.Scanner;
public class MediaTresNotas {
        public static void main (String[] args){
        Scanner tecla = new Scanner(System.in);
        
        System.out.println("CALCULAR MEDIA DE 3 NOTAS");
        System.out.println("====================================================");
        
        System.out.println("Dime la I nota obtenida");
        double nota1 = tecla.nextDouble();
        System.out.println("Dime la II nota obtenida");
        double nota2 = tecla.nextDouble();
        System.out.println("Dime la III nota obtenida");
        double nota3 = tecla.nextDouble();
        if ((nota1 >= 0) && (nota1 <= 10) &&
            (nota2 >= 0) && (nota2 <= 10) &&
            (nota3 >= 0) && (nota3 <= 10)){
           double media = (nota1 + nota2 + nota3) / 3; 
           System.out.printf("Tu media es %.2f ", media);
        } else {
            System.err.println("Has introducido alguna nota erronea!");
        }

    }
}
