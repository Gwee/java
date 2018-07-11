/**
 * Created by Guy on 4/10/2016.
 */
public abstract class Shape {
    protected abstract double getArea();
    protected abstract void whoAmI();
    protected abstract String getShapeType();
    public int Compare(Shape s){
        if (this.getArea() == s.getArea()){
            return 0;
        }
        if (this.getArea() > s.getArea()){
            return 1;
        }else{
            return -1;
        }
    }
    protected abstract boolean equals(Shape s);
}