/**
 * Created by guy on 18/04/2016.
 */
public class Rectangle extends PolygonShape {
    private double width, height;
    public Rectangle (Point pos, int width, int height){
        super(pos);
        this.width = width;
        this.height = height;
    }
    @Override
    protected double getArea() {
        return width*height;
    }

    protected int getScope() {
        return 0;
    }

    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }

    public void whoAmI(){
        System.out.println("I am a Rectangle!");
        System.out.println("Position: "+super.getPosition().toString()+" Width: "+width+ " Height: "+height);
        super.whoAmI();

    }

    @Override
    public boolean equals(Shape other) {
        if (other instanceof Rectangle) {
            Rectangle otherShape = (Rectangle) other;
            return this.width == otherShape.getWidth() && this.height == otherShape.getHeight();
        } else {
            return false;
        }
    }
}
