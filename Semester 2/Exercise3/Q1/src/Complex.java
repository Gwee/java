import java.util.ArrayList;

/**
 * Created by guy on 02/05/2016.
 */
public class Complex implements showable,Arithmetic {
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
    public boolean equals(Complex c){
        return this.a == c.a && this.b == c.b;
    }
    public void show(){
        System.out.println(this);
    }

    @Override
    public Complex add(Object o1) {
        if (o1 instanceof Complex){
            this.a = this.a + ((Complex) o1).a;
            this.b = this.b + ((Complex) o1).b;
        }else{
            return null;
        }
        return this;
    }

    @Override
    public Complex sub(Object o1) {
        if (o1 instanceof Complex){
            this.a = this.a - ((Complex) o1).a;
            this.b = this.b - ((Complex) o1).b;
        }else{
            return null;
        }
        return this;
    }

    @Override
    public Complex mul(Object o1) {
        if (o1 instanceof Complex){
            this.a = this.a * ((Complex) o1).a;
            this.b = this.b * ((Complex) o1).b;
        }else{
            return null;
        }
        return this;
    }

    @Override
    public Complex div(Object o1) {
        if (o1 instanceof Complex){
            this.a = this.a / ((Complex) o1).a;
            this.b = this.b / ((Complex) o1).b;
        }else{
            return null;
        }
        return this;
    }
}
