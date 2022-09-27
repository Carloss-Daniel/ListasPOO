package exercicio5;
import java.util.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws ParseException {
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

		System.out.println("Digite os Dados do Cliente:");
		System.out.print("Nome: ");
		String nome = sc.nextLine();
		System.out.print("Email: ");
		String email = sc.next();
		System.out.print("Data de Nasimento (DD/MM/YYYY): ");
		Date dataNascimento = sdf.parse(sc.next());
		
		Cliente cliente = new Cliente(nome, email, dataNascimento);
		
		System.out.println("Digite os Dados da Ordem:");
		System.out.print("Status Pagamento_Pendente/ Processamento,\r\n"
				+ "	Enviado/ Entregue: ");
		StatusOrdem status = StatusOrdem.valueOf(sc.next());
		
		Ordem ordem = new Ordem( new Date(), status, cliente);
		
		System.out.print("Quantos itens para esta ordem? ");
		int n = sc.nextInt();
		for (int i=1; i<=n; i++) {
			System.out.println("Enter #" + i + " item data:");
			System.out.print("Nome do Produto: ");
			sc.nextLine();
			String produtoNome = sc.nextLine();
			System.out.print("Preço do Produto: ");
			double produtoPreço = sc.nextDouble();

			Produto produto = new Produto(produtoNome, produtoPreço);

			System.out.print("Quantidade: ");
			int quantidade = sc.nextInt();

			OrdemItem item = new OrdemItem(quantidade, produtoPreço, produto); 

			ordem.adicionarItem(item);
		}
		
		System.out.println();
		System.out.println("Resumo da Ordem:");
		System.out.println(ordem);
		
		sc.close();
		
		
	}

}
