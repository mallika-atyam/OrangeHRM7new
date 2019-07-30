package JUN5;

public class SBI implements S1 {

	public static void main(String[] args)
	{
	
		System.out.println("HAI I AM SBI BANK-----------------");
		
		
		S1 SBI1 =new SBI();
		SBI1.deposit();
		SBI1.withdrawal();
		SBI1.classinterest();
				
		
	}

	@Override
	public void deposit()
	{
			System.out.println("HAI I AM SBI DEPOSIT");
		
	}

	@Override
	public void withdrawal() 
	{
		
		System.out.println("HAI I AM SBI WITHDRAWAL");
		
	}

	@Override
	public void classinterest()
	{
	
		System.out.println("HAI I AM SBI CLASSINTEREST");
		
	}

}
