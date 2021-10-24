package testes;
import republica.Pagamentos;
import republica.Residente;

class  DemoPagamentos
{
private static Pagamentos pagTest;
private static Residente resTest;
static                  //static block
{


}
public static void main(String args[]) throws Exception  //static method
{

	
//-------Criação dos vetores de teste---------------------------------------
	
	Residente res1 = new Residente("Jhonathan", "jhonatha@email.com", 1200);
	Residente res2 = new Residente("Pedro", "pedro@email.com", 500);
	Residente res3 = new Residente("Iago", "iago@email.com", 200);
	
	
	Residente[] listaResidentes = {res1,res2,res3};
	float[] listaPagamentos = {(float)1235.1,(float)60.090,(float) 450.12,};
//--------------------------------------------------------------------------

	
	System.out.println("Testando criação da classe pagamentos\n\n");
// Criação da Classe--------------------------------------------------------
	pagTest = new Pagamentos(listaResidentes, listaPagamentos);
	for (int i = 0;i<pagTest.getListaPagamentos().length;i++)
			{
				String str = String.format("Pagamento do Residente %s: %4.2f",pagTest.getListaResidentes()[i].getNome() ,pagTest.getListaPagamentos()[i]);
				System.out.println(str);
		
			}
//---------------------------------------------------------------------------

	System.out.println("\n\nTestando Setar lista de residentes\n\n");
//Setando Lista de Residentes------------------------------------------------
	Residente res0 = new Residente("Luan", "luan@email.com", 500);
	Residente[] listaResidentes_2 = {res1,res0,res3};
	pagTest.setListaResidentes(listaResidentes_2);
	for (int i = 0;i<pagTest.getListaPagamentos().length;i++)
	{
		String str = String.format("Pagamento do Residente %s: %4.2f",pagTest.getListaResidentes()[i].getNome() ,pagTest.getListaPagamentos()[i]);
		System.out.println(str);

	}
//-----------------------------------------------------------------------------
	
System.out.println("\n\nTestando Setar lista de pamentos\n\n");
//Setando lista de pagamentos------------------------------------------------
	float[] listaPagamentos_2 = {(float)0,(float)690,(float) 4};
	pagTest.setListaPagamentos(listaPagamentos_2);
	for (int i = 0;i<pagTest.getListaPagamentos().length;i++)
	{
		String str = String.format("Pagamento do Residente %s: %4.2f",pagTest.getListaResidentes()[i].getNome() ,pagTest.getListaPagamentos()[i]);
		System.out.println(str);

	}
//-----------------------------------------------------------------------------
	
		
System.out.println("\n\nTestando Execeção de número de residentes diferente de pagamentos\n\n");
//Setando lista de pagamentos------------------------------------------------
	float[] listaPagamentos_3 = {(float)0,(float)690};
	pagTest.setListaPagamentos(listaPagamentos_3);
	for (int i = 0;i<pagTest.getListaPagamentos().length;i++)
	{
		String str = String.format("Pagamento do Residente %s: %4.2f",pagTest.getListaResidentes()[i].getNome() ,pagTest.getListaPagamentos()[i]);
		System.out.println(str);

	}
//-----------------------------------------------------------------------------
		
				

}}
