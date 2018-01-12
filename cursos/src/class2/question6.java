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
public class question6 {

    public static void main(String[] args) {
        int weekday = 5;
        boolean holiday = false;
        if (weekday >= 1 && weekday <= 5 && !holiday) {
            System.out.println("Wake up at 7:00");
        } else {
            System.out.println("Sleep in!");
        }
    }
}
