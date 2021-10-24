package republicaExceptions;

public class ValorNaoInformadoException extends Exception {
	 
    /**
	 * Essa excessão será lançada sempre que o usuário informar um valor
	 * vazia na despesa
	 */
	private static final long serialVersionUID = 1L;

	public ValorNaoInformadoException(String message) {
        super(message);
    }
}