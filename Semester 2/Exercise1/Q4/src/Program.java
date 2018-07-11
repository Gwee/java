/**
 * Created by guy on 27/03/2016.
 */
public class Program {
    public static void main(String[] args) {
        Rect r = new Rect(2,5);
        System.out.println(r.getArea()); // מודפס שטח המלבן
        System.out.println(r.getCirc()); //מודפס היקף המלבן
        Square s = new Square(6);
        System.out.println(s.getArea()); // מודפס שטח המלבן
        System.out.println(s.getCirc()); //מודפס היקף המלבן
        System.out.println(s.hashCode());
        System.out.println(r.hashCode());
        Square s2 = s;
        System.out.println(s2.hashCode());
    }
}