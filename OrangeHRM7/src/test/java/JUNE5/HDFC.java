package JUNE5;

public class HDFC implements BANK {

	public static void main(String[] args)
	
	{
		System.out.println("HDFC BANK DETAILS");
		
		BANK H1= new HDFC();
		H1.deposit();
		H1.classinterest();
		H1.withdraw();
		
		
	}

	@Override
	public void deposit() 
	{
		
		System.out.println("HDFC BANK DEPOSIT");
		
	}

	@Override
	public void withdraw() 
	{
		
		System.out.println("HDFC BANK WITHDRAW");
		
	}

	@Override
	public void classinterest() 
	{
		System.out.println("HDFC BANK CLASSINTEREST");
		
	}

}
