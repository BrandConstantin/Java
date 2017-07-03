/*
 * Amplía el programa anterior para que diga la nota del boletín (insuficiente,
 * suficiente, bien, notable o sobresaliente)
 */
package tema04;

import java.util.Scanner;

/**
 *
 * @author BrandConstantin
 */
public class Media_3Notas_1 {
    public static void main(String[] args) {
        Scanner t = new Scanner(System.in);
        
        System.out.print("Introduce la primera nota: ");
        int nota1 = t.nextInt();
        System.out.print("Introduce la segunda nota: ");
        int nota2 = t.nextInt();
        System.out.print("Introduce la tercera nota: ");
        int nota3 = t.nextInt();
        
        double media = (nota1 + nota2 + nota3) / 3;
                
        //por si meten otra nota que no deben introducir
        if ((nota1 >= 0) && (nota1 <= 10) &&
            (nota2 >= 0) && (nota2 <= 10) &&
            (nota3 >= 0) && (nota3 <= 10)){
           media = (int)(nota1 + nota2 + nota3) / 3; 
           System.out.printf("Tu media es %.2f \n", media);
        } else {
            media = -1;
            System.err.println("Has introducido alguna nota erronea!");
        }
    }
}