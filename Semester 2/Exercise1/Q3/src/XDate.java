import java.util.Date;

/**
 * Created by guy on 20/03/2016.
 */
public class XDate extends Date {
    public XDate(){
    }
    public XDate(int date, int month, int year){
        super(year-1900,month,date);
    }
    //this method overrides the Date getMonth and returns a month from 1-12 instead of 0-11
    public int getMonth(){
         return super.getMonth() + 1;
    }
    public int getYear(){ //// FIXME: 3/24/2016 showing wrong year
        return super.getYear() + 1900;
    }
    //gets number of days as a parameter to be added and then returns a new object of XDate with the new number of days
    public XDate addDays(int days){
        XDate retXDate = new XDate(super.getDate()+days,super.getMonth(),this.getYear());
        return retXDate;
    }
    public int getDay(){
        return super.getDay();
    }
    //returns the current local date
    public static void now (){
        Date retDate = new Date();
        System.out.println("Today's date is: "+retDate.toString());

    }
}


