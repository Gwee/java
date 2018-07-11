
public class Car {
	private int speed=0;
	
	public void goFaster(){
		speed=speed+1;
	}
	public void slowDown(){
		speed=speed-1;
	}
	public void Stop(){
		speed=0;
	}
	public void ShowSpeed(){
		System.out.println("spped:"+speed);
	}
}
