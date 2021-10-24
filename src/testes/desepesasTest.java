package testes;
import republica.Data;
import republica.Categoria;
import republica.Subcategoria;
import republica.Despesa;


class  despesasTest
{
private static Categoria residencia;
private static Categoria cat_nula;
private static Subcategoria aluguel;
private static Data data;
private static Data data_nula;
private static Despesa despesa;
static                  //static block
{




}
public static void main(String args[]) throws Exception  //static method
{

	 
	 //criação da classe Sucategoria, Categoria, Data
	 aluguel = new Subcategoria("Aluguel");
	 residencia = new Categoria("Residência", aluguel);
	 data = new Data(10, 2021);
	 
	  //Testando criação classe Despesa
	 despesa = new Despesa(120.50f, data, "senhor barriga", residencia);
	 System.out.println(despesa.getDescricao());
	 System.out.printf("%.2f\n", despesa.getValor());
	 System.out.printf("%d/%d\n", despesa.getData().getMes(), despesa.getData().getAno());
	 System.out.println(despesa.getCategoria().getDescricao());
	 
	 
	// Testando setar data nula
	try {
		despesa.setData(data_nula);
	} catch (Exception e){
		System.out.println(e);
	}
	
	
	// testando setar categoria nula
		try {
			despesa.setCategoria(cat_nula);
		} catch (Exception e){
			System.out.println(e);
		}
	 
	// testando setar descrição vazia
	try {
		despesa.setDescricao("");
	} catch (Exception e) {
		System.out.println(e);
	}


	 
}
}