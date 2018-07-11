/**
 * Created by Guy on 4/10/2016.
 */
public class CubeShape extends ThreeDimensionalShape {
    private double length;
    public CubeShape(Point pos, int length){
        super(pos);
        this.length = length;
    }
    @Override
    public double getVol() {
        return Math.pow(length,3);
    }
    public void whoAmI(){
        System.out.println("I am a Cube!");
        System.out.println("Position: "+getPosition().toString()+" Length: "+length);
        super.whoAmI();
    }

    public double getLength() {
        return length;
    }

    public double getArea() {
        return 6*Math.pow(length,2);
    }

    @Override
    public boolean equals(Shape other) {
        if (other instanceof CubeShape) {
            CubeShape otherShape = (CubeShape)other;
            return this.length == otherShape.getLength();
        } else {
            return false;
        }
    }
}
