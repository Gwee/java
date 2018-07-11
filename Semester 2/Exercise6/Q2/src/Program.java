/**
 * Created by Guy on 7/2/2016.
 */
public class Program {
    public static void main(String[] args) {
        Point p1 = new Point(1,2);
        Point p2 = new Point(3,4);
        Point p3 = new Point(5,6);
        Point p4 = new Point(7,8);
        Point p5 = new Point(9,10);
        Point p6 = new Point(11,12);

        List<Point> pointList = new List<Point>();
        pointList.addItem(p1);
        pointList.addItem(p2);
        pointList.addItem(p3);
        pointList.show();
        System.out.println("Showing maximum point");
        System.out.println(pointList.max().toString());
        System.out.println("Showing minimum point");
        System.out.println(pointList.min().toString());

    }
}
