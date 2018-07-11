/**
 * Created by Guy on 4/10/2016.
 */
public abstract class EllipticalShape extends TwoDimensionalShape {
    protected double radius, diameter;
    public EllipticalShape(Point pos, int radius, int diameter) {
        super(pos);
        this.radius = radius;
        this.diameter = diameter;
    }
    public void whoAmI(){
        System.out.println("Position: "+super.getPosition().toString()+" Radius: "+radius+" Diameter: "+diameter);
        super.whoAmI();

    }
    protected double getArea(){
        return Math.PI*Math.pow(radius,2);
    }
    public double getRadius() {
        return radius;
    }

    public double getDiameter() {
        return diameter;
    }


}
