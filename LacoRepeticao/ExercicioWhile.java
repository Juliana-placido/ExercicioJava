package Generation.LacoRepeticao;
import java.util.Scanner;

public class ExercicioWhile {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
        int idade, sexo, categoria;
        int backend = 0, mulheresFrontend = 0, homensMobileMaiores40 = 0, mulheresFullstackMenores30 = 0;
        char continuar = 'S';

        while (continuar == 'S') {
            System.out.print("Informe a idade do colaborador: ");
            idade = leia.nextInt();

            System.out.print("Informe o sexo do colaborador (1-Masculino, 2-Feminino, 3-Outros): ");
            sexo = leia.nextInt();

            System.out.print("Informe a categoria do colaborador (1-Backend, 2-Frontend, 3-Mobile, 4-Fullstack): ");
            categoria = leia.nextInt();

            if (categoria == 1) {
                backend++;
            } else if (categoria == 2 && sexo == 2) {
                mulheresFrontend++;
            } else if (categoria == 3 && sexo == 1 && idade > 40) {
                homensMobileMaiores40++;
            } else if (categoria == 4 && sexo == 2 && idade < 30) {
                mulheresFullstackMenores30++;
            }

            System.out.print("Deseja continuar a leitura dos dados de um novo colaborador? (S/N): ");
            continuar = leia.next().toUpperCase().charAt(0);
        }

        System.out.println("O número de pessoas desenvolvedoras Backend é: " + backend);
        System.out.println("O número de mulheres desenvolvedoras Frontend é: " + mulheresFrontend);
        System.out.println("O número de homens desenvolvedores Mobile maiores de 40 anos é: " + homensMobileMaiores40);
        System.out.println("O número de mulheres desenvolvedoras FullStack menores de 30 anos é: " + mulheresFullstackMenores30);
	}

}
