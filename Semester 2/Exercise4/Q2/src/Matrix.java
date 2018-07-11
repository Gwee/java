import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Created by guy on 20/05/2016.
 */
public class Matrix implements Arithmetic,InputOutput,Cloneable {
    private int[][] data;

    public Matrix (Matrix m){
        this.data = m.data;
    }
    public Matrix (int row, int col) throws Exception {
        if (row <=0 || col <=0)
            throw new Exception("Number of rows or columns cannot be 0 or a negative number");
        data = new int[row][col];
    }
    public Matrix (int[][] m) throws Exception {
        if (m!=null)
        data = m;
        if (!isMatrix(this)){
            throw new Exception("This is not a matrix");
        }
    }

    private void verifyMatrix(Object o) {
        if (!(o instanceof Matrix)) {
            throw new UnsupportedOperationException("Cannot add a non Matrix to Matrix");
        }
    }

    private boolean isMatrix (Matrix m){
        int arrLength = m.data[0].length;
        for (int i = 0; i < m.data.length; i++) {
            if (m.data[i].length != arrLength)
                return false;
        }
        return true;
    }

    //Since isMatrix checks if this is a matrix, we only need to rely on comparing the length of the row and column for dimensions and same for ifSquare
    private boolean compareMatrixDimensions (Matrix m){
        if (m!=null && isMatrix(m) && m.data.length == this.data.length && m.data[0].length == this.data[0].length){
            return true;
        }else{
            throw new UnsupportedOperationException("Not the same Matrix dimensions");
        }
    }

    private boolean isSquareMatrix (Matrix m){
        if (m!=null && isMatrix(m) && m.data.length == m.data[0].length){
            return true;
        }else {
            throw new UnsupportedOperationException("Not a square matrix");
        }
    }
    @Override
    public Matrix add(Object o) {
        Matrix retObj = new Matrix((Matrix) (o));
        try {
            verifyMatrix(o);
            compareMatrixDimensions((Matrix)(o));
            for (int i = 0; i < this.data.length; i++) {
                for (int j = 0; j < this.data[i].length; j++) {
                    retObj.data[i][j] = this.data[i][j] + ((Matrix) o).data[i][j];
                }
            }
        } catch (RuntimeException e) {
            System.out.println("Cannot add!");
            System.out.println(e.toString());
        }
        return retObj;
    }

    @Override
    public Matrix sub(Object o) {
        Matrix retObj = new Matrix((Matrix) (o));
        try {
            verifyMatrix(o);
            compareMatrixDimensions((Matrix)(o));
            for (int i = 0; i < this.data.length; i++) {
                for (int j = 0; j < this.data[i].length; j++) {
                    retObj.data[i][j] = this.data[i][j] - ((Matrix) o).data[i][j];
                }
            }
        } catch (RuntimeException e) {
            System.out.println("Cannot subtract!");
            System.out.println(e.toString());
        }
        return retObj;
    }

    @Override
    public Matrix mul(Object o) {
        Matrix retObj = new Matrix((Matrix) (o));
        try {
            verifyMatrix(o);
            isSquareMatrix((Matrix) (o));
            for (int i = 0; i < this.data.length; i++) {
                for (int j = 0; j < this.data[i].length; j++) {
                    retObj.data[i][j] = this.data[i][j] * ((Matrix) o).data[i][j];
                }
            }
        } catch (RuntimeException e) {
            System.out.println("Cannot multiply!");
            System.out.println(e.toString());
        }
        return retObj;
    }

    @Override
    public Matrix div(Object o) {
        throw new DivOperationNotSupported("div not supported");
    }

    @Override
    public String toString() {
        String retString ="";
        for (int i = 0; i < this.data.length; i++) {
            for (int j = 0; j < this.data[i].length; j++) {
               retString+=this.data[i][j] + " ";
            }
            retString+="\n";
        }
        return retString;
    }


    @Override
    public void read() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a number: ");
        try {
            int tmpInt = sc.nextInt();
            data[0][0] = tmpInt; //not sure i understand what to do with the int
        }catch (InputMismatchException e){
            System.out.println("Error - Not a number!");
            read();
        }finally {
            sc.close();
        }
    }
    @Override
    public void write() {
        System.out.println(this.toString());
    }
    @Override
    public boolean equals(Object obj){
        try {
            verifyMatrix(obj);
            compareMatrixDimensions((Matrix) obj);
            for (int i = 0; i < data.length; i++) {
                for (int j = 0; j < data[i].length; j++) {
                    if (data[i][j] != ((Matrix) obj).data[i][j]) {
                        return false;
                    }
                }
            }
        }catch (RuntimeException e){
            System.out.println(e.toString());
            return false;
        }
        return true;
    }
    public Matrix clone() throws CloneNotSupportedException {
        return (Matrix) super.clone();
    }
    public int valueAt(int i, int j){
        try {
            return data[i][j];
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Illegal index, please enter an index i from 0 to: "+data.length + " or index j from 0 to: "+data[0].length);
        }
        return data[i][j];
    }
}