import javax.management.ListenerNotFoundException;
import java.util.Iterator;
import java.util.ListIterator;

public class List<T extends Comparable> implements MinMax,Iterable<T> {
    private ListItem<T> head;
    private T minItem;
    private T maxItem;
    public List() {
        head =  null;
    }
    public void addItem(T info) {
        head = new ListItem<T>(info, head);
    }

    @Override
    public T min() {
        ListItem<T> current = head;
            minItem = current.getElm();
        int counter=0;
        while (current!=null) {
            if (minItem.compareTo(current.getElm()) == 1){
                minItem = current.getElm();
            }
            current = current.getNext();
            counter++;
        }
        return minItem;
    }
    @Override
    public T max() {
        ListItem<T> current = head;
        maxItem = current.getElm();
        int counter=0;
        while (current!=null) {
            if (maxItem.compareTo(current.getElm()) == -1) {
                    maxItem = current.getElm();
            }
            current = current.getNext();
            counter++;
        }
        return maxItem;
    }

    @Override
    public Iterator<T> iterator() {
        return null;
    }
    public  void show(){
        if (head==null)
            return;
        else
            head.show();
    }
}