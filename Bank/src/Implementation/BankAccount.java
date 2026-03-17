package Implementation;

public abstract class BankAccount {
    private String accNum;
    private String accHolderName;
    private int pin = 3498;
    protected double balance;

    protected BankAccount(String accNum, String accHolderName, double balance) {
        this.accNum = accNum;
        this.accHolderName = accHolderName;
        this.balance = balance;
    }

    protected boolean validatePin(int pin) {
        return this.pin == pin;
    }

    public void getaccNum(int pin) throws InvalidPinException {
        if (!validatePin(pin))
            throw new InvalidPinException("Pin is invalid");
        System.out.println("Account number: " + accNum);
    }

    public void getaccHolderName(int pin) throws InvalidPinException {
        if (!validatePin(pin))
            throw new InvalidPinException("Pin is invalid");
        System.out.println("Account holder: " + accHolderName);
    }

    public abstract void getBal(int pin) throws InvalidPinException;
    public abstract void withdraw(double amount, int pin)
            throws InvalidAmountException, InsufficientBalException;
    public abstract void deposit(double amount, int pin)
            throws InvalidAmountException;
    public abstract void deposit(double amount, int pin, String mode)
            throws InvalidAmountException;
}
