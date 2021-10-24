package testes;
import republica.Subcategoria;

class  Demo
{
private static Subcategoria luz;
static                  //static block
{




}
public static void main(String args[]) throws Exception  //static method
{
	//Testando criação da classe

	 luz = new Subcategoria("Conta de luz");
	 System.out.println(luz.getDescricao());

	// Testando setar descrição
	 luz.setDescricao("agua");
	 System.out.println(luz.getDescricao());


	//Testando execeção
	 luz.setDescricao("");
	 System.out.println(luz.getDescricao());
}
}
