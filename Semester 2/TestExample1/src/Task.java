import java.util.Date;

/**
 * Created by guy on 05/06/2016.
 */
public class Task {
    private String desc;
    private Date when;
    private Boolean done;
    public Task (String desc, Date when){
        this.desc = desc;
        this.when = when;
    }
    public Boolean isDone(){
        return done;
    }
    public String getDesc(){
        return desc;
    }

    @Override
    public String toString() {
        return "("+desc+", "+when+")";
    }
    //best clone example
    public Task clone()throws CloneNotSupportedException{
        Task retTask = (Task) super.clone();
        retTask.when = (Date) retTask.when.clone();
        return retTask;
    }
    public boolean equals (Object o){
        if (this == o)
            return true;
        if (o == null)
            return false;
        // FIXME: 05/06/2016 COPY FROM INTERNET
    }
}
