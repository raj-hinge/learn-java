package learnLoan5;

import static org.junit.Assert.*;


import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class TestLoan {

	@Before
	public void setUp() throws Exception 
	{
	 
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testLoan() 
	{
		Loan5 t1 = new Loan5(100000,4.0,5);
		double test = 1841.6522055265968;
		
		//double test1 = t1.getMonthlyPayment();
		
		assertEquals(test,t1.getMonthlyPayment(),0);
		
		//System.out.println(test1);
		
		//assertEquals(test, test1,0);
		
	}

}
