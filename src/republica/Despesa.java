package republica;
import republicaExceptions.*;

public class Despesa {

	float valor;
	Data data;
	String descricao;
	Categoria categoria;

	public Despesa (float valor, Data data, String descricao, Categoria categoria) throws ValorNaoInformadoException, DescricaoNaoInformadaException, DataNaoInformadaException, CategoriaNaoInformadaException {
        this.setValor(valor);
        this.setData (data);
        this.setDescricao(descricao);
        this.setCategoria (categoria);
    }

    public float getValor() { // Deve retornar o valor da metodo valor
        return valor;
    }

    public void setValor(float valor) throws ValorNaoInformadoException{ // Deve setar o valor da metodo valor
      if (valor == 0.0f) {
    	  throw new ValorNaoInformadoException("Erro: Valor da despesa não informado!");
      } else {
    	  this.valor = valor;
      }
    }

    public Data getData() { // Deve retornar o valor da metodo data
    	return data;
    }

    public void setData(Data data) throws DataNaoInformadaException { // Deve setar o valor da metodo data
    	if (data == null) {
    		throw new DataNaoInformadaException("Erro: Data da despesa não informada!");
    	}else {
    		this.data = data;
    	}
	}
    public String getDescricao() { // Deve retornar o valor da metodo descri��o
        return descricao;
    }

    public void setDescricao(String descricao) throws DescricaoNaoInformadaException { // Deve setar o valor da metodo descri��o
    	if (descricao == null) {
    		throw new DescricaoNaoInformadaException("Erro: Descrição da categoria não informada!");
    	} else {
    		this.descricao = descricao;
    	}
    }

    public Categoria getCategoria() { // Deve retornar o valor da metodo categoria
    	return categoria;
    }

    public void setCategoria(Categoria categoria) throws CategoriaNaoInformadaException { // Deve setar o valor da metodo categoria
    	if (categoria == null) {
    		throw new CategoriaNaoInformadaException("Erro: Categoria da despesa não informada!");
    	} else {
    		this.categoria = categoria;
    	}
    }
    
    
}
