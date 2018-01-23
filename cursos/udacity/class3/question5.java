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
public class question5 {
    public double fahrenheitToCelsius(double fahrenheit){
        double celcius = (fahrenheit - 32) * (5 / 9);
        
        return celcius;
    }
    
    public void printTemperature(double fahrenheit){
        System.out.println("F: " + fahrenheit + "\n C: " + fahrenheitToCelsius(fahrenheit));
    }
}
