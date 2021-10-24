package republica;
import republicaExecptions.*;

public class Categoria {

	String descricaoCategoria;
	Subcategoria subcategoria;

	public Categoria (String descricaoCategoria) throws DescricaoNaoInformadaException{
		this.setDescricao(descricaoCategoria);
		this.setSubcategoria(null);
	}
	
	public Categoria (String descricaoCategoria, Subcategoria subcategoria) throws DescricaoNaoInformadaException{
		this.setDescricao(descricaoCategoria);
		this.setSubcategoria(subcategoria);
	}
	
    public Subcategoria getSubcategoria() { // Deve retornar o valor da metodo subcategoria
        return subcategoria;
    }

    public void setSubcategoria(Subcategoria subcategoria) { // Deve setar o valor da metodo subcategoria
      this.subcategoria = subcategoria;
    }

    public String getDescricao() { // Deve retornar o valor da metodo descricaoCategoria
    	return descricaoCategoria;
    }

    public void setDescricao(String descricaoCategoria) throws DescricaoNaoInformadaException{ // Deve setar o valor da metodo descricaoCategoria
    	if (descricaoCategoria == null) {
    		throw new DescricaoNaoInformadaException("Erro: Descrição da categoria não informada!");
    	} else {
    		this.descricaoCategoria = descricaoCategoria;
    	}
    }
    
}
