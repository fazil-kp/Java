class MinBalExp extends Exception {
    public MinBalExp(String message) {
        super(message);
    }
}

class Account {
    private double balance;

    public Account(double balance) {
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposit successful. Balance: " + balance);
    }

    public void withdraw(double amount) throws MinBalExp {
        if (amount > balance) {
            throw new MinBalExp("Withdrawal amount exceeds balance.");
        } else {
            balance -= amount;
            System.out.println("Withdrawal successful. Balance: " + balance);
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Account account = new Account(1000);
        try {
            account.withdraw(500);
            account.withdraw(800);
        } catch (MinBalExp e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
