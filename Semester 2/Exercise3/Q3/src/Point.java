import java.lang.*;

/**
 * Created by guy on 08/05/2016.
 */
public class Point{
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


}
