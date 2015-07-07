package learnLoan4;

public class LongTermLoan4 extends Loan4
{
	//int monthlyExtra = 15;
		
	LongTermLoan4(int amount, double rate, int years)
	{
	
		super(amount, rate +.5 , years);
	
	}
	
	
	public void displayMonthlyBal( )
	{
		double totalAmount = (super.getMonthlyPayment() + 15) * super.years *12;
		
		System.out.println("Total Amount owed by Borrower:"+String.format( "%.2f", totalAmount));
		System.out.println();
		
		System.out.println("Monthly Balances:");
		
		for(int i = 1; i < (super.years*12);i++ )
		{
		
		double monthlyBal = totalAmount - ((super.getMonthlyPayment() +15) * i);
		
		
		System.out.println("Month:"+ i + "  Balance:"+String.format( "%.2f",monthlyBal));
		
		}
	
	
	
	}
}