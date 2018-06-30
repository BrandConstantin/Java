/*
 * Implementa una función que pinte un cuadrilátero por pantalla hecho con asteriscos. En general, los
cuadriláteros son figuras geométricas de cuatro lados, no obstante, en este ejercicio nos centraremos
únicamente en el cuadrado y el rectángulo. Si la función recibe dos parámetros (un número y un
valor lógico) se deberá pintar por pantalla un cuadrado y si recibe tres (dos números y un valor lógico)
pintará un rectángulo. El parámetro lógico relleno indica si la figura está o no rellena. Las cabeceras
se indican a continuación:
public static void pintaCuadrilatero(int lado, boolean relleno)
public static void pintaCuadrilatero(int anchura, int altura, boolean relleno)
Por ejemplo pintaCuadrilatero(6, 4, false) pintaría un rectángulo hueco de 6 asteriscos de
ancho y 4 de alto.
 */
package t2c2_b;

import java.util.Scanner;

/**
 *
 * @author BrinCo
 */
public class Cuadrilatero {
    public static void main(String[] args) {
        Scanner t = new Scanner (System.in);
        System.out.println("CUADRILATERO");
        System.out.println("-----------------------------------------------------------------------------");
        
        System.out.println("Cuadrilatero relleno con 4 de lados: ");
        pintaCuadri(4, false);
        
        System.out.println("Cuadrilatero relleno con 4 de lado: ");
        pintaCuadri(4, true);
        
        System.out.println("Rectangulo sin relleno con 5 de ancho y 9 de alto: ");
        pintaCuadri(5, 9, false);
        
        System.out.println("Rectangulo con relleno con 15 de ancho y 3 de alto: ");
        pintaCuadri(15, 3, true);
        
        System.out.println("--------------------------------------------------");
    }
    
    public static void pintaCuadri(int lado, boolean relleno){
        pintaCuadri(lado, lado, relleno);
    }
    
    public static void pintaCuadri(int anchura, int altura, boolean relleno){
        for(int i = 0; i < altura; i++){
            for(int j = 0; j < anchura; j++){
                if(i == 0 || i == (altura - 1) || j == 0 || j == (anchura - 1) || relleno){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println(" ");
        }
    }
}
