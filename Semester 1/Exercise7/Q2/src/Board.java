import java.util.Scanner;
import java.util.StringTokenizer;

/**
 * Created by guy on 09/02/2016.
 */
public class Board {
    private Cell[][] cells;
    private int sizeOfBoard;
    private boolean gameOver;
    private int gameState; //0 if lost and 1 if won

    public Board(String difficulty) {
        switch (difficulty.toLowerCase()){
            case "easy":
                sizeOfBoard = 4;
                break;
            case "medium":
                sizeOfBoard = 8;
                break;
            case "hard":
                sizeOfBoard = 12;
                break;
        }
        cells = new Cell[sizeOfBoard][sizeOfBoard];
    }

    //When intialize is called, cells are created and added to the board randomly according to the difficulty
    public void initialize(){
        for (int row = 0; row < cells.length; row++) {
            for (int col = 0; col < cells[row].length; col++) {
                    cells[row][col] = new Cell(0);
            }
        }
        addMines();
        addCells();
    }
    //Add mines randomly to 1/4 of the size of the board
    private void addMines(){
        int randomRow = 0;
        int randomCol = 0;
        int minePool = (cells.length*cells.length)/4;
        for (int i = 0; i < minePool; minePool--) {
                randomRow = (int)(Math.random()*(cells.length));
                randomCol = (int)(Math.random()*(cells.length));
                cells[randomRow][randomCol].setMine(true);
        }
    }

    //Give the cells values and increment them according to the mine placement
    private void addCells(){
        for (int row = 0; row < cells.length; row++) {
            for (int col = 0; col < cells[row].length; col++) {
                if (!cells[row][col].isMine()){

                    for (int subRow = row-1; subRow <= row+1 ; subRow++) {
                        for (int subCol = col-1; subCol <= col+1; subCol++) {
                            if (subRow >= cells.length || subRow < 0 || subCol >= cells.length || subCol < 0){
                                continue;
                            }
                                if (cells[subRow][subCol].isMine()){
                                    cells[row][col].incrementValue();
                                }

                        }
                    }
                }
            }
        }
    }
    private void expose (int row, int col){
        if (cells[row][col].isMine()) {
            cells[row][col].setVisible(true);
            gameOver=true; //// FIXME: 15/02/2016 Call checkGameState at the end of nextTurn instead
        }
        if (cells[row][col].getValue()==0) {
            exposeZero(row, col);
        }else{
            cells[row][col].setVisible(true);
        }
    }
    //This method is used to expose all zero's in range recursively :)
    private void exposeZero(int row, int col){
        if (row < 0 || col < 0 || row >= cells.length || col >= cells.length){
            return;
        }
        if (cells[row][col].getValue() > 0 || cells[row][col].isVisible() || cells[row][col].isMine()){
            return;
        }
        if (!cells[row][col].isVisible()){
            cells[row][col].setVisible(true);
        }
            for (int i = row-1; i <= row+1; i++) {
                for (int j = col-1; j <= col+1  ; j++) {
                    if (i < 0 || j < 0 || i >= cells.length || j >= cells.length){
                        continue;
                    }
                    if (cells[i][j].getValue()==0)
                    exposeZero(i,j);
                }
            }


    }

    public boolean isGameOver(){
        return gameOver;
    }

    //Here go over the entire array and check the following:
    //if mine is exposed = gameOver and gameState = lost
    //if all mines marked and none visible = gameOver and gameState = win
    private void checkGameState(){
        int mineCounter=0;
        int markCounter=0;
        for (int row = 0; row < cells.length; row++) {
            for (int col = 0; col < cells[row].length; col++) {
                if (cells[row][col].isMine())
                    mineCounter++;
                if (cells[row][col].isMine() && cells[row][col].isVisible()){
                    gameOver = true;
                    gameState=0;
                    System.out.println("Game Over :( you blew up!");
                }
                if (cells[row][col].isMine() && cells[row][col].isMarked()) {
                    markCounter++;
                }
            }
        }
        if (mineCounter==markCounter){
            gameOver=true;
            gameState=1;
            System.out.println("You win! Nice job :)");
        }
    }

    public void nextTurn(){
        Scanner sc = new Scanner(System.in);
        StringTokenizer st = new StringTokenizer(sc.nextLine());
        String cmd ="";
        int row=0;
        int col=0;
        if (st.countTokens()!= 3){
            System.out.println("Please enter a valid command (i.e: solve 3 4)");
            return;
        }
        while(st.hasMoreElements()) {
            cmd = st.nextToken();
            row = Integer.parseInt(st.nextToken());
            col = Integer.parseInt(st.nextToken());
        }
        if (row >= cells.length || col >= cells.length || col < 0 || row < 0){
            System.out.println("No such place in board");
            return;
        }
        switch (cmd.toLowerCase()){
            case "expose":
                expose(row,col);
                break;
            case "mark":
                mark(row,col);
                break;
            case "solve":
                solve(row,col);
                break;
        }
        checkGameState();
    }

    private void mark(int row, int col){
        cells[row][col].setMarked(true);
    }

    private void solve(int row, int col){
        if (cells[row][col].isMine()){
            mark(row,col);
        }else{
            expose(row,col);
        }
    }
    public void show(){
        for (int row = 0; row < cells.length; row++) {
            System.out.print("|");
            for (int col = 0; col < cells[row].length; col++) {
                if (cells[row][col].isMarked() && !cells[row][col].isVisible())
                    System.out.print(" M |");
                else if (!cells[row][col].isVisible())
                    System.out.print(" * |");
                else {
                    if (cells[row][col].getValue() == -1) {
                        System.out.print((char) 27 + "[37;41;1m * " + (char) 27 + "[0m");
                        System.out.print("|");
                    }
                    else {
                        System.out.print(" " + cells[row][col].getValue() + " |");
                    }
                }
            }
            System.out.println();
        }
        System.out.println();
    }

}
