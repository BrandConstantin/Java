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
public class quiz02_countBlocks {

    public int countBlocks(int levels) {
        int blocks = 0;

        for (int i = 1; i <= levels; i++) {
            blocks += (i * i);
        }

        return blocks;
    }
}
