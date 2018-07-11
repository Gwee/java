
public class Vehicle {
	private int vehicleLicenseNumber;
	private int vehicleCurrentSpeed; 
	private int vehicleMaximumSpeed=100;
	
	public Vehicle (){
	vehicleCurrentSpeed=0;
	vehicleMaximumSpeed=100;
	}
	public Vehicle(int licenseNumber){
		vehicleCurrentSpeed=0;
		vehicleLicenseNumber=licenseNumber;
	}
	public Vehicle(int licenseNumber, int maximumSpeed){
		vehicleCurrentSpeed=0;
		vehicleLicenseNumber=licenseNumber;
		if (maximumSpeed>=100){
			vehicleMaximumSpeed=100;
		}
		vehicleMaximumSpeed=maximumSpeed;
	}
	public void accelerate(){
		if (vehicleCurrentSpeed + 1 >= vehicleMaximumSpeed){
			vehicleCurrentSpeed=vehicleMaximumSpeed;
		}
		vehicleCurrentSpeed=vehicleCurrentSpeed+1;
	}
	public void accelerate(int kmh){
		if (vehicleCurrentSpeed + kmh >= vehicleMaximumSpeed){
			vehicleCurrentSpeed=vehicleMaximumSpeed;
		}
		vehicleCurrentSpeed=vehicleCurrentSpeed+kmh;
	}
	public void decelerate(){
		if (vehicleCurrentSpeed - 1 <= 0){
			vehicleCurrentSpeed=0;
		}
		vehicleCurrentSpeed=vehicleCurrentSpeed-1;
	}
	public void decelerate(int kmh){
		if (vehicleCurrentSpeed - kmh <= 0){
			vehicleCurrentSpeed=0;
		}
		vehicleCurrentSpeed=vehicleCurrentSpeed-kmh;
	}
	public int getCurrentSpeed(){
		return vehicleCurrentSpeed;
	}
}
