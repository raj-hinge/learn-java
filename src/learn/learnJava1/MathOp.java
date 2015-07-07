package learn.learnJava1;


public class MathOp 
{

	
	public static void main(String[] args)
	{
		Add a = new Add();
		
		a.setX(10);
		a.setY(20);
		
		System.out.println(a.addMethod());
		
		
		Subtract s = new Subtract();
		
		s.setX(100);
		s.setY(20);
		
		System.out.println(s.subtractMethod());
		
		
		Divide d = new Divide();
		
		d.setX(13);
		d.setY(7);
		
		System.out.println(d.divideMethod());
		
		
		Mod m = new Mod();
		
		m.setX(13);
		m.setY(7);
		
		System.out.println(m.modMethod());
		
	}
	
	
	
}

