package Generation.Poo;

public class TestaFuncionario {
    public static void main(String[] args) {
        Funcionario funcionario1 = new Funcionario("Gabriel Placido", "123.456.789-00", "Desenvolvedor BackEnd", 5000.00, false);
        Funcionario funcionario2 = new Funcionario("Juliana Lima", "111.222.333-44", "Desenvolvedora FullStack", 6500.00, true);

        funcionario1.visualizar();
        System.out.println();
        funcionario2.visualizar();
    }
}