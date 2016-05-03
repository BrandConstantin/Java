/*
 * Modifica el programa Gestisimal realizado anteriormente añadiendo las siguientes mejoras:
• Utiliza una lista en lugar de un array para el almacenamiento de los datos.
• Comprueba la existencia del código en el alta, la baja y la modificación de artículos
para evitar errores.
• Cambia la opción “Salida de stock” por “Venta”. Esta nueva opción permitirá hacer
una venta de varios artículos y emitir la factura correspondiente. Se debe preguntar
por los códigos y las cantidades de cada artículo que se quiere comprar. Aplica un
21% de IVA.
 */
package gestisimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 *
 * @author BrinCo
 */
public class Gestisimal {
    static ArrayList<Articulos> a = new ArrayList<Articulos>();    
    
    public static void main(String[] args){
        Scanner t = new Scanner(System.in);
        
        HashMap<String, Integer> h = new HashMap<String, Integer>();
        
        int opcion;
        int opcion2;
        int i;
        int numUnidadesIntrod;
        int numUnidades = 0;
        int numUnidadesFactura = 0;
        double precioCompra;
        double precioVenta;
        double subtotal;
        double baseImponible;
        double totalFactura;
        String codigo;
        String codigoIntrod = "";
        String descripIntrod;
        String precioCompraString;
        String precioVentaString;
        String numUnidadesString;

        do {
            System.out.println("\n\nG E S T I S I M A L");
            System.out.println("===================");
            System.out.println("1. Listado");
            System.out.println("2. Alta");
            System.out.println("3. Baja");
            System.out.println("4. Modificación");
            System.out.println("5. Entrada de mercancía");
            System.out.println("6. Venta de mercancía");
            System.out.println("7. Salir");
            opcion = t.nextInt();
            
            switch(opcion){
                case 1: //listado articulos
                    System.out.println("LISTADO");
                    System.out.println("|||||||||||||||||||||||||||||");
                    
                    for(Articulos articulo: a){
                        System.out.println(articulo);
                    }
                break;
                    
                case 2: //alta articulo
                    System.out.println("ALTA ARTICULO");
                    System.out.println("||||||||||||||||||||||||||||||");
                    
                    System.out.println("Introdusca datos del articulo: ");
                    System.out.print("Código: ");
                    codigoIntrod = t.nextLine();
                    
                    do{
                        if(posicion(codigoIntrod) != -1){
                            System.out.println("El código ya existe en la base de datos!");
                            System.out.println("Introduce otro código: ");
                        }
                    }while(posicion(codigoIntrod) != -1);

                    System.out.print("Descripción: ");
                    descripIntrod = t.nextLine();
                    System.out.print("Precio de Compra: ");
                    precioCompra = Double.parseDouble(t.nextLine());
                    System.out.print("Precio de Venta: ");
                    precioVenta = Double.parseDouble(t.nextLine());
                    System.out.print("Stock (número de unidades): ");
                    numUnidadesIntrod = Integer.parseInt(t.nextLine());

                    a.add(new Articulos(codigoIntrod, descripIntrod, precioCompra, precioVenta, numUnidades));               
                break;
                    
                case 3: //borrar articulos
                    System.out.println("BAJA ARTICULO");
                    System.out.println("|||||||||||||||||||||||||||||||");
                    
                    System.out.println("Introduzca el código del articulo que quieres borrar");
                    codigoIntrod = t.nextLine();

                    if(posicion(codigoIntrod) == 1){
                        System.out.println("El código es inexistente!");
                    }else{
                        a.remove(posicion(codigoIntrod));
                        System.out.println("Articulo borrado!");
                    }
                break;
                    
                case 4: //modificar articulos
                    System.out.println("MODIFICACIÓN ARTICULO");
                    System.out.println("||||||||||||||||||||||||||||||");


                    System.out.println("Cual es el código del dico a modificar?");
                    

                    do{
                        codigoIntrod = t.nextLine();
                        if(posicion(codigoIntrod) != -1){
                            System.out.println("Código inexistente!");
                            System.out.println("Escribe otro código: ");
                        }
                    }while(posicion(codigoIntrod) == -1);
                    
                    i = posicion(codigoIntrod);
                    
                    System.out.println("Introduce los nuevos datos del disco");
                    System.out.println("-----------------------------------------");

                    System.out.println("Código: " + a.get(i).getCodigo());
                    System.out.print("Nuevo código: ");
                    codigoIntrod = t.nextLine();
                    if (!codigoIntrod.equals(" ")) {
                        a.get(i).setCodigo(codigoIntrod);
                    }
                    System.out.println("Descripción: " + a.get(i).getDescripcion());
                    System.out.print("Nueva descripción: ");
                    descripIntrod = t.nextLine();
                    if (!descripIntrod.equals("")) {
                        a.get(i).setDescripcion(descripIntrod);
                    }
                    System.out.println("Precio de compra: " + a.get(i).getPrecioCompra());
                    System.out.print("Nuevo precio de compra: ");
                    precioCompraString = t.nextLine();
                    if (!precioCompraString.equals("")) {
                        a.get(i).setPrecioCompra(Double.parseDouble(precioCompraString));
                    }
                    System.out.println("Precio de venta: " + a.get(i).getPrecioVenta());
                    System.out.print("Nuevo precio de venta: ");
                    precioVentaString = t.nextLine();
                    if (!precioVentaString.equals("")) {
                        a.get(i).setPrecioVenta(Double.parseDouble(precioVentaString));
                    }
                    System.out.println("Stock: " + a.get(i).getNumUnidades());
                    System.out.print("Nuevo stock: ");
                    numUnidadesString = t.nextLine();
                    if (!numUnidadesString.equals("")) {
                        a.get(i).setNumUnidades(Integer.parseInt(numUnidadesString));
                    }

                break;
                    
                case 5: //entrada mercancia nueva
                    System.out.println("ENTRADA DE MERCANCIA");
                    System.out.println("|||||||||||||||||||||||||||||||");
                    
                    System.out.println("Introduzca el código del articulo");
                    codigoIntrod = t.nextLine();

                    do{
                        codigoIntrod = t.nextLine();
                        if(posicion(codigoIntrod) != -1){
                            System.out.println("Codigo inexistente!");
                        }
                    }while(posicion(codigoIntrod) == -1);
                    
                    i = posicion(codigoIntrod);

                    System.out.println("Entrada de mercancia del articulo " + a.get(i));
                    System.out.println("Cuantas unidades entran en el almacén?");
                    numUnidadesIntrod = t.nextInt();
                    a.get(i).setNumUnidades(numUnidadesIntrod + a.get(i).getNumUnidades());
                    System.out.println("Añadiamiento correcto!");

                break;
                    
                case 6:
                    System.out.println("Venta DE MERCANCIA");
                    System.out.println("|||||||||||||||||||||||||||||||");
                    
                    do{
                        System.out.println("1. Añadir Articulo");
                        System.out.println("1. Generar Factura");
                        System.out.println("1. Cancelar");
                        
                        opcion2 = t.nextInt();
                        
                        switch(opcion2){
                            case 1:
                                System.out.println("Introduzca el código del articulo: ");
                                codigoIntrod = t.nextLine();
                                
                                i = posicion(codigoIntrod);
                                
                                if(i == -1){
                                    System.out.println("Código inexistente!");
                                }else{
                                    System.out.println(a.get(i));
                                    if(h.containsKey(codigoIntrod)){
                                        numUnidadesFactura = h.get(codigoIntrod);
                                    }else{
                                        numUnidadesFactura = 0;
                                    }
                                    System.out.print("Unidades totales en factura provisional "); 
                                    System.out.println(numUnidadesFactura);
                                    System.out.println("Unidades totales a añadir a la factura " );
                                    System.out.println(numUnidades = t.nextInt());
                                    
                                    if((a.get(i).getNumUnidades() - numUnidadesFactura < numUnidades)){
                                        System.out.println("No hay suficiente stock");
                                        System.out.println("Solo puede añadir a la venta como máximo");
                                        System.out.println(a.get(i).getNumUnidades() - numUnidadesFactura);
                                    }else if(h.containsKey(codigoIntrod)){
                                        h.put(codigoIntrod, h.get(codigoIntrod) + numUnidades);
                                    }else{
                                        h.put(codigoIntrod, numUnidades);
                                    }
                                }
                                
                                //muestra las lineas
                                System.out.println("\n\n CÓDIGO |    DESCRIPCIÃ“N    | UNIDADES | PRECIO UNID. | SUBTOTAL");
                                for(Map.Entry pareja: h.entrySet()){
                                    codigo = pareja.getKey().toString();
                                    i = posicion(codigo);
                                    numUnidades = Integer.parseInt(pareja.getValue().toString());
                                    subtotal = numUnidades * a.get(i).getPrecioVenta();
                                    System.out.printf(" %6s | %17s | %8d | %12.2f | %8.2f\n", 
                                        codigo, a.get(i).getDescripcion(), numUnidades, a.get(i).getPrecioVenta(), subtotal);
                                }
                                break;
                                
                            case 2: //genera la factura
                                baseImponible = 0;
                                System.out.println("\n\n CÃ“DIGO |   DESCRIPCIÃ“N   | UNIDADES | PRECIO UNID. | SUBTOTAL");
                                for(Map.Entry pareja: h.entrySet()){
                                    codigo = pareja.getKey().toString();
                                    i = posicion(codigo);
                                    numUnidades = Integer.parseInt(pareja.getValue().toString());
                                    subtotal = numUnidades * a.get(i).getPrecioVenta();
                                    System.out.printf(" %6s | %15s | %8d | %12.2f | %8.2f\\n\", codigo, a.get(i).getDescripcion(), unidades, a.get(i).getPrecioDeVenta(), subtotal");
                                    baseImponible += subtotal;
                                    a.get(i).setNumUnidades(a.get(i).getNumUnidades() - 
                                            numUnidades);
                                }
                                
                                                        System.out.printf("                                      BASE IMPONIBLE: %8.2f \n", baseImponible);
                                System.out.printf("IVA (21%%): %8.2f \n", baseImponible * 0.21);
                                System.out.printf("TOTAL: %8.2f \n", baseImponible * 1.21);

                                System.out.println("\n\nFactura generada.\nPulse INTRO para volver al menÃº principal.");
                                System.console().readLine();

                                break;
                        }
                    }while(opcion2 == 1);
                    
                break;
            }
            
        }while(opcion != 7);
    }
    
    static public int posicion(String codigo){
        int i = -1;
        for(Articulos posi: a){
            i++;
            if(posi.getCodigo().equals(codigo)){
                return i;
            }
        }
        return -1;
    }
}
