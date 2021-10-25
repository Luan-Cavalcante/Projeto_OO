package republicaExceptions;

public class CategoriaNaoInformadaException extends Exception {
	 
    /**
	 * Essa excessão será lançada sempre que o usuário informar uma categoria
	 * vazia na despesa
	 */
	private static final long serialVersionUID = 1L;

	public CategoriaNaoInformadaException(String message) {
        super(message);
    }
}