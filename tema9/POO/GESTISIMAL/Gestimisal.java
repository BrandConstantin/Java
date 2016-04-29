/*
 * Crea el programa GESTISIMAL (GESTIón SIMplifcada de Almacén) para llevar
 *    el control de los artículos de un almacén. De cada artículo se debe saber
 *    el código, la descripción, el precio de compra, el precio de venta y el
 *    stock (número de unidades). El menú del programa debe tener, al menos, las
 *    siguientes opciones:
 *    <p>
 *    1. Listado
 *    2. Alta
 *    3. Baja
 *    4. Modifcación
 *    5. Entrada de mercancía
 *    6. Salida de mercancía
 *    7. Salir
 *    <p>
 *    La entrada y salida de mercancía supone respectivamente el incremento y
 *    decremento de stock de un determinado artículo. Hay que controlar que no
 *    se pueda sacar más mercancía de la que hay en el almacén.
 */
package GESTISIMAL;

import java.util.Scanner;

/**
 *
 * @author BrinCo
 */
public class Gestimisal {
    static int T = 4;
    
    public static void main(String[] args){
        Scanner t = new Scanner(System.in);
        
        int opcion;
        int i;
        int primeraPosicion;
        boolean codigoExistente;
        int numUnidadesIntrod = 0;
        String codigoIntrod = "";
        String descripIntrod;
        String precioCompraString;
        String precioVentaString;
        String numUnidadesString;
                
        //crear el array
        Articulos[] articulo = new Articulos[T];
        
        //meter cada uno de los articulos en las celdas del array
        for(i = 0; i < T; i++){
            articulo[i] = new Articulos();
        }
        
        do {
            System.out.println("\n\nG E S T I S I M A L");
            System.out.println("===================");
            System.out.println("1. Listado");
            System.out.println("2. Alta");
            System.out.println("3. Baja");
            System.out.println("4. Modificación");
            System.out.println("5. Entrada de mercancía");
            System.out.println("6. Salida de mercancía");
            System.out.println("7. Salir");
            System.out.print("Introduzca una opción: ");
            opcion = Integer.parseInt(t.nextLine());
            
            switch(opcion){
                case 1: //listado articulos
                    System.out.println("LISTADO");
                    System.out.println("|||||||||||||||||||||||||||||");
                    
                    for(i = 0; i < T; i++){
                        if(!articulo[i].getCodigo().equals("NO DEFINIDO")){
                            System.out.println(articulo[i]);
                        }
                    }
                break;
                    
                case 2: //alta articulo
                    System.out.println("ALTA ARTICULO");
                    System.out.println("||||||||||||||||||||||||||||||");
                    
                    // buscar posición libre del array
                    primeraPosicion = 0;
                    String c = articulo[primeraPosicion].getCodigo();
                    while ((primeraPosicion < T) && (!(c.equals("NO DEFINIDO")))) {
                        primeraPosicion++;
                        if(primeraPosicion < T) {
                            c = articulo[primeraPosicion].getCodigo();
                        }
                    }

                    if (primeraPosicion == T) {
                        System.out.println("Lo siento, la base de datos está llena.");
                    } else {
                        System.out.println("Por favor, introduzca los datos del articulo.");  
                        System.out.print("Código: ");

                        // comprobar si se repite el código
                        codigoExistente = true;
                        while (codigoExistente) {
                            codigoExistente = false;
                            codigoIntrod = t.nextLine();

                            for (i = 0; i < T; i++){
                               if (codigoIntrod.equals(articulo[i].getCodigo())) {
                                   codigoExistente = true;
                                }
                            }

                            if (codigoExistente) {
                               System.out.println("Ese código ya existe en la base de datos.");
                               System.out.print("Introduzca otro código: ");
                            }
                        } 

                        (articulo[primeraPosicion]).setCodigo(codigoIntrod);
                        System.out.print("Descripción: ");
                        String d = t.nextLine();
                        (articulo[primeraPosicion]).setDescripcion(d);
                        System.out.print("Precio de Compra: ");
                        int pc = Integer.parseInt(t.nextLine());
                        (articulo[primeraPosicion]).setPrecioCompra(pc);
                        System.out.print("Precio de Venta: ");
                        int pv = Integer.parseInt(t.nextLine());
                        (articulo[primeraPosicion]).setPrecioVenta(pv);
                        System.out.print("Stock (número de unidades): ");
                        int ud = Integer.parseInt(t.nextLine());
                        (articulo[primeraPosicion]).setNumUnidades(ud);

                        //articulo[primeraPosicion] = new Discos(c, a, t, g, d);
                }                
                break;
                    
                case 3:// borrar articulos
                    System.out.println("BAJA ARTICULO");
                    System.out.println("|||||||||||||||||||||||||||||||");
                    
                    System.out.println("Introduzca el código del articulo que quieres borrar");
                    codigoIntrod = t.nextLine();

                    i = -1;
                    c = "";

                    do{
                        i++;

                        if(i < T){
                            c = articulo[i].getCodigo();
                        }
                    }while(!(c.equals(codigoIntrod)) && (i < T));

                    if(i == T){
                        System.out.println("El código que has introducido no existe!");
                    }

                    if(i != T){
                        articulo[i].setCodigo("NO DEFINIDO");
                        articulo[i].setDescripcion("");
                        articulo[i].setPrecioCompra(0.0);
                        articulo[i].setPrecioVenta(0.0);
                        articulo[i].setNumUnidades(0);
                        System.out.println("Articulo borrado definidamente de la BD");
                    }
                break;
                    
                case 4: //modificar articulos
                    System.out.println("MODIFICACIÓN ARTICULO");
                    System.out.println("||||||||||||||||||||||||||||||");


                    System.out.println("Cual es el código del dico a modificar?");
                    codigoIntrod = t.nextLine();

                    i = -1;
                    do{
                        i++;
                    }while(!((articulo[i].getCodigo()).equals(codigoIntrod)));

                    System.out.println("Introduce los nuevos datos del disco");
                    System.out.println("-----------------------------------------");

                    System.out.println("Código: " + articulo[i].getCodigo());
                    System.out.print("Nuevo código: ");
                    codigoIntrod = t.nextLine();
                    if (!codigoIntrod.equals(" ")) {
                        articulo[i].setCodigo(codigoIntrod);
                    }
                    System.out.println("Descripción: " + articulo[i].getDescripcion());
                    System.out.print("Nueva descripción: ");
                    descripIntrod = t.nextLine();
                    if (!descripIntrod.equals("")) {
                        articulo[i].setDescripcion(descripIntrod);
                    }
                    System.out.println("Precio de compra: " + articulo[i].getPrecioCompra());
                    System.out.print("Nuevo precio de compra: ");
                    precioCompraString = t.nextLine();
                    if (!precioCompraString.equals("")) {
                        articulo[i].setPrecioCompra(Double.parseDouble(precioCompraString));
                    }
                    System.out.println("Precio de venta: " + articulo[i].getPrecioVenta());
                    System.out.print("Nuevo precio de venta: ");
                    precioVentaString = t.nextLine();
                    if (!precioVentaString.equals("")) {
                        articulo[i].setPrecioVenta(Double.parseDouble(precioVentaString));
                    }
                    System.out.println("Stock: " + articulo[i].getNumUnidades());
                    System.out.print("Nuevo stock: ");
                    numUnidadesString = t.nextLine();
                    if (!numUnidadesString.equals("")) {
                        articulo[i].setNumUnidades(Integer.parseInt(numUnidadesString));
                    }

                break;
                    
                case 5: //entrada mercancia nueva
                    System.out.println("ENTRADA DE MERCANCIA");
                    System.out.println("|||||||||||||||||||||||||||||||");
                    
                    System.out.println("Introduzca el código del articulo");
                    codigoIntrod = t.nextLine();
                    
                    i = -1;
                    c = "";
                    do{
                        i++;
                        if(i < T){
                            c = articulo[i].getCodigo();
                        }
                    }while(!(c.equals(codigoIntrod)) && (i < T));
                    
                    if(i == T){
                        System.out.println("El código introducido es inexistente!");
                    }else{
                        System.out.println("Entrada de mercancia del articulo " + articulo[i]);
                        System.out.println("Cuantas unidades entran en el almacén?");
                        numUnidadesString = t.nextLine();
                        articulo[i].setNumUnidades(Integer.parseInt(numUnidadesString) 
                            + articulo[i].getNumUnidades());
                        System.out.println("Añadiamiento correcto!");
                    }
                break;
                    
                case 6:
                    System.out.println("SALIDA DE MERCANCIA");
                    System.out.println("|||||||||||||||||||||||||||||||");
                    
                    System.out.println("Introduzca el código del articulo");
                    codigoIntrod = t.nextLine();
                    
                    i = -1;
                    c = "";
                    do{
                        i++;
                        if(i < T){
                            c = articulo[i].getCodigo();
                        }
                    }while(!(c.equals(codigoIntrod)) && (i < T));
                    
                    if(i == T){
                        System.out.println("El código introducido es inexistente!");
                    }else{
                        System.out.println("Salida de mercancia del articulo " + articulo[i]);
                        System.out.println("Cuantas unidades salen del almacén?");
                        numUnidadesIntrod = Integer.parseInt(t.nextLine());
                        if(articulo[i].getNumUnidades() - numUnidadesIntrod > 0){
                            articulo[i].setNumUnidades(articulo[i].getNumUnidades() 
                                    - numUnidadesIntrod);
                            System.out.println("Mercancia salida del almacén");
                        }else{
                            System.out.println("No se puede sacar tantas unidades!");
                        }
                    }
                break;
                }
            
        }while(opcion != 7);
    }
}
