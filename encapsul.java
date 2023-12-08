
class BankAccount {
private int accountNumber;
private String accountHolderName;
private double accountBalance;
// Constructor
public BankAccount(int accountNumber, String accountHolderName) {
this.accountNumber = accountNumber;
this.accountHolderName = accountHolderName;
this.accountBalance = 0.0;
}
// Getter methods
public int getAccountNumber() {
return accountNumber;
}
public String getAccountHolderName() {
return accountHolderName;
}
public double getAccountBalance() {
return accountBalance;
}
// Method to deposit money
public void deposit(double amount) {
if (amount > 0) {
accountBalance += amount;
System.out.println("Deposit successful. New balance: " + accountBalance);
} else {
System.out.println("Invalid amount. Deposit failed.");
}
}
// Method to withdraw money
public void withdraw(double amount) {
if (amount > 0 && amount <= accountBalance) {
accountBalance -= amount;
System.out.println("Withdrawal successful. New balance: " + accountBalance);
} else {
System.out.println("Insufficient funds. Withdrawal failed.");
}
}
}
public class encapsul {
public static void main(String[] args) {
BankAccount account1 = new BankAccount(123456, "John Doe");
System.out.println("Account Number: " + account1.getAccountNumber());
System.out.println("Account Holder Name: " + account1.getAccountHolderName());
System.out.println("Account Balance: " + account1.getAccountBalance());
account1.deposit(1000);
account1.withdraw(500);
}
}