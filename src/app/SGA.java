package app;
import republica.*;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import java.util.ArrayList;
import java.util.List;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;


public class SGA {
	static List<Categoria> categorias = new ArrayList<Categoria>();
	static List<Despesa> despesas = new ArrayList<Despesa>();
	private static Republica republica;
	private static Data inputData() {
		Data data;
		int mes, ano;
		while(true) {
			mes = Integer.parseInt(JOptionPane.showInputDialog("Digite o mês de vencimento da despesa"));
			ano = Integer.parseInt(JOptionPane.showInputDialog("Digite o ano de vencimento da despesa"));
			try {
				data = new Data(mes, ano);
				break;
			} catch(Throwable e) {
				JOptionPane.showMessageDialog(null, "Data inválida, tente novamente");
			}
		}
		return data;
	}
	

	private static void imprimirTabela( Pagamentos pagmentos) {
		
		
		String cabecalho = "Nome\tEmail\tValor a Pagar\n";
		Object[] cols = {
			    "Nome","Email","Valor a Pagar"
			};
		String tabela = cabecalho;
		int len = pagmentos.getListaResidentes().length;
		DefaultTableModel model = new DefaultTableModel(); 
		
		model.addColumn("Nome"); 
		model.addColumn("Email"); 
		model.addColumn("Valor a Pagar");
		float valor_total = 0;
		for (int i =0;i < len;i++)
			
		{
			String valor = String.format("R$ %.2f\n",pagmentos.getListaPagamentos()[i]);
			model.addRow(new Object[]{pagmentos.getListaResidentes()[i].getNome(), pagmentos.getListaResidentes()[i].getEmail(),valor});
			valor_total = valor_total + pagmentos.getListaPagamentos()[i];
		}
		
		String valor = String.format("R$ %.2f\n",valor_total);
		model.addRow(new Object[]{"", "VALOR TOTAL",valor});

		JTable tabela_pagamentos  =new JTable(model);
		JOptionPane.showMessageDialog(null, new JScrollPane(tabela_pagamentos));
		
		
	}
	
	
	
	private static float inputValor() {
		float valor;
		while(true) {
			
			try {
				valor = Float.parseFloat(JOptionPane.showInputDialog("Digite o valor"));
				break;
			} catch(Throwable e) {
				JOptionPane.showMessageDialog(null, "Valor inválido, tente novamente");
			}
		}
		return valor;
	}
	
	private static Categoria createCategoria() {
		Categoria categoria;
		Subcategoria subcategoria;
		String descricaoCategoria;
		String descricaoSubcategoria;
		while(true) {
			descricaoCategoria = JOptionPane.showInputDialog("Digite a descrição da categoria criada");
			descricaoSubcategoria = JOptionPane.showInputDialog("Digite a descrição da subcategoria\n"
					+ "(se não houver subcategoria, aperte apenas enter)");
			if (descricaoSubcategoria.isEmpty()) {
				try {
					categoria = new Categoria(descricaoCategoria);
					break;
				} catch(Throwable e) {
					JOptionPane.showMessageDialog(null, "Valor inválido, tente novamente");
				}
			} else {
				try {
					subcategoria = new Subcategoria(descricaoSubcategoria);
					categoria = new Categoria(descricaoCategoria, subcategoria);
					break;
				} catch(Throwable e) {
					JOptionPane.showMessageDialog(null, "Valor inválido, tente novamente");
				}
			}
		
		}
		
		return categoria;
		
	}
	
	
	private static Categoria inputCategoria() {
		Categoria categoria;
		int categoriaEscolhida;
		String opcoesCategorias = "Escolha uma das categorias abaixo, usando sua numeração:\n"
				+ "Caso queira criar uma nova categoria, digite -1\n\n";
		
		for (int i=0; i<categorias.size(); i++) {
			categoria = categorias.get(i);
			opcoesCategorias = opcoesCategorias + i +" - Categoria: " +categoria.getDescricao();
			if (categoria.getSubcategoria() != null) {
				opcoesCategorias = opcoesCategorias + " Subcategoria: " +categoria.getSubcategoria().getDescricao();
			}
				opcoesCategorias = opcoesCategorias + '\n';
		}
		
		while(true) {
			categoriaEscolhida = Integer.parseInt(JOptionPane.showInputDialog(opcoesCategorias));
			if (categoriaEscolhida == -1) {
				categoria = createCategoria();
				categorias.add(categoria);
				break;
			} else if (categoriaEscolhida >=0 && categoriaEscolhida < categorias.size()) {
				categoria = categorias.get(categoriaEscolhida);
				break;
			}
		}
		
		return categoria;
	}
	
	
	
	
	public static void main (String[] args) throws Exception {
		int opcao = 0;
		
		
		do {
			String strOpcao = JOptionPane.showInputDialog("Escolha uma opção: \n"
					+ "1 - Cadastrar residente \n"
					+ "2 - Cadastrar despesa\n"
					+ "3 - Cadastrar categoria\n"
					+ "4 - Realizar pagamento\n"
					+ "0 - Sair do programa");
			opcao = Integer.parseInt(strOpcao);
			
			Republica republica = new Republica();
			switch (opcao) {
			case 1:
				//cadastrar residente
				Residente residente;
				String nome;
				String email;
				float rendimentos;
				
				while(true) {
				
					nome = JOptionPane.showInputDialog("Digite o nome do residente");
					email = JOptionPane.showInputDialog("Digite o email do residente");
					rendimentos = inputValor();
					try {
						residente = new Residente(nome, email, rendimentos);
						republica.addResidente(residente);
						break;
					} catch (Throwable e) {
						JOptionPane.showMessageDialog(null, "Dados do residente inválidos, tente novamente");
					}
				}

				break;
			case 2: 
				//cadastrar despesa
				float valor;
				Data data;
				Categoria categoria;
				Despesa despesa;
				String descricao;
				
				while(true) {
				
					data = inputData();
					valor = inputValor();
					descricao = JOptionPane.showInputDialog("Digite o nome do credor da despesa");
					categoria = inputCategoria();
					try {
						despesa = new Despesa(valor, data, descricao, categoria);
						republica.addDespesa(despesa);
						break;
					} catch (Throwable e) {
						JOptionPane.showMessageDialog(null, "Valor inválido, tente novamente");
					}
				}
				
				break;

			case 3: 
				//cadastrar categoria
				Categoria cat;
				cat = createCategoria();
				System.out.print(cat);
				categorias.add(cat);
				break;
	
			case 4:
				
				String strOpcao_pag = JOptionPane.showInputDialog("Escolha uma opção de pagamento: \n"
						+ "1 - Pagamento Igualitário \n"
						+ "2 - Pagamento Proporcional\n"
						+ "0 - Voltar");
				int opcao_pag = Integer.parseInt(strOpcao_pag);
				
				switch(opcao_pag)
				{

					case 1:
						Data data_file_i = inputData();	
						int mes_i = data_file_i.getMes();
						int ano_i = data_file_i.getAno();
						
						try {
							Pagamentos pagIgualitario = republica.pagamentoIgualitario(mes_i,ano_i);
							imprimirTabela(pagIgualitario);
							break;
						} catch(Throwable e) {
							JOptionPane.showMessageDialog(null, "O arquivo não foi encontrado. Tenha certeza de ter cadastrado despesas nessa data anteriormente...");
						}
						
						
						break;
					case 2:
						Data data_file_p = inputData();	
						int mes_p = data_file_p.getMes();
						int ano_p = data_file_p.getAno();
						
						try {
							Pagamentos pagProporcional = republica.pagamentoProporcional(mes_p, ano_p);
							imprimirTabela(pagProporcional);
							break;
						} catch(Throwable e) {
							JOptionPane.showMessageDialog(null, "O arquivo não foi encontrado. Tenha certeza de ter cadastrado despesas nessa data anteriormente...");
						}
					

						
						break;
					case 0:
						break;
				}

				break;
	
			case 0: 
				//sair do programa
				break;

			default:
				//Opcao invalida
				break;
			}
			
			
		}while(opcao!=0);
		

		
	}
}
