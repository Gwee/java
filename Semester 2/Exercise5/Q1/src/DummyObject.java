/**
 * Created by Guy on 5/28/2016.
 */
public class DummyObject implements Cloneable {
    private int value;

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public DummyObject(int value){
        this.value = value;
    }

    @Override
    public String toString() {
        return ""+value;
    }
    public DummyObject clone() throws CloneNotSupportedException{
        DummyObject retDummyObj;
        retDummyObj = (DummyObject)super.clone();
        retDummyObj.value = this.value;
        return retDummyObj;
    }
}
