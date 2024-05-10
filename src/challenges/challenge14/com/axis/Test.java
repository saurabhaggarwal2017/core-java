package challenges.challenge14.com.axis;

public class Test {
    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount(123456, "saurabh kumar");
        System.out.printf("Your account balance : %d. \n", bankAccount.getBalance());
        System.out.printf("Your account number : %d. \n", bankAccount.getAccountNumber());
        System.out.printf("Your accountHolder name : %s. \n", bankAccount.getAccountHolderName());

        bankAccount.depositMoney(1000);
        System.out.printf("Your account balance : %d. \n", bankAccount.getBalance());
        bankAccount.withdrawMoney(2000);
        System.out.printf("Your account balance : %d. \n", bankAccount.getBalance());
        bankAccount.withdrawMoney(900);
        System.out.printf("Your account balance : %d. \n", bankAccount.getBalance());
        bankAccount.withdrawMoney(-50);

        bankAccount.setAccountHolderName("saurabh aggarwal");
        System.out.printf("Your account balance : %d. \n", bankAccount.getBalance());
        System.out.printf("Your account number : %d. \n", bankAccount.getAccountNumber());
        System.out.printf("Your accountHolder name : %s. \n", bankAccount.getAccountHolderName());

        Employee employee = new Employee("saurabh kumar", 23);
        employee.setSalary(30462);
        System.out.println(employee.displayEmployeeDetails());
    }
}
