package problem4;

public class Account {
	private double balance;
	private int accNumber;
	public Account() {}
	public Account(int a) {
		balance=0.0;
		accNumber=a;
	}
	public void deposit(double sum) {
	    if (sum < 0) {
	        System.out.println("Error: Cannot deposit a negative amount.");
	    } else {
	        balance += sum;
	    }
	}
	public void withdraw(double sum) {
	    if (sum < 0) {
	        System.out.println("Error: Cannot withdraw a negative amount.");
	    } else {
	        if (balance > sum) {
	            balance -= sum;
	        } else {
	            System.out.println("Error: Not enough balance");
	        }
	    }
	}
	public double getBalance() {
		return this.balance;
	}
	public int getAccountNumber() {
		return this.accNumber;
	}
	public void transfer(double amount,Account other){
		this.withdraw(amount);
		other.deposit(amount);
	}
	public String toString() {
		return accNumber+": "+balance+" tenge.";
	}
	public final void print() {
		System.out.println(toString());
	}
}

