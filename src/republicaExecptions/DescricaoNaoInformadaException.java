package republicaExecptions;


public class DescricaoNaoInformadaException extends Exception {
	 
    /**
	 * Essa excessão será lançada sempre que o usuário informar uma descrição
	 * vazia na subcategoria ou categoria
	 */
	private static final long serialVersionUID = 1L;

	public DescricaoNaoInformadaException(String message) {
        super(message);
    }
}