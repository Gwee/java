/**
 * Created by Guy on 1/15/2016.
 */
public class Program {

    public static void main(String[] args) {
        Polynomial a = new Polynomial(4,3,2,2,0,7);
        Polynomial b = new Polynomial(6,-2,1,6,3,4,6,5);
        Polynomial c = new Polynomial(6,2,5,6,4,5,4,0);
        Polynomial d = new Polynomial(2,4,1,6);
        System.out.println("Evaluation = " +a.evaluate(2));
        a.show();
        a.showDerivative();
        System.out.println("Evaluation = "+b.evaluate(4));
        b.show();
        b.showDerivative();

        System.out.println(d.isRoot(-1.5));
    }
}
