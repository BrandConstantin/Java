/*
 * Programa que pida números hasta que uno sea cero. En cada iteración (desde la segunda) debe imprimir la suma 
 * de los dos últimos números.
 */
package tema04;

import java.util.Scanner;

/**
 *
 * @author BrandConstantin
 */
public class Suma_Ultimos_Num {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);    
        
        int primerNum = -1;
        int segundoNum = -1;
        
        while(primerNum != 0 || segundoNum != 0){
            System.out.print("Escriba un número: ");
            primerNum = lector.nextInt();   
            System.out.print("Escriba un segundo número: ");
            segundoNum = lector.nextInt();   
            
            int resultado = primerNum + segundoNum ;
            System.out.println("Resultado de los dos últimos números es = " + primerNum + " + " + segundoNum + " = " + resultado);            
            
            if(primerNum == 0){
                segundoNum = primerNum;
                System.out.println("Programa finalizado!");
            }else if(segundoNum == 0){
                primerNum = segundoNum;
                System.out.println("Programa finalizado!");
            }
        }        
    }
}
