/**
 * Created by guy on 09/02/2016.
 */
public class Cell {
    private int value;
    private boolean isMine;
    private boolean isMarked;
    private boolean isVisible;

    public Cell(int value) {
        this.value = value;
        if (value ==-1){
            this.isMine = true;
        }
    }

    public void setMarked(boolean marked) {
        isMarked = marked;
    }

    public boolean isMarked() {
        return isMarked;
    }

    public Cell(boolean isMine){
        this.isMine=isMine;
        this.value=-1;
    }

    public void setValue(int value) {
        if (this.value==-1){
            return;
        }else {
            this.value = value;
        }
    }

    public void incrementValue() {
        if (this.value==-1){
            return;
        }else {
            this.value++;
        }
    }

    public void setMine(boolean mine) {
        isMine = mine;
        this.value = -1;
    }

    public boolean isMine() {
        return isMine;
    }

    public int getValue() {
        return value;
    }

    public void setVisible(boolean visible) {
        isVisible = visible;
    }

    public boolean isVisible() {
        return isVisible;
    }
}
