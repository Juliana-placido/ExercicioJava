package Generation.Switch;
import java.util.Scanner;

public class Numero {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        float numero1 = leia.nextFloat();

        System.out.print("Digite o segundo número: ");
        float numero2 = leia.nextFloat();

        System.out.print("Digite o código da operação matemática (1- Soma, 2 - Subtração, 3 - Multiplicação e  4 - Divisão): ");
        int operacao = leia.nextInt();

        float resultado;

        switch (operacao) {
            case 1:
                resultado = numero1 + numero2;
                System.out.printf("O resultado da soma é %.2f\n", resultado);
                break;
            case 2:
                resultado = numero1 - numero2;
                System.out.printf("O resultado da subtração é %.2f\n", resultado);
                break;
            case 3:
                resultado = numero1 * numero2;
                System.out.printf("O resultado da multiplicação é %.2f\n", resultado);
                break;
            case 4:
                resultado = numero1 / numero2;
                System.out.printf("O resultado da divisão é %.2f\n", resultado);
                break;
            default:
                System.out.println("Operação Inválida!!!!!");
        }
	}

}
