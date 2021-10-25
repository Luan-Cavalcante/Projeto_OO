package republicaExceptions;

public class ArquivoNaoEncontradoException extends Exception {
	 
    /**
	 * Essa excessão será lançada sempre que o usuário informar um arquivo que não existe
	 */
	private static final long serialVersionUID = 1L;

	public ArquivoNaoEncontradoException(String message) {
        super(message);
    }
}