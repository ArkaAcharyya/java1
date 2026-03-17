package Wallet;

public class ExceededLimitException extends RuntimeException{
	public ExceededLimitException (String msg) {
		super(msg);
	}

}
