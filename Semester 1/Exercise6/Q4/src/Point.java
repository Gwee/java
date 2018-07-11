/**
 * Created by guy on 25/01/2016.
 */
public class Point {
    private int x,y;
    public Point (int a, int b) {
        x=a; y=b;
    }
    public double distance (Point p){
        int tempx , tempy;
        tempx=(x-p.x)*(x-p.x);
        tempy=(y-p.y)*(y-p.y);
        return  Math.sqrt(tempx+tempy);
    }

}
