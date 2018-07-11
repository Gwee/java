
public class Clock {
	private int hours;
	private int minutes;
	private int seconds;
	private int milliseconds;
	
	public void tick (){
		milliseconds = milliseconds+1;
		seconds=seconds+milliseconds/1000; 
		minutes=minutes+seconds/60; 
		hours=hours+minutes/60; 
		milliseconds=milliseconds%1000;
		seconds=seconds%60; 
		minutes=minutes%60; 
		hours=hours%24;
	}

	public void show(){
	System.out.println("Hours:"+hours);
	System.out.println("Minutes:"+minutes);
	System.out.println("Seconds:"+seconds);
	System.out.println("Milliseconds:"+milliseconds);
	} 
	public void reset(){
		milliseconds=0;
		seconds=0;
		minutes=0;
		hours=0;
	}
}
	
	
