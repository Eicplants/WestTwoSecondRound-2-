package q1FriedChicken;

public class OverdraftBalanceException extends RuntimeException {
	public OverdraftBalanceException(String msg) {
		super( msg);
	}
}
