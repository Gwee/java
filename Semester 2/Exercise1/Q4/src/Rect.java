/**
 * Created by guy on 26/03/2016.
 */
public class Rect extends Shape {
    private int width, length;
    public Rect(){
        super();
    }
    public Rect(int length, int width){
        super();
        this.length = length;
        this.width = width;
    }
    public double getArea(){
        return length *width;
    }
    public int getCirc(){
        return 2*(width+ length);
    }
}
