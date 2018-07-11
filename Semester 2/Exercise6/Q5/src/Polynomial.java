import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/**
 * Created by Guy on 7/4/2016.
 */
public class Polynomial<V> implements Iterator<V> {
    Map<Integer, V> polynomialMap;
    private Set<Map.Entry<Integer, V>> entrySet;
    private Map.Entry<Integer,V> nextEntry;

    public Polynomial(){
        polynomialMap = new HashMap<Integer, V>();
        entrySet = polynomialMap.entrySet();
    }
    public Polynomial(int numberOfMembers){
        polynomialMap = new HashMap<Integer, V>(numberOfMembers);
    }
    public void addElm (Integer power, V coefficient){
        if (power < 0) {
            Math.abs(power);
            throw new RuntimeException("ERROR: The power must be an absolute number, converting to absolute");
        }
        for (Map.Entry m : polynomialMap.entrySet()) {
            if ((Integer) m.getKey() == power){
                polynomialMap.put(power,(V)m.getValue());
            }else {
                polynomialMap.put(power,coefficient);
            }
        }
    }


    @Override
    public boolean hasNext() {
        return false;
    }

    @Override
    public V next() {
        V  tmp = (V)entrySet.iterator().next();
        nextEntry = nextEntry.getNext();
        return tmp;
        return null;
    }
}
