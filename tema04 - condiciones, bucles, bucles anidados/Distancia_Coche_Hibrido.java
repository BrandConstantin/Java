/*
 * Realiza un programa que calcule los kilómetros que puede recorrer un coche híbrido. Los datos que
 * debe pedir el programa son el consumo medio en litros/100Km y los litros de gasolina que le quedan al
 * depósito. Suponemos que el 20% del tiempo, el coche funciona con baterías y no gasta nada de
 * combustible.
 */
package tema04;

import java.util.Scanner;

/**
 *
 * @author BrandConstantin
 */
public class Distancia_Coche_Hibrido {
    public static void main(String[] args) {
        Scanner datos = new Scanner(System.in);    
        
        double km;
        int consumaMedio;
        int litrosDeposito;
        double bateria;
        
        //pedir consumo medio de litros/100
        System.out.print("Cuanto litros gasta el coche por cada 100km: ");
        consumaMedio = datos.nextInt();
        //litros que le quedan en el deposito
        System.out.print("Cuantos litros de gasolina quedan en el deposito: ");
        litrosDeposito = datos.nextInt();
        //cuantos km puede recorrer?
        km = (litrosDeposito / consumaMedio) * 100;
        //si 20% es bateria electrica
        bateria = (km * 20) / 100;
        
        System.out.println("El coche puede recorrer " + km + " km con lo que tiene en el deposito");
        System.out.println("Más un 20% de bateria (" + bateria + "km) es un total de " + (km + bateria) + "km");
    }
}
