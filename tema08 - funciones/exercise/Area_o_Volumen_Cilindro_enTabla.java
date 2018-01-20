/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package git;

import java.util.Scanner;

/**
 *
 * @author brand
 */
public class Area_o_Volumen_Cilindro_enTabla {

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
        System.out.println("...............................................");
        
        resultado = functions.Functions.tablaCilindro(radio, altura);
        System.out.printf("%.2f \n", resultado[0]);
        System.out.printf("%.2f \n", resultado[1]);
    }
}
