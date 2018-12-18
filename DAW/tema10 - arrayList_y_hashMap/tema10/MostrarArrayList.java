/*
 * Crea un ArrayList con los nombres de 6 compañeros de clase. A continuación, 
 * muestra esos nombres por pantalla. Utiliza para ello un bucle for que recorra
 * todo el ArrayList sin usar ningún índice.

 */
package tema10;

import java.util.ArrayList;

/**
 *
 * @author BrinCo
 */
public class MostrarArrayList {

    public static void main(String[] args) {
        ArrayList<String> a = new ArrayList<String>();
        
        a.add("Elvis");
        a.add("Helen");
        a.add("John");
        a.add("Marge");
        a.add("Bart");
        a.add("Lisa");
        
        //System.out.println("Mis compis de clase son: " + a);
        
        for(String compis: a){
            System.out.println(compis);
        }
    }  
}
