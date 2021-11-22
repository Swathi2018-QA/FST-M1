package activities;

import java.util.HashSet;

public class Activity10 {

	public static void main(String[] args) {
		HashSet<String> hs = new HashSet<String>();
		hs.add("Apple");
		hs.add("Banana");
		hs.add("Orange");
		hs.add("Kiwi");
		hs.add("Butter fruit");
		hs.add("Chickoo");
		
		
		System.out.println("Original set: "+hs);
		
		System.out.println("Size of hash set: "+hs.size());
		
		System.out.println(hs.remove("Kiwi"));
		
		System.out.println(hs.remove("Kiwi"));
		
		System.out.println(hs.contains("Orange"));
		
		System.out.println(hs);
	}

}
