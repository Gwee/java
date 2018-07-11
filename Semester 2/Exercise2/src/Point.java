/**
 * Created by Guy on 4/12/2016.
 */
public class Point {
    private int x,y;
    public Point (int x, int y){
        this.x = x;
        this.y = y;
    }
    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    @Override
    public String toString(){
        return x+","+y;
    }
}
