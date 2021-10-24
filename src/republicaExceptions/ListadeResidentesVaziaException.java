package republicaExceptions;


public class ListadeResidentesVaziaException extends Exception {

    /**
	 * Essa excessão será lançada sempre que o usuário informar uma descrição
	 * vazia na subcategoria ou categoria
	 */
	private static final long serialVersionUID = 2L;

	public ListadeResidentesVaziaException(String message) {
        super(message);
    }
}