package problem4;

import java.util.Vector;

public class Bank {
	Vector<Account> accounts = new Vector<Account>();
	public Bank() {}
	public Bank(Account account) {
		accounts.add(account);
	}
	public void openAccount(Account acc) {
        accounts.add(acc);
    }

    public void closeAccount(Account acc) {
        accounts.remove(acc);
    }
	public void update() {
		for(Account a: accounts) {
			a.deposit(10000);
			if(a instanceof SavingAccount) {
				((SavingAccount) a).addInterest();
			}
			else if(a instanceof CheckingBalance) {
				((CheckingBalance) a).deductFee();
			}
		}
	}
}
