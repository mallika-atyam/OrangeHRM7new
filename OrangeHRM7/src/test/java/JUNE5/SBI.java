package JUNE5;

public class SBI  implements BANK
{

	public static void main(String[] args) 
	{
		System.out.println("------------------------------------");

		System.out.println("HDFC BANK DETAILS");
		
		
		BANK H1= new HDFC();
		H1.deposit();
		H1.classinterest();
		H1.withdraw();
		
		System.out.println("------------------------------------");
		
		
		
		
		System.out.println("SBI BANK DETAILS");
		
		BANK H2 = new SBI();
		H2.deposit();
		H2.withdraw();
		H2.classinterest();

		
		
		System.out.println("------------------------------------");
		
	}

	@Override
	public void deposit() 
	{
		
		System.out.println("SBI BANK DEPOSIT");
	}

	@Override
	public void withdraw() 
	{
		
		System.out.println("SBI BANK WITHDRAW");
	}

	@Override
	public void classinterest() 
	{
		
		System.out.println("SBI BANK CLASSINTEREST");
	}

}
