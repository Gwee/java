import java.util.Arrays;

/**
 * Created by Guy on 2/2/2016.
 */
public class Program {
    public static void main(String[] args) {
        Matrix m1 = new Matrix(4,4,2,3,4);
        Matrix m2 = new Matrix(m1);
        Matrix m4 = new Matrix(4,4,2,3,4);
        Matrix m5 = new Matrix(8, 8, 1,5,9,8,2,3,5,6,6);
        System.out.println("m1 & m2:");
        m2.show();
        System.out.print("Is m1 Singular? ");
        System.out.println(m1.isSingular(m1.data));
        System.out.print("Is m1 Symmetric? ");
        System.out.println(m1.isSymmetric(m1.data));
        Matrix m6 = new Matrix(m2.getTranspose(m2.data));
        System.out.print("Transpose of m2 is: ");
        m6.show();
        int[][] m3Array = new int[][]{{1,7,3},{7,4,-5},{3,-5,6}};
        Matrix m3 = new Matrix(m3Array);
        System.out.println("m3:");
        m3.show();
        System.out.print("Is m3 Symmetric? ");
        System.out.println(m2.isSymmetric(m3.data));
        System.out.print("Is m3 thin? ");
        System.out.println(m2.isThin(m3.data));
        System.out.print("Does m3 equal m2? ");
        System.out.println(m2.isEquals(m3.data, m2.data));
        System.out.print("Does m4 equal m1? ");
        System.out.println(m2.isEquals(m4.data,m1.data));
        Matrix m7 =  new Matrix(m2.scalarMultiply(m3.data,5));
        //Matrix m8 =  new Matrix(m2.sumMatrix(m5.data,m2.data));
        Matrix m9 =  new Matrix(m2.diffMatrix(m3.data,m2.data));
        Matrix m10 =  new Matrix(m2.multiplyMatrix(m3.data,m2.data));
        System.out.println("Scalar multiplication of m3 and 5: ");
        m7.show();
        System.out.println("Sum of m3 and m2: ");
        //m8.show();
        System.out.println("Diff between m3 and m2: ");
       // m9.show();
        System.out.println("m3 multiplied by m2: ");
        //m10.show();
        System.out.println("Before subMatrix of m2: ");
        m2.show();
        System.out.println("After subMatrix of m2: ");
        m2.subMatrix(0,1,4,2);
        m2.show();
    }
}
