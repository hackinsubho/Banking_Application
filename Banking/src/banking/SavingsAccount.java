package banking;

public class SavingsAccount implements Accounts {

	AccountDetails account = new AccountDetails();

	public boolean withdrawal(double amount, int uniqueId) throws LimitExceeded {
		try {
			if (amount < account.person[uniqueId].balance
					&& account.person[uniqueId].balance > 1000) {
				return true;
			}
			else throw new LimitExceeded("Limit Exceeded");

		} catch (Exception m) {

			System.out.println(m);
		}
		return false;

	}

	public boolean deposit(double amount) {

		return false;
	}

	public boolean deposit(double amount, int uniqueId) {
		// TODO Auto-generated method stub
		return false;
	}

}
