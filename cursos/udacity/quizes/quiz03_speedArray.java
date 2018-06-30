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
public class quiz03_speedArray {

    double[] speed = {5.1, 4.2, 2.4, 6.2, 8.5, 9.0};

    public double search(double[] speed) {
        int size = speed.length;
        double min = speed[0];

        for (int i = 1; i < size; i++) {
            if (speed[i] < min) {
                min = speed[i];
            }
        }

        return min;
    }
}
