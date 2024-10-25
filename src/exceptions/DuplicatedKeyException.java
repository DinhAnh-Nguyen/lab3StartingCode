package exceptions;

public class DuplicatedKeyException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 791039258142932449L;
	
	public DuplicatedKeyException(String errorMessage) {
		super(errorMessage);
	}

}
