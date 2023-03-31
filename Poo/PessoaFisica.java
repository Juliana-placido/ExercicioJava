package Generation.Poo;

public class PessoaFisica {
	public class PessoaFisica extends Cliente {
	    private String cpf;

	    public PessoaFisica(int id, String nome, String endereco, String telefone, String cpf, String email) {
	        super(id, nome, endereco, telefone, email);
	        this.cpf = cpf;
	    }

	    // Métodos Get e Set para o atributo cpf
	    public String getCpf() {
	        return cpf;
	    }

	    public void setCpf(String cpf) {
	        this.cpf = cpf;
	    }

	    // Método visualizar que exibe todos os dados do objeto, incluindo o cpf
	    @Override
	    public void visualizar() {
	        super.visualizar();
	        System.out.println("CPF: " + cpf);
	    }
	}
}
