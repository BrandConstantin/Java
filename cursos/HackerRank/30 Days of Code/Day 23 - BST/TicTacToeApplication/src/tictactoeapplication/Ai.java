package tictactoeapplication;

import java.util.ArrayList;
import java.util.Random;

/**
 *
 * @author BrandConstantin
 */
public class Ai {
    public int pickSpot(TicTacToe game){
        ArrayList<Integer> choices = new ArrayList();
        for (int i = 0; i < 9; i++) {
            // if the slot is not taken, add it as a choice
            if(game.board[i] == '-'){
                choices.add(i + 1);
            }
        }
        
        Random rand = new Random();
        int choice = choices.get(Math.abs(rand.nextInt() % choices.size()));
        
        return choice;
    }
}
