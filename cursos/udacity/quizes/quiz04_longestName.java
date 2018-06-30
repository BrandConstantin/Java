/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quizes;

/**
 *
 * @author brand
 */
public class quiz04_longestName {
    public static void main(String[] args) {
        String[] names = {"Cleopatra", "Alejandro", "Kimberli", "John", "Stan"};
        
//        System.out.println(names[longestName]);
    }
    

    public String findLongestName(String[] names) {
        int size = names.length;
        String longestName = names[0];

        for (int i = 1; i < size; i++) {
            if (names[i].length() > longestName.length()) {
                longestName = names[i];
            }
        }

        return longestName;
    }
}
