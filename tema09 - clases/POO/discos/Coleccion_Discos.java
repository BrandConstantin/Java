package tema9;

import java.util.Scanner;

/**
 *
 * @author BrinCo
 */
public class Coleccion_Discos {
    //tamaño array
    static int T = 3;

    public static void main(String[] args){
        Scanner tecla = new Scanner(System.in);
        
        //el array de discos 
       Discos[] album = new Discos[T];
        
        for(int i = 0; i < T; i++){
            album[i] = new Discos("LIBRE", "Sin Autor", "Sin Titulo", "Sin Genero", 0);

        }
        
        int i;
        int opcion;
        String codigoIntrod;
        String autorIntrod;
        String tituloIntrod;
        String generoIntrod;
        String duracionIntrodString;
        int duracionIntrod;

        do {
            System.out.println("\n\nCOLECCIÓN DE DISCOS");
            System.out.println("===================");
            System.out.println("1. Listado");
            System.out.println("2. Nuevo disco");
            System.out.println("3. Modificar");
            System.out.println("4. Borrar");
            System.out.println("5. Salir");
            System.out.print("Introduzca una opción: ");
            opcion = Integer.parseInt(tecla.nextLine());
            
            switch(opcion){
                case 1: 
                    System.out.println("LISTADO DISCOS:");
                    System.out.println("------------------");
                    for(i = 0; i < T; i++){
                            System.out.println(album[i]);
                    }
                    break;
                case 2: 
                    //busca la primera posición para comprobar si esta libre
                    i = -1;
                    do{
                        i++;
                    }while(!((album[i].getCodigo()).equals("LIBRE")));
                                                         
                        System.out.println("");
                        System.out.println("INTRODUCIR DATOS DISCO");
                        System.out.println("-------------------------------------");

                        System.out.println("Album nº: " + (i + 1));

                        System.out.print("Código: ");
                        String c = tecla.nextLine();
                        (album[i]).setCodigo(c);
                        System.out.print("Autor: ");
                        String a = tecla.nextLine();
                        (album[i]).setAutor(a);
                        System.out.print("Titulo: ");
                        String t = tecla.nextLine();
                        (album[i]).setTitulo(t);
                        System.out.print("Genero: ");
                        String g = tecla.nextLine();
                        (album[i]).setGenero(g);
                        System.out.print("Duración: ");
                        int d = Integer.parseInt(tecla.nextLine());
                        (album[i]).setDuracion(d);

                        album[i] = new Discos(c, a, t, g, d);
                        
                    break;
                case 3:
                    System.out.println("MODIFICAR DISCO");
                    System.out.println("-------------------------");
                    System.out.println("Cual es el código del dico a modificar?");
                    codigoIntrod = tecla.nextLine();
                    
                    i = -1;
                    do{
                        i++;
                    }while(!((album[i].getCodigo()).equals(codigoIntrod)));
                    
                    System.out.println("Introduce los nuevos datos del disco");
                    System.out.println("-----------------------------------------");
                   
                    System.out.println("Código: " + album[i].getCodigo());
                    System.out.print("Nuevo código: ");
                    codigoIntrod = tecla.nextLine();
                    if (!codigoIntrod.equals(" ")) {
                        album[i].setCodigo(codigoIntrod);
                    }
                    System.out.println("Autor: " + album[i].getAutor());
                    System.out.print("Nuevo autor: ");
                    autorIntrod = tecla.nextLine();
                    if (!autorIntrod.equals("")) {
                        album[i].setAutor(autorIntrod);
                    }
                    System.out.println("Titulo: " + album[i].getTitulo());
                    System.out.print("Nuevo titulo: ");
                    tituloIntrod = tecla.nextLine();
                    if (!tituloIntrod.equals("")) {
                        album[i].setTitulo(tituloIntrod);
                    }
                    System.out.println("Genero: " + album[i].getGenero());
                    System.out.print("Nuevo género: ");
                    generoIntrod = tecla.nextLine();
                    if (!generoIntrod.equals("")) {
                        album[i].setGenero(generoIntrod);
                    }
                    System.out.println("Duración: " + album[i].getDuracion());
                    System.out.print("Duración: ");
                    duracionIntrodString = tecla.nextLine();
                    if (!duracionIntrodString.equals("")) {
                        album[i].setDuracion(Integer.parseInt(duracionIntrodString));
                    }
                    
                    break;
                case 4:
                    System.out.println("BORRAR DATOS DISCO");
                    System.out.println("-------------------------------");
                    
                    System.out.println("Introduzca el código del disco que quieres borrar");
                    codigoIntrod = tecla.nextLine();
                    
                    i = -1;
                    do{
                        i++;
                    }while(!((album[i].getCodigo()).equals(codigoIntrod)));
                    album[i].setCodigo("LIBRE");
                    album[i].setAutor("Sin Autor");
                    album[i].setTitulo("Sin Titulo");
                    album[i].setGenero("Sin Genero");
                    album[i].setDuracion(0);
                    System.out.println("Album borrado");
                    break;
                default:
            }
        }while(opcion != 5);
    }
}
