package activities;

public class Activity12{

	public static void main(String[] args) {		
		Addable ad1 = (a,b)->(a+b);
		Addable ad2 = (a,b)->{
			return a+b;
		};
		System.out.println(ad1.add(2, 3));
		System.out.println(ad2.add(20, 25));
	}

}

