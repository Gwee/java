/**
 * Created by Guy on 5/28/2016.
 */
public class EmptyListException extends RuntimeException{

    public EmptyListException(){
        this("list");
    }
    public EmptyListException(String name){
        super(name+" is empty ");
    }

}
