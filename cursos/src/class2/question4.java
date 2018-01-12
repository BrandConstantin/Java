/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package class2;

/**
 *
 * @author brand
 */
public class question4 {

    public static void main(String[] args) {
        boolean isSnowing = false;
        boolean isRaining = true;
        double temperature = 60.0;

        if (isRaining || isSnowing || temperature < 50) {
            System.out.println("Let’s stay home.");
        } else {
            System.out.println("Let’s go out!");
        }
    }
}
