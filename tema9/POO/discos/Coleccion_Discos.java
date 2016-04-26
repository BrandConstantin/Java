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
public class Coleccion_Discos {
    //tamaño array
    static int T = 20;

    public static void main(String[] args){
        Scanner tecla = new Scanner(System.in);
        //el array de discos 
        Discos[] album = new Discos[T];
        
        int i;
        int opcion;
        int primeraPosicion = -1;

        do {
            System.out.println("\n\nCOLECCIÓN DE DISCOS");
            System.out.println("===================");
            System.out.println("1. Listado");
            System.out.println("2. Nuevo disco");
            System.out.println("3. Modificar");
            System.out.println("4. Borrar");
            System.out.println("5. Salir");
            System.out.print("Introduzca una opción: ");
            opcion = tecla.nextInt();
            
            switch(opcion){
                case 1: 
                    System.out.println("Listado Discos:");
                    System.out.println("------------------");
                    for(i = 0; i < T; i++){
                        if(!album[i].getCodigo().equals("LIBRE")){
                            System.out.println(album[i]);
                        }
                    }
                    break;
                case 2: 
                    //busca la primera posición para comprobar si esta libre
                    do{
                        primeraPosicion++;
                    }while(!((album[primeraPosicion].getCodigo()).equals("LIBRE")));
                    System.out.println("Introduzca datos del disco");
                    System.out.println("-------------------------------------");
                    
                    for(i = 0; i < album.length; i++){
                        album[i] = new Discos();
                        System.out.println("Album nº: " + (i + 1));

                        System.out.println("Código: ");
                        String c = tecla.nextLine();
                        (album[i]).setCodigo(c);
                        System.out.println("Autor: ");
                        String a = tecla.nextLine();
                        (album[i]).setAutor(a);
                        System.out.println("Titulo: ");
                        String t = tecla.nextLine();
                        (album[i]).setTitulo(t);
                        System.out.println("Genero: ");
                        String g = tecla.nextLine();
                        (album[i]).setGenero(g);
                        System.out.println("Duración: ");
                        int d = tecla.nextInt();
                        (album[i]).setDuracion(d);
                    }
        }while(opcion != 5);
    }
}
