package republica;

public class Despesa {

	float valor;
	Data data;
	String descricao;
	Categoria categoria;

	public Despesa (float valor, Data data, String descricao, Categoria categoria) {
        this.valor = valor;
        this.data = data;
        this.descricao = descricao;
        this.categoria = categoria;
    }

    public float getValor() { // Deve retornar o valor da metodo valor
        return valor;
    }

    public void setValor() { // Deve setar o valor da metodo valor
      
    }

    public Data getData() { // Deve retornar o valor da metodo data
    return data;
}

    public void setData() { // Deve setar o valor da metodo data
  
}
    public String getDescricao() { // Deve retornar o valor da metodo descrição
        return descricao;
    }

    public void setDescricao() { // Deve setar o valor da metodo descrição
      
    }

    public Categoria getCategoria() { // Deve retornar o valor da metodo categoria
    return categoria;
}

    public void setCategoria() { // Deve setar o valor da metodo categoria
  
}
    
    
}
