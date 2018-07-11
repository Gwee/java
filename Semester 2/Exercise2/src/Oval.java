/**
 * Created by guy on 18/04/2016.
 */
public class Oval extends EllipticalShape {

    public Oval(Point pos, int radius, int diameter){
        super(pos,radius,diameter);
    }
    protected int getScope() {
        return 0;
    }
    public void whoAmI(){
        System.out.println("I am an Oval!");
        super.whoAmI();
    }

    public boolean equals(Shape other) {
        if (other instanceof Oval) {
            Oval otherShape = (Oval)other;
            return this.radius == otherShape.getRadius() && this.diameter == otherShape.getDiameter();
        } else {
            return false;
        }
    }


}
