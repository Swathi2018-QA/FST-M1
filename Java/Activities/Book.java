package activities;

abstract class Book {
	public String title;
	
	public abstract void setTitle(String s);

	public String getTitle() {
		return title;
	}

}

class MyBook extends Book
{
	public void setTitle(String s)
	{
		title = s;
	}
}

