/*
 * Modifca el programa “Colección de discos” como se indica a continuación:
 *     a) Mejora la opción “Nuevo disco” de tal forma que cuando se llenen todas
 *        las posiciones del array, el programa muestre un mensaje de error. No se
 *        permitirá introducir los datos de ningún disco hasta que no se borre alguno
 *        de la lista.
 *     b) Mejora la opción “Borrar” de tal forma que se verifique que el código
 *        introducido por el usuario existe.
 *     c) Modifca el programa de tal forma que el código del disco sea único, es
 *        decir que no se pueda repetir.
 *     d) Crea un submenú dentro dentro de “Listado” de tal forma que exista un
 *        listado completo, un listado por autor (todos los discos que ha publicado un
 *        determinado autor), un listado por género (todos los discos de un género
 *        determinado) y un listado de discos cuya duración esté en un rango
 *        determinado por el usuario.
 */
package ColeccionDiscosMejorado;
import java.util.Scanner;

/**
 *
 * @author BrinCo
 */

public class ColeccionDiscosMejorado {
    //tamaño array
    static int T = 3;

    public static void main(String[] args){
    Scanner tecla = new Scanner(System.in);

    //el array de discos 
   tema9.Discos[] album = new tema9.Discos[T];

    for(int i = 0; i < T; i++){
        album[i] = new tema9.Discos("LIBRE", "Sin Autor", "Sin Titulo", "Sin Genero", 0);

    }

    int i = 0;
    int opcion;
    int primeraPosicion = -1;
    boolean codigoExistente = false;
    String codigoIntrod = "";
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
            /*case 1: 
                System.out.println("LISTADO DISCOS:");
                System.out.println("------------------");
                for(i = 0; i < T; i++){
                        System.out.println(album[i]);
                }
                break;*/
                
            case 2: 
                System.out.println("\nNUEVO DISCO");
                System.out.println("--------------------------------");

                // buscar posición libre del array
                primeraPosicion = 0;
                String c = album[primeraPosicion].getCodigo();
                while ((primeraPosicion < T) && (!(c.equals("LIBRE")))) {
                    primeraPosicion++;
                    if(primeraPosicion < T) {
                        c = album[primeraPosicion].getCodigo();
                    }
                }

                if (primeraPosicion == T) {
                    System.out.println("Lo siento, a base de datos está llena.");
                } else {
                    System.out.println("Por favor, introduzca los datos del disco.");  
                    System.out.print("Código: ");

                    // comprobar si se repite el código
                    codigoExistente = true;
                    while (codigoExistente) {
                        codigoExistente = false;
                        codigoIntrod = tecla.nextLine();

                        for (i = 0; i < T; i++){
                           if (codigoIntrod.equals(album[i].getCodigo())) {
                               codigoExistente = true;
                            }
                        }

                        if (codigoExistente) {
                           System.out.println("Ese código ya existe en la base de datos.");
                           System.out.print("Introduzca otro código: ");
                        }
                    } 

                    (album[primeraPosicion]).setCodigo(codigoIntrod);
                    System.out.print("Autor: ");
                    String a = tecla.nextLine();
                    (album[primeraPosicion]).setAutor(a);
                    System.out.print("Titulo: ");
                    String t = tecla.nextLine();
                    (album[primeraPosicion]).setTitulo(t);
                    System.out.print("Genero: ");
                    String g = tecla.nextLine();
                    (album[primeraPosicion]).setGenero(g);
                    System.out.print("Duración: ");
                    int d = Integer.parseInt(tecla.nextLine());
                    (album[primeraPosicion]).setDuracion(d);

                    //album[primeraPosicion] = new tema9.Discos(c, a, t, g, d);
                }                
                break;
                
            /*case 3:
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

                break;*/
            case 4:
                System.out.println("BORRAR DATOS DISCO");
                System.out.println("-------------------------------");

                System.out.println("Introduzca el código del disco que quieres borrar");
                codigoIntrod = tecla.nextLine();

                i = -1;
                c = "";
                
                do{
                    i++;
                    
                    if(i < T){
                        c = album[i].getCodigo();
                    }
                }while(!(c.equals(codigoIntrod)) && (i < T));
                
                if(i == T){
                    System.out.println("El código que has introducido no existe!");
                    System.out.println("Vuelve a introducir el código: ");
                    codigoIntrod = tecla.nextLine();
                }
                    
                if(i != T){
                    album[i].setCodigo("LIBRE");
                    album[i].setAutor("Sin Autor");
                    album[i].setTitulo("Sin Titulo");
                    album[i].setGenero("Sin Genero");
                    album[i].setDuracion(0);
                    System.out.println("Album borrado");
                }
        }
    }while(opcion != 5);
    }
}
