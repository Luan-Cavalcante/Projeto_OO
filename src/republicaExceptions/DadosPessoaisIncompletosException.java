package republicaExecptions;

public class DadosPessoaisIncompletosException extends Exception{
	
	private static final long serialVersionUID =  1L ;

	public  DadosPessoaisIncompletosException ( String  mensagem ) {
        super (mensagem);
    }
}