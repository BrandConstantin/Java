/*
 * Pedir 5 sueldos y decir cuantos hay más de 1000 euros
 */
package tema.pkg0.b.condicionales.y.bucles;
import java.util.Scanner;

/**
 *
 * @author BrinCo
 */
public class Sueldos_Mayores_1000 {
    public static void main(String[] args) {
        Scanner tecla = new Scanner(System.in);

        int sueldo;
        int sumaSueldos = 0;
        int mayorMil = 0;
        
        System.out.println("Ver cuantos sueldos superiores a 1000 hay");
        System.out.println("==================================");
        
        for(int i = 1; i <= 5; i++){
            System.out.println("Introduce un sueldo:");
            sueldo = tecla.nextInt();
            
            if(sueldo > 1000){
                mayorMil++;
            }
            
            sumaSueldos = sumaSueldos + sueldo;
        }
        
        System.out.println("La suma de los sueldos es de " + sumaSueldos);
        System.out.println("Mayores de 1000 € hay un total de  " + mayorMil + " sueldos");
    }
}
