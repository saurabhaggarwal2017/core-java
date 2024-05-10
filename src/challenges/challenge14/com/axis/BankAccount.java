package challenges.challenge14.com.axis;

public class BankAccount {
    private int accountNumber;
    private String accountHolderName;
    private int balance;

    public BankAccount(int accountNumber, String accountHolderName, int balance) {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.balance = balance;
    }

    // zero balance account.
    public BankAccount(int accountNumber, String accountHolderName) {
        this(accountNumber, accountHolderName, 0);
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public String getAccountHolderName() {
        return accountHolderName;
    }

    public int getBalance() {
        return balance;
    }

    public void setAccountHolderName(String accountHolderName) {
        this.accountHolderName = accountHolderName;
    }

    public void depositMoney(int amount) {
        if (amount <= 0) {
            System.out.println("Don't pass negative or zero amount for deposit.");
        } else {
            this.balance += amount;
            System.out.printf("Your amount %d rs. is successfully deposit in your account %d.\n", amount, this.accountNumber);
        }
    }

    public void withdrawMoney(int amount) {
        if (amount <= 0) {
            System.out.println("Don't pass negative or zero amount for withdraw.");
        } else if (amount > this.balance) {
            System.out.println("You can't withdraw money because you don't have enough account balance.");
        } else {
            this.balance -= amount;
            System.out.printf("Amount %d rs. is successfully withdraw from your account %d.\n", amount, this.accountNumber);
        }
    }
}
