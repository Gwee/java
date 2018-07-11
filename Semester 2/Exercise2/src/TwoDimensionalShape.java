/**
 * Created by Guy on 4/10/2016.
 */
public abstract class TwoDimensionalShape extends Shape {
    private Point position;
    public TwoDimensionalShape(Point pos){
        position = pos;
    }
//    protected abstract double getArea();
//    protected abstract int getScope();
    public void whoAmI(){
        System.out.println("2D Shape");
        System.out.println("-------------------");

    }
    public Point getPosition() {
        return position;
    }
    public String getShapeType(){
        return "2D";
    }
}
