package learn.learnJava1;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;


public class TestAddJunit
{

	@Before
	public void setUp() throws Exception 
	{
	}

	
	@Test
	public  void testAddition()
	{
		Add a = new Add();
		
		a.setX(10);
		a.setY(20);
		
		assertEquals(30,a.addMethod());
	}
	
	@After
	public void tearDown() throws Exception 
	{
	}
		
	
}

