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
public class formada_min5letras_max10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String cadena = "¿Que pasa?";
        
        Pattern pat = Pattern.compile("[a-zA-z]{5,10}");
        Matcher mat = pat.matcher(cadena);
        
        if(mat.matches()){
            System.out.println("SI");
        }else{
            System.out.println("NO");
        }
    }
    
}
