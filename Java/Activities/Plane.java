package activities;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Plane {
	private List<String> passengers;
	private int maxPassengers;
	private Date lastTimeTookOf;
    private Date lastTimeLanded;

    public Plane(int maxPassengers)
    {
    	this.maxPassengers = maxPassengers;
    	passengers = new ArrayList<String>();
    }
    
    
    public void onboard(String passenger)
    {
    	passengers.add(passenger);
    }
    
    public List<String> getPassesngers()
    {
    	return passengers;
    }
    
    public Date takeOff() {
        this.lastTimeTookOf = new Date();
        return lastTimeTookOf;
    }
    
    public void land()
    {
    	this.lastTimeLanded = new Date();
    	this.passengers.clear();
    }
    
    public Date getLastTimeLanded()
    {
    	return this.lastTimeLanded;
    }
}
