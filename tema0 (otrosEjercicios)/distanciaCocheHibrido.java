/**
 * Realiza un programa que calcule los kilómetros que puede recorrer un coche híbrido. Los datos que
 * debe pedir el programa son el consumo medio en litros/100Km y los litros de gasolina que le quedan al
 * depósito. Suponemos que el 20% del tiempo, el coche funciona con baterías y no gasta nada de
 * combustible.
 *
 * @author costy
 */
import java.util.Scanner;

public class distanciaCocheHibrido{
  public static void main(String[] args) {
      
      Scanner datos = new Scanner(System.in);
      
      System.out.println("Averiguar los km que puede recorrer un coche hibrido:");
      System.out.print("===================================================================\n");   
      
      double km;
      double bateria;
      double kmTotal;
      
      System.out.println("Cuantos litros de gasolina gasta cada 100 km?");
      double litrosGasta = datos.nextDouble();
      System.out.println("Cuantos litros te quedan en el deposito?");
      double litrosTanque = datos.nextDouble();    
      System.out.print("===================================================================\n"); 
      
          km = (litrosTanque / litrosGasta) * 100;
          bateria = (km * 20) / 100;
          kmTotal = km + bateria;
          
          System.out.printf("El coche puede recorrer un total de de %2f km\n", km);
          System.out.println("Y añadiendo un 20% de la bateria, sera un total de " + kmTotal + " km");
       }
}
