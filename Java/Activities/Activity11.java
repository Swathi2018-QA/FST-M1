package activities;

import java.util.HashMap;
import java.util.Map;

public class Activity11 {

	public static void main(String[] args) {
		Map<Integer,String> colours = new HashMap<Integer,String>();
		colours.put(1, "Black");
		colours.put(2, "Blue");
		colours.put(3, "White");
		colours.put(4, "Green");
		colours.put(5, "Yellow");
		
		
		System.out.println("Original map: "+colours);
		
		System.out.println("Removing White: "+colours.remove(3));
		
		if(colours.containsValue("Green"))
		{
			System.out.println("Green exists in Map");
		}
		else
		{
			System.out.println("Green does not exists in Map");
		}
		
		System.out.println("Size of map: "+colours.size());

	}

}
