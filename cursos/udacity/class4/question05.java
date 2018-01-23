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
public class question05 {

    public static void main(String[] args) {
        int intArray[] = {1, 0, 2, 3, -1, 2};

//        findRange(intArray);
    }

    public int findRange(int[] intArray) {
        if (intArray.length == 0) {
            return -1;
        } else {
            int largest = intArray[0];
            int smaller = intArray[0];

            for (int i = 1; i < intArray.length; i++) {
                if (intArray[i] > largest) {
                    largest = intArray[i];
                }
                if (intArray[i] < smaller) {
                    smaller = intArray[i];
                }
            }

            return largest - smaller;
        }
    }

}
