package banking;

public class LimitExceeded extends Exception {

	private static final long serialVersionUID = 1L;

	public LimitExceeded(String message) {
		super(message);
	}
}
