package Generation.lacocondicional;
import java.util.Scanner;

public class Doador {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);

        // Scanner lê o nome do doador e armazena na variavel nome
        System.out.print("Digite o nome do doador: ");
        String nome = leia.nextLine();

        //Scanner lê a idade do doador e armazena na variável idade
        System.out.print("Digite a idade do doador: ");
        int idade = leia.nextInt();

        // O Scanner lê se é a primeira doação do doador e armazena na variável primeira
        System.out.print("É a primeira doação do doador? (Digite true para 'sim' ou false para 'não'): ");
        boolean primeira = leia.nextBoolean();

        // Condição para verificar se o doador está apto ou não para doar sangue
        if (idade >= 18 && idade <= 69) {
            if (idade >= 60 && primeira) {
                System.out.println("O doador " + nome + " não está apto para doar sangue.");
            } else {
                System.out.println("O doador " + nome + " está apto para doar sangue.");
            }
        } else {
            System.out.println("O doador " + nome + " não está apto para doar sangue.");
        }

  
	}

}
