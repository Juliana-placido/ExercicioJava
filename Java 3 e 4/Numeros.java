package Generation;
import java.util.Scanner;
public class Numeros {

	public static void main(String[] args) {
	     Scanner leia = new Scanner(System.in);

	        System.out.println("Digite o valor de n1:");
	        float n1 = leia.nextFloat();

	        System.out.println("Digite o valor de n2:");
	        float n2 = leia.nextFloat();

	        System.out.println("Digite o valor de n3:");
	        float n3 = leia.nextFloat();

	        System.out.println("Digite o valor de n4:");
	        float n4 = leia.nextFloat();

	        float produto1 = n1 * n2;
	        float produto2 = n3 * n4;
	        float diferenca = produto1 - produto2;

	        System.out.println("A diferença do produto entre n1 e n2 pelo produto entre n3 e n4 é: " + diferenca);

	        leia.close();

	}

}
