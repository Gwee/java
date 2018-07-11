import java.util.Map;

/**
 * Created by Guy on 7/2/2016.
 */
//Implementing Map.Entry in Pair allows getting separate values by first or by second. You can also set/update values by passing the second name
public class Pair<V> implements Map.Entry<V,V> {
    private V first;
    private V second;
    public Pair(){

    }
    public Pair (V first, V second){
        this.first = first;
        this.second = second;
    }

    @Override
    public V getKey() {
        return first;
    }

    @Override
    public V getValue() {
        return second;
    }

    @Override
    public V setValue(V value) {
        this.second = value;
        return null;
    }

    @Override
    public String toString() {
        return "Pair{" +
                "first=" + first +
                ", second=" + second +
                '}';
    }
}
