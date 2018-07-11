import java.util.Arrays;
import java.util.StringTokenizer;

/**
 * Created by guy on 17/02/2016.
 */
public class Program {
    public static void main(String[] args) {
        int[][] Board = {{1, 0, 1, 1, 0}, {0, 1, 1, 0, 0}, {1, 0, 1, 1, 0}, {1, 1, 0, 0, 1}, {0, 0, 0, 0, 1}, {1, 1, 1, 1, 1}};
        System.out.println(Arrays.toString(Board[0]));
        System.out.println(Arrays.toString(Board[1]));
        System.out.println(Arrays.toString(Board[2]));
        System.out.println(Arrays.toString(Board[3]));
        System.out.println(Arrays.toString(Board[4]));
        System.out.println(Arrays.toString(Board[5]));
        System.out.println();
        System.out.println("This is the way to the destination 5,4");
        canMove(Board, 0,0,5,4);
        System.out.println();
        System.out.println("This is the way to destination 5,0");
        canMoveLeft(Board, 0,0,5,0);
    }

    public static boolean canMove(int[][] m, int srcRow, int srcCol, int dstRow, int dstCol) {
        if (srcRow == dstRow && srcCol == dstCol) {
            return true;
        }
            for (int row = srcRow; row <= srcRow + 1; row++) {
                for (int col = srcCol; col <= srcCol + 1; col++) {
                    if (row==srcRow && col ==srcCol){
                        continue;
                    }
                    if (col >= m[0].length || row >= m.length){
                        continue;
                    }
                    if (m[row][col] == 1) {
                        if (canMove(m, row, col, dstRow, dstCol)){
                            System.out.println(row+", "+col);
                            return true;
                        }
                    }
                }
            }
        return false;
    }

    public static boolean canMoveLeft(int[][] m, int srcRow, int srcCol, int dstRow, int dstCol) {
        if (srcRow == dstRow && srcCol == dstCol) {
            return true;
        }
        for (int row = srcRow-1; row <= srcRow + 1; row++) {
            for (int col = srcCol-1; col <= srcCol + 1; col++) {
                if (row==srcRow && col ==srcCol){
                    continue;
                }
                if (col >= m[0].length || row >= m.length || row <0 || col <0){
                    continue;
                }
                if (m[row][col] == 1 && m[row][col]!=2) {
                    m[row][col]=2;
                    if (canMoveLeft(m, row, col, dstRow, dstCol)){
                        System.out.println(row+", "+col);
                        return true;
                    }
                }
            }
        }
        return false;
    }
}
