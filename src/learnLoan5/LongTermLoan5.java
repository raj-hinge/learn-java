package learnLoan5;


public class LongTermLoan5 extends Loan5
{
	int monthlyExtra = 15;
	
	LongTermLoan5(int amount, double rate, int years)
	{
	
		super(amount, rate +.5 , years);
	
	}
	
	public double getMonthlyPayment()
	{
	
		double longTermMonthPay = (super.getMonthlyPayment() + monthlyExtra);
		return(longTermMonthPay);
	
	}
	
	
	/// dont need this piece of code as it already exist in super class 
	/*
	public void displayMonthlyBal()
	{
		double totalAmount = (this.getMonthlyPayment()) * super.years *12;
		
		System.out.println("Total Amount owed by Borrower:"+String.format( "%.2f", totalAmount));
		System.out.println();
		
		System.out.println("Monthly Balances:");
		
		for(int i = 1; i < (this.years*12);i++ )
		{
		
		double monthlyBal = totalAmount - (this.getMonthlyPayment() * i);
		
		
		System.out.println("Month:"+ i + "  Balance:"+String.format( "%.2f",monthlyBal));
		
		}
	
	
	
	}
	*/
}