package republica;
import republicaExceptions.*;
public class Subcategoria {
	    
	    	String descricaoSubcategoria;

	    public Subcategoria (String descricao) throws DescricaoNaoInformadaException {
	        this.setDescricao(descricao);
	    }

	    public String getDescricao() { // Deve retornar o valor da metodo descricaoSubcategoria
	    	
	        return descricaoSubcategoria;
	    }

	    public void setDescricao(String descricao) throws DescricaoNaoInformadaException { // Deve setar o valor da metodo descricaoSubcategoria
		  if (descricao.length() <  1)
	    	  {
			  throw new DescricaoNaoInformadaException("O tamanho da decrição deve ser maior ou igual a 1 caractere");
	    	  }
		  else
			  this.descricaoSubcategoria = descricao;
	    	  }
	      
	    }
