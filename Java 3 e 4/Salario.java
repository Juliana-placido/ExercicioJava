package Generation;

import java.util.Scanner;

public class Salario {

	public static void main(String[] args) {
		double salario, abono, soma;
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite o valor do salário: ");
		salario = leia.nextFloat();
		
		System.out.println("Digite o valor do abono: ");
		abono = leia.nextFloat();
		
		soma = salario + abono;
		
		System.out.println("O valor do salário com abono é:  " + soma);
		
		leia.close();
		
		
		

	}

}
