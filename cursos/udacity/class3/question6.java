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
public class question6 {

    public int diceRoll(int side) {
        double randomNumber = (Math.random() * side) + 1;

        return (int) randomNumber;
    }

    public int monopolyRoll() {
        int sum;
        
        int sixSided1 = diceRoll(6);
        int sixSided2 = diceRoll(6);

        if (sixSided1 != sixSided2) {
            sum = sixSided1 + sixSided2;
        } else {
            int sixSided3 = diceRoll(6);
            int sixSided4 = diceRoll(6);

            sum = sixSided1 + sixSided2 + sixSided3 + sixSided4;
        }

        return sum;
    }
}
