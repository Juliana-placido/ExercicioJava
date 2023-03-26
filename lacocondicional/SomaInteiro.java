package Generation;
import java.util.Scanner;

public class SomaInteiro {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);
		
		System.out.print("Digite o valor de A: ");
		int a = leia.nextInt();
		
		System.out.print("Digite o valor de B: ");
		int b = leia.nextInt();
		
		System.out.print("Digite o valor de C: ");
		int c = leia.nextInt();
		
		if(a + b > c) {
			System.out.println("a soma de A e B é maior do que C");
		}else if(a + b < c) {
			System.out.println("a soma de A e B é menor do que C");
		}else {
			System.out.println("A soma de A e B é igual a C");
		}
		
	}

}