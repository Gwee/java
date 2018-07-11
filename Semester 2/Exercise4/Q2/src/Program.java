/**
 * Created by guy on 22/05/2016.
 */
public class Program {
    public static void main(String[] args) throws Exception {
        int[][] notMatrix1 = new int[][]{{1, 1, 1},{2, 2, 2, 2}};
        int[][] notMatrix2 = new int[][]{{1, 1, 1,},{2, 2, 2,},{3}};
        int[][] arr3x3 = new int[][]{{1, 1, 1},{2, 2, 2},{3, 3, 3}};
        int[][] arr3x4 = new int[][]{{1, 1, 1, 1},{2, 2, 2, 2},{3, 3, 3, 3}};
        int[][] arr4x3 = new int[][]{{1, 1, 1},{2, 2, 2},{3, 3, 3},{4, 4, 4}};
        int[][] arr4x3Large = new int[][]{{10, 10, 10},{20, 20, 20},{30, 30, 30},{40, 40, 40}};

        Matrix m2 = new Matrix(arr3x3);
        Matrix m3 = new Matrix(arr3x4);
        Matrix m4 = new Matrix(arr4x3);
        Matrix m5 = new Matrix(arr4x3Large);


        m2.write();
        m3.write();
        m4.write();

        //Examples of arithmetic operations
        Matrix m6 = m3.add(m3);
        Matrix m7 = m5.sub(m4);
        Matrix m8 = m2.mul(m2);

        System.out.println("Addition");
        m6.write();
        System.out.println("Subtraction");
        m7.write();
        System.out.println("Multiplication");
        m8.write();

        //Example of div exception
        try {
            Matrix m9 = m6.div(m3);
        }catch (DivOperationNotSupported e){
            System.out.println(e.toString());
        }

        //Example of InputOutput operations
        m2.read();
        m2.write();

        //Examples equals
        System.out.println("Is m2 equal to m2? "+ m2.equals(m2));
        System.out.println("Is m2 equal to m3? "+ m2.equals(m3));
        System.out.println("Is m5 equal to m4? " +m5.equals(m4));

        //Examples of cloning
        Matrix cloneM2 = m2.clone();
        System.out.println("Is cloneM2 equal to m2? "+cloneM2.equals(m2));
        Matrix cloneM5 = m5.clone();
        System.out.println("Is cloneM2 equal to cloneM5? "+ cloneM5.equals(cloneM2));
        m5.write();

        //Examples for valueAt
        System.out.println("Checking values 2,2 in m2 \n");
        m2.write();
        System.out.println("Got: "+m2.valueAt(2,2));
        System.out.println("Checking values 0,0 in m5 \n");
        m5.write();
        System.out.println("Got: "+m5.valueAt(0,0));



        //NEGATIVE TESTS
        //Examples of incompatible matrices
        System.out.println("\n \n NEGATIVE TESTS \n");
        try {
            Matrix m1Bad = new Matrix(notMatrix2);
        }catch (Exception e){
            System.out.println(e.toString());
        }
        try {
            Matrix m2Bad = new Matrix(0,1);
        }catch (Exception e){
            System.out.println(e.toString());
        }
        try {
            Matrix m3Bad = new Matrix(1,-9);
        }catch (Exception e){
            System.out.println(e.toString());
        }
        //Illegal arithmetic operations
        m3.add(m4);
        m5.sub(m3);
        m5.mul(m3);
        //Illegal valueAt numbers using outofboundsexceptions
        try {
        m4.valueAt(-1,1);
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println(e.toString());
        }
        try {
            m2.valueAt(2,10);
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println(e.toString());
        }

    }
}
