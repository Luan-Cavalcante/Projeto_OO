package republica;

public class Subcategoria {
	    
	    	String descricaoSubcategoria;

	    public Subcategoria (String descricao) {
	        this.descricaoSubcategoria = descricao;
	    }

	    public String getDescricao() { // Deve retornar o valor da metodo descricaoSubcategoria
	    	
	        return descricaoSubcategoria;
	    }

	    public void setDescricao(String descricao) { // Deve setar o valor da metodo descricaoSubcategoria
	    	  try
	    	  {
	    	    this.descricaoSubcategoria = descricao;
	    	  }
	    	  catch(DescricaoNaoInformadaException) e) //captura a possível exeção de valor nulo
	    	  {
	    	    //TRATAMENTO DA exceção
	    	    System.out.println("A Descrição da subcategoria está nula, para solucional tal o problema, foi lhe atribuito um valor default.");
	    	  }
	      
	    }
}
