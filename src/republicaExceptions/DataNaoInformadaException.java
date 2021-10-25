package republicaExceptions;

public class DataNaoInformadaException extends Exception {
	 
    /**
	 * Essa excessão será lançada sempre que o usuário informar uma data
	 * vazia na despesa
	 */
	private static final long serialVersionUID = 1L;

	public DataNaoInformadaException(String message) {
        super(message);
    }
}
