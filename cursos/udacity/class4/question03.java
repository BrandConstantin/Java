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
public class question03 {

    public static void main(String[] args) {
        System.out.println(yearsTilOneMillion(1000));

    }

    public static int yearsTilOneMillion(double initialBalance) {
        double interest = 1.05;
        int years = 0;
//        double total = initialBalance;

        for (double total = initialBalance; total < 1000000; total++) {
            years++;
            total = (total * interest);            
        }

        return years;
    }
}
