/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo;

import java.util.Scanner;

/**
 *
 * @author BrinCo
 */
public class PruebaGato {
    public static void main(String[] args){
        Scanner tecla = new Scanner(System.in);
        
        Gato[] gato = new Gato[4];
        int i;
        
        System.out.println("Introduce los gatos: ");
        System.out.println("------------------------------------------");
        
        for(i = 0; i < 4; i++){
            gato[i] = new Gato();
            System.out.println("Gato nº: " + (i + 1));
            System.out.println("Nombre: ");
            String n = tecla.nextLine();
            (gato[i]).setNombre(n);
            System.out.println("Raza: ");
            String r = tecla.nextLine();
            (gato[i]).setRaza(r);
            System.out.println("Edad: ");
            int e = tecla.nextInt();
            (gato[i]).setEdad(e);
            System.out.println("Color: ");
            String c = tecla.nextLine();
            (gato[i]).setColor(c);
        }
        
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
