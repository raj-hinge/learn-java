package learnLoan5;


public class Loan5 
{
	int amount;
	double rate;
	int years;
	
	
	// constructor to set up values for Loan4 object
	
	public Loan5(int amount, double rate, int years)
	{
		this.amount = amount;
		this.rate = rate;
		this.years = years;	
	}
	
	public double getMonthlyPayment()
	{
		//M = P [ i(1 + i)^n ] / [ (1 + i)^n – 1]
				/*
		M = monthly mortgage payment
		P = the principal, or the initial amount you borrowed.
		i = your monthly interest rate. Your lender likely lists 
		interest rates as an annual figure, so you’ll have to divide by 12, 
		for each month of the year. So, if your rate is 5%, 
		then the monthly rate will look like this: 0.05/12 = 0.004167.
		n = the number of payments, or the payment period in months. 
		If you take out a 30-year fixed rate mortgage, 
		this means: n = 30 years x 12 months per year = 360 payments.
				 */
				
				// convert interest rate into a decimal 
				//eg: 4% = 0.04
				
				double interest = this.rate/100;
				
				// monthly interest rate is yearly rate divided by 12
				
				double monthlyInterest = interest/ 12;
				
				// terms in month is year *12
				
				int termInMonths = this.years *12;
				
				// formula for monthly payment 
				
				double monthlyPay = (this.amount * monthlyInterest)/
						(1-Math.pow(1+monthlyInterest, -termInMonths));
				
				return(monthlyPay);		
	}
	
	
	
	public void displayMonthlyBal()
	{
		double totalAmount = this.getMonthlyPayment() * this.years *12;
		
		System.out.println("Total Amount owed by Borrower:"+String.format( "%.2f", totalAmount));
		System.out.println();
		
		System.out.println("Monthly Balances:");
		
		for(int i = 1; i < (years*12);i++ )
		{
		
		double monthlyBal = totalAmount - (this.getMonthlyPayment() * i);
		
		
		System.out.println("Month:"+ i + "  Balance:"+String.format( "%.2f",monthlyBal));
		
		}
		
	}
	
	
	
	
}
