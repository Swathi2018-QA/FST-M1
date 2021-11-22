package activities;

public class Activity6 {

	public static void main(String[] args) throws InterruptedException {
		Plane plane = new Plane(10);
		plane.onboard("Swathi");
		plane.onboard("Pradeep");
		plane.onboard("Leela");
		plane.onboard("Nagaraj");
		plane.onboard("Raaghu");
		
		System.out.println("Plane took off at: "+plane.takeOff());
		System.out.println("Passengers are: "+plane.getPassesngers());
		Thread.sleep(5);
		
		plane.land();
		System.out.println("Plane landing time: "+plane.getLastTimeLanded());
		
	}
	

}
