/**
 * Created by Guy on 7/1/2016.
 */
public class Point {
    private int x,y;
    public Point(int x,int y){
        this.x = x;
        this.y = y;
    }

    @Override
    public String toString() {
        return "("+x+", "+y+")";
    }
}
