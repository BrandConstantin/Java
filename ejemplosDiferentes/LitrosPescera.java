/**
 *Realiza un programa que calcule los litros que caben en una pecera a partir de sus dimensiones (ancho, alto y 
 * largo en centímetros). Tanto los datos introducidos como el resultado pueden contener decimales.
 * 
 * @author brand
 */
import java.util.Scanner;

public class LitrosPescera {

    public static void main(String[] args) {

        Scanner dato = new Scanner(System.in);
        
        System.out.println("Introduce el ancho en centimetros de tu pescera:");
        double ancho = dato.nextDouble(); 
        System.out.println("Introduce el alto en centimetros de tu pescera:");
        double alto = dato.nextDouble(); 
        System.out.println("Introduce el largo en centimetros de tu pescera:");
        double largo = dato.nextDouble(); 
         System.out.print("===================================================================\n");
         
        Double volumen = ancho * alto * largo; 
        System.out.println("El volumen de tu pescera es de: " + volumen + " centimetros cubicos");
        double litros = volumen / 1000;
        System.out.println("Lo que significa que caben: "+ litros + " litros");
    }
}
