/**
 * Created by guy on 13/03/2016.
 */
public class Door {
    public boolean open;
    public Door() { this(true); }
    public Door (boolean  state) {
        open=state;
    }
    public void open(){
        open=true;
    }
    public  void  close() {
        open=false;
    }
    public  boolean  isOpen() {
        return open;
    }
    public void showState(){
        System.out.println("Is door open? "+isOpen());
    }
}

