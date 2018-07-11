/**
 * Created by guy on 09/05/2016.
 */
public class ObjCounter {
    private String className;
    private int counter;

    public ObjCounter(String className){
        this.counter=1;
        this.className = className;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public int getCounter() {
        return counter;
    }

    public void setCounter(int counter) {
        this.counter = counter;
    }
    @Override
    public boolean equals(Object o){
        if (o instanceof ObjCounter){
            return this.counter == ((ObjCounter)o).counter && this.className == ((ObjCounter)o).className;
        }else{
            return false;
        }
    }
}
