package exceptions;

public class NullArgumentException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = -6331941262757255734L;
	
	public NullArgumentException(String errorMessage) {
		super(errorMessage);
	}

}
