package Implementation;

import java.util.Scanner;

public class Driver_class {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        BankAccount account = null;
        System.out.println();

        try {
            System.out.println("Select Account Type:");
            System.out.println("1. Savings Account");
            System.out.println("2. Current Account");

            int choice = sc.nextInt();

            if (choice == 1) {
                try {
					account = new SavingsAccount(
					        "S101", "Arka", 5000);
				} catch (InsufficientBalException e) {
					System.out.println(e.getMessage());
				}
            } 
            else if (choice == 2) {
					try {
						account = new CurrentAccount(
						        "C201", "Arka", 3000, 5000);
					} catch (InsufficientBalException e) {
						// TODO Auto-generated catch block
						System.out.println(e.getMessage());
					}
            } 
            else {
                System.out.println("Invalid account choice");
                return;
            }

            while (true) {

                System.out.println("\n------ MENU ------");
                System.out.println("1. Show Account Number");
                System.out.println("2. Show Account Holder Name");
                System.out.println("3. Check Balance");
                System.out.println("4. Deposit");
                System.out.println("5. Deposit with Mode");
                System.out.println("6. Withdraw");
                System.out.println("7. Exit");

                System.out.print("Enter choice: ");
                int option = sc.nextInt();

                if (option == 7) {
                    System.out.println("Thank you! Session closed.");
                    break;
                }

                System.out.print("Enter PIN: ");
                int pin = sc.nextInt();

                try {
                    switch (option) {

                        case 1:
                            account.getaccNum(pin);
                            break;

                        case 2:
                            account.getaccHolderName(pin);
                            break;

                        case 3:
                            account.getBal(pin);
                            break;

                        case 4:
                            System.out.print("Enter amount: ");
                            double dep = sc.nextDouble();
                            account.deposit(dep, pin);
                            break;

                        case 5:
                            System.out.print("Enter amount: ");
                            double amt = sc.nextDouble();
                            System.out.print("Enter mode: ");
                            String mode = sc.next();
                            account.deposit(amt, pin, mode);
                            break;

                        case 6:
                            System.out.print("Enter amount: ");
                            double w = sc.nextDouble();
                            account.withdraw(w, pin);
                            break;

                        default:
                            System.out.println("Invalid menu option");
                    }
                }
                catch (InvalidPinException |
                       InvalidAmountException |
                       InsufficientBalException e) {

                    System.out.println("Error: " + e.getMessage());
                }
            }
        }
        finally {
        	sc.close();
        }
    }
 }


