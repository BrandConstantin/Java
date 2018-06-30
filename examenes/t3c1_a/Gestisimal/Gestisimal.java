/*
 * Modifica la aplicación Gestisimal (Gestión Simplificada de Almacén) realizada en clase mediante un
ArrayList de tal forma que cumpla los siguientes requisitos:
a) Debe haber, al menos, 5 artículos precargados.
b) Cada artículo debe tener un atributo que indique el tipo de producto: “alimentación”, “limpieza”,
“perfumería”, etc. Al dar de alta un producto, el usuario puede introducir el tipo que quiera (no hay
unos tipos predeterminados).
c) Se podrá realizar un listado completo o un listado filtrado por el tipo de producto (se pide por
teclado o se elige de un menú generado al efecto).
 */
package t3c1_a.Gestisimal;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import java.util.HashMap;

/**
 *
 * @author BrinCo
 */
public class Gestisimal {
    public static void main(String[] args) {
         System.out.println("GESTISIMAL");
         System.out.println("---------------------------------------------------");
         Scanner s = new Scanner(System.in);
         ArrayList<Articulo> almacen = new ArrayList();
         ArrayList<String> envasados = new ArrayList<>();
         int menu = 0;
         
        //Carga articulos previos
        almacen.add(new Articulo("111", "Leche", "brick", 5.55, 55.55, 5));
        almacen.add(new Articulo("222", "Atún", "enlatado", 6.66, 66.66, 6));
        almacen.add(new Articulo("333", "Agua", "embotellado", 2.22, 22.55, 8));
        almacen.add(new Articulo("444", "Lentejas", "granel", 6.66, 66.66, 6));
        almacen.add(new Articulo("555", "Comida de gato", "enlatado", 2.22, 22.55, 8));
        //Carga los envasados en un arrayList
        for(Articulo x: almacen) {
            envasados.add(x.getEnvasado());
        }
        
        //Menú principal
        while(menu != 7) {
            System.out.println("Menú Principal");
            System.out.println("1. Listado de articulos.");
            System.out.println("2. Alta de articulo.");
            System.out.println("3. Baja de articulo.");
            System.out.println("4. Modificación de articulo.");
            System.out.println("5. Entrada de mercancia.");
            System.out.println("6. Venta de mercancia.");
            System.out.println("7. Salir.");
            menu = s.nextInt();;
            
            //Switch del menú principal
            switch(menu) {
                case 1:
                    //Pregunta si se quiere listar por tipo de envasado
                     String r = "n";
                     System.out.print("Desea listar por tipo de envasado? (s/n):");
                     r = s.nextLine();
                     if(r.equals("n")) {
                        //Listado completo de los articulos
                        System.out.println("Listado completo de articulos--------------");
                        for(Articulo x: almacen) {
                            System.out.println(x);
                        }
                     } else { //Listado por tipo de envasado
                        System.out.println("Los tipos de envasados disponibles actualmente son:");
                        for(String x: envasados) {
                            System.out.println(x + ".");
                        }
                        System.out.print("Que tipo de envasado desea listar?: ");
                        String env = s.nextLine();
                        if(!envasados.contains(env)) {
                            System.out.println("Lo siento, ese envasado no existe.");
                        } else {
                            System.out.println("Listado por envasado--------------");
                            for(Articulo x: almacen) {
                                if(x.getEnvasado().equals(env)) {
                                    System.out.println(x);
                                }
                            }
                        }
                     }
                break;
                    
                case 2:
                    //Alta de articulo (verifica que no se repita el código)
                    System.out.print("Introduce el Codigo: ");
                    String cod = s.nextLine();
                    while(almacen.contains(new Articulo(cod,"", "", 0.0, 0.0, 0))) {
                        System.out.println("El código ya existe. Por favor, introduzca un nuevo código.");
                        System.out.print("Codigo: ");
                        cod = s.nextLine();
                    }
                    System.out.print("Intorduzca una descripción: ");
                    String desc = s.nextLine();
                    System.out.print("Intorduzca el tipo de envasado: ");
                    String env = s.nextLine();
                    envasados.add(env);
                    System.out.print("Intorduzca el precio de compra: ");
                    double precComp = s.nextDouble();;
                    System.out.print("Intorduzca el precio de venta: ");
                    double precVent = s.nextDouble();;
                    System.out.print("Intorduzca el stock del articulo: ");
                    int stock = s.nextInt();;
                    //Crea el articulo
                    almacen.add(new Articulo(cod, desc, env, precComp, precVent, stock));
                    System.out.println("Su articulo ha sido dado de alta con exito.");
                break;
                    
                case 3:
                    //Baja del articulo
                    System.out.print("Introduzca el código del articulo que desea dar de baja: ");
                    String codBaja = s.nextLine();
                    //Borra el articulo
                    while (!almacen.contains(new Articulo(codBaja,"", "",0.0, 0.0, 0))) {
                        System.out.print("Ese código no existe.\nIntroduzca otro código: ");
                        codBaja = s.nextLine();
                    }
                    int i = almacen.indexOf(new Articulo(codBaja,"", "",0.0, 0.0, 0));
                    almacen.remove(i);
                    System.out.println("El articulo ha sido retirado del almacen.");
                break;
                    
                case 4:
                    //Modificación del articulo
                    System.out.println("Modificación de articulos--------------");
                    System.out.print("Introduzca el código del articulo que quiere modificar: ");
                    String codUp = s.nextLine();
                    while (!almacen.contains(new Articulo(codUp,"", "",0.0, 0.0, 0))) {
                        System.out.print("Ese código no existe.\nIntroduzca otro código: ");
                        codUp = s.nextLine();
                    }                    
                    //Submenú del Update
                    System.out.println("Menú UPDATE");
                    System.out.println("1. Modificar código.");
                    System.out.println("2. Modificar descripción.");
                    System.out.println("3. Modificar precio de compra.");
                    System.out.println("4. Modificar precio de venta.");
                    System.out.println("5. Modificar stock.");
                    System.out.println("6. Modificar el tipo de envasado.");
                    int menuUp = s.nextInt();;
                    int x = almacen.indexOf(new Articulo(codUp,"", "", 0.0, 0.0, 0));
                    
                    switch(menuUp) {
                        case 1:
                            System.out.print("Introduzca el nuevo código: ");
                            String codUpNuevo = s.nextLine();
                            //Verifica si el código ya existe
                            while (almacen.contains(new Articulo(codUpNuevo,"", "", 0.0, 0.0, 0))) {
                                System.out.print("Ese código existe.\nIntroduzca otro código: ");
                                codUpNuevo = s.nextLine();
                            }
                            almacen.get(x).setCodigo(codUpNuevo);
                            System.out.println("El articulo fue modificado con exito.");
                        break;     
                            
                        case 2:
                            System.out.print("Introduzca la nueva descripción: ");
                            String desUp = s.nextLine();
                            almacen.get(x).setDescripcion(desUp);
                            System.out.println("El articulo fue modificado con exito.");
                        break;
                            
                        case 3:
                            System.out.print("Introduzca el nuevo precio de compra: ");
                            double preComUp = s.nextDouble();;
                            almacen.get(x).setPrecioCompra(preComUp);
                            System.out.println("El articulo fue modificado con exito.");
                        break;
                            
                        case 4:
                            System.out.print("Introduzca el nuevo precio de venta: ");
                            double preVentUp = s.nextDouble();;
                            almacen.get(x).setPrecioVenta(preVentUp);
                            System.out.println("El articulo fue modificado con exito.");
                        break;
                            
                        case 5:
                            System.out.print("Introduzca el nuevo stock: ");
                            int stockUp = s.nextInt();;
                            almacen.get(x).setStock(stockUp);
                            System.out.println("El articulo fue modificado con exito.");
                        break;
                            
                        case 6:
                            System.out.print("Introduzca el tipo de envasado: ");
                            String envUp = s.nextLine();
                            almacen.get(x).setEnvasado(envUp);
                            System.out.println("El articulo fue modificado con exito.");
                        break;
                        default:
                            System.out.println("Opción incorrecta.");
                        break;
                    }
                break;
                    
                case 5:
                    //Compra de articulos
                    System.out.println("Entrada de articulos--------------");
                    System.out.print("Introduzca el código del articulo que ha comprado: ");
                    String codCompra = s.nextLine();
                    while (!almacen.contains(new Articulo(codCompra,"", "", 0.0, 0.0, 0))) {
                        System.out.print("Ese código no existe.\nIntroduzca otro código: ");
                        codCompra = s.nextLine();
                    } 
                    System.out.print("Introduzca la cantidad comprada: ");
                    int cantidadComp = s.nextInt();;
                    int j = almacen.indexOf(new Articulo(codCompra,"", "", 0.0, 0.0, 0));
                    almacen.get(j).compra(cantidadComp);
                    System.out.println("El nuevo stock de tu articulo es: " + almacen.get(j).getStock());
                break;
                    
                case 6:
                    //Venta de articulos
                    System.out.println("Venta de articulos--------------");
                    String sigue = "s";
                    //Crea un HashMap para guardar los articulos que apareceran en la factura y la cantidad vendida
                    HashMap<String, Integer> factura = new HashMap<>();
                    
                    while(sigue.equals("s")) {
                        System.out.print("Introduzca el código del articulo que quiere vender: ");
                        String codVenta = s.nextLine();
                        while (!almacen.contains(new Articulo(codVenta,"", "", 0.0, 0.0, 0))) {
                            System.out.print("Ese código no existe.\nIntroduzca otro código: ");
                            codVenta = s.nextLine();
                        }
                        System.out.print("Introduzca la cantidad vendida: ");
                        int cantidadVent = s.nextInt();;
                        int p = almacen.indexOf(new Articulo(codVenta,"", "", 0.0, 0.0, 0));
                        almacen.get(p).venta(cantidadVent);
                        if(almacen.get(p).venta(cantidadVent)){
                            factura.put(codVenta, cantidadVent);
                        }
                        System.out.print("Desea vender otro atriculo(s/n)?: ");
                        sigue = s.nextLine();                     
                    }
                    Articulo.generaFactura(factura, almacen);
                break;
                    
                default:
                    System.out.println("Opción incorrecta.");
                break;
            }
        }
    }
}
