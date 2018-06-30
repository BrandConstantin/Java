/*
 * Hacer la media de los números
 */
package tema04;

import java.util.Scanner;

/**
 *
 * @author BrandConstantin
 */
public class Media_Numeros {
    public static void main(String[] args) {
        Scanner tecla = new Scanner(System.in);    
        
        int num = 0;
        int contadorNegativos = 0;
        int contadorPositivos = 0;
        int ceros = 0;
        int sumaNegativos = 0;
        int sumaPositivos = 0;
        int sumaCeros = 0;
        
        do{
            System.out.print("Introduce número: ");
            num = tecla.nextInt();
                    
             if(num >= 0){
                contadorPositivos++;
                sumaPositivos += num;
            }
        }while(num >= 0);
        
        if(num < 0){
            System.out.println("No se puede hacer media con números negativos");
            System.out.println("El ultimo número se descarta");
            
            System.out.println("------------------------------------------");        
            System.out.println("Se han introducido un total de " + contadorPositivos + " números positivos");

            double mediaPositivos = (double)(sumaPositivos) / contadorPositivos;

            System.out.println("La media de los positivos es de " + mediaPositivos);
        }
    }
}
