package activities;

public class Car {
	public String color;
	public String transmission;
	public int make;
	public int tyres;
	public int doors;
	
	public Car(String color, String transmission, int make)
	{
		this.color = color;
		this.transmission = transmission;
		this.make= make;
		this.tyres = 4;
		this.doors = 4;
	}
	
	
	public void displayCharacteristics()
	{
		System.out.println("Car color: "+this.color);
		System.out.println("Car transmission: "+this.transmission);
		System.out.println("Car make: "+this.make);
		System.out.println("Car tyres: "+this.tyres);
		System.out.println("Car doors: "+this.doors);
		
	}
	
	public void accelarate()
	{
		System.out.println("Car is moving forward.");
	}
	
	public void brake() 
	{
		System.out.println("Car has stopped.");
	}

}
