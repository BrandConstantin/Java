/**
 *
 * @author costy
 *
 * Teniendo en cuenta que un ángulo de 360º equivale a 2π radianes, hacer un programa que pida un valor entero de 
 * x grados por pantalla y escriba a cuantos radianes equivale.
 */
import java.util.Scanner;
public class GradosaRadianes {
    public static void main(String[] args) {

        System.out.println("Escriba el número de grados a pasar a radianes: ");

        Scanner lector = new Scanner(System.in);
        int grados = lector.nextInt() ;

        float resultado = (float) (2 * Math.PI * grados / 360) ;

        System.out.println(grados + "º equivalen a: " + resultado + " radianes");
    }
    
}