package bo.umss.app.inventorySB.exception;

public class EntityNotFoundException extends RuntimeException {

	private static final long serialVersionUID = -2850004309455900216L;

	public EntityNotFoundException() {

	}

	public EntityNotFoundException(String message) {
		super(message);
	}
}
