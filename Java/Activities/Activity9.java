package activities;

import java.util.ArrayList;
import java.util.List;

public class Activity9 {

	public static void main(String[] args) {
		List<String> myList = new ArrayList<String>();
		myList.add("Swathi");
		myList.add("Pradeep");
		myList.add("Leela");
		myList.add("Nagaraj");
		myList.add("Raaghu");
		
		System.out.println("Third name: "+myList.get(2));
		
		
		myList.contains("Kushal");
		
		System.out.println("Number of names: "+myList.size());
		
		myList.remove("Raaghu");
		System.out.println("Size of list: "+myList.size());
	}

}
