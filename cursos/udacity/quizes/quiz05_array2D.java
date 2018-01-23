/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quizes;

import javax.security.auth.Subject;

/**
 *
 * @author brand
 */
public class quiz05_array2D {
    public static double studentAvarage(int[][] grades, int student){
        int total = 0;
//        int subjects = grades.length;
        
        for (int i = 0; i < grades.length; i++) {
            total += grades[i][student];            
        }
        
        double avarage = total / (double)grades.length;
        
        return avarage;
    }
}
