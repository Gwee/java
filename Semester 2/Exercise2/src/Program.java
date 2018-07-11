/**
 * Created by guy on 18/04/2016.
 */
public class Program {
    public static void main(String[] args) {
        Point p1 = new Point(5,6);
        Square s1 = new Square(p1,200);
        Rectangle r1 = new Rectangle(p1,2,2);
        Triangle t1 = new Triangle(p1, 5, 10);
        Circle c1 = new Circle(p1, 10, 11);
        Oval o1 = new Oval(p1, 20,22);
        CubeShape cu1 = new CubeShape(p1, 5);
        BallShape b1 = new BallShape(p1, 8);
        Shape[] a = new Shape[]{s1,r1,t1,c1,o1,cu1,b1};

        DrawingBoard db1 = new DrawingBoard();
        //adding all shapes to drawing board
        db1.add(s1,r1,t1,c1,o1,cu1,b1);
        System.out.println("Showing all Shapes");
        System.out.println();
        db1.showAll();
        db1.add(r1,r1,r1,r1,r1);



//
//        System.out.println();
//
//        System.out.println("Area of Oval: "+db1.shapesInBoardArr[4].getArea());
//        System.out.println("Area of Cube: "+db1.shapesInBoardArr[5].getArea());
//        System.out.println("Comparing area between shapes "+db1.shapesInBoardArr[4].getClass().getName()+" and "+db1.shapesInBoardArr[5].getClass().getName()+" where 1 is bigger, -1 is smaller and 0 is equals");
//        System.out.println(db1.shapesInBoardArr[4].Compare(db1.shapesInBoardArr[5]));
//        System.out.println();
//        System.out.println("The shape with the maximum area has a total of "+ db1.getMax().getArea()+" and is:");
//        db1.getMax().whoAmI();
//        System.out.println();
//
//
//        System.out.println("Area of Cube: "+cu1.getVol());
//        System.out.println("Area of Ball: "+b1.getVol());
//        System.out.println("Example of getMax3DV1 and getMax3DV2: ");
//        System.out.println("The shape with the most volume is: ");
//        db1.getMax3DV1().whoAmI();
//        db1.getMax3DV2().whoAmI();
//
//        System.out.println();
//        System.out.println("Example of equals:");
//        System.out.println("Does "+db1.shapesInBoardArr[3].getClass().getName()+" equal "+db1.shapesInBoardArr[3].getClass().getName()+"?");
//        System.out.println(db1.shapesInBoardArr[3].equals(db1.shapesInBoardArr[3]));
//        System.out.println("Does "+db1.shapesInBoardArr[4].getClass().getName()+" equal "+db1.shapesInBoardArr[5].getClass().getName()+"?");
//        System.out.println(db1.shapesInBoardArr[4].equals(db1.shapesInBoardArr[5]));
//
//        System.out.println();
//        System.out.println("Example of getTypes:");
//        Class[] classes = db1.getTypes();
//        for (int i = 0; i < classes.length ; i++) {
//            if (classes[i]!=null)
//            System.out.println(classes[i]);
//        }
    }
}
