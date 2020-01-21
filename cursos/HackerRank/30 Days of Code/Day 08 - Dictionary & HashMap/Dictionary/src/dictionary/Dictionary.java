/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dictionary;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author BrandConstantin
 */
public class Dictionary {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Map<String, String>englishSpanishDictionary = new HashMap<String, String>();
        
        englishSpanishDictionary.put("Monday", "Lunes");
        englishSpanishDictionary.put("Tuesday", "Martes");
        englishSpanishDictionary.put("Wednesday", "Miercoles");
        englishSpanishDictionary.put("Thursday", "Jueves");
        englishSpanishDictionary.put("Friday", "Viernes");
        
        System.out.println(englishSpanishDictionary.get("Monday"));
        
        System.out.println(englishSpanishDictionary.keySet());
        System.out.println(englishSpanishDictionary.values());
        System.out.println(englishSpanishDictionary.size());
        
        System.out.println(englishSpanishDictionary.toString());
        System.out.println(englishSpanishDictionary.remove("Monday"));
        System.out.println(englishSpanishDictionary.toString());
    }
    
}
