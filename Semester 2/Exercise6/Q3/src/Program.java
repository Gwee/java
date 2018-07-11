import java.util.*;

/**
 * Created by guy on 02/07/2016.
 */
public class Program {
    public static void main(String[] args) {
        Collection collectionGrades = Arrays.asList(90,85,90,73,99,54,60,85,99);
        Pair minMax1 = minmax(collectionGrades);
        System.out.println(minMax1.toString());

        Map mapGrades = new HashMap();
        mapGrades.put("Guy",100);
        mapGrades.put("Oran", 70);
        mapGrades.put("Noam", 93);
        mapGrades.put("Nitzan",95);
        Pair minMax2 = minmax(mapGrades);
        System.out.println(minMax2.toString());
    }

    public static  <T extends Comparable,V> Pair<T> minmax(Collection<T> c) {
        T min = (T)min(c);
        T max = (T)max(c);
        return new Pair<T>(min,max);
    }


    public static <K,V extends Comparable> Pair<V> minmax(Map<K,V> map) {
        List<V> values = new ArrayList<V>(map.values());
        List<K> keys = new ArrayList<K>(map.keySet());
        V min = (V)min(values);
        V max = (V)max(values);
        V minKey = (V)map.get(min);
        V maxKey = (V)map.get(max);

        Pair minPair = new Pair(minKey,min);
        Pair maxPair = new Pair(maxKey,max);
        return new Pair((V)minPair,(V)maxPair);
    }
    public static <T extends Comparable> T min(Collection<? extends T> coll) {
        Iterator<? extends T> i = coll.iterator();
        T candidate = i.next();

        while (i.hasNext()) {
            T next = i.next();
            if (next.compareTo(candidate) < 0)
                candidate = next;
        }
        return candidate;
    }
    public static <T extends Comparable> T max(Collection<? extends T> coll) {
        Iterator<? extends T> i = coll.iterator();
        T candidate = i.next();

        while (i.hasNext()) {
            T next = i.next();
            if (next.compareTo(candidate) > 0)
                candidate = next;
        }
        return candidate;
    }
}
