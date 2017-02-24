package banking;

import java.util.*;

public class AccountDetails {
	Scanner input = new Scanner(System.in);
	String firstname;
	String Lastname;
	String customerId;
	long accountnumber;
	int count = 0;
	double balance;
	public AccountDetails[] person;

	AccountDetails() {
		person = new AccountDetails[1000];
	}

	void createAccount(String firstname, String lastname, String customerId) {
		int index = count++;
		if (count > person.length) {
			AccountDetails[] tmp = new AccountDetails[person.length * 2];
			for (int i = 0; i < person.length; i++) {
				tmp[i] = person[i];
			}
			person = tmp;
		}
		person[index].firstname = this.firstname;
		person[index].Lastname = this.Lastname;
		person[index].balance = 1000;
		person[index].customerId = this.customerId;

	}

	boolean validate(String customerId) {
		for (int i = 0; i < person.length; i++) {
			if (customerId == person[i].customerId)
				return true;
		}
		return false;

	}
}
