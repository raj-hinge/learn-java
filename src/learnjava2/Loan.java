package learnjava2;



public class Loan 
{
	private double rate;
	private int loanAmount;
	private int years;
	
	
	// setting rate 
	public void setRate(double rate) 
	{
		this.rate = rate;
	}
	
	//setting loanAmount
	public void setLoanAmount(int loanAmount) 
	{
		this.loanAmount = loanAmount;
	}
	
	//setting Months
	public void setYears(int years) 
	{
		this.years = years;
	}
	
	
	//returning rate
	public double getRate() 
	{
		return rate;
	}
	
	//returning loan amount
	public int getLoanAmount() 
	{
		return loanAmount;
	}
	
	//returning months
	public int getYears() 
	{
		return years;
	}
	
// monthly payment method - which displays monthly amount due 
	
	public double monthlyPayment(Loan l)
	{
		//M = P [ i(1 + i)^n ] / [ (1 + i)^n – 1]
		/*
    M = monthly mortgage payment
    P = the principal, or the initial amount you borrowed.
    i = your monthly interest rate. Your lender likely lists interest rates as an annual figure, so you’ll have to divide by 12, for each month of the year. So, if your rate is 5%, then the monthly rate will look like this: 0.05/12 = 0.004167.
    n = the number of payments, or the payment period in months. If you take out a 30-year fixed rate mortgage, this means: n = 30 years x 12 months per year = 360 payments.
		 */
		
		// convert interest rate into a decimal 
		//eg: 4% = 0.04
		
		double interest = l.getRate()/100;
		
		// monthly interest rate is yearly rate divided by 12
		
		double monthlyInterest = interest/ 12.0;
		
		// terms in month is year *12
		
		int termInMonths = l.getYears() *12;
		
		// formula for monthly payment 
		
		double monthlyPay = (l.getLoanAmount() * monthlyInterest)/
				(1-Math.pow(1+monthlyInterest, -termInMonths));
		
		return(monthlyPay);
		
		
		
	}
	
	//public void displayBalance();
	
	
	
	
}
