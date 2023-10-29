package problem4;


public class CheckingBalance extends Account{
	private int counter=0;
	private final int FREE_TRANSACTIONS=5;
	public CheckingBalance() {}
	public CheckingBalance(int number) {
		super(number);
	}
	public void deductFee() {
		if(counter>FREE_TRANSACTIONS) {
			super.withdraw((counter-FREE_TRANSACTIONS)*150);
		}
	}
	public void withdraw(double sum) {
		counter++;
		super.withdraw(sum);
	}
	public void transfer(double amount, Account other) {
		this.withdraw(amount);
		other.deposit(amount);
	}
}
