import java.util.concurrent.locks.Lock;

/**
 * Created by guy on 13/03/2016.
 */
public class Program {
    public static void main(String[] args) {
        LockableDoor lDoor = new LockableDoor();
        lDoor.showState();
        if (lDoor.isOpen()){
            lDoor.close();
        }else{
            lDoor.open();
        }
        lDoor.showState();
        lDoor.lock();
        lDoor.showState();
    }
}
