package banking;

public interface Accounts {
public boolean withdrawal(double amount, int uniqueId) throws LimitExceeded;
public boolean deposit(double amount, int uniqueId);
}
