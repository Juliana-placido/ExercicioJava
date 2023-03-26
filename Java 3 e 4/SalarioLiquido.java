package Generation;
import java.util.Scanner; 
public class SalarioLiquido {
	 public static void main(String[] args) {
	        float salarioBruto, adicionalNoturno, horasExtras, descontos, salarioLiquido;
	        Scanner scanner = new Scanner(System.in);

	        System.out.print("Digite o salário bruto: ");
	        salarioBruto = scanner.nextFloat();

	        System.out.print("Digite o valor do adicional noturno: ");
	        adicionalNoturno = scanner.nextFloat();

	        System.out.print("Digite o valor das horas extras: ");
	        horasExtras = scanner.nextFloat();

	        System.out.print("Digite o valor dos descontos: ");
	        descontos = scanner.nextFloat();

	        salarioLiquido = salarioBruto + adicionalNoturno + horasExtras - descontos;
	        System.out.println("O salário líquido é: " + salarioLiquido);

	        scanner.close();

}
}