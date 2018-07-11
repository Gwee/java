/**
 * Created by Guy on 5/28/2016.
 */
public class ListNode implements Cloneable {
    Object data;
    ListNode nextNode;

    public ListNode(Object o){
        this(o,null);
    }
    public ListNode(Object o,ListNode node){
        data=o;
        nextNode=node;
    }
    public Object getObject(){
        return data;
    }
    public ListNode getNext(){
        return nextNode;
    }

    @Override
    public String toString() {
        return data.toString();
    }
    public void show(){
        if (this.nextNode==null){
            System.out.println(data.toString());
            return;
        }
        System.out.println(data.toString());
        this.nextNode.show();
    }

    public void showRev() {
        if (this.nextNode != null) {
            this.nextNode.showRev();
        }
        System.out.println(data.toString());

    }

    public void addAtRec(Object obj, int k) {
        if (k == 0) {
            nextNode = new ListNode(obj,nextNode);
        } else {
            this.nextNode.addAtRec(obj,k-1);
        }
    }
    public ListNode clone() throws CloneNotSupportedException{
        ListNode retNode;
        retNode = (ListNode)super.clone();
        if (data instanceof Cloneable && nextNode instanceof Cloneable){
            retNode.data = data;
            retNode.nextNode = nextNode;
        }
        return retNode;
    }
}