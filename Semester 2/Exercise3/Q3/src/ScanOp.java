/**
 * Created by guy on 10/05/2016.
 */
public interface ScanOp {
    void reset();
    boolean forward();
    boolean backward();
    Object getCurrent();
}
