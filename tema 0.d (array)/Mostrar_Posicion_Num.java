/*
 * Leer numeros crecientemente ordenados, buscarlos en array y decir su posición
 */
package tema.pkg0.d.array;

import java.util.Scanner;

/**
 *
 * @author BrinCo
 */
public class Mostrar_Posicion_Num {
    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);
        
        int t[] = new int[10];
        int i;
        int j = 0;
        int num;
        
        System.out.println("Mostrar posición número ");
        System.out.println("============================================");
        
        for(i = 0; i < t.length; i++){
            System.out.print("Introduce número (de forma ascendente):");
            t[i] = tec.nextInt();
        }
        
        System.out.println("················································");
        
        System.out.println("Que número quieres buscar?");
        num = tec.nextInt();
        
        while((j < 10) && (t[j] < num)){
            j++;
        }
        
        if(j == 10){
            System.out.println("No he encontrado nada!");
        }else{
            if(t[j] == num){
                System.out.println("Esta en la posición " + j);
            }else{
                System.out.println("No he encontrado nada!");
            }
        }
    }
}
