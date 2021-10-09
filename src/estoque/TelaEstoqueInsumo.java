package estoque;
import java.util.Scanner;

public class TelaEstoqueInsumo {
	
	
	public static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		opcoes();
		cadastrarInsumo();
		editarInsumo();
		consultarInsumo();
		excluirInsumo();
		
	}

	static insumo insumo = new insumo();

	static void opcoes() {

		int opcao;

		System.out.println("ESTOQUE\n");

		do {
			System.out.println("Opções para estoque. Opção desejada: ");
			System.out.println("====================================\n");
			System.out.println("0 - Voltar");
			System.out.println("1 - Cadastrar Insumo");
			System.out.println("2 - Editar Insumo");
			System.out.println("3 - Consultar Insumo");
			System.out.println("4 - Excluir Insumo");

			opcao = sc.nextInt();
			System.out.println("Voce escolheu a opção: " + opcao);
			switch (opcao) {
			case 0:
				System.out.println("Voltar para o menu");
				break;
			case 1:
				cadastrarInsumo();
				break;
			case 2:
				editarInsumo();
				break;
			case 3:
				consultarInsumo();
				break;
			case 4:
				excluirInsumo();
				break;
			default:
				System.out.println("Opção inválida " + opcao);
				break;
			}
		} while (opcao != 0);
	}

	public static void cadastrarInsumo() {
		System.out.println("Cadastrar insumo. Entre com os dados: ");
		System.out.println("=====================================\n");
		System.out.println("Código do Sistema: ");
		 insumo.codSistema = sc.nextInt();
		 System.out.println("Nome: ");
			insumo.nome = sc.next();

		System.out.println("Categoria: ");
		System.out.println("1- bebidas");
		System.out.println("2- carnes");
		System.out.println("3- condimentos");
		System.out.println("4- embalagens");
		System.out.println("5- frios");
		System.out.println("6- leites e derivados");
		System.out.println("7- liquidos");
		System.out.println("8- massas");
		System.out.println("9- verduras");
		System.out.println("10- outros");
		insumo.categoria = sc.nextByte();

		System.out.println("Preço de Custo: ");
		insumo.pCusto = sc.nextDouble();

		System.out.println("Medida: ");
		System.out.println("1- UN");
		System.out.println("2- KG");
		System.out.println("3- LT");
		insumo.medida = sc.nextByte();
                         
		System.out.println("Estoque Mínimo: ");
		insumo.estoqueM = sc.nextDouble();

		System.out.println("Estoque Atual: ");
		insumo.estoqueA = sc.nextDouble();

		System.out.println("Situação do Estoque: ");
		if (insumo.estoqueA >= insumo.estoqueM) {
			System.out.println("Regular");
		}else if (insumo.estoqueA < insumo.estoqueM) {
			System.out.println("Abaixo do Mínimo");
		}else if (insumo.estoqueA <= 0) {
			System.out.println("Negativo / Insuficiente");
		}
		

		System.out.println("\nINSUMO CADASTRADO COM SUCESSO!");
		System.out.println("================================================");
		System.out.println("Código do Sistema   : " + insumo.codSistema);
		System.out.println("Nome                : " + insumo.nome);
		System.out.println("Categoria           : " + insumo.categoria);
		System.out.println("Preço de Custo      : " + insumo.pCusto);
		System.out.println("Medida              : " + insumo.medida);
		System.out.println("Estoque Mínimo      : " + insumo.estoqueM);
		System.out.println("Estoque Atual       : " + insumo.estoqueA);
		System.out.println("Situação do Estoque : " + insumo.sitEstoque);
		System.out.println("================================================");
	}

	public static void editarInsumo() {
		System.out.println("Digite o número para alterar no cadastro do insumo: ");
		System.out.println("===================================================");
		System.out.println("1 - Código do Sistema");
		System.out.println("2 - Nome");
		System.out.println("3 - Categoria");
		System.out.println("4 - Preço de Custo");
		System.out.println("5 - Medida");
		System.out.println("6 - Estoque Mínimo");
		System.out.println("7 - Estoque Atual");
		System.out.println("8 - Situação do Estoque");

		int opcao = sc.nextInt();
		if (opcao == 1) {
			System.out.println("Código do Sistema: ");
			insumo.codSistema = sc.nextInt();
		} else if (opcao == 2) {
			System.out.println("Nome: ");
			insumo.nome = sc.nextLine();
		} else if (opcao == 3) {
			System.out.println("Categoria: ");
			System.out.println("1- bebidas");
			System.out.println("2- carnes");
			System.out.println("3- condimentos");
			System.out.println("4- embalagens");
			System.out.println("5- frios");
			System.out.println("6- leites e derivados");
			System.out.println("7- liquidos");
			System.out.println("8- massas");
			System.out.println("9- verduras");
			System.out.println("10- outros");
			insumo.categoria = sc.nextByte();
		} else if (opcao == 4) {
			System.out.println("Preço de Custo: ");
			insumo.pCusto = sc.nextDouble();
		} else if (opcao == 5) {
			System.out.println("Medida: ");
			System.out.println("1- UN");
			System.out.println("2- KG");
			System.out.println("3- LT");
			insumo.medida = sc.nextByte();
		} else if (opcao == 6) {
			System.out.println("Estoque Mínimo: ");
			insumo.estoqueM = sc.nextDouble();
		} else if (opcao == 7) {
			System.out.println("Estoque Atual: ");
			insumo.estoqueA = sc.nextDouble();
		} else if (opcao == 8) {
			System.out.println("Situação do Estoque: ");
			System.out.println("1- Regular");
			System.out.println("2- Abaixo do Mínimo");
			System.out.println("3- Negativo / Insuficiente");
			insumo.sitEstoque = sc.nextInt();
		}
	}


	public static void consultarInsumo() {
		System.out.println("\nInsumo cadastrado " + insumo.nome);
		System.out.println("==============================================");
		System.out.println("Código do Sistema   : " + insumo.codSistema);
		System.out.println("Categoria           : " + insumo.categoria);
		System.out.println("Preço de Custo      : " + insumo.pCusto);
		System.out.println("Medida              : " + insumo.medida);
		System.out.println("Estoque Mínimo      : " + insumo.estoqueM);
		System.out.println("Estoque Atual       : " + insumo.estoqueA);
		System.out.println("Situação do Estoque : " + insumo.sitEstoque);
		System.out.println("==============================================");
	}

	public static void excluirInsumo() {
		insumo.codSistema = 0;
		insumo.nome = "";
		insumo.categoria = 0;
		insumo.pCusto = 0;
		insumo.medida = 0;
		insumo.estoqueM = 0;
		insumo.estoqueA = 0;
		insumo.sitEstoque = 0;
	}
}



