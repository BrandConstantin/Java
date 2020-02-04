package tictactoeapplication;

import java.util.Scanner;

/**
 *
 * @author BrandConstantin
 */
public class TicTacToeApplication {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean doYouWantToPlay = true;
        
        while(doYouWantToPlay){
            System.out.println("Wolcome to Tic Tac Toe! \n Pick what character I will be: ");
            char playerToken = sc.next().charAt(0);
            System.out.println("Enter a character for your opponent: ");
            char opponentToken = sc.next().charAt(0);
            
            TicTacToe game = new TicTacToe(playerToken, opponentToken);
            Ai ai = new Ai();
            
            //set up the game
            System.out.println("Enter a number from 1-9, left to right: ");
            TicTacToe.printIndexBoard();
            
            while(game.gemeOver().equals("Not over!")){
                if(game.currentMarker == game.userMarker){
                    // user turn
                    System.out.println("It's your turn");
                    int spot = sc.nextInt();
                    
                    while(!game.playTurn(spot)){
                        System.out.println("Try again! The spot is alredy taken.");
                        spot = sc.nextInt();
                    }
                    System.out.println("You picked " + spot);
                }else{
                    // ai turn
                    System.out.println("It's the turn of pc");
                    int aiSpot = ai.pickSpot(game);
                    game.playTurn(aiSpot);
                    System.out.println("I picked " + aiSpot);
                }
                // print out new board
                System.out.println("");
                game.printBoard();
            }
            
            System.out.println(game.gemeOver());
            System.out.println("Do you wanna play again? ");
            char response = sc.next().charAt(0);
            
            doYouWantToPlay = response == 'Y';
        }
    }
    
}
