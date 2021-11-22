package activities;

public class Activity4 {

	public static void main(String[] args) {
		int[] unordered = {5,1,4,6,2,8};
		for(int i=0;i<unordered.length;i++)
		{
			int temp = 0;
			for(int j=i+1;j<unordered.length;j++)
			{
				if(unordered[i]>unordered[j])
				{
					temp = unordered[i];
					unordered[i] = unordered[j];
					unordered[j] = temp;
				}
			}
		}
		
		
		for(int i=0;i<unordered.length;i++)
		{
			System.out.print(unordered[i]+" ");
		}

	}

}
