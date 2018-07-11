/**
 * Created by guy on 13/03/2016.
 */
public class LockableDoor extends Door {
    private boolean isLocked;
    public LockableDoor(){
        super(true);
        isLocked=false;
    }
    //this opens the door if its not locked
    public void open(){
        if (!isLocked || !isOpen()) {
            super.open();
            System.out.println("Door is now open");
        }else{
            System.out.println("Door is either locked or already open!");
        }
    }
    //this closes the door
    public void close(){
        if (isOpen()){
            super.close();
            System.out.println("Door is now closed");
        } else{
            System.out.println("Door is already closed.");
        }
    }
    //if the door isn't locked and isn't open, this will lock the door
    public void lock(){
        if (!isLocked && !isOpen()){
            isLocked = true;
            System.out.println("Door is now locked");
        }else{
            System.out.println("Cannot lock door. It's either already locked or not closed");
        }
    }
    //this unlocks the door in case it is already locked and closed
    public void unlock(){
        if (isLocked && !isOpen()){
            isLocked=false;
        }else{
            System.out.println("Cannot unlock. Door is either open or not locked.");
        }
    }
    public void showState(){
        super.showState();
        System.out.println("Is door Locked? "+isLocked);
    }
}
