package tictactoeapplication;

/**
 *
 * @author BrandConstantin
 */
public class TicTacToe {

    protected char[] board;
    protected char userMarker;
    protected char aiMarker;
    protected char winner;
    protected char currentMarker;

    public TicTacToe(char playerMarker, char aiMarker) {
        this.board = setBoard();
        this.userMarker = playerMarker;
        this.aiMarker = aiMarker;
        this.winner = '-';
        this.currentMarker = userMarker;
    }

    public static char[] setBoard() {
        char[] board = new char[9];
        for (int i = 0; i < board.length; i++) {
            board[i] = '-';
        }
        return board;
    }

    public boolean playTurn(int spot) {
        boolean isValid = withinRange(spot) && !isSpotTaken(spot);

        if (isValid) {
            board[spot - 1] = currentMarker;
            currentMarker = (currentMarker == userMarker) ? aiMarker : userMarker;
        }
        return isValid;
    }

    // check if our spot is in the range
    public boolean withinRange(int number) {
        return number > 0 && number < board.length + 1;
    }

    // check if the spot is taken
    public boolean isSpotTaken(int number) {
        return board[number - 1] != '-';
    }

    public void printBoard() {
        System.out.println();
        for (int i = 0; i < 9; i++) {
            if (i % 3 == 0 && i != 0) {
                System.out.println();
                System.out.println("-----------------");
            }
            System.out.print(" | " + board[i]);
        }
        System.out.println();
    }

    public static void printIndexBoard() {
        System.out.println();
        for (int i = 0; i < 9; i++) {
            if (i % 3 == 0 && i != 0) {
                System.out.println();
                System.out.println("-----------------");
            }
            System.out.print(" | " + (i + 1));
        }
        System.out.println();
    }
    
    public boolean isThereAWinner(){
        boolean diagonalsAndMiddles = (rightDi() || leftDi() || middleRow() || secondCol()) && board[4] != '-';
        boolean topAndFirst = (topRow() || firstCol()) && board[0] != '-';
        boolean bottomAndThird = (bottomRow() || thirdCol()) && board[8] != '-';
        
        if(diagonalsAndMiddles){
            System.out.println("di");
            this.winner = board[4];
        }else if(topAndFirst){
            System.out.println("m");
            this.winner = board[0];
        }else if(bottomAndThird){
            System.out.println("l");
            this.winner = board[8];
        }
        return diagonalsAndMiddles || topAndFirst || bottomAndThird;
    }
    
    public boolean topRow(){
        return board[0] == board[1] && board[1] == board[2];
    }
    public boolean middleRow(){
        return board[3] == board[4] && board[4] == board[5];
    }
    public boolean bottomRow(){
        return board[6] == board[7] && board[7] == board[8];
    }
    public boolean firstCol(){
        return board[0] == board[3] && board[3] == board[6];
    }
    public boolean secondCol(){
        return board[1] == board[4] && board[4] == board[7];
    }
    public boolean thirdCol(){
        return board[2] == board[5] && board[5] == board[8];
    }
    public boolean rightDi(){
        return board[0] == board[4] && board[4] == board[8];
    }
    public boolean leftDi(){
        return board[2] == board[4] && board[4] == board[6];
    }
    public boolean isTheBoardFilled(){
        for (int i = 0; i < board.length; i++) {
            if(board[i] == '-'){
                return false;
            }            
        }
        return true;
    }
    public String gemeOver(){
        boolean didSomeoneWin = isThereAWinner();
        if(didSomeoneWin){
            return "The winner is " + this.winner;
        }else if(isTheBoardFilled()){
            return "Game over!";
        }else{
            return "Not over!";
        }
    }
}
