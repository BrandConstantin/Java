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
public class question04 {

    public static void main(String[] args) {
        String weekdays[] = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday"};
//
//        for (int i = weekdays.length - 1; i >= 0; i--) {
//            System.out.println((weekdays[i]));
//        }
        printInReverse(weekdays);
    }

    public static void printInReverse(String[] weekdays) {

        for (int i = weekdays.length - 1; i >= 0; i--) {
            System.out.println((weekdays[i]));
        }
    }
}
