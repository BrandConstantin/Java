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
public class question06 {

    public static void main(String[] args) {
        int rows = 3;
        for (int i = 1; i <= rows; i++) {
            String thisRow = "";
            for (int j = 0; j < i; j++) {
                thisRow = thisRow + "#";
            }
            System.out.println(thisRow);
        }
    }
}
