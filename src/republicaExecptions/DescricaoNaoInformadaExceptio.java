package republicaExecptions;


public class DescricaoNaoInformadaExceptio extends Exception {
	 
    /**
	 * Essa excessão será lançada sempre que o usuário informar uma descrição
	 * vazia na subcategoria ou categoria
	 */
	private static final long serialVersionUID = 1L;

	public DescricaoNaoInformadaExceptio(String message) {
        super(message);
    }
}