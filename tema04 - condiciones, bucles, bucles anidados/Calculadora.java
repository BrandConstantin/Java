/*
 * Sumar números hasta que se introduce un 0
* Restar números si son menores que 0
 */
package tema04;

import java.util.Scanner;

/**
 *
 * @author BrandConstantin
 */
public class Calculadora {
    public static void main(String[] args) {
        Scanner tecla = new Scanner(System.in);
        
        double num = 0;
        double suma = 0;
        double resta = 0;
        double sumaFinal = 0;
        
        System.out.println("Introduce numero:");
        num = tecla.nextDouble();
        
        System.out.println("==================================");                        
        
        while(num != 0){
            if(num > 0){
                suma += num;
                System.out.println("Suma: " + suma);

                System.out.println("Introduce numero:");
                num = tecla.nextDouble();          
            }
            
            if(num < 0){
                suma = suma - (-num);
                System.out.println("Suma: " + suma);

                System.out.println("Introduce numero:");
                num = tecla.nextDouble();    
            }
            
            sumaFinal = suma + resta;
        }            
        
        if(num == 0){
            System.out.println("Suma final: " + sumaFinal);
        }
    }
}
