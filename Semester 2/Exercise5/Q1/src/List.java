import sun.invoke.empty.Empty;

import java.util.Map;

public class List implements Cloneable {

    private ListNode firstNode;
    private ListNode lastNode;
    private String name;


    public List(){
        this("list");
    }
    public List(String listName){
        name=listName;
        firstNode=lastNode=null;
    }
    public void insertAtFront(Object insertItem){
        if(isEmpty())
            firstNode=lastNode=new ListNode(insertItem);
        else
            firstNode=new ListNode(insertItem,firstNode);
    }
    public void insertAtBack(Object insertItem){
        if(isEmpty())
            firstNode=lastNode=new ListNode(insertItem);
        else
            lastNode=lastNode.nextNode=new ListNode(insertItem);
    }
    public Object removeFromFront()throws EmptyListException{
        if(isEmpty())
            throw new EmptyListException(name);
        Object removedItem=firstNode.data;

        if(firstNode==lastNode)
            firstNode=lastNode=null;
        else
            firstNode=firstNode.nextNode;
        return removedItem;
    }
    public Object removeFromBack() throws EmptyListException{
        if(isEmpty())
            throw new EmptyListException(name);

        Object removedItem=lastNode.data;
        if(firstNode==lastNode)
            firstNode=lastNode=null;
        else{
            ListNode current=firstNode;

            while(current.nextNode!=lastNode)
                current=current.nextNode;

            lastNode=current;
            current.nextNode=null;
        }
        return removedItem;
    }
    public boolean isEmpty(){
        return firstNode==null;
    }
    public void print(){
        if(isEmpty()){
            System.out.printf("Empty %s\n", name);
            return;
        }
        System.out.printf("The %s is : ",name);
        ListNode current=firstNode;

        while(current != null){
            System.out.printf("%s",current.data);
            current=current.nextNode;
        }
        System.out.println("\n");
    }
    public Object removeAt(int k) throws ListIndexOutOfBound{
        int listLength = listLength();
        ListNode current = firstNode;
        ListNode retNode = firstNode;
        if (k < 0 || k >= listLength ){
            throw new ListIndexOutOfBound("k cannot be lower than 0 or longer than the list length "+listLength());
        }
        if (k==0){
            return removeFromFront();
        }
        if(k==listLength-1){
            return removeFromBack();
        }
        for (int i = 0; i < listLength; i++) {
            if (i==k-1){
                try {
                    retNode = current.nextNode; // FIXME: 29/05/2016 have nextNode of the return object be null without affecting the List
                    current.nextNode = current.getNext().nextNode;
                    return retNode;
                }catch (EmptyListException e){
                    throw new EmptyListException(""+k);
                }
            }
            current = current.nextNode;
        }
        return retNode;
    }
    private int listLength(){
        ListNode current = firstNode;
        int counter=0;
        while (current!=null){
            current = current.nextNode;
            counter++;
        }
        return counter;
    }
    public  void show(){
        if (firstNode==null)
            return;
        else
            firstNode.show();
    }
    public void showRev(){
        if (firstNode == null)
            return;
        else
            firstNode.showRev();
    }
    public void addAt(Object obj, int k) throws ListIndexOutOfBound{
        int listLength = listLength();
        ListNode current = firstNode;
        if (k < 0 || k >= listLength ){
            throw new ListIndexOutOfBound("k cannot be lower than 0 or longer than the list length "+listLength());
        }
        if (k==0){
            insertAtFront(obj);
            return;
        }
        if(k==listLength-1){
            insertAtBack(obj);
            return;
        }
        for (int i = 0; i < listLength; i++) {
            if (i==k-1){
                try {
                    current.nextNode = new ListNode(obj,current.nextNode);
                }catch (EmptyListException e){
                    throw new EmptyListException(""+k);
                }
            }
            current = current.nextNode;
        }
    }
    public void addAtRec(Object obj, int k) throws ListIndexOutOfBound{
        int listLength = listLength();
        if (k < 0 || k >= listLength ){
            throw new ListIndexOutOfBound("k cannot be lower than 0 or longer than the list length "+listLength());
        }
        if (k==0){
            insertAtFront(obj);
            return;
        }
        if (firstNode ==null){
            return;
        }else {
            firstNode.addAtRec(obj, k);
        }
    }
    @Override
    public String toString() {
        String retString ="( ";
        ListNode current = firstNode;
        while(current!=null) {
            if (current.nextNode==null)
                retString += current.toString();
            else
                retString += current.toString()+", ";
                current = current.nextNode;
        }
        retString+=" )";

        return retString;
    }
    public List clone() throws CloneNotSupportedException{ // FIXME: 5/31/2016 not working
        List retList = new List(name+" cloned");
        ListNode current = firstNode;
        if (firstNode instanceof Cloneable){
            while(current!=null) {
                retList.insertAtBack(current.clone());
                current = current.nextNode;
            }
        }
        return retList;
    }
    public Object[] toArray() throws CloneNotSupportedException{
        Object[] retObjArr = new Object[listLength()];
        ListNode current = firstNode;
        int i=0;
        try {
            while(current!=null){
                retObjArr[i] = current.clone();
                current = current.nextNode;
                i++;
            }
        } catch (CloneNotSupportedException e){
            throw new CloneNotSupportedException(e.toString());
        }

        return retObjArr;
    }
}