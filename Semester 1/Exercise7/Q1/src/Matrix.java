import java.util.Arrays;

/**
 * Created by Guy on 2/2/2016.
 */
public class Matrix {
    int[][] data;
    boolean squareMatrix;

    public Matrix (int row, int col, int... values){
        if (row==col){
            squareMatrix=true;
        }
        data = new int[row][col];
        for (int i = 0; i < data.length ; i++) {
            for (int j = 0; j < data[i].length ; j++) {
                int rand = (int) (Math.random() * values.length);
                data[i][j] = values[rand];
            }
        }
    }
    public Matrix (Matrix m){
        if (m.squareMatrix){
            this.squareMatrix=true;
        }
        this.data = m.data ;
    }
    public Matrix (int[][] m){
        this.data = m;
    }
    public boolean isSingular(int[][] matrix){
        if (!squareMatrix){
            return false;
        }
        if (determinant(matrix) ==0){
            return true;
        }else{
            return false;
        }
    }
    public int[][] getTranspose(int[][] matrix){
        int[][] result = new int[matrix.length][matrix.length];
        result[0][0] = matrix[0][0];
        for (int x = 0; x < matrix.length ; x++) {
            for (int y = 0; y < matrix[x].length ; y++) {
                    result[x][y] = matrix[y][x];
            }
        }
        return result;
    }
    public boolean isSymmetric(int[][] matrix) {
        if (!squareMatrix) {
            return false;
        }
            for (int x = 0; x < matrix.length; x++) {
                for (int y = 0; y < x; y++) {
                        if (matrix[x][y] != matrix[y][x]) {
                           return false;
                        }
                }
            }
            return true;
        }
    public boolean isThin(int[][] matrix){
        double zeroCount=0;
        double count=0;
        for (int i = 0; i < matrix.length ; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] == 0){
                    zeroCount++;
                }
                count++;
            }
        }
        if (zeroCount/count*100 >= 80){
            return true;
        }else{
            return false;
        }
    }

    public int[][] scalarMultiply(int[][] m, int scalar){
        for (int x = 0; x < m.length; x++) {
            for (int y = 0; y < m[x].length; y++) {
                m[x][y] *= scalar;
            }
        }
        return m;
    }
    public int[][] sumMatrix(int[][] m1, int[][] m2){
        int length=0;
        if (m1.length == m2.length && m1[0].length == m2[0].length){
            length = m1.length;
        }else{
            return null;
        }
        int[][] result = new int[length][length];
        for (int x = 0; x < m1.length; x++) {
            for (int y = 0; y < m1[x].length; y++) {
                result[x][y] = m1[x][y] + m2[x][y];
            }
        }
        return result;
    }
    public int[][] diffMatrix(int[][] m1, int[][]m2){
        int length=0;
        if (m1.length == m2.length && m1[0].length == m2[0].length){
            length = m1.length;
        }else{
            return null;
        }
        int[][] result = new int[length][length];
        for (int x = 0; x < m1.length; x++) {
            for (int y = 0; y < m1[x].length; y++) {
                result[x][y] = m1[x][y] - m2[x][y];
            }
        }
        return result;
    }
    public int[][] multiplyMatrix(int[][] m1, int[][]m2){
        int length=0;
        if (m1.length == m2.length && m1[0].length == m2[0].length){
            length = m1.length;
        }else{
            return null;
        }
        int[][] result = new int[length][length];
        for (int x = 0; x < m1.length; x++) {
            for (int y = 0; y < m1[x].length; y++) {
                result[x][y] = m1[x][y] * m2[x][y];
            }
        }
        return result;
    }
    public boolean isEquals(int[][] m1, int[][] m2){
        boolean b1=false;
        int newLength =0;
        int index=0;
        for (int i = 0; i < m1.length ; i++) {
            if (m1[i].length != m2[i].length) {
                return false;
            }
            newLength += m1[i].length;
        }
        int[] arr1 = new int[newLength];
        int[] arr2 = new int[newLength];
        for (int x = 0; x < m1.length ; x++) {
            for (int y = 0; y < m1[x].length; y++) {
                arr1[index] = m1[x][y];
                arr2[index] = m2[x][y];
                index++;
                }
            }
        for (int i = 0; i < arr1.length ; i++) {
            for (int j = 0; j < arr1.length ; j++) {
                if (arr1[i] == arr2[j]){
                    b1 = true;
                    break;
                }else{
                    b1=false;
                }
            }
            if (!b1){
                return false;
            }
        }
     return  b1;
    }
    private int determinant(int[][] matrix){
        int sum=0;
        int s;
        if(matrix.length==1){  //size 1 matrix determinant is itself.
            return(matrix[0][0]);
        }
        for(int i=0;i<matrix.length;i++){ //finds determinant using row-by-row expansion
            int[][]smaller= new int[matrix.length-1][matrix.length-1]; //creates smaller matrix- values not in same row, column
            for(int a=1;a<matrix.length;a++){
                for(int b=0;b<matrix.length;b++){
                    if(b<i){
                        smaller[a-1][b]=matrix[a][b];
                    }
                    else if(b>i){
                        smaller[a-1][b-1]=matrix[a][b];
                    }
                }
            }
            if(i%2==0){ //sign changes based on i
                s=1;
            }
            else{
                s=-1;
            }
            sum+=s*matrix[0][i]*(determinant(smaller)); //recursive step: determinant of larger determined by smaller.
        }
        return(sum); //returns determinant value. once stack is finished, returns final determinant.
    }

    public int[][] generateSubMatrix (int[][] matrix, int excludeColumnIndex){
        int[][] m = new int[matrix.length-1][matrix.length-1];
        int i2;
        for (int i = 0; i <matrix.length ; i++) {
            for (int j = 1; j <matrix.length ; j++) {
                i2=i;

                if (i !=excludeColumnIndex){
                if (i > excludeColumnIndex){
                    i2--;
                }
                    m[j-1][i2] = matrix[j][i];
                }
            }

        }
        return m;
    }
    public Matrix subMatrix(int i, int j, int a, int b){
        int[][] subMatrix = new int[a][b];
        if (i+a > this.data.length || j+b > this.data.length ){
            return this;
        }
        int jTemp=j;
        for (int x = 0; x < a; x++) {
            for (int y = 0; y < b; y++) {
                subMatrix[x][y] = this.data[i][j];
                j++;
            }
            i++;
            j=jTemp;
        }
        this.data = subMatrix;
        return this;
    }
    public void show (){
        for (int x = 0; x < data.length; x++) {
            System.out.println("");
            for (int y = 0; y < data[x].length; y++) {
                System.out.print(data[x][y] + " ");
            }
        }
        System.out.println("");
    }
}
