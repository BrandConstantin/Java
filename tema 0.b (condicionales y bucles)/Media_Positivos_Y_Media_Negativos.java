/*
 * Pedir 10 numeros y mostrar media positivos y media negativos
 */
package tema.pkg0.b.condicionales.y.bucles;
import java.util.Scanner;

/**
 *
 * @author BrinCo
 */
public class Media_Positivos_Y_Media_Negativos {
    public static void main(String[] args) {
        Scanner tecla = new Scanner(System.in);

        int num;
        int ceros = 0;
        int positivos = 0;
        int negativos = 0;
        int sumaPositivos = 0;
        int sumaNegativos = 0;
        double mediaPositivos = 0;
        double mediaNegativos = 0;
        
        System.out.println("Calcular media positivos y negativos");
        System.out.println("==================================");
        
        for(int i = 1; i <= 10; i++){
            System.out.println("Introduce un número");
            num = tecla.nextInt();
            
            if(num == 0){
                ceros++;
            }else if(num < 0){
                negativos++;
                sumaNegativos += num;
            }else{
                positivos++;
                sumaPositivos += num;
            }
            
            mediaPositivos = (double)sumaPositivos / positivos;
            mediaNegativos = (double)sumaNegativos / negativos;
        }
        
        System.out.println("El total de ceros han sido de " + ceros);
        System.out.println("El total de numeros positivos ha sido de " + positivos);
        System.out.println("El total de numeros negativos ha sido de " + negativos);
        System.out.println("La media de los positivos es de " + mediaPositivos);
        System.out.println("La media de los negativos es de " + mediaNegativos);
    }
}
