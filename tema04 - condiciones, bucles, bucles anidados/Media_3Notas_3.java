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
public class Media_3Notas_3 {
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
        
        //boletin notas (insuficiente, suficiente, notable, bien, sobresaliente)
        System.out.println("------------------------------------------------------");
        
        if(media >= 9 && media <= 10){
            System.out.printf("Sobresaliente:  %.2f \n", media);
        }else if(media >= 8 && media < 9){
            System.out.printf("Muy bien:  %.2f \n", media);
        }else if(media >= 6 && media < 8){
            System.out.printf("Bien:  %.2f \n", media);
        }else if(media >= 5 && media < 6){
            System.out.printf("Suficiente:  %.2f \n", media);
        }else{
            System.out.printf("Insuficiente: %.2f \n", media);
        }
          /*          if(media == 10){
                System.out.println("La media de las tres notas es " +  media);
                System.out.println("SOBRESALIENTE");
            }else if(media < 10 && media >= 9 ){
                System.out.println("La media de las tres notas es " +  media);
                System.out.println("NOTABLE");
            }else if(media < 9 && media >= 7){
                System.out.println("La media de las tres notas es " +  media);
                System.out.println("BIEN");
            }else if(media < 7 && media >= 5){
                System.out.println("La media de las tres notas es " +  media);
                System.out.println("SUFICIENTE");
            }else{
                System.out.println("La media de las tres notas es " +  media);
                System.out.println("INSUFICIENTE");
            }*/
    }
}