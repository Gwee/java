import jdk.internal.org.objectweb.asm.tree.IntInsnNode;

import java.util.ArrayList;

/**
 * Created by Guy on 7/1/2016.
 */
public class Program {
    public static void main(String[] args) {
        Point p1 = new Point(1,2);
        Point p2 = new Point(3,4);
        Point p3 = new Point(5,6);

        Stack<Point> pointStack = new Stack<Point>(3);
        pointStack.push(p1);
        pointStack.push(p2);
        pointStack.push(p3);
        System.out.println(pointStack.toString());
        System.out.println(pointStack.top().toString());
        pointStack.pop();
        System.out.println(pointStack.toString());
        pointStack.pop();
        System.out.println(pointStack.toString());
        pointStack.pop();
        System.out.println(pointStack.toString());
        pointStack.push(p2);
        System.out.println(pointStack.toString());

        Stack<Stack> numberStack = new Stack<Stack>(5);
        Stack<Integer> s1 = new Stack<Integer>(3);
        s1.push(1);
        s1.push(2);
        s1.push(3);
        Stack<Integer> s2 = new Stack<Integer>(3);
        s2.push(3);
        s2.push(4);
        s2.push(5);
        numberStack.push(s1);
        numberStack.push(s2);
        System.out.println(numberStack.toString());



    }

}
