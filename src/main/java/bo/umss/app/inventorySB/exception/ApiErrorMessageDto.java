package bo.umss.app.inventorySB.exception;

public class ApiErrorMessageDto {

	private String message;

	public ApiErrorMessageDto(String message) {
		this.message = message;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
}
