package learn.learnJava1;

public class Mod 
{
	private int x1;
	private int y1;
	
	public void setX(int x1) 
	{
		this.x1 = x1;
	}
	
	
	public void setY(int y1)
	{
		this.y1 = y1;
	}
	
	public float modMethod()
	{
	 return(this.x1%this.y1);
	}
}
