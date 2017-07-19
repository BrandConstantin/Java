/*
 *  Realiza un programa que resuelva una ecuación de segundo grado (del tipo
 * ax 2 + bx + c = 0).
 */
package tema04;

import java.util.Scanner;

/**
 *
 * @author BrandConstantin
 */
public class Ecuacion_2Grado {
    public static void main(String[] args) {
        Scanner t = new Scanner(System.in);

        System.out.println("Dime cuanto es a: ");
        int a = t.nextInt();
        System.out.println("Dime cuanto es b: ");
        int b = t.nextInt();
        System.out.println("Dime cuanto es c:");
        int c = t.nextInt();

        System.out.println("............................................");

        double resultadoPositivo = 0;
        double resultadoNegativo = 0;
        
        if(a != 0){
            if(b != 0){
                if(c != 0){
                    if(Math.pow(b, 2) - (4 * a *c) >= 0){
                        resultadoPositivo = (-b + (Math.sqrt(Math.pow(b, 2) - (4 * a * c)))) / (2 * a);
                        resultadoNegativo = (-b - (Math.sqrt(Math.pow(b, 2) - (4 * a * c)))) / (2 * a);
                    }else{
                        System.out.println("Raiz cuadrada negativa");
                    }
                }else{
                    if((-b / a) >= 0){
                        resultadoPositivo = Math.sqrt(-b / a);
                        resultadoNegativo = -resultadoPositivo;
                    }else{
                        System.out.println("Raiz cuadrada negativa");
                    }
                }
            }else{
                if((-c / a) >= 0){
                    resultadoPositivo = Math.sqrt(-c / a);
                    resultadoNegativo = - resultadoPositivo;
                }else{
                    System.out.println("Raiz cuadrada negativa");
                }
            }
        }else{
            System.out.println("Ecuación sin soulución real");
        }
        
        if(!((resultadoPositivo > -0.00000001) && (resultadoPositivo < 0.00000001))){
            if(!((resultadoNegativo > - 0.0000001) && (resultadoNegativo < 0.00000001))){
                System.out.printf("Resultado 1: %.2f\n ", resultadoPositivo);
                System.out.printf("Resultado 2: %.2f\n ", resultadoNegativo);
            }
        }
    }
}
