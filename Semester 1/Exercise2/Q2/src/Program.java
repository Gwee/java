
public class Program {
	static int requiredSpeed;
	public static void main(String[] args) {
		Vehicle car1 = new Vehicle(12345);
		Vehicle car2 = new Vehicle(12346, 60);
		car1.accelerate(5);
		car2.accelerate();
		System.out.println("Current speed of car1 is "+car1.getCurrentSpeed() +" km/h");
		int car2Speed = car2.getCurrentSpeed();
		if(car2Speed >= 30){
			requiredSpeed = car2Speed - 30;
			car2.decelerate(requiredSpeed);
		}
		if(car2Speed <= 30){
			requiredSpeed = 30 - car2Speed;
			car2.accelerate(requiredSpeed);
		}
			
		System.out.println("Current speed of car2 is "+car2Speed +" km/h");
		
		
	}
}