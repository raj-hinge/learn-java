package learnJava3;

public class Loan 
{
	private double rate;
	private int loanAmount;
	private int[] years = new int[2];
	//private int months;
	
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
	
	//setting years
	// years[1] will have months
	public void setYears(int years[]) 
	{
		this.years[0] = years[0];
		this.years[1] = years[0] *12;
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
	public int[] getYears() 
	{
		return years;	
	}
	
	public double monthlyPayment(double rate, int loanAmount, int[] years)
	{
		
		double interest = rate/100;
		
		// monthly interest rate is yearly rate divided by 12
		
		double monthlyInterest = interest/ 12.0;
		
		// terms in month is year *12
		
		//// not required : int termInMonths = years[1];
		
		// formula for monthly payment 
		
		double monthlyPay = (loanAmount * monthlyInterest)/
				(1-Math.pow(1+monthlyInterest, -years[1]));
		
		return(monthlyPay);
		
		
	}
	
	
	
	public void displayBalance(double monthlyPay, int[] years)
	{
		double TotalPay = monthlyPay * years[1];
		
		System.out.println("Total Amount owed by Borrower:"+String.format( "%.2f", TotalPay));
		
		System.out.println("Monthly Balances:");
		
		for(int i = 1; i < years[1]; i++ )
		{
		
		double monthlyBal = TotalPay - (monthlyPay * i);
		
		
		System.out.println("Month:"+ i + "  Balance:"+String.format( "%.2f",monthlyBal));
		
		
		
		}
		
	}
	
	
}
