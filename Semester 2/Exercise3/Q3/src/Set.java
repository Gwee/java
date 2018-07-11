/**
 * Created by guy on 08/05/2016.
 */
public class Set implements Arithmetic,ScanOp {
    private Object[] set;
    private ObjCounter[] objCounter;
    private int index;

    public Set(int setSize){
        this.set = new Object[setSize];
        this.objCounter = new ObjCounter[setSize];
    }
    public Set(int setSize, Object ... o){
        this.set = new Object[setSize];
        this.objCounter = new ObjCounter[setSize];
        for (int i = 0; i < o.length; i++) {
            addObj(o[i]);
        }
    }
    //Here we add a new object only in case it doesn't exist. We also create an additional counter object to count the number of times this type of object exists
    public void addObj(Object o){
        for (int i = 0; i < this.set.length; i++) {
            if (set[i]==null && !checkExist(o)){
                set[i] = o;
                insertToObjCounter(o);
            }
        }
    }

    //Checks if object already exists in set, if same exact exists we return true, if one exists but not the same we add to counter, if doesn't exist we return false
    public boolean checkExist(Object o) {
        for (int i = 0; i < set.length; i++) {
            if (set[i] != null && set[i].equals(o)) {
                return true;
            }
        }
        return false;
        //if object exists but is not the same one, we increase the counter of that object
    }

    private void insertToObjCounter(Object o){
        for (int i = 0; i < objCounter.length; i++) {
            if (objCounter[i] != null && objCounter[i].getClassName() == o.getClass().getName()) {
                objCounter[i].setCounter(objCounter[i].getCounter() + 1);
                break;
            } else if (objCounter[i] == null && !isObjCounterFull()) {
                objCounter[i] = new ObjCounter(o.getClass().getName());
                break;
            }
        }
    }
    private boolean isObjCounterFull(){
        for (int i = 0; i < objCounter.length; i++) {
            if (objCounter[i]==null)
                return false;
        }
        resizeObjCounter();
        return true;
    }
    private void resizeObjCounter(){
        ObjCounter[] retObjCounter = new ObjCounter[objCounter.length*2];
        for (int i = 0; i < objCounter.length; i++) {
            retObjCounter[i] = objCounter[i];
        }
        objCounter = retObjCounter;
    }
//    private ObjCounter[] mergeObjCounter(ObjCounter[] o){
//        ObjCounter[] retObjCounter = new ObjCounter[o.length+objCounter.length];
//        for (int i = 0; i < objCounter.length; i++) {
//            insertToObjCounter(ObjCounter[i]);
//
//        }
//    }
    @Override
    public String toString() {
        String retStr = "";
        for (int i = 0; i < objCounter.length; i++) {
            if (objCounter[i]!=null)
            retStr+=""+objCounter[i].getClassName()+"("+objCounter[i].getCounter()+"):";
        }
    return retStr;
    }
    public Object[] getByType(Class c){
        Object[] retObj = new Object[set.length];
        for (int i = 0; i < set.length; i++) {
            if (c.isInstance(set[i])){
                retObj[i]=set[i];
            }
        }
        return retObj;
    }

    public Class[] getObjects(){
        Class[] retClass = new Class[set.length];
        for (int i = 0; i < set.length; i++) {
            if (set[i]!=null)
            retClass[i]=set[i].getClass();
            }
        return retClass;
    }

    @Override
    public Object add(Object o1) {
        if (o1 instanceof Set){
            Set retSet = new Set(((Set) o1).set.length+this.set.length);
            for (int i = 0; i < set.length; i++) {
                if (set[i]!=null)
                retSet.addObj(set[i]);
            }
            for (int i = 0; i < ((Set) o1).set.length; i++) {
                if(((Set) o1).set[i]!=null)
                retSet.addObj(((Set) o1).set[i]);
            }
            return retSet;
            }else {
            return this;
        }
    }

    @Override
    public Object sub(Object o1) {
        return null;
    }

    @Override
    public Object mul(Object o1) {
        if (o1 instanceof Set){
            int tmp=0;
            Set retSet = new Set(((Set) o1).set.length+this.set.length);
            for (int i = 0; i < set.length; i++) {
                if (set[i] != null)
                    for (int j = 0; j < ((Set) o1).set.length; j++) {
                        if (set[i].equals(((Set) o1).set[i])) {
                            retSet.addObj(set[i]);
                        }
                    }
            }
            return retSet;
        }else {
            return this;
        }
    }

    @Override
    public Object div(Object o1) {
        return null;
    }

    @Override
    public void reset() {
        index=0;
    }

    @Override
    public boolean forward() {
        index++;
        return set[index]!=null || index<=set.length;
    }

    @Override
    public boolean backward() {
        index--;
        return set[index]!=null || index>=0;
    }

    @Override
    public Object getCurrent() {
        if (this.set[index]!=null)
        return this.set[index];
        else
            return null;
    }
}
