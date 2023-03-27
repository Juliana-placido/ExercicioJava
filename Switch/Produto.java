package Generation.Switch;
import java.util.Scanner;

public class Produto {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);

        // Lê o código do produto e a quantidade comprada
        System.out.println("Bem Vindo a lanchonete da Juliana");
        System.out.print("Digite o código do produto de 1 a 6: ");
        int codigo = leia.nextInt();

        System.out.print("Digite a quantidade que deseja comprar: ");
        int quantidade = leia.nextInt();

        // Define o nome do produto e o preço unitário com base no código do produto
        String produto;
        double preco;

        switch (codigo) {
            case 1:
                produto = "Cachorro-quente";
                preco = 10.0;
                break;
            case 2:
                produto = "X-Salada";
                preco = 15.0;
                break;
            case 3:
                produto = "X-Bacon";
                preco = 18.0;
                break;
            case 4:
                produto = "Bauru";
                preco = 12.0;
                break;
            case 5:
                produto = "Refrigerante";
                preco = 8.0;
                break;
            case 6:
                produto = "Suco de Laranja";
                preco = 13.0;
                break;
            default:
                System.out.println("Código de produto inválido!");
                leia.close();
                return;
        }

        // Calcula o valor total da compra
        double total = quantidade * preco;


        String tabela = String.format("| %-20s | %10d | %10.2f | %12.2f |", produto, quantidade, preco, total);
        String separador = "+----------------------+------------+-------------+----------------+";
        String cabecalho = "|      Produto         | Quantidade | Preço unit. | Valor total    |";
        String mercado ="|                         Lanhonete da Juliana                       |";
        String mensagem = "|                Muito Obrigado e volte sempre :)                |";

        // Imprime a tabela na tela
        System.out.println(separador);
        System.out.println(mercado);
        System.out.println(separador);
        System.out.println(cabecalho);
        System.out.println(separador);
        System.out.println(tabela);
        System.out.println(separador);
        System.out.println(mensagem);
        System.out.println(separador);
	}

}
