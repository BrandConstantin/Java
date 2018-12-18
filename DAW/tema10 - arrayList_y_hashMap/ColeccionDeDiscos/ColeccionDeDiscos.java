/*
 * Realiza de nuevo el ejercicio de la colección de discos pero utilizando esta vez una lista para
almacenar la información sobre los discos en lugar de un array convencional. Comprobarás
que el código se simplifica notablemente ¿Cuánto ocupa el programa original hecho con
un array? ¿Cuánto ocupa este nuevo programa hecho con una lista?

 */
package ColeccionDeDiscos;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author BrinCo
 */
public class ColeccionDeDiscos {
    public static void main(String[] args) {
        Scanner t = new Scanner(System.in);
        
        ArrayList<Discos> a = new ArrayList<Discos>();
        
        int i;
        //boolean codigoExistente = false;
        String codigoIntrod = "";
        String autorIntrod;
        String tituloIntrod;
        String generoIntrod;
        String duracionIntrodString;
        int duracionIntrod;
        int opcion;
        int opcionListado;
        int limiteInfe;
        int limiteSupe;
        
        //discos declarados
        a.add(new Discos("A1", "Scorpions", "Wind of Change", "Rock", 48));
        a.add(new Discos("A2", "ACDC", "Thunder Truck", "Rock", 52));
        a.add(new Discos("A3", "Nirvana", "Smells like Spirit", "Rock", 36));
        a.add(new Discos("A4", "Muse", "Undisclosed", "Rock", 38));
        a.add(new Discos("A5", "Coldplay", "Yellow", "Rock", 45));

        do {
            System.out.println("\n\nCOLECCIÓN DE DISCOS");
            System.out.println("===================");
            System.out.println("1. Listado");
            System.out.println("2. Nuevo disco");
            System.out.println("3. Modificar");
            System.out.println("4. Borrar");
            System.out.println("5. Salir");
            opcion = Integer.parseInt(t.nextLine());

            switch(opcion){
                case 1: 
                    do{
                        System.out.println("\nLISTADO");
                        System.out.println("-----------------------");
                        System.out.println("1. Completo");
                        System.out.println("2. Por autor");
                        System.out.println("3. Por género");
                        System.out.println("4. Por duración");
                        System.out.println("5. Menú principal");
                        opcionListado = Integer.parseInt(t.nextLine()); 

                        switch(opcionListado){
                            case 1://listado completo
                                for(Discos d: a){
                                    System.out.println(d);
                                }
                            break;

                            case 2://listado por autor
                                System.out.println("Introdusca el autor: ");
                                autorIntrod = t.nextLine();
                                for(Discos d: a){
                                    if(d.getAutor().equals(autorIntrod)){
                                        System.out.println(d);
                                    }
                                }
                            break;

                            case 3://listado por género
                                System.out.println("Introdusca el genero: ");
                                generoIntrod = t.nextLine();
                                for(Discos d: a){
                                    if(d.getGenero().equals(generoIntrod)){
                                        System.out.println(d);
                                    }
                                }
                            break;

                            case 4://listado por duración
                                System.out.println("Introdusca la duración: ");
                                duracionIntrodString = t.nextLine();
                                for(Discos d: a){
                                    if(d.getDuracion() == (Integer.parseInt(duracionIntrodString)));
                                    System.out.println(d);
                                }
                            break;
                        }
                    }while(opcionListado != 5);
                    break;

                case 2: 
                    System.out.println("\nNUEVO DISCO");
                    System.out.println("--------------------------------");
                    
                    System.out.println("Introduzca los datos del disco: ");
                    System.out.println("");
                    System.out.print("Código: ");
                    codigoIntrod = t.nextLine();

                    while(a.contains(new Discos(codigoIntrod,"", "", "", 0))){
                        System.out.println("Este código ya existe en la base de datos!");
                        System.out.println("Intentalo de nuevo con otro código: ");
                        codigoIntrod = t.nextLine();
                    }
                    
                    System.out.print("Autor: ");
                    autorIntrod = t.nextLine();
                    System.out.print("Titulo: ");
                    tituloIntrod = t.nextLine();
                    System.out.print("Genero: ");
                    generoIntrod = t.nextLine();
                    System.out.print("Duración: ");
                    duracionIntrod = Integer.parseInt(t.nextLine());

                    a.add(new Discos(codigoIntrod, autorIntrod, tituloIntrod, generoIntrod, duracionIntrod)); 
                    break;

                case 3:
                    System.out.println("MODIFICAR DISCO");
                    System.out.println("-------------------------");
                    System.out.println("Cual es el código del dico a modificar?");
                    codigoIntrod = t.nextLine();
                    
                    while(!a.contains(new Discos(codigoIntrod,"", "", "", 0))){
                        System.out.println("Este código no existe en la base de datos!");
                        System.out.println("Intentalo de nuevo con otro código: ");
                        codigoIntrod = t.nextLine();
                    }
                    
                    i = a.indexOf((new Discos(codigoIntrod,"", "", "", 0)));

                    System.out.println("Introduce los nuevos datos del disco");
                    System.out.println("-----------------------------------------");

                    System.out.println("Código: " + a.get(i).getCodigo());
                    System.out.print("Nuevo código: ");
                    codigoIntrod = t.nextLine();
                    if (!codigoIntrod.equals(" ")) {
                        a.get(i).setCodigo(codigoIntrod);
                    }
                    System.out.println("Autor: " + a.get(i).getAutor());
                    System.out.print("Nuevo autor: ");
                    autorIntrod = t.nextLine();
                    if (!autorIntrod.equals("")) {
                        a.get(i).setAutor(autorIntrod);
                    }
                    System.out.println("Titulo: " + a.get(i).getTitulo());
                    System.out.print("Nuevo titulo: ");
                    tituloIntrod = t.nextLine();
                    if (!tituloIntrod.equals("")) {
                        a.get(i).setTitulo(tituloIntrod);
                    }
                    System.out.println("Genero: " + a.get(i).getGenero());
                    System.out.print("Nuevo género: ");
                    generoIntrod = t.nextLine();
                    if (!generoIntrod.equals("")) {
                        a.get(i).setGenero(generoIntrod);
                    }
                    System.out.println("Duración: " + a.get(i).getDuracion());
                    System.out.print("Duración: ");
                    duracionIntrodString = t.nextLine();
                    if (!duracionIntrodString.equals("")) {
                        a.get(i).setDuracion(Integer.parseInt(duracionIntrodString));
                    }

                    break;

                case 4:
                    System.out.println("BORRAR DATOS DISCO");
                    System.out.println("-------------------------------");

                    System.out.println("Introduzca el código del disco que quieres borrar");
                    codigoIntrod = t.nextLine();

                    if(!a.contains(new Discos(codigoIntrod,"", "", "", 0))){
                        System.out.println("El código introducido es inexistente!");
                    }else{
                        a.remove(a.indexOf(new Discos(codigoIntrod,"", "", "", 0)));
                        System.out.println("Album eliminado!");
                    }
            }
        }while(opcion != 5);
    }
}
