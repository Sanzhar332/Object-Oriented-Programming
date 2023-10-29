package problem4;

public class SavingAccount extends Account{
	private double rate;
	public SavingAccount() {}
	public SavingAccount(int rate,int number) {
		super(number);
		this.rate=rate;
	}
	public void addInterest() {
		super.deposit(100*rate/super.getBalance());
	}
}
