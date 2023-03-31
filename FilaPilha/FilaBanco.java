package Generation.FilaPilha;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class FilaBanco{

    public static void main(String[] args) {
        Queue<String> fila = new LinkedList<String>();
        Scanner leia = new Scanner(System.in);
        int opcao = -1;

        while (opcao != 0) {
            System.out.println("O que deseja fazer?:");
            System.out.println("***************************************");
            System.out.println("1: Adicionar um novo Cliente na fila.");
            System.out.println("2: Listar todos os Clientes na fila.");
            System.out.println("3: Chamar (retirar) uma pessoa da fila.");
            System.out.println("0: Sair do programa.");
            System.out.println("***************************************");

            System.out.print("Digite uma opção: ");
            opcao = leia.nextInt();
            leia.nextLine();

            switch (opcao) {
                case 1:
                    System.out.print("Digite o nome: ");
                    String nome = leia.nextLine();
                    fila.add(nome);
                    System.out.println("Cliente adicionado!");
                    break;
                case 2:
                    System.out.println("Lista de Clientes na Fila:");
                    System.out.format("%-20s %n", "------------------");
                    System.out.format("%-20s %n", "Nome do Cliente");
                    System.out.format("%-20s %n", "------------------");

                    if (fila.isEmpty()) {
                        System.out.println("A fila está vazia!");
                    } else {
                        for (String cliente : fila) {
                            System.out.format("%-20s %n", cliente);
                        }
                    }
                    break;
                case 3:
                    if (fila.isEmpty()) {
                        System.out.println("A fila está vazia!");
                    } else {
                        System.out.println("Fila antes de chamar o cliente: " + fila);

                        String clienteChamado = fila.poll();
                        System.out.println("Cliente chamado: " + clienteChamado);

                        System.out.println("Fila após chamar o cliente: " + fila);
                    }
                    break;
                case 0:
                    System.out.println("Programa finalizado!");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente!");
                    break;
            }
        }

        leia.close();
    }
}

