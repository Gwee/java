/**
 * Created by Guy on 7/1/2016.
 */
public class Stack <T> {
    private T[] data;
    private int top;
    public Stack (int size){
        data = (T[]) new Object[size];
        top = -1;
    }
    public void push(T value) {
        top++;
        data[top] = value;
    }
    public T pop() {
        return data[top--];
    }
    public T top() {
        return data[top];
    }

    @Override
    public String toString() {
        String retString ="";
        for (int i = 0; i <= top; i++) {
            retString = retString+" "+data[i].toString();
        }
        return retString;
    }
}
