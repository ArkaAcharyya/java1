package Implementation;

public class CurrentAccount extends BankAccount {
    private double overdraftLimit;

    public CurrentAccount(String accNum, String accHolderName,
                          double bal, double overdraftLimit) {

        super(accNum, accHolderName, bal);
        this.overdraftLimit = overdraftLimit;
    }

    public void getBal(int pin) throws InvalidPinException {
        if (!validatePin(pin))
            throw new InvalidPinException("Invalid PIN");
        System.out.println("Current Balance: " + balance);
    }

    public void withdraw(double amount, int pin)
            throws InvalidAmountException, InsufficientBalException {

        if (!validatePin(pin))
            throw new InvalidPinException("Invalid PIN");

        if (amount <= 0)
            throw new InvalidAmountException("Invalid amount");

        if (balance - amount < -overdraftLimit)
            throw new InsufficientBalException("Overdraft limit exceeded");

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

