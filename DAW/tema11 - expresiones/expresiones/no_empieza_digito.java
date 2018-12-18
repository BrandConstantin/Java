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
public class no_empieza_digito{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String cadena = "23 años";
        
        Pattern pat = Pattern.compile("^[^\\d].*");
        Matcher mat = pat.matcher(cadena);
        
        if(mat.matches()){
            System.out.println("SI");
        }else{
            System.out.println("NO");
        }
    }
    
}
