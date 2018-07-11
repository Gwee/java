/**
 * Created by guy on 18/04/2016.
 */
public class Circle extends EllipticalShape {

    public Circle(Point pos, int radius, int diameter) {
        super(pos, radius, diameter);
        this.radius = radius;
        this.diameter = diameter;

    }

    protected int getScope() {
        return 0;
    }

    public void whoAmI() {
        System.out.println("I am a Circle!");
        super.whoAmI();
    }

    public boolean equals(Shape other) {
        if (other instanceof Circle) {
            Circle otherShape = (Circle)other;
            return this.radius == otherShape.getRadius() && this.diameter == otherShape.getDiameter();
        } else {
            return false;
        }
    }
}
