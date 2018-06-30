/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo;

/**
 *
 * @author BrinCo
 */
public class PruebaGato2 {
    public static void main(String[] args){
        Gato2[] gato = new Gato2[4];
        int i;
        
        gato[0] = new Gato2("Bola de nieve 1", "siames", 1, "rosa");
        gato[1] = new Gato2("Bola de nieve 2", "siames", 2, "amarillo");
        gato[2] = new Gato2("Bola de nieve 1", "peludo", 3, "azul");
        gato[3] = new Gato2("Bola de nieve 1", "peludo", 4, "verde");
         
        System.out.println("Comprobar datos de los gatos");
        System.out.println("----------------------------------------------");
        
        for (i = 0; i < 4; i++){
            System.out.println("Gato nº: " + (i +1));
            System.out.println("Nombre: " + gato[i].getNombre());
            System.out.println("Raza: " + gato[i].getRaza());
            System.out.println("Edad: " + gato[i].getEdad());
            System.out.println("Color: " + gato[i].getColor());
        }
    }
}
