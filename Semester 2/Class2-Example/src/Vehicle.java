
public class Vehicle {
	protected int maxSpeed;
	protected int currentSpeed;
	protected String vehicleNum;
	protected long kilometrage;

    public Vehicle(int maxSpeed,String num,long k){
		this.maxSpeed=maxSpeed;
		currentSpeed=0;
		vehicleNum=num;
		kilometrage=k;
	}
	public Vehicle(int maxSpeed,String num){
		this(maxSpeed,num,0);
	}
	public Vehicle(String num){
		this(250,num,0);
	}
	public Vehicle(){
		this("New Vehicle");
	}
	public void tooFast(){
		System.out.println("be careful, your speed is too fast!!!");
	}
    public void changeSpeed(int newSpeed,int limitedSpeed){
    	if(newSpeed>limitedSpeed){
    		currentSpeed=newSpeed;
    		this.tooFast();
    	}
    		
    	if(newSpeed>maxSpeed){
    		currentSpeed=maxSpeed;
    		this.tooFast();
    	}
    	
    	if(limitedSpeed-newSpeed>20){
    		currentSpeed=newSpeed;
    		System.out.println("very slow");
    	}
    		
    	
    }
    public void show(){
   	 System.out.println("This is vehicle number: "+vehicleNum);
   	 System.out.println("The maximum speed is: "+maxSpeed);
   	 System.out.println("The total kilometrage: "+kilometrage);
   	 
    }
}
