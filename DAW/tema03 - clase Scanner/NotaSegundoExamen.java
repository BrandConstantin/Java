/*
 * Realiza un programa que calcule la nota que hace falta sacar en el segundo
 * examen de la asignatura Programación para obtener la media deseada. Hay
 * que tener en cuenta que la nota del primer examen cuenta el 40% y la del
 * segundo examen un 60%.
 */
package tema03;

import java.util.Scanner;

/**
 *
 * @author BrandConstantin
 */
public class NotaSegundoExamen {
    public static void main(String[] args) {
        Scanner t = new Scanner(System.in);
        
        int exam1;
        double media;
        
        System.out.println("Que nota sacaste en el primer examen? ");
        exam1 = t.nextInt();
        System.out.println("Que media quieres sacar en programación? ");
        media = t.nextDouble();
        System.out.println("-----------------------------------------------------------------------");
        
        double exam2 = (media - ((exam1 * 0.4) / 2) * 0.6);
        
        System.out.println("Para sacar una media de " + media + " hace falta sacar en el segundo "
                + " examen una nota de " + exam2);
    }
}
