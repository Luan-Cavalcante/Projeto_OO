package testes;
import republica.Republica;
import republica.Pagamentos;
class  DemoRepublica
{
private static Republica rep;
static                  //static block
{


}
public static void main(String args[]) throws Exception  //static method
{
	//Testando criação da classe

	 rep = new Republica();

	 // Testando pagamentos igualitario
	 System.out.println("TESTANDO PAGAMENTOS IGUALITÁRIOS");

	 Pagamentos pag = rep.pagamentoIgualitario(10, 2021);


	 int n = pag.getListaResidentes().length;
	 System.out.println("Nome\tEmail\tValor a Pagar");

	 for (int i = 0;i < n;i++)
	 {

		 String str = String.format("%s\t%s\t%.2f",pag.getListaResidentes()[i].getNome(),pag.getListaResidentes()[i].getEmail(),pag.getListaPagamentos()[i]);
		 System.out.println(str);

	 }


	 // Testando pagamentos proporcional
	 pag = rep.pagamentoProporcional(10, 2021);
	 System.out.println("\n\nTESTANDO PAGAMENTOS PROPORCIONAL");
	 n = pag.getListaResidentes().length;

	 System.out.println("Nome\tEmail\tValor a Pagar");

	 for (int i = 0;i < n;i++)
	 {

		 String str = String.format("%s\t%s\t%.2f",pag.getListaResidentes()[i].getNome(),pag.getListaResidentes()[i].getEmail(),pag.getListaPagamentos()[i]);
		 System.out.println(str);

	 }



}
}
