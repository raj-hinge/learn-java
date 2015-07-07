package learnLoan4;

public class Loan4init4 
{
	public static void main(String[] args)
	{
		// getting parameters from outside the program 
		
		int loanAmount = Integer.parseInt(args[0]);
		double rate = Double.parseDouble(args[1]);
		int years = Integer.parseInt(args[2]);
		
		

		
		if(years > 5)
		{
		double monthlyPayment;
		
		Loan4 l = new LongTermLoan4(loanAmount,rate,years);
		
		monthlyPayment = l.getMonthlyPayment() + 15;
		
		System.out.println("Monthly Amount Due: "+ String.format( "%.2f",monthlyPayment));
		
		//System.out.println("Monthly Amount Due: "+ String.format( "%.2f",monthlyPay));
		
		System.out.println();
		
		l.displayMonthlyBal();
		
		}
		
		else 
		
		{

		Loan4 l = new Loan4(loanAmount,rate,years);
		
		System.out.println("Monthly Amount Due: "+ String.format( "%.2f",l.getMonthlyPayment()));
	
	
		System.out.println();
	
		l.displayMonthlyBal();
		}
	
	}
	


	}

