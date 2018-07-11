import java.util.Collection;

/**
 * Created by guy on 02/05/2016.
 */
public class Utility {

    public static void showAll(Showable[] a) {
        for (int i = 0; i < a.length; i++) {
            a[i].show();
        }
    }
    public static void showAll(Object[] a) {
        for (int i = 0; i < a.length; i++) {
            if (a[i] instanceof Showable){
                ((Showable)a[i]).show();
            }else{
                System.out.println(a[i].toString());
            }
        }
    }
    public static boolean search(Object[] a, Object o) {
        for (int i = 0; i < a.length ; i++) {
            if (a[i] instanceof Comparable && o instanceof Comparable && ((Comparable)a[i]).compareTo(o)==0){
                    return true;
            }else {
                if (a[i].equals(o)){
                    return true;
                }
            }
        }
        return false;
    }
    public static Object max(Object[] a) {
        Object retObj = a[0];
        for (int i = 0; i < a.length; i++) {
            if (!(a[i] instanceof Comparable)){
                return null;
            }
            if (a[i] instanceof Comparable && ((Comparable)a[i]).compareTo(retObj) == 1){
                    retObj = a[i];
            }
        }
        return retObj;
    }
    public void show(){
        System.out.println(this.toString());
    }
}
