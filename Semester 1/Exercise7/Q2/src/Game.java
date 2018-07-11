/**
 * Created by Guy on 2/9/2016.
 */
public class Game {
    private Board board;

    public Game(String gameLevel) {
        board = new Board(gameLevel);
    }
    public void start (){
        board.initialize();
        board.show();
        while(!board.isGameOver()){
            board.nextTurn();
            board.show();
        }
        //board.checkGameState;
    }

}
