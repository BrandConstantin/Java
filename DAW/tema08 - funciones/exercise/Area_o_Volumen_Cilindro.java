/*
Calcular área o el volumen, según se especifica, de un cilindro
 */
package git;

import functions.Functions;
import java.util.Scanner;

/**
 *
 * @author brand
 */
public class Area_o_Volumen_Cilindro {

    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);

        double radio;
        double altura;
        int opcion;

        System.out.println("Área o Volumen");
        System.out.println("···············································");
        System.out.println("Introduce radio: ");
        radio = tec.nextInt();
        System.out.println("Introduce altura: ");
        altura = tec.nextInt();
        System.out.println("...............................................");
        System.out.println("Escoge la opcion 1 - 2 (volumen o area) de lo "
                + "que quieres calcular: ");
        opcion = tec.nextInt();
        System.out.println("\n·················································");
        functions.Functions.cilindro(radio, altura, opcion);
    }
}
