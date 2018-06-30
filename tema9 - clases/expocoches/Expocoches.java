/*
 * Queremos gestionar la venta de entradas (no numeradas) de Expocoches
Campanillas que tiene 3 zonas, la sala principal con 1000 entradas disponibles,
la zona de compra-venta con 200 entradas disponibles y la zona vip
con 25 entradas disponibles. Hay que controlar que existen entradas antes de
venderlas.
 */

package expocoches;

import java.util.Scanner;

/**
 * mirar la definición de la clase zona
 * 
 * @author BrinCo
 */
public class Expocoches {
    public static void main(String[] args){
        Scanner tecla = new Scanner(System.in);
        
        Zona principal = new Zona(1000);
        Zona compraVenta = new Zona(200);
        Zona vip = new Zona(25);
        
        int opcion = 0;
        int opcion2 = 0;
        int entradas = 0;
        
        System.out.println("EXPOCOCHES CAMPANILLAS");
        System.out.println("------------------------------------------");
        
        do{
            System.out.println("1. Mostrar entradas disponibles");
            System.out.println("2. Vender entradas");
            System.out.println("3. Salir");
            System.out.println("------------------------------------------");
            
            opcion = tecla.nextInt();
            
            if(opcion == 1){
                System.out.println("En la zona principal hay " + principal.getEntradasPorVender() + 
                       " entradas disponibles" );
                System.out.println("En la zona compra venta hay " + compraVenta.getEntradasPorVender() + 
                       " entradas disponibles" );
                System.out.println("En la zona vip hay " + vip.getEntradasPorVender() + 
                       " entradas disponibles" );
            }
            
            if(opcion == 2){
                System.out.println("1. Zona Principal");
                System.out.println("2. Zona Compra Venta");
                System.out.println("3. Zona Vip");
                
                opcion2 = tecla.nextInt();
                
                System.out.println("Cuantas entradas quieres comprar?");
                entradas = tecla.nextInt();
                
                switch(opcion2){
                    case 1:
                        principal.vender(entradas);
                        break;
                    case 2: 
                        compraVenta.vender(entradas);
                        break;
                    case 3: 
                        vip.vender(entradas);
                        break;
                    default:
                }
            }
        }while(opcion < 3);
    }
}
