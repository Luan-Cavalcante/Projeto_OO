package app;
import republica.*;
import javax.swing.JOptionPane;
import java.util.ArrayList;
import java.util.List;

public class SGA {
	static List<Categoria> categorias = new ArrayList<Categoria>();
	static List<Despesa> despesas = new ArrayList<Despesa>();
	static List<Residente> residentes = new ArrayList<Residente>();
	
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
			if (descricaoSubcategoria == "") {
				System.out.println("Nao tem subcategoria");
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
	
	
	
	
	public static void main (String[] args) {
		int opcao = 0;
		
		
		do {
			String strOpcao = JOptionPane.showInputDialog("Escolha uma opção: \n"
					+ "1 - Cadastrar residente \n"
					+ "2 - Cadastrar despesa\n"
					+ "3 - Cadastrar categoria\n"
					+ "4 - Realizar pagamento\n"
					+ "0 - Sair do programa");
			opcao = Integer.parseInt(strOpcao);
			
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
						residentes.add(residente);
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
					descricao = JOptionPane.showInputDialog("Digite a descricao da despesa");
					categoria = inputCategoria();
					try {
						despesa = new Despesa(valor, data, descricao, categoria);
						despesas.add(despesa);
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
				// realizar pagamento
				break;
	
			case 0: 
				//sair do programa
				break;

			default:
				//Opcao invalida
				break;
			}
			
			
		}while(opcao!=0);
		
		// So para testar, imprimir todas despesas e categorias
		for (int i=0; i<categorias.size(); i++) {
			Categoria categoria = categorias.get(i);
			JOptionPane.showMessageDialog(null, categoria);
		}
		
		for (int i=0; i<despesas.size(); i++) {
			Despesa despesa = despesas.get(i);
			JOptionPane.showMessageDialog(null, despesa);
		}
		
		for (int i=0; i<residentes.size(); i++) {
			Residente residente = residentes.get(i);
			JOptionPane.showMessageDialog(null, residente);
		}
		
		
	}
}
