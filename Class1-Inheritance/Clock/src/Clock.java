/**
 * Created by guy on 13/03/2016.
 */
public class Clock {
    protected int hours, minutes, seconds;

    public Clock() { //this is overloading - we use the same name but with different parameters
        this(0, 0);
    }

    public Clock(int h, int m) {
        hours = h;
        minutes = m;
        seconds = 0;
    }

    public void tick() {
        seconds += 1;
        minutes += seconds / 60;
        hours += minutes / 60;
        seconds %= 60;
        minutes %= 60;
        hours %= 24;
    }

    public void showTime() {
        System.out.println(hours + ":" + minutes + ":"+ seconds);
    }
}

class AlarmClock extends Clock {
    //hours, mintues, seconds
    private int aHours, aMinutes, aSeconds;
    private boolean enabled;
    public AlarmClock (int h, int m, int aH, int aM, boolean state){
        super(h,m);
        aHours = aH;
        aMinutes = aM;
        aSeconds = 0;
        enabled = state;
    }
    public AlarmClock(){
        super();
    }
    public void tick() { //this is overriding
        seconds += 1;
        minutes += seconds / 60;
        hours += minutes / 60;
        seconds %= 60;
        minutes %= 60;
        hours %= 24;
        if (hours == aHours && minutes == aMinutes && seconds == 0)
            System.out.println("Hey…..time to wake up!!");
    }
    public void showTime(int p){
        for (int i = 0; i < p; i++) {
            super.showTime();
        }
    }
}

class Program {
    public static void main(String[] args) {
        Clock c1 = new Clock(12, 30);
        c1.tick();
        c1.showTime();
        AlarmClock aC1 = new AlarmClock(17,43,17,46,true);
        for (int i = 0; i < 181; i++) {
            aC1.tick();
        }
        aC1.tick();
        //aC1.showTime();
        aC1.showTime(7);
    }
}
