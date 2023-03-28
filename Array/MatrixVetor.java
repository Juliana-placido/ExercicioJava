package Generation.Array;
import java.util.Scanner;

public class ExercicioVetor {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        int[] numeros = new int[10];
        for (int i = 0; i < 10; i++) {
            System.out.printf("Digite o %dº número inteiro: ", i+1);
            numeros[i] = leia.nextInt();
        }

        System.out.print("Elementos de índices ímpares do vetor: ");
        for (int i = 1; i < 10; i += 2) {
            System.out.print(numeros[i] + " ");
        }
        System.out.println();

        System.out.print("Elementos pares do vetor: ");
        for (int i = 0; i < 10; i++) {
            if (numeros[i] % 2 == 0) {
                System.out.print(numeros[i] + " ");
            }
        }
        System.out.println();

        int soma = 0;
        for (int i = 0; i < 10; i++) {
            soma += numeros[i];
        }
        System.out.println("A Soma dos elementos do vetor: " + soma);

        double media = (double) soma / 10;
        System.out.println("A Média dos elementos do vetor: " + media);

        leia.close();
    }
}

