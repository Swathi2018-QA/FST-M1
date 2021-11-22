package activities;

public class Activity2 {

	public static void main(String[] args) {
		int[] numbers = {10,77,10,54,-11,10};
		int sum = 0;
		for(int i=0;i<numbers.length;i++)
		{
			if(numbers[i] % 10 == 0)
			{
				sum+=numbers[i];
			}
		}
		System.out.println("Sum of 10's in array: "+sum);

		
	}

}
