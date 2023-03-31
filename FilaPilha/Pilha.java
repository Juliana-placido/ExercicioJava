package Generation.FilaPilha;
import java.util.Scanner;
import java.util.Stack;

public class Pilha {

    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        Stack<String> pilha = new Stack<>();

        while (true) {
            System.out.println("\nMenu:\n1: Adicionar um novo livro na pilha.\n2: Listar todos os livros da Pilha.\n3: Retirar um livro da pilha.\n0: Sair.\n");
            System.out.print("Digite uma opção: ");
            int opcao = leia.nextInt();
            leia.nextLine();

            switch (opcao) {
                case 1:
                    System.out.print("\nDigite o nome do livro: ");
                    String livro = leia.nextLine();
                    pilha.push(livro);
                    System.out.println("\nPilha:\n" + livro + "\nLivro adicionado!\n");
                    break;
                case 2:
                    System.out.println("\nLista de Livros na Pilha:\n");
                    if (pilha.empty()) {
                        System.out.println("A pilha está vazia!\n");
                    } else {
                        System.out.printf("%-4s%s\n", "Posição", "Livro");
                        for (int i = pilha.size() - 1; i >= 0; i--) {
                            System.out.printf("%-4d%s\n", i + 1, pilha.get(i));
                        }
                    }
                    break;
                case 3:
                    if (pilha.empty()) {
                        System.out.println("\nA Pilha está vazia!\n");
                    } else {
                        String livroRetirado = pilha.pop();
                        System.out.println("\nPilha:\n" + String.format("%-20s\n\n", livroRetirado) + "Um livro foi retirado da pilha!\n");
                    }
                    break;
                case 0:
                    System.out.println("\nPrograma Finalizado!\n");
                    System.exit(0);
                default:
                    System.out.println("\nOpção inválida!\n");
            }
        }
    }
}

