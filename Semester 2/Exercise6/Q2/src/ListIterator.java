import java.util.Iterator;

/**
 * Created by Guy on 7/2/2016.
 */
public class ListIterator<E extends Comparable> implements Iterator<E> {
    private ListItem<E>   nextItem;
    public ListIterator(ListItem<E> item) { nextItem = item;  }
    public E next() {
        E  tmp = nextItem.getElm();
        nextItem = nextItem.getNext();
        return tmp;
    }
    public boolean hasNext() { return nextItem != null;   }
    public void remove() {
        throw new IllegalStateException();
    }

}
