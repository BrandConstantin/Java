/**
 * Queremos calcular el tiempo en horas que empleará un vehículo en recorrer una distancia determinada (nos la
pedirá el programa en km para doubleroducirla desde teclado) teniendo en cuenta que conocemos la velocidad a la
que se desplaza (en km/h, también nos la pedirá el programa) y suponiendo que su movimiento es uniforme.
Recuerda que la expresión matemática que relaciona el desplazamiento, el tiempo y la velocidad para un objeto
con movimiento uniforme es e = v * t, donde e es el espacio recorrido, v la velocidad mantenida y t el tiempo que
se ha tardado.
 *
 * @author costy
 */
import java.util.Scanner;

public class distanciaCoche{
  public static void main(String[] args) {
      
      Scanner datos = new Scanner(System.in);
      
      System.out.println("Averiguar el tiempo empleado de un coche en recorer una distancia");
      
      System.out.println("Introduce la distancia expresada en km");
      double distancia = datos.nextDouble();
      System.out.println("Introduce la la velocidad expresada en km/h");
      double velocidad = datos.nextDouble();    
      
      double tiempo = distancia / velocidad; //para averiguar la distancia la formula es distancia=velocidad*tiempo
      
       System.out.printf("Para recorer esa distacia con esta velocidad hace falta un tiempo de %f. horas", tiempo);
       }
}
