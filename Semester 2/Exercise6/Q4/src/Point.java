/**
 * Created by Guy on 7/1/2016.
 */
public class Point implements Comparable {
    private int x,y;
    public Point(int x, int y){
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    @Override
    public String toString() {
        return "("+x+", "+y+")";
    }

    //Not sure how to implement the compare logic so I went with the basic, if needed can be changed easily
    @Override
    public int compareTo(Object o) {
        if (!(o instanceof Point))
            return 1;
        if (((Point) o).x == x && ((Point) o).y == y)
            return 0;
        if (((Point) o).x > x && ((Point) o).y > y)
            return -1;
        return 1;
    }
    @Override
    public boolean equals(Object o){
        if (!(o instanceof Point)){
            return false;
        }
        if (((Point) o).x==x && ((Point) o).y==y){
            return true;
        }
        return false;
    }
}
