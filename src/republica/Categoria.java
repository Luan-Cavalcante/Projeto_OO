package republica;

public class Categoria {

	String descricaoCategoria;
	Subcategoria subcategoria;

    public Categoria (String descricaoCategoria, Subcategoria subcategoria) {
        this.descricaoCategoria = descricaoCategoria;
        this.subcategoria = subcategoria;
    }

    public Subcategoria getSubcategoria() { // Deve retornar o valor da metodo subcategoria
        return subcategoria;
    }

    public void setSubcategoria() { // Deve setar o valor da metodo subcategoria
      
    }

    public String getDescricao() { // Deve retornar o valor da metodo descricaoCategoria
    return descricaoCategoria;
}

    public void setDescricao() { // Deve setar o valor da metodo descricaoCategoria
  
}
    
}
