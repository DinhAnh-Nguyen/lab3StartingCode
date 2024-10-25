package exceptions;

public class NullKeyException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = -6331941262757255734L;
	
	public NullKeyException() {
		super("Error! Key is null.");
	}

}
