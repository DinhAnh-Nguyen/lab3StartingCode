package exceptions;

public class NullValueException extends Exception {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 4571931775097438901L;
	
	public NullValueException() {
		super("Error! Value is null.");
	}

}
