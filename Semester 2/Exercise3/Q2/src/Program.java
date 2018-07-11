import javax.rmi.CORBA.Util;

/**
 * Created by guy on 08/05/2016.
 */
public class Program {
    public static void main(String[] args) {
        Point p1 = new Point(4,5);
        Point p2 = new Point(7,8);
        Point p3 = new Point(7,8);
        Point p4 = new Point(9,9);
        Complex c1 = new Complex(4,5);
        Complex c1Clone = c1;
        Object[] objArr = {p1,p2,c1};
        //Search by using native equals and found by reference
        System.out.println(Utility.search(objArr,c1Clone));
        //Search showing doesn't exist
        System.out.println(Utility.search(objArr,p4));
        //Search showing exists
        System.out.println(Utility.search(objArr,p3));

        Object[] objArr2 = {p1,p4,p3};
        //Max usage
        System.out.println("Max object in array");
        System.out.println(Utility.max(objArr2).toString());

        //Show all
        System.out.println("Example of ShowAll");
        Utility.showAll(objArr);
        //Show all using Showable
        System.out.println("Example of ShowAll that implement Showable");
        Complex c2 = new Complex(400,500);
        Showable[] showArr = {c1Clone,c1,c2};
        Utility.showAll(showArr);
    }
}
