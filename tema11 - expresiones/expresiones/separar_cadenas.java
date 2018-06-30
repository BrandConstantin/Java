/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package expresiones;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
/**
 *
 * @author brand
 */
public class separar_cadenas{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String str = "blanco-rojo:amarillo.verde_azul";
        
        String[] cadenas = str.split("[-:._]");
        
        for(int i = 0; i < cadenas.length; i++){
            System.out.println(cadenas[i]);
        }
    }
    
}
