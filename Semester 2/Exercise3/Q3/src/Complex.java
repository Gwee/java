/**
 * Created by guy on 02/05/2016.
 */
public class Complex {
    private double a,b;

    public Complex(){
       this(0,0);
    }
    public Complex(double a, double b){
        this.a = a;
        this.b = b;
    }
    public Complex(Complex c){
        this.a = c.a;
        this.b = c.b;
    }

    public Complex clone(){
        return new Complex(this.a,this.b);
    }
    @Override
    public String toString() {
        return "(" + a + " + " + b + "i)";
    }
    public void show() {
        System.out.println(this);
    }
}