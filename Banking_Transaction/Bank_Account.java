package Project;
import 
public abstract class Bank_Account {
	private String accNum;
	private String accHolderName;
	private double bal;
	private int pin;
	protected Bank_Account(String accNum, String accHolderName, double bal) throws InvalidAmountException{
		if(bal<0) {
			throw new InvalidAmountException("Balance cannot be less than 0");
		}
		this.accNum=accNum;
		this.accHolderName=accHolderName;
		this.bal=bal;
	}
	public double getBal(int pin) {
		if(this.pin==pin) {
			return bal;
		}
		return -1;
	}
	public void setBal(double bal, int pin) {
		if(this.pin==pin) {
			this.bal=bal;
			System.out.println("Your new balance is: "+bal);
		}
		return;
	}
	public void withdraw(double amount, int pin) throws InsufficientBalException, InvalidAmountException{
		if(this.pin==pin) {
			if(amount<0) {
				throw new InvalidAmountException("Amount is invalid");
			}
			if(amount>this.bal) {
				throw new InsufficientBalException("Balance is insufficient");
			}
			this.bal-=amount;
			System.out.println("Amount is withdrawn");
		}
		System.out.println("INVALID PIN");
	}
	public void deposit(double amount,int pin) throws InvalidAmountException{
		if(this.pin==pin) {
			if(amount<0) {
				throw new InvalidAmountException("Amount is invalid");
			}
			this.bal+=amount;
			System.out.println("Amount deposited successfully");
		}
		System.out.println("INVALID PIN");
	}
	public void deposit(double amount, int pin, String mode) throws InvalidAmountException{
		if(this.pin==pin) {
			if(amount<0) {
				throw new InvalidAmountException("Amount is invalid");
			}
			this.bal+=amount;
			System.out.println("Amount deposited successfully");
			System.out.println("Mode is: "+mode);
		}
	}
	
	
}
