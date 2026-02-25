package pratica4;

/*3 - Vamos refatorar nosso projeto Banco.

a) Criar a classe Cliente com base no diagrama de classe acima.
b) Alterar a classe Conta conforme diagrama acima. Lembre de colocar os métodos já implementados na
aula anterior (getters e setters, sacar, depositar, transferir, imprimir)
c) Implementar a classe Questao3 para cadastrar cliente e atender as alterações nas classes acima.*/

public class Cliente {
	private long cpf;
	private String nome;
	private String endereco;
	
	// construtores 
	public Cliente(String nome,long cpf) {
		this.nome=nome;
		this.cpf=cpf;
	}
	public Cliente(String nome,long cpf,String endereco) {
		this.nome=nome;
		this.cpf=cpf;
		this.endereco=endereco;
	}
	
	public Cliente(int cpf2, String nome2, String endereco2) {
		// TODO Auto-generated constructor stub
	}
	// metodos get e set
	public void setEndereco(String endereco) {
		this.endereco=endereco;
	}
    public String getNome() {
    	return nome;
    }
    public long getCpf () {
    	return cpf;
    }
    public String getEndereco() {
    	return endereco;
    }
    public String imprimir() {
    	return "nome = "+nome+
    			"cpf = "+cpf+
    			"endereco"+endereco;
    }
}
