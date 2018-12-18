/*
 * Realiza un programa que escoja al azar 5 palabras en español del mini-diccionario del
ejercicio anterior. El programa irá pidiendo que el usuario teclee la traducción al inglés
de cada una de las palabras y comprobará si son correctas. Al final, el programa deberá
mostrar cuántas respuestas son válidas y cuántas erróneas.

 */
package diccionario;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;
/**
 *
 * @author BrinCo
 */
public class Diccionario2 {
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
        
        int i;
        int num;
        
        //guardar claves en un array de String
        String[] a = h.keySet().toArray(new String[0]);
        
        //genera 5 números sin repetirse
        ArrayList<Integer> n = new ArrayList<Integer>();
        n.add((int)(Math.random() * 22));
        
        for(i = 0; i < 4; i++){
            do{
                num = (int)(Math.random() * 20);
            }while(n.contains(num));
            
            n.add(num);
        }
        
        System.out.println("TRADUCTOR INGLES-ESPAÑOL");
        System.out.println("#########################");
        
        int puntos = 0;
        
        System.out.println("Traduce estas palabras: ");
        
        for(i = 0; i < 5; i++){
            System.out.print(a[n.get(i)] + ": ");
            String palabra = t.nextLine();
            
            if(palabra.equals(h.get(a[n.get(i)]))){
                System.out.println("Correcto!");
                puntos++;
            }else{
                System.out.println("Incorrecto!");
                System.out.println("La palabra erá: " + h.get(a[n.get(i)]));
            }
        }

        System.out.println("Has oabtenido: " + puntos + " puntos");

    }
}
