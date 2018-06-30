/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package class3;

/**
 *
 * @author brand
 */
public class question3 {

    public double calculateTip(double cost) {
        double finalCost = (cost * 15) / 100;

        return calculateTip(finalCost);
    }

    public double calculateTip2(double cost) {
        double tip = cost * 0.15;
        return tip;
    }

}
