/*
 * Pedir 10 numeros y mostrar los negativos
 */
package tema.pkg0.b.condicionales.y.bucles;

import java.util.Scanner;

/**
 *
 * @author BrinCo
 */
public class Pedir_Num_Mostrar_Negativos {
    public static void main(String[] args) {
        Scanner tecla = new Scanner(System.in);
        
        int num;
        boolean negativo = false;
        int contarNegativos = 0;
        
        System.out.println("Mostrar negativos de 10 numeros");
        System.out.println("==================================");
        
        for(int i = 1; i <= 10; i++){
            System.out.println("Introduce el " + i + " numero: ");
            num = tecla.nextInt();
            
            if(num < 0){
                negativo = true;
                contarNegativos++;
            }
        }
        
        if(negativo == true){
            System.out.println("Se han introducido numeros negativos");
        }
        System.out.println("Se han introducido un total de " + contarNegativos + 
                " numeros negativos");
    }
}
