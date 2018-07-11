/**
 * Created by Guy on 5/28/2016.
 */
public class Program {

    public static void main(String[] args) throws ListIndexOutOfBound, CloneNotSupportedException {
        List guyList = new List("GuyList");
        guyList.insertAtBack(new DummyObject(1));
        guyList.insertAtBack(new DummyObject(2));
        guyList.insertAtBack(new DummyObject(3));
        guyList.insertAtBack(new DummyObject(4));
        guyList.insertAtFront(new DummyObject(100));

        System.out.println("Example of toString()");
        System.out.println(guyList.toString());

        System.out.println("Examples of removeAt");
        guyList.print();
        Object tmp = guyList.removeAt(0);
        System.out.println(tmp.toString()+" removed");
        guyList.print();
        Object tmp2 = guyList.removeAt(1);
        System.out.println(tmp2.toString()+" removed");
        guyList.print();
        Object tmp3 = guyList.removeAt(2);
        System.out.println(tmp3.toString()+" removed");
        guyList.print();

        System.out.println("Example of recursive show()");
        guyList.show();

        System.out.println("Example of recursive showRev()");
        guyList.showRev();

        System.out.println("Example of addAt()");
        guyList.addAt(new DummyObject(5),0);
        guyList.print();
        guyList.addAt(new DummyObject(6),2);
        guyList.print();
        guyList.addAt(new DummyObject(7),2);
        guyList.print();

        System.out.println("Examples of addAtRec()");
        guyList.addAtRec(new DummyObject(8),3);
        guyList.print();
        guyList.addAtRec(new DummyObject(9),1);
        guyList.print();
        guyList.addAtRec(new DummyObject(4),0);
        guyList.print();

        System.out.println("Example of deep clone()");
        List guyList2 = guyList.clone();
        guyList2.print();

        System.out.println("Example of toArray()");
        Object[] objArr = guyList2.toArray();
        System.out.print("The new Object array is: ");
        for (int i = 0; i < objArr.length; i++) {
            System.out.print(objArr[i].toString()+" ");
        }
    }
}
