package Generation.LacoRepeticao;
import java.util.Scanner;
public class ExercicioFor {

	
		 public static void main(String[] args) {
		        Scanner leia = new Scanner(System.in);
		        int numero, pares = 0, impares = 0;

		        System.out.println("Digite 10 numeros inteiros: ");

		        for (int i = 0; i < 10; i++) {
		            numero = leia.nextInt();

		            if (numero % 2 == 0) {
		                pares++;
		            } else {
		                impares++;
		            }
		        }

		        System.out.println("A quantidade de números pares é: " + pares);
		        System.out.println("A quantidade de números ímpares é: " + impares);
		    }


	}

}
