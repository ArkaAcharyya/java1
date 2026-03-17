package Implementation;

public class SavingsAccount extends BankAccount {
    private static final double MIN_BAL = 1000;

    public SavingsAccount(String accNum, String accHolderName, double bal)
            throws InsufficientBalException {

        super(accNum, accHolderName, bal);

        if (bal < MIN_BAL)
            throw new InsufficientBalException("Minimum balance required: " + MIN_BAL);
    }

    public void getBal(int pin) throws InvalidPinException {
        if (!validatePin(pin))
            throw new InvalidPinException("Invalid PIN");;
        System.out.println("Savings Balance: " + balance);
    }

    public void withdraw(double amount, int pin)
            throws InvalidAmountException, InsufficientBalException {

        if (!validatePin(pin))
            throw new InvalidPinException("Invalid PIN");

        if (amount <= 0)
            throw new InvalidAmountException("Invalid amount");

        if (balance - amount < MIN_BAL)
            throw new InsufficientBalException("Minimum balance violation");

        balance -= amount;
        System.out.println("Withdrawal successful");
    }

    public void deposit(double amount, int pin)
            throws InvalidAmountException {

        if (!validatePin(pin))
            throw new InvalidPinException("Invalid PIN");

        if (amount <= 0)
            throw new InvalidAmountException("Invalid amount");

        balance += amount;
        System.out.println("Deposit successful");
    }

    public void deposit(double amount, int pin, String mode)
            throws InvalidAmountException {
        deposit(amount, pin);
        System.out.println("Mode: " + mode);
    }
}
