/**
 * Created by guy on 02/05/2016.
 */
public class Program {
    public static void main(String[] args) {

        Complex a = new Complex(12,6);
        Complex b = new Complex();
        Complex c = new Complex(7,4);

        System.out.println("Add " +c.toString()+ " with " + a.toString());
        Complex d = c.add(a);
        d.show();

        Complex e;
        e = d.clone();
        System.out.println("Multiply " +d.toString()+ "  with " + a.toString());
        e.mul(a);
        e.show();

        System.out.println("Divide " +e.toString() + " by "+c.toString());
        Complex f = e.div(c);
        f.show();

        System.out.println("Substract "+d.toString()+ " by " +f.toString());
        d.sub(f);
        d.show();
    }
}
