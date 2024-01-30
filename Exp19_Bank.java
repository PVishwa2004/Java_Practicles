package Lab;

class Account {
    String accountNumber;
    double balance;

    public Account(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public void deposit(double amount) {
        balance += amount;
    }

    public void withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
        } else {
            System.out.println("Insufficient balance");
        }
    }

    public double getBalance() {
        return balance;
    }
}

class SavingsAccount extends Account {
    public SavingsAccount(String accountNumber, double balance) {
        super(accountNumber, balance);
    }
	 @Override
	 public void withdraw(double amount) {
	     if (balance - amount < 100) {
	         System.out.println("Minimum balance of Rs. 100 required!");
	     } else {
	         super.withdraw(amount);
	     }
	 }
}

//CurrentAccount.java
//Subclass CurrentAccount

class CurrentAccount extends Account {
    public CurrentAccount(String accountNumber, double balance) {
        super(accountNumber, balance);
    }
	 @Override
	 public void deposit(double amount) {
	     balance += amount;
	     System.out.println("Deposit of Rs. " + amount + " successful. Current balance: $" + getBalance());
	 }
	
	 @Override
	 public void withdraw(double amount) {
	     if (balance >= amount) {
	         balance -= amount;
	         System.out.println("Withdrawal of Rs. " + amount + " successful. Current balance: $" + getBalance());
	     } else {
	         System.out.println("Insufficient funds. Withdrawal failed.");
	     }
	 }
}

public class Exp19_Bank {
	public static void main(String args[]) {
		CurrentAccount c = new CurrentAccount("AE2001",5000);
		SavingsAccount s = new SavingsAccount("MS3501", 7000);
		
		System.out.println("Balance in savings acc : " + s.getBalance());
		System.out.println("Balance in current acc : " + c.getBalance());
		
		s.withdraw(100);
		
		System.out.println("Balance in savings acc after withdraw : " + s.getBalance());
		
		c.deposit(500);
		System.out.println("Balance in current acc after deposit : " + c.getBalance());
		
		c.withdraw(400);
		System.out.println("Balance in current acc after withdraw : " + c.getBalance());
	}
}
