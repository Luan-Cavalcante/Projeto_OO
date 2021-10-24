package republica;
import java.util.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import republicaExceptions.*;
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
	    //	Despesa d = new Despesa(valor, data, descricao, categoria);
	      
	    }

	    public Pagamentos pagamentoIgualitario(int mes, int ano) throws Exception {
	    	
//	    	Esse metodo vai acessar os arquivos dos residentes e popular o vetor residente,
//	    	depois acessar os arquivos de despesas do mes e dividir o valor das despesas totais
//	    	pelo n�mero de residentes.
//	    	Popular o vetor pagamentosafazer com esse valor encontrado.
//	    	A main dever� receber o objeto pagamentos, acessar a lista residentes e pagamentos
//	    	(atributos da classe Pagamentos) e associar cada indice do vetor listaresidentes ao listapagamentos
//	    	para descobrir quanto cada residente devera pagar.
//	    



		//Execeções em casos de mes e ano invalidos
		if (mes < 1 || mes > 12)
		{
			throw new DataInvalidaException("O mês informado é inválido. O mês deve estar no intervalo: [1,12]");

		}

		if (ano < 0)
		{
			throw new DataInvalidaException("O ano deve ser um valor positivo");

		}



		// cria a string para acessar o arquivo
		String file_residentes = "data/residentes/alunos.txt";


			String file_depesas = String.format("data/despesas/despesas_%d_%d.txt",mes,ano);

			//Verifica se existe o arquivo do ano e mês e se existir cada linha do arquivo e faz o somatório das despesas
		    float valor_total = 0;

		    try {
		      Scanner despesas = new Scanner(new File(file_depesas));
		      despesas.useDelimiter("\n");
		      while (despesas.hasNext())
		      {

			  String[] linha = despesas.next().split(";");
			  String nameDespesa = linha[0];
			  String categoriaDespesa = linha[1];
			  float valorDespesa =  Float.parseFloat(linha[2]);
			  valor_total = valor_total + valorDespesa;
		      }
		      despesas.close();



		    } catch (FileNotFoundException e) {
		      System.out.println("O Arquivo do mês e ano informado não foi encontrado. Tenha certeza de ter cadastrado despesas para o mês e ano informado.");
		      e.printStackTrace();}


		    Residente[] listaResidentes = new Residente[0]; //Cria um vetor de residentes


		//Lê todos os residentes do arquivo e cria um vetor de residentes
		    try {
			      Scanner residente = new Scanner(new File(file_residentes));
			      residente.useDelimiter("\n");
			      while (residente.hasNext())
			      {

				  String[] linha = residente.next().split(";");
				  String nomeresidente = linha[0];
				  String emailresidente = linha[1];
				  float redimentoresidente =  Float.parseFloat(linha[2]);

				  Residente res = new Residente(nomeresidente, emailresidente, redimentoresidente);

				  Residente[] tempResidentes = new Residente[listaResidentes.length + 1];
						for (int i=0; i<listaResidentes.length; i++) {
							tempResidentes[i] = listaResidentes[i];
						}


						tempResidentes[listaResidentes.length] = res;
						listaResidentes = tempResidentes;

			      }
			      residente.close();


			    } catch (FileNotFoundException e) {
			      System.out.println("Ocorreu um erro ao abrir o arquivo dos residentes...");
			      e.printStackTrace();
			      }

		    //cria a lista de inteiros que cada residente deverá pagar

		    float[] valor_a_pagar = new float[listaResidentes.length];
			for (int i=0; i<valor_a_pagar.length; i++) {
				valor_a_pagar[i] = valor_total/valor_a_pagar.length;
			}


			//cria o objeto pagamentos
			Pagamentos pagmentoI = new Pagamentos(listaResidentes, valor_a_pagar);

			return pagmentoI;





	    	
	    }

	    public Pagamentos pagamentoProporcional(int mes, int ano) throws Exception{


//	    	Esse metodo vai acessar os arquivos dos residentes e popular o vetor residentes,
//	    	depois acessar os arquivos de despesas do mes e dividir  proporcionalmente o valor 
//	    	das despesas totais pelo n�mero de residentes de acordo com o rendimento.
//	    	Popular o vetor pagamentosafazer com esse valor encontrado para cada residente.
//	    	A main dever� receber o objeto pagamentos, acessar a lista residentes e pagamentos
//	    	(atributos da classe Pagamentos) e associar cada indice do vetor listaresidentes ao listapagamentos
//	    	para descobrir quanto cada residente devera pagar.
//	    


		//Execeções em casos de mes e ano invalidos
		if (mes < 1 || mes > 12)
		{
			throw new DataInvalidaException("O mês informado é inválido. O mês deve estar no intervalo: [1,12]");

		}

		if (ano < 0)
		{
			throw new DataInvalidaException("O ano deve ser um valor positivo");

		}



		// cria a string para acessar o arquivo
		String file_residentes = "data/residentes/alunos.txt";


			String file_depesas = String.format("data/despesas/despesas_%d_%d.txt",mes,ano);

			//Verifica se existe o arquivo do ano e mês e se existir cada linha do arquivo e faz o somatório das despesas
		    float valor_total = 0;

		    try {
		      Scanner despesas = new Scanner(new File(file_depesas));
		      despesas.useDelimiter("\n");
		      while (despesas.hasNext())
		      {

			  String[] linha = despesas.next().split(";");
			  String nameDespesa = linha[0];
			  String categoriaDespesa = linha[1];
			  float valorDespesa =  Float.parseFloat(linha[2]);
			  valor_total = valor_total + valorDespesa;
		      }
		      despesas.close();



		    } catch (FileNotFoundException e) {
		      System.out.println("O Arquivo do mês e ano informado não foi encontrado. Tenha certeza de ter cadastrado despesas para o mês e ano informado.");
		      e.printStackTrace();}


		    Residente[] listaResidentes = new Residente[0]; //Cria um vetor de residentes


		//Lê todos os residentes do arquivo e cria um vetor de residentes
		    try {
			      Scanner residente = new Scanner(new File(file_residentes));
			      residente.useDelimiter("\n");
			      while (residente.hasNext())
			      {

				  String[] linha = residente.next().split(";");
				  String nomeresidente = linha[0];
				  String emailresidente = linha[1];
				  float redimentoresidente =  Float.parseFloat(linha[2]);

				  Residente res = new Residente(nomeresidente, emailresidente, redimentoresidente);

				  Residente[] tempResidentes = new Residente[listaResidentes.length + 1];
						for (int i=0; i<listaResidentes.length; i++) {
							tempResidentes[i] = listaResidentes[i];
						}


						tempResidentes[listaResidentes.length] = res;
						listaResidentes = tempResidentes;

			      }
			      residente.close();


			    } catch (FileNotFoundException e) {
			      System.out.println("Ocorreu um erro ao abrir o arquivo dos residentes...");
			      e.printStackTrace();
			      }

		    //Calcula redimentos dos residentes total para fazer uma proporção
		    float redimentosRepublica = 0;
			for (int i=0; i<listaResidentes.length; i++) {
				redimentosRepublica = redimentosRepublica + listaResidentes[i].getRendimentos();

			}

		    //cria a lista de inteiros que cada residente deverá pagar

		    float[] valor_a_pagar = new float[listaResidentes.length];
			for (int i=0; i<valor_a_pagar.length; i++) {
				valor_a_pagar[i] = valor_total *(listaResidentes[i].getRendimentos()/redimentosRepublica)  ;
			}


			//cria o objeto pagamentos
			Pagamentos pagmentoP = new Pagamentos(listaResidentes, valor_a_pagar);
			return pagmentoP;


	}		    
}





