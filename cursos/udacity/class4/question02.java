/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package class4;

/**
 *
 * @author brand
 */
public class question02 {

    public static void main(String[] args) {
        String[] sentence = {"Learning", "Java", "is", "fun."};

        System.out.println(indexOfFirstOccurrence(sentence, "dfadsf"));
        System.out.println(indexOfFirstOccurrence(sentence, "Java"));

    }

    public static int indexOfFirstOccurrence(String[] stringArray, String sentence) {        
        for (int i = 0; i < stringArray.length; i++) {
            if (stringArray[i].equals(sentence)){
                return i;
            }
        }
        return -1;
    }
}
