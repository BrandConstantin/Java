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
public class question1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double balance = 0;
        balance = balance + 20; //Add quarter 1 profits (thousands).
        balance = balance - 25; //Subtract quarter 1 expenses (thousands).
        balance = balance + 30; //Add quarter 2 profits (thousands).
        balance = balance - 25; //Subtract quarter 1 expenses (thousands).
        if (balance < 0) {
            System.out.println("We’re in the red!");
        } else if (balance > 0) {
            System.out.println("We made a profit!");
        } else {
            System.out.println("We broke even.");
        }

    }

}
