package Generation.LacoRepeticao;
import java.util.Scanner;

public class ExercicioDoWhile {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
        int numero, soma = 0;

        do {
            System.out.print("Digite um número inteiro ou 0 para sair: ");
            numero = leia.nextInt();

            if (numero > 0) {
                soma += numero;
            }
        } while (numero != 0);

        System.out.println("A soma dos números positivos digitados é: " + soma);
	}

}
