/*
 * Realiza un programa que resuelva una ecuación de segundo grado (del tipo ax2+bx+c = 0).
 *
 * @author Costy
 */
import java.util.Scanner;
public class EcuacionSegundoGrado {
    public static void main (String[] args){
        Scanner tecla = new Scanner(System.in);

        System.out.println("CALCULAR ECUACIÓN SEGUNDO GRADO");
        System.out.println("====================================================");

        System.out.println("Dime el valor de a:");
        double a = tecla.nextDouble();
        System.out.println("Dime el valor de b:");
        double b = tecla.nextDouble();
        System.out.println("Dime el valor de c:");
        double c = tecla.nextDouble();
        
        double resultadoPos = 0;
        double resultadoNeg = 0;
        
        if (a != 0){
         if (b != 0){
           if (c != 0){
             if (Math.pow(b,2)-(4*a*c) >= 0){
               resultadoPos = (-b+(Math.sqrt(Math.pow(b,2)-(4*a*c))))/(2*a);
               resultadoNeg = (-b-(Math.sqrt(Math.pow(b,2)-(4*a*c))))/(2*a);
             }else{
               System.out.print("Raíz cuadrada negativa.");
             }
           }else{
             if ((-b/a) >= 0){
               resultadoPos = Math.sqrt(-b/a);
               resultadoNeg = -resultadoPos;
             }else{
               System.out.print("Raíz cuadrada negativa.");
             }
           }
         }else{
           if ((-c/a) >= 0){
             resultadoPos = Math.sqrt(-c/a);
             resultadoNeg = -resultadoPos;
           }else{
             System.out.print("Raíz cuadrada negativa.");
           }
         }
       }else{
         System.out.print("Ecuación sin solución real.");
       }

       if (!((resultadoPos > -0.00000001) && (resultadoPos < 0.00000001))){
         if (!((resultadoNeg > -0.0000001) && (resultadoNeg < 0.00000001))){
         System.out.printf("Resultado 1: %.2f\n", resultadoPos);
         System.out.printf("Resultado 2: %.2f", resultadoNeg);
         }
       }
    }
}
