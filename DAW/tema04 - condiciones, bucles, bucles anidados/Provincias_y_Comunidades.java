package tema04;

/**
 *
 * @author BrandConstantin
 *
 * Dada una provincia, indicar a qué comunidad autónoma pertenece. 
 * 
 */

import java.util.Scanner;
public class Provincias_y_Comunidades {
     public static void main(String[] args) {
        String provincia;         
        String comunidadAutonoma;  
 
        System.out.print("Introduzca el nombre de la provincia: ");
        Scanner lector = new Scanner(System.in);
        provincia = lector.nextLine ();
         
        switch (provincia) {
            case "Almería":
            case "Cádiz":
            case "Córdoba":
            case "Granada":
            case "Huelva":
            case "Malaga":
            case "Jaén":
            case "Sevilla":
                comunidadAutonoma = "Andalucía";
                break;
               
            case "Cáceres":
            case "Badajoz":
                comunidadAutonoma = "Extremadura";
                break;
           
            case "Huesca":
            case "Zaragoza":
            case "Teruel":
                comunidadAutonoma = "Aragón";
                break;

            case "A Coruña":
            case "Lugo":
            case "Orense":
            case "Pontevedra":
                comunidadAutonoma = "Galicia";
                break;

            case "Castellón":
            case "Valencia":
            case "Alicante":
                comunidadAutonoma = "Comunidad Valenciana";
                break;
            
            case "Barcelona":
            case "Tarragona":
            case "Lleida":
            case "Girona":
                comunidadAutonoma = "Cataluña";
                break;

            case "Vizcaya":
            case "Guipúzcoa":
            case "Álava":
                comunidadAutonoma = "País Vasco";
                break;

            case "Las Palmas":
            case "Tenerife":
                comunidadAutonoma = "Canarias";
                break;

            case "Toledo":
            case "Ciudad Real":
            case "Cuenca":
            case "Guadalajara":
            case "Albacete":
                comunidadAutonoma = "Castila la Mancha";
                break;
            
            case "Ávila":
            case "Salamanca":
            case "Segovia":
            case "Zamora":
            case "Burgos":
            case "Soria":
            case "Palencia":
            case "Valladolid":
            case "León":
                comunidadAutonoma = "Castila y León";
                break;

            default:
                comunidadAutonoma = "Error (provincia desconocida)";
                break;
        }
        System.out.printf ("La provincia %s se encuentra ubicada en la comunidad: %s\n", provincia, comunidadAutonoma);
     }    
}