/*
 * Crea un mini-diccionario español-inglés que contenga, al menos, 20 palabras (con su
correspondiente traducción). Utiliza un objeto de la clase HashMap para almacenar las
parejas de palabras. El programa pedirá una palabra en español y dará la correspondiente
traducción en inglés.

 */
package diccionario;
import java.util.HashMap;
import java.util.Scanner;
/**
 *
 * @author BrinCo
 */
public class Diccionario {
    public static void main(String[] args){
        Scanner t = new Scanner(System.in);
        
        HashMap<String, String> h = new HashMap<String, String>();
        
        h.put("white", "blanco");
        h.put("yellow", "amarillo");
        h.put("pink", "rosa");
        h.put("red", "rojo");
        h.put("blue", "azul");
        h.put("green", "verde");
        h.put("violet", "violeta");
        h.put("black", "negro");
        h.put("bike", "bici");
        h.put("car", "coche");
        h.put("train", "tren");
        h.put("boat", "barco");
        h.put("plain", "avion");
        h.put("brother", "hermano");
        h.put("sister", "hermana");
        h.put("father", "padre");
        h.put("mother", "madre");
        h.put("cousin", "primo");
        h.put("grandfather", "abuelo");
        h.put("uncle", "tio");
        
        System.out.println("TRADUCTOR INGLES-ESPAÑOL");
        System.out.println("#########################");

        String palabra = t.nextLine();
        if(h.containsKey(palabra)){
            System.out.println(palabra + " - " + h.get(palabra));
        }else{
            System.out.println("Palabra desconocida!");
        }
    }
}
