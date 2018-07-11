/**
 * Created by Guy on 1/19/2016.
 */
public class Program {
    public static void main(String[] args) {
        Set s1 = new Set(2, 6, 1, 2, 2, 6, 7, 19, 5);
        s1.show();
        Set s2 = new Set();
        s2.add(7);
        s2.add(2);
        s2.add(8);
        s2.add(11);
        s2.add(8);
        Set s3;
        Set s4 = new Set(4, 5, 4, 0, 55, 10);
        Set s5 = new Set(11, 55, 6, 4, 7, 91);
        Set s6 = new Set(2, 4, 6);
        Set s7 = new Set(4, 6, 2);
        System.out.println(s6.equals(s7));
        s3 = s1.union(s2);
        s3.show();
        s1.interset(s2).show();
        System.out.println(s1.union(s2).subset(s1.interset(s2)));
        int[] b;
        b = s3.toArray();
        for (int k = 0; k < b.length; k++) {
            System.out.println(b[k]);
        }
    }
}
