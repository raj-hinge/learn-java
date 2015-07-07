package learnJava3;

public class MortgageCalc 
{
	
		public static void main(String[] args)
		{
			int loanAmount = Integer.parseInt(args[0]);
			double rate = Double.parseDouble(args[1]);
			int[] years = new int[2];
			years[0] = Integer.parseInt(args[2]);
			
			Loan l = new Loan();
			
			l.setLoanAmount(loanAmount);
			l.setRate(rate);
			l.setYears(years);
			
			l.monthlyPayment(rate, loanAmount, years);
			
			
}
}