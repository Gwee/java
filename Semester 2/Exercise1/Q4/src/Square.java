/**
 * Created by guy on 26/03/2016.
 */

public class Square extends Shape {
    private int length;
    public Square(){
        super();
    }
    public Square(int length){
        super();
        this.length = length;
    }
    public double getArea(){
        return Math.pow(length,2);
    }
    public int getCirc(){
        return 4*length;
    }
}
