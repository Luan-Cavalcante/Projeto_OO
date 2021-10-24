package republica;
import republicaExecptions.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Residente {

	String nome;
    String email;
    float rendimentos;

    public Residente (String nome, String email, float rendimentos) {
        this.nome = nome;
        this.email = email;
        this.rendimentos = rendimentos;
    }

    public void setnome(String nome) throws DadosPessoaisIncompletosException {
    	if ( (nome.length() < 1) || (nome.length() > 30) )
    		throw new DadosPessoaisIncompletosException("Nome invalido. Minimo 1 caracter, maximo 30 caracteres"); 
    	else
    		this.nome = nome;
    }
    
    public void setemail(String email) throws DadosPessoaisIncompletosException{ 
    	
    	String expression = "^[\\w\\.-]+@([\\w\\-]+\\.)+[A-Z]{2,4}$";
        Pattern pattern = Pattern.compile(expression, Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher(email);
        
    	if (email != null && email.length() > 0 && matcher.matches()) 
            	this.email = email;
    	else
    		throw new DadosPessoaisIncompletosException("email invalido");   
    }

    public void setrendimentos(float rendimentos) throws RendimentoInvalidoException { 
    	if (rendimentos < 0)
    		throw new RendimentoInvalidoException("Insira um rendimento valido.");
    	else
    	this.rendimentos = rendimentos;
    }

	public String getNome() {
		return nome;
    }
	public String getEmail() { 
	    return email;
	}
	public float getRendimentos() { 
	    return rendimentos;
	}
	}
