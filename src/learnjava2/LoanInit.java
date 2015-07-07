package learnjava2;

public class LoanInit 
{
	public static void main(String[] args)
	{
		int loanAmount = Integer.parseInt(args[0]);
		double rate = Double.parseDouble(args[1]);
		int years = Integer.parseInt(args[2]);
		
		double mp;
		
		Loan l = new Loan();
		
		if(years <= 5)
		{
		l.setRate(rate);
		} else
		{
			l.setRate(rate+.5) ;
		}
		
		l.setLoanAmount(loanAmount);
		l.setYears(years);
		
		if(years <= 5)
		{
			mp = l.monthlyPayment(l);
			System.out.println("Monthly Due:"+String.format( "%.2f",mp));
			//System.out.println(l.monthlyPayment(l));
		}else
		{
			mp = l.monthlyPayment(l) + 15;
			System.out.println("Monthly Due:"+String.format( "%.2f",mp));
			//System.out.println(l.monthlyPayment(l)+15);
		}
		
		
		double TotalPay = mp * (l.getYears() *12);
		
		System.out.println("Total Amount owed by Borrower:"+String.format( "%.2f", TotalPay));
		
		System.out.println("Monthly Balances:");
		
		for(int i = 1; i < (years*12);i++ )
		{
		
		double monthlyBal = TotalPay - (mp * i);
		
		
		System.out.println("Month:"+ i + "  Balance:"+String.format( "%.2f",monthlyBal));
		
		}
		//DisplayBal d = new DisplayBal(l.monthlyPayment(l));
		//d.displayBalance();
		
	}


}
