/*
 * To change this license header, choose License Headers in Project Properties.
 * Desplasar los valores de un array n posiciones
 */
package tema.pkg0.d.array;
import java.util.Scanner;

public class Desplazar_N_Posiciones {
    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);
        
        int c[] = new int[6];
        int ultimo;
        int i;
        int posicion;
        int vuelta;
        
        System.out.println("Desplazar valores de un array");
        System.out.println("============================================");
        
        for(i = 0; i < 6; i++){
            System.out.println("Introduce número: ");
            c[i] = tec.nextInt();
        }
        
        System.out.println("============================================");
        for(i = 0; i < 6; i++){
            System.out.print(c[i] + " ");
        }
        
        //preguntar cuantas posiciones quiere desplazar
        System.out.println("\nCuantas posiciones quieres desplazar? "
                + "(elije un número comprendido entre 1 y 6");
        posicion = tec.nextInt();
        
        System.out.println("\n============================================");
        
        if(posicion > 6){
            System.out.println("Opción erronea!");
        }else{
            for(vuelta = 1; vuelta <= posicion; vuelta++){
            //guardamos el ultimo elemento
            ultimo = c[5];

            //desplazamos los elementos hacia ultima posición
            //al desplazarlo perdemos el ultimo valor, por esto lo hemos guardado
            for(i = 4; i >= 0; i--){
                c[i + 1] = c[i];
            }

            //el ultimo valor pasa a ser primero
            c[0] = ultimo;
            }
        }
        
        //mostrar resultado
        for(i = 0; i < 6; i++){
            System.out.print(c[i] + " ");
        }
    }
}
