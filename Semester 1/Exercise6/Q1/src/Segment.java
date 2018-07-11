import java.util.Scanner;

/**
 * Created by guy on 18/01/2016.
 */
public class Segment {
    private Point first, second;

    public Segment (){
        first = new Point(0,0);
        second = new Point(1,1);
    }
    public Segment (int x1, int y1, int x2, int y2){
        first = new Point(x1,y1);
        second = new Point(x2,y2);
    }
    public Segment (int x, int y){
        first = new Point(0,0);
        second = new Point(x,y);
    }
    public Segment (Point first, Point second){
        this.first = first;
        this.second = second;
    }
    public Segment (int x, int y, Point second){
        first = new Point(x,y);
        this.second = second;
    }
    public Segment (Point first, int x, int y){
        this.first = first;
        second = new Point(x,y);
    }
    public Segment (Segment sg){
        first = sg.first;
        second = sg.second;
    }
    public void readSegment(){
        int x1,x2,y1,y2;
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter 2 new points");
        System.out.println("Point 1 x ");
        x1 = sc.nextInt();
        System.out.println("Point 1 y ");
        y1 = sc.nextInt();
        System.out.println("Point 2 x ");
        x2 = sc.nextInt();
        System.out.println("Point 2 y ");
        y2 = sc.nextInt();
        first.setPoint(x1,y1);
        second.setPoint(x2,y2);
        sc.close();
    }
    public Point middle(){
        int x1 = (int)(first.getX());
        int x2 = (int)(second.getX());
        int y1 = (int)(first.getY());
        int y2 = (int)(second.getY());
        return new Point((x1+x2)/2,(y1+y2)/2);
    }
    public double length(){
        return Math.sqrt((first.getX()-second.getX())*(first.getX()-second.getX()) + (first.getY()-second.getY())*(first.getY()-second.getY()));
    }
    public boolean greaterThan(Segment sg){
        return this.length() > sg.length();
    }
    public boolean lessThan(Segment sg){
        return this.length() < sg.length();
    }
    public boolean equals(Segment sg){
        return this.first.getX() == sg.first.getX() && this.second.getX() == sg.second.getX() && this.first.getY() == sg.first.getY() && this.second.getY() == sg.second.getY();
    }
    public void show(){
        System.out.println(this.toString());
    }
    public String toString(){
        return "Segment ("+this.first.getX()+","+ first.getY()+","+second.getX()+","+second.getY()+")";
    }


}
