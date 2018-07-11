import com.sun.org.apache.xpath.internal.operations.Equals;

import java.util.*;

/**
 * Created by guy on 02/07/2016.
 */
public class Program {
    public static void main(String[] args) {
        List arabList = new ArrayList<String>();
        arabList.add("Guy");
        arabList.add("test");
        arabList.add("Guy");
        arabList.add("test2");
        arabList.add("test3");
        arabList.add("test");

        Map<String,Integer> freqMap = calcFreq(arabList);
        //test should appear 2 times and Guy should appear 2 times
        for (Map.Entry<String, Integer> entry : freqMap.entrySet()) {
            System.out.print(entry.getKey()+" : ");
            System.out.println(entry.getValue());
            System.out.println();
        }

        List pointList = new ArrayList<Point>();
        pointList.add(new Point(2,2));
        pointList.add(new Point(5,5));
        pointList.add(new Point(1,1));
        pointList.add(new Point(2,2));
        pointList.add(new Point(3,3));

        Map<Point,Integer> pointMap = calcFreq(pointList);
        for (Map.Entry<Point,Integer> entry : pointMap.entrySet()) {
            System.out.print(entry.getKey()+" : ");
            System.out.println(entry.getValue());
            System.out.println();
        }
    }
    public static Map calcFreq(Collection<? extends Equals> col){
        Map<String,Integer> retMap = new HashMap<String,Integer>();
        int freq=0;
        boolean b1=false;
        for (Object s:col)
        {
            freq = frequency(col,s);
            for (String key:retMap.keySet())
            {
                if (s.equals(key)){
                    b1=true;
                }
            }
            if (!b1){
                retMap.put(s.toString(),freq);
            }
            b1=false;
        }
        return retMap;
    }
    public static int frequency(Collection<?> c, Object o) {
        int result = 0;
        if (o == null) {
            for (Object e : c)
                if (e == null)
                    result++;
        } else {
            for (Object e : c)
                if (o.equals(e))
                    result++;
        }
        return result;
    }
}
