package Generation.Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ListasCores {

    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        ArrayList<String> cores = new ArrayList<String>();

        for (int i = 1; i <= 5; i++) {
            System.out.print("Digite a cor " + i + ": ");
            String cor = leia.nextLine();
            cores.add(cor);
        }

        System.out.println("Listar todas as cores:");

        for (String cor : cores) {
            System.out.println(cor);
        }

        Collections.sort(cores);

        System.out.println("\nOrdenar as cores:");

        String format = "| %-10s |%n";
        System.out.format("+------------+%n");
        System.out.format("|   Cores    |%n");
        System.out.format("+------------+%n");

        for (String cor : cores) {
            System.out.format(format, cor);
        }

        System.out.format("+------------+%n");
    }
}
