/*
 * Realiza un programa que calcule el tiempo que tardará en caer un objeto desde una altura
 * h. Aplica la fórmula t = √2hg siendo g = 9:81m/s2
 *
 * @author Costy
 */
import java.util.Scanner;
public class NotasBoletinConSwitch {
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
        
        int media = 0;
        
        if ((nota1 >= 0) && (nota1 <= 10) &&
            (nota2 >= 0) && (nota2 <= 10) &&
            (nota3 >= 0) && (nota3 <= 10)){
           media = (int)(nota1 + nota2 + nota3) / 3; 
           System.out.printf("Tu media es %d ", media);
        } else {
            System.err.println("Has introducido alguna nota erronea!");
        }
        
        switch (media){
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
                System.out.println("Has obtenido un INSUFICIENTE");  
                break;
            case 5:
            case 6:
                System.out.println("Has obtenido un SUFICIENTE");
                break;
            case 7:
                System.out.println("Has obtenido un BIEN");
                break;
            case 8:
            case 9:
                System.out.println("Has obtenido un NOTABLE");
                break;
            case 10:
                System.out.println("Has obtenido un SOBRESALIENTE");
                break;
        }
    }
}
