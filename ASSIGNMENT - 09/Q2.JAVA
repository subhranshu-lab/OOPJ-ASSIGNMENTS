import java.util.Scanner;

class BankAccount {
    double balance;

    public BankAccount(double initialBalance) {
        this.balance = initialBalance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: Rs " + amount + " Current Balance: Rs " + balance);
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && balance >= amount) {
            balance -= amount;
            System.out.println("Withdrew: Rs " + amount + " Current Balance: Rs " + balance);
        } else {
            System.out.println("Insufficient balance or invalid amount");
        }
    }

    public double getBalance() {
        return balance;
    }
}

class SavingsAccount extends BankAccount {
    public SavingsAccount(double initialBalance) {
        super(initialBalance);
    }

    public void withdraw(double amount) {
        if (amount <= 0) {
            System.out.println("Invalid withdrawal amount.");
            return;
        }
        if ((balance - amount) < 100) {
            System.out.println("Transaction Denied! Minimum balance of Rs 100 must be maintained.");
        } else {
            super.withdraw(amount);
        }
    }
}

public class A9b {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Initial Account Balance: ");
        double amt = sc.nextDouble();
        System.out.println("\n---Savings Account created---");
        SavingsAccount s = new SavingsAccount(amt);
        int ch;
        do {
            System.out.println("\nWhat do you want to do?");
            System.out.println("1. Deposit");
            System.out.println("2. Withdrawal");
            System.out.println("3. Get Balance");
            System.out.println("4. Exit");
            System.out.print("Your choice: ");
            ch = sc.nextInt();

            if (ch == 1) {
                System.out.print("Enter amount to deposit: ");
                double d = sc.nextDouble();
                s.deposit(d);
            } else if (ch == 2) {
                System.out.print("Enter amount to withdraw: ");
                double w = sc.nextDouble();
                s.withdraw(w);
            } else if (ch == 3) {
                System.out.println("Current Balance: Rs " + s.getBalance());
            } else if (ch == 4) {
                System.out.println("Exiting....");
            } else {
                System.out.println("Invalid choice.");
            }
        } while (ch != 4);
        sc.close();
    }
}