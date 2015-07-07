package learnLoan5;


public class Loan5init5 
{
	public static void main(String[] args)
	{
		// getting parameters from outside the program 
		
		int loanAmount = Integer.parseInt(args[0]);
		double rate = Double.parseDouble(args[1]);
		int years = Integer.parseInt(args[2]);
		
		Loan5 l = null;

/*		
		if(years > 5)
		{
		// if loan period is greater than 5 years 	
		Loan5 l = new LongTermLoan5(loanAmount,rate,years);
		
		// calls the getMonthlyPayment method which returns monthly payment 
		System.out.println("Monthly Amount Due: "+ String.format( "%.2f",l.getMonthlyPayment()));
		System.out.println();
		
		// calls the displayMonthlyBal method which displays monthly bal
		l.displayMonthlyBal();
		}
		else 		
		{
		// if loan period is less than 5 years : 
		Loan5 l = new Loan5(loanAmount,rate,years);
		
		System.out.println("Monthly Amount Due: "+ String.format( "%.2f",l.getMonthlyPayment()));
		System.out.println();
		
		l.displayMonthlyBal();
		}
	
*/		

//*************ask James why this code cannot be outside the if statement 

		/*
		System.out.println("Monthly Amount Due: "+ String.format( "%.2f",l.getMonthlyPayment()));
		System.out.println();
		
		l.displayMonthlyBal();
	*/


  
 if(years > 5)
		{
		// if loan period is greater than 5 years 	
		 l = new LongTermLoan5(loanAmount,rate,years);
 		}
 else 		
		{
		// if loan period is less than 5 years : 
		l = new Loan5(loanAmount,rate,years);
 		}
 	
 
  	System.out.println("Monthly Amount Due: "+ String.format( "%.2f",l.getMonthlyPayment()));
	System.out.println();
		
	l.displayMonthlyBal();
  
	}



}

		
