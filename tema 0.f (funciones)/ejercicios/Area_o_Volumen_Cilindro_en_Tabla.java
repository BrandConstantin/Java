/*
 * Calcular área o el volumen, según se especifica, de un cilindro
 * en una tabla
 */
package ejercicios;

import java.util.Scanner;

/**
 *
 * @author BrinCo
 */
public class Area_o_Volumen_Cilindro_en_Tabla {
    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);
        
        double radio;
        double altura;
        double resultado[];
        
        System.out.println("Área o Volumen");
        System.out.println("···············································");
        System.out.println("Introduce radio: ");
        radio = tec.nextInt();
        System.out.println("Introduce altura: ");
        altura = tec.nextInt();
        System.out.println("\n·················································");
        resultado = funciones.Varias.tablaCilindro(radio, altura);
        System.out.println("El volumen es de " + resultado[0]);
        System.out.println("El área es de " + resultado[1]);
    }
}
