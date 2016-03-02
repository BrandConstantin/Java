/*
 * Realiza un programa que calcule el tiempo que tardará en caer un objeto desde una altura
 * h. Aplica la fórmula t = √2hg siendo g = 9:81m/s2
 *
 * @author Costy
 */
import java.util.Scanner;
public class NotasBoletinConIf {
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
        
        double media = 0;
        
        if ((nota1 >= 0) && (nota1 <= 10) &&
            (nota2 >= 0) && (nota2 <= 10) &&
            (nota3 >= 0) && (nota3 <= 10)){
           media = (nota1 + nota2 + nota3) / 3; 
           System.out.printf("Tu media es %.2f ", media);
        } else {
            System.err.println("Has introducido alguna nota erronea!");
        }
        
        if ((media >= 0) && (media < 5)){
            System.out.println("Has obtenido un INSUFICIENTE");
        } else if ((media >= 5) && (media < 7)){
            System.out.println("Has obtenido un SUFICIENTE");
        } else if ((media >= 7) && (media < 8)){
            System.out.println("Has obtenido un BIEN");
        } else if ((media >= 8) && (media < 9)){
            System.out.println("Has obtenido un NOTABLE");
        } else {
            System.out.println("Has obtenido un SOBRESALIENTE");
        }
    }
}
