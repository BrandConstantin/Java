/*
 * Mostrar número al revés
 */
package tema.pkg0.a;
import java.util.Scanner;
/**
 *
 * @author BrinCo
 */
public class NumeroReves {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        int num;
        int decenasMillar, unidadesMillar, centena, decena, unidad;
        
        System.out.print("Introduce un número de hasta 99.999: ");
        num = teclado.nextInt();
        
        System.out.println("-------------------------------------");
        
        //unidades
        unidad = num % 10;
        num /= 10;
        
        //decenas
        decena = num % 10;
        num /= 10;
        
        //centenas
        centena = num % 10;
        num /= 10;
        
        //unidadesMillar
        unidadesMillar = num % 10;
        num /= 10;
        
        //decenasMillar
        decenasMillar = num % 10;
        num /= 10;
        
        //imprimir los numeros
        System.out.println(unidad + " " + decena + " " + centena + " " + 
                            unidadesMillar + " " + decenasMillar);
    }
    
}
