/**
 * Created by guy on 08/05/2016.
 */
public class Point implements Comparable{
    private int x,y;

    public Point(int x, int y){
        this.x = x;
        this.y = y;
    }

    @Override
    public boolean equals(Object o) {
        if (o instanceof Point) {
            return this.x == ((Point)o).x && this.y == ((Point)o).y;
        }else{
            return false;
        }
    }

    @Override
    public int compareTo(Object o) {
        if (this.x == ((Point)o).x && this.y == ((Point)o).y){
            return 0;
        }else if (this.x > ((Point)o).x && this.y > ((Point)o).y){
            return 1;
        }else{
            return -1;
        }
    }

    @Override
    public String toString() {
        return "("+x+", "+y+")";
    }
}
