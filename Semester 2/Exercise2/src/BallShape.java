/**
 * Created by Guy on 4/10/2016.
 */
public class BallShape extends ThreeDimensionalShape {
    private double radius;
    public BallShape(Point pos, int radius) {
        super(pos);
        this.radius = radius;
    }
    @Override
    public double getVol() {
        return ((1.333333*Math.PI*(Math.pow(radius,3))));
    }
    public void whoAmI(){
        System.out.println("I am a Ball!");
        System.out.println("Position: "+getPosition().toString()+" Radius: "+radius);
        super.whoAmI();

    }

    public double getRadius() {
        return radius;
    }

    @Override
    public double getArea() {
        return 4*Math.PI*Math.pow(radius,2);
    }

    @Override
    public boolean equals(Shape other) {
        if (other instanceof BallShape) {
            BallShape otherShape = (BallShape)other;
            return this.radius == otherShape.getRadius();
        } else {
            return false;
        }
    }
}
