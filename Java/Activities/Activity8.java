package activities;

public class Activity8 {

	public static void main(String[] args) {
		try
		{
			Activity8.exceptionTest("Will print to console");
			Activity8.exceptionTest(null);
		}catch(CustomException ex)
		{
			System.out.println("Catch block: "+ex.getMessage());
		}

	}
	
	
	public static void exceptionTest(String msg) throws CustomException
	{
		if(msg == null)
		{
			throw new CustomException("String is null");
		}
		else
		{
			System.out.println(msg);
		}
	}

}
