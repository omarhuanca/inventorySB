package bo.umss.app.inventorySB.exception;

public class NullFieldException extends RuntimeException {

	private static final long serialVersionUID = 8908629990210974800L;

	public NullFieldException() {
		super();
	}

	public NullFieldException(String message) {
		super(message);
	}
}
