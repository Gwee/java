/**
 * Created by guy on 08/05/2016.
 */
public class Program {
    public static void main(String[] args) {
        Complex c = new Complex(4,5);
        Point p = new Point(7,8);
        Complex c2 = c;
        Point p3 = new Point(8,9);
        Complex c3 = new Complex(10,20);
        Point p4 = new Point(8,9);

        Set s0 = new Set(6);
        s0.addObj(c);
        s0.addObj(c3);
        s0.addObj(p);
        s0.addObj(p3);
        //c2 will not be added since its the same object as c
        s0.addObj(c2);
        //this will not be added since equals is implemented in class Point and p4=p3
        s0.addObj(p4);

        System.out.println(s0.toString());
        Complex c4 = new Complex(20,30);
        Complex c5 = new Complex(30,40);
        Point p5 = new Point(60,80);
        Point p6 = new Point(7,8);
        Complex c6 = new Complex();
        Object[] setArr = {c4,c5,p6,c6};
        Set s1 = new Set(5,setArr);

        //example of adding both sets
        Object s3 = s0.add(s1);
        System.out.println(s3.toString());

        //example of using multiple on both and see that only p6 in common
        Object s4 = s0.mul(s1);
        System.out.println(s4.toString());


        //example of getting all points by class
        Object s5 = s0.getByType(Point.class);

        Class[] class1 = s0.getObjects();

        //example of ScanOp
        System.out.println(s1.getCurrent().toString());
        s1.forward();
        s1.forward();
        System.out.println("Point does not implement toString so we get: "+s1.getCurrent().toString());
        s1.backward();
        System.out.println(s1.getCurrent().toString());
        s1.reset();
        System.out.println(s1.getCurrent().toString());

    }

}
