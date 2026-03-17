package Exception.unchecked_exc;


public class CustomUncheckedException {
	public static void withdraw(double balance, double amount){
		if(amount>balance) {
			throw new InsufficientBalanceException("Amount is greater than balance");
		}
		System.out.println("Amount is deducted, Remaining balance is: "+(balance-amount));
			//return Permit.HARD;
		
		//return null;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//try {
			try {
				withdraw(50,500);
			} catch (InsufficientBalanceException e) {
				// TODO Auto-generated catch block
				System.out.println("Caught exception: "+e.getMessage() );
			}
	}
}
