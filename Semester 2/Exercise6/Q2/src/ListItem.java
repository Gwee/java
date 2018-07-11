/**
 * Created by Guy on 7/2/2016.
 */
public class ListItem<E extends Comparable>  {
    private E info;
    private ListItem <E> next;
    public ListItem(E info,ListItem<E> next){
        this.info = info;
        this.next = next;
    }
    public E getElm(){return info;}
    public ListItem<E> getNext(){
        return next;
    }
    public void show() {
        if (this.next == null) {
            System.out.println(info.toString());
            return;
        }
        System.out.println(info.toString());
        this.next.show();
    }

}
