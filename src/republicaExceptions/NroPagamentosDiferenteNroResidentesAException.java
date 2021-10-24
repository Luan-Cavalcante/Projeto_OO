package republicaExceptions;


public class NroPagamentosDiferenteNroResidentesAException extends Exception {

    /**
	 * Essa excessão será lançada sempre que o usuário informar uma descrição
	 * vazia na subcategoria ou categoria
	 */
	private static final long serialVersionUID = 1L;

	public NroPagamentosDiferenteNroResidentesAException(String message) {
        super(message);
    }
}