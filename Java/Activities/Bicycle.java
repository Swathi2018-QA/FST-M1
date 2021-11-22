package activities;

public class Bicycle implements BicycleParts, BicycleOperations {
	public int gears;
    public int currentSpeed;
	
	public Bicycle(int gears, int currentSpeed)
	{
		this.gears = gears;
		this.currentSpeed = currentSpeed;
	}
	
	public void applyBrake(int decrement)
	{
		currentSpeed = currentSpeed - decrement;
		System.out.println("Curent Speed: "+currentSpeed);
	}
	public void speedUp(int increment)
	{
		currentSpeed = currentSpeed + increment;
		System.out.println("Curent Speed: "+currentSpeed);
	}
	public String bicycleDesc() {
	    return("No of gears are "+ this.gears + "\nSpeed of bicycle is " + this.currentSpeed);
	}

}

class MountainBike extends Bicycle
{
	public int seatHeight;
	
	public MountainBike(int gears, int currentSpeed, int seatHeight) {
		super(gears, currentSpeed);
		this.seatHeight = seatHeight;
	}

	public void setHeight(int newValue) {
	    seatHeight = newValue;
	}
	public String bicycleDesc() {
	    return("No of gears are "+ this.gears + "\nSpeed of bicycle is " + this.currentSpeed+"\nSeat Height "+this.seatHeight);
	}

	
	
}
