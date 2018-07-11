/**
 * Created by guy on 18/01/2016.
 */
public class Point {
    private float x,y;

    public Point (int x, int y){
        this.x = x;
        this.y = y;
    }
    public void setPoint(int x, int y){
        this.x = x;
        this.y = y;
    }
    public float getX(){
        return x;
    }
    public float getY(){
        return y;
    }
    public void show(){
        System.out.println("("+(int)x+", "+(int)y+")");
    }
}
