/**
 * Created by guy on 20/03/2016.
 */
public class Truck extends Vehicle {
    private double maxCargoWeight;
    private double height;

    public Truck(){

    }
    public Truck(String num, int maxSpeed, long k, double maxCargoWeight, double height){
        super(maxSpeed,num, k);
        this.maxCargoWeight = maxCargoWeight;
        this.height = height;
    }
    public void show(){
        super.show();
        System.out.println("I am a truck >:)");
    }
}
