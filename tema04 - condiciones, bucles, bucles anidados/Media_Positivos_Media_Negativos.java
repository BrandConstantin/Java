/*
 * Pedir 10 numeros y mostrar media positivos y media negativos
 */
package tema04;

import java.util.Scanner;

/**
 *
 * @author BrandConstantin
 */
public class Media_Positivos_Media_Negativos {
    public static void main(String[] args) {
        Scanner tecla = new Scanner(System.in);    
        
        int contadorNumeros = 10;
        int num = 0;
        int contadorNegativos = 0;
        int contadorPositivos = 0;
        int ceros = 0;
        int sumaNegativos = 0;
        int sumaPositivos = 0;
        int sumaCeros = 0;
        
        for(int i = contadorNumeros; i > 0; i--){
            System.out.print("Introduce número: ");
            num = tecla.nextInt();
                    
            if(num < 0){
                contadorNegativos++;
                sumaNegativos += num;
            }else if(num > 0){
                contadorPositivos++;
                sumaPositivos += num;
            }else{
                ceros++;
                sumaCeros += num;
            }
        }
        
        System.out.println("------------------------------------------");
        System.out.println("Se han introducido un total de " + contadorNegativos + " números negativos");
        System.out.println("Se han introducido un total de " + contadorPositivos + " números positivos");
        System.out.println("Se han introducido un total de " + ceros + " ceros");
        
        double mediaNegativos = (double)sumaNegativos / contadorNegativos;
        double mediaPositivos = (double)sumaPositivos / contadorPositivos;
        
        System.out.println("La media de los negativos es de " + mediaNegativos);
        System.out.println("La media de los positivos es de " + mediaPositivos);
        
        
    }
}
