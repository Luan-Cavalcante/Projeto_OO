package republica;
import java.util.*;

public class Republica {
	Vector<Integer> meses = new Vector<Integer>(12);{
	for (int i = 1; i<= 12; i++)
		meses.add(i);
	}	
		
	 public Republica () {
	        }

	    public void addResidente(String nome, String email, float rendimento) { // Deve adiciocar um residente no arquivo
	    	Residente r = new Residente(nome, email, rendimento); 
	    }

	    public void addDespesa(float valor, Data data, String descricao, Categoria categoria) { // Deve setar o valor da metodo subcategoria
	    	Despesa d = new Despesa(valor, data, descricao, categoria);
	      
	    }

	    public Pagamentos pagamentoIgualitario() {
	    	Residente[] residentes = Residente();
	    	Pagamentos pagamentosafazer = new Pagamentos();
	    	return pagamentosafazer;
	    	
//	    	Esse metodo vai acessar os arquivos dos residentes e popular o vetor residente,
//	    	depois acessar os arquivos de despesas do mes e dividir o valor das despesas totais
//	    	pelo número de residentes. 
//	    	Popular o vetor pagamentosafazer com esse valor encontrado.
//	    	A main deverá receber o objeto pagamentos, acessar a lista residentes e pagamentos
//	    	(atributos da classe Pagamentos) e associar cada indice do vetor listaresidentes ao listapagamentos
//	    	para descobrir quanto cada residente devera pagar.
//	    
	    }

	    public Pagamentos pagamentoProporcional() { 
	    	Residente[] residentes = Residente();
	    	Pagamentos pagamentosafazer = new Pagamentos();
	    	return pagamentosafazer;
	    	
//	    	Esse metodo vai acessar os arquivos dos residentes e popular o vetor residentes,
//	    	depois acessar os arquivos de despesas do mes e dividir  proporcionalmente o valor 
//	    	das despesas totais pelo número de residentes de acordo com o rendimento. 
//	    	Popular o vetor pagamentosafazer com esse valor encontrado para cada residente.
//	    	A main deverá receber o objeto pagamentos, acessar a lista residentes e pagamentos
//	    	(atributos da classe Pagamentos) e associar cada indice do vetor listaresidentes ao listapagamentos
//	    	para descobrir quanto cada residente devera pagar.
//	    
	}		    
}





