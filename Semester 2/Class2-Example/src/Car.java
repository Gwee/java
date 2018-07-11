
public class Car extends Vehicle {
	protected String model;
	protected String color;
	protected int numOfDoors;

	public Car(String model,String color,int doors,int hand,int maxSpeed, String num, long k) {
		super(maxSpeed, num, k);
		this.model=model;
		this.color=color;
		numOfDoors=doors;
	}

	public Car(String model,String color,int doors,int maxSpeed, String num) {
		super(maxSpeed, num);
		this.model=model;
		this.color=color;
		numOfDoors=doors;
	}

	public Car(String model,String num) {
		super(num);
		this.model=model;
		color="white";
		numOfDoors=4;
	}

	public Car() {
		
	}
    public void show(){
    	System.out.println("this is a "+color+" "+model+" with "+numOfDoors+" doors");
    	super.show();
    	
    }
}
