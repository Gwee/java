/**
 * Created by guy on 11/04/2016.
 */
public class Square extends PolygonShape {
    private double length;
    public Square(Point pos, int length){
        super(pos);
        this.length = length;
    }

    public double getLength() {
        return length;
    }

    @Override
    public double getArea(){
        return Math.pow(length,2);
    }
    public double getScope(){
        return 0;
    }
    public void whoAmI(){
        System.out.println("I am a Square!");
        System.out.println("Position: "+super.getPosition().toString()+" Length: "+length);
        super.whoAmI();
    }

    @Override
    public boolean equals(Shape other) {
        if (other instanceof Square) {
            Square otherShape = (Square) other;
            return this.length == otherShape.getLength();
        } else {
            return false;
        }
    }
}
