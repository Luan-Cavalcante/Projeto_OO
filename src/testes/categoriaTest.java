package testes;
import republica.Subcategoria;
import republica.Categoria;

class  categoriaTest
{
private static Subcategoria luz;
private static Subcategoria internet;
private static Categoria residencia;
static                  //static block
{




}
public static void main(String args[]) throws Exception  //static method
{
	//criação da classe Subcategoria
	 luz = new Subcategoria("Conta de luz");
	 internet = new Subcategoria("Conta de internet");

	 
	 //Testando criação da classe Categoria
	 residencia = new Categoria("Residência", luz);
	 System.out.println(residencia.getDescricao());
	 System.out.println(residencia.getSubcategoria().getDescricao());
	 
	// Testando setar descrição
	residencia.setDescricao("Telecomunicações");
	System.out.println(residencia.getDescricao());
	
	// Testando setar subcategoria
	residencia.setSubcategoria(internet);
	System.out.println(residencia.getSubcategoria().getDescricao());


	//Testando execeção
	residencia.setDescricao("");
	 
}
}