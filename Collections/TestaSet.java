package Generation.Collections;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.Iterator;

public class TestaSet {
    public static void main(String[] args) {

        Set<Integer> numeros = new HashSet<>();
        Scanner sc = new Scanner(System.in);

        // Solicita ao usuário 10 números inteiros não repetidos
        System.out.println("Digite 10 números inteiros não repetidos:");
        for (int i = 1; i <= 10; i++) {
            int num = sc.nextInt();
            numeros.add(num);
        }

        // Exibe todos os elementos da Collection Set utilizando um Iterator
        System.out.println("Elementos da Collection Set:");
        Iterator<Integer> iterator = numeros.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}



