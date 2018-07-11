/**
 * Created by Guy on 4/10/2016.
 */
public abstract class ThreeDimensionalShape extends Shape {
    private Point position;
    public ThreeDimensionalShape(Point pos){
        position = pos;
    }
    protected abstract double getVol();
    public int Compare3D(ThreeDimensionalShape s){
        if (this.getVol() == s.getVol()){
            return 0;
        }
        if (this.getVol() > s.getVol()){
            return 1;
        }else{
            return -1;
        }
    }
    public Point getPosition() {
        return position;
    }
    public void whoAmI(){
        System.out.println("3D Shape");
        System.out.println("-------------------");

    }
    public String getShapeType(){
        return "3D";
    }
}
