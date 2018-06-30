/*
 * Queremos calcular el tiempo en horas que empleará un vehículo en recorrer una distancia determinada (nos la
 * pedirá el programa en km para doubleroducirla desde teclado) teniendo en cuenta que conocemos la velocidad a la
 * que se desplaza (en km/h, también nos la pedirá el programa) y suponiendo que su movimiento es uniforme.
 * Recuerda que la expresión matemática que relaciona el desplazamiento, el tiempo y la velocidad para un objeto
 * con movimiento uniforme es e = v * t, donde e es el espacio recorrido, v la velocidad mantenida y t el tiempo que
 * se ha tardado.
 */
package tema04;

import java.util.Scanner;

/**
 *
 * @author BrandConstantin
 */
public class Distancia_Coche {
    public static void main(String[] args) {
        Scanner datos = new Scanner(System.in);   
        
        int tiempo;
        double distancia;
        int kmXh;
        
        //se pide la distancia
        System.out.print("Que distancia en km recorrera el coche: ");
        distancia = datos.nextDouble();
        //km/h que corre el coche
        System.out.print("A que velocidad corre el coche (en km/h): ");
        kmXh = datos.nextInt();
        //saber tiempo en horas de una distancia
        //formula e = v * t
        tiempo = (int)(distancia / kmXh) * 60; //tiempo en minutos por esto '* 60'
      
       System.out.printf("Para recorer la distacia de %.2f km con una velocidad de %dkm/h hace falta un tiempo de %d minutos", distancia, kmXh, tiempo);
    }
}
