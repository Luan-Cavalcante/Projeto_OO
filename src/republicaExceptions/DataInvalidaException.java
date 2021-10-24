package republicaExecptions;

public class DataInvalidaException extends Exception {
	private static final long serialVersionUID = 1L;

	public DataInvalidaException(String message) {
        super(message);
	}
}
