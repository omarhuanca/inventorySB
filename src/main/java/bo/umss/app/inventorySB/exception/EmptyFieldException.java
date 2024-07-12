package bo.umss.app.inventorySB.exception;

public class EmptyFieldException extends RuntimeException {

	private static final long serialVersionUID = -5184971292309210539L;

	public EmptyFieldException() {
		super();
	}

	public EmptyFieldException(String message) {
		super(message);
	}
}
