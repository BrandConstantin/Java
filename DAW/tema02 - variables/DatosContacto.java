/*
 * Crea las variables nombre, direccion y telefono y asígnale los valores correspondientes.
* Muestra los valores de esas variables por pantalla de tal forma que el resultado del programa
* sea el mismo que en el ejercicio 2.
 */
package tema02;

/**
 *
 * @author BrandConstantin
 */
public class DatosContacto {
    public static void main (String[] args){
        String nombre = "Constantin";
        String apellido = "Brand";
        String direcc = "C/ Marmoles";
        int telef = 952452245; 
        
        System.out.println("Mi nombre completo es " + apellido + " " + nombre); 
        System.out.println("Mi dirección es " + direcc + " y el telefono de contacto " + telef); 
    }
}
