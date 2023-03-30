package Generation.Poo;

public class TestaCliente {
    public static void main(String[] args) {
        Cliente cliente1 = new Cliente(1, "Juliana Placido", "Rua Lençóis, 123", "(11) 1234-5678", "juliana@email.com");
        Cliente cliente2 = new Cliente(2, "Gabriel Placido", "Rua Lençois, 456", "(11) 1111-2222", "gabriel@email.com");

        cliente1.visualizar();
        System.out.println();
        cliente2.visualizar();
    }
}
