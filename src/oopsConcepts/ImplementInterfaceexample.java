package oopsConcepts;

public class ImplementInterfaceexample implements Bank {


	
	@Override
	public void withDraw() {
		System.out.println("This is withdraw method");
		
	}

	@Override
	public void deposit() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void TotalBalance() {
		System.out.println("This is Totalbalance method");
		
	}

	@Override
	public void limitofWithdrawl() {
		System.out.println("This is Withdrawl method");
		
	}
	
	@Override
	public String Bankname(String strname) {
		
		return strname.concat(bankName);
	}

	@Override
	public int addition(int a, int b) {
		
		return a+b;
	}
	
	public void ownmethod() {
		
	}
	//upcasting
	public static void main(String[] args) {
		ImplementInterfaceexample obj =new ImplementInterfaceexample();
		System.out.println(obj.Bankname("   xyz Bank"));
		System.out.println(obj.addition(6, 8));

	}

	

	
	

}
