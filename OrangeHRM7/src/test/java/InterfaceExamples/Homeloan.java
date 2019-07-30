package InterfaceExamples;

public class Homeloan {

	public static void main(String[] args) {

		BRI b1 = new SBI();
		b1.BankRI();
		
		BRI b2 = new HDFC();
		b2.BankRI();
	}

}


interface BRI
{
	public void BankRI();
}


class SBI implements BRI
{

	@Override
	public void BankRI() {
		
		int RI=8;
		System.out.println("SBI RI is " + RI);
		
	}
	
}



class HDFC implements BRI
{

	@Override
	public void BankRI() {
		
		int RI=10;
		System.out.println("HDFC RI is " + RI);
		
	}
	
}




