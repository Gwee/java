/**
 * Created by guy on 18/04/2016.
 */

public class Triangle extends PolygonShape {
    private double height, base;

    public Triangle(Point pos, double height, double base) {
        super(pos);
        this.height = height;
        this.base = base;
    }

    @Override
    protected double getArea() {
        return (height * base) / 2;
    }

    protected int getScope() {
        return 0;
    }

    public void whoAmI() {
        System.out.println("I am a Triangle!");
        System.out.println("Position: " + super.getPosition().toString() + " Height: " + height + " Base: " + base);
        super.whoAmI();
    }

    @Override
    protected boolean equals(Shape other) {
        if (other instanceof Triangle) {
            Triangle otherShape = (Triangle) other;
            return this.height == otherShape.getHeight() && this.base == otherShape.getBase();
        } else {
            return false;
        }
    }

    public double getHeight() {
        return height;
    }

    public double getBase() {
        return base;
    }
}
