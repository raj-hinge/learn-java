package learnjava2;

public class DisplayBal extends Loan
{
	
	int currentMonth=6;
	double m;
	
	DisplayBal(Double l)
	{
		this.m = l;
		
	}
	
	public void displayBalance()
	{
		
		System.out.println(this.m);
		
		double TotalPay = this.m * super.getYears();
		
		System.out.println(TotalPay);
		
		double monthlyBal = TotalPay - (this.m * currentMonth);
		
		System.out.println(monthlyBal);
		
		
	}
	
	
	
	//System.out.println("test");
	
	
	
}
