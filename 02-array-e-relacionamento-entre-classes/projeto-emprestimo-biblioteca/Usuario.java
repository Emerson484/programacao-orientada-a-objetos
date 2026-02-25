package pratica4;

public class Usuario {
	private String nome;
	private long cpf;
	private String endereco;
	private String profissao;
	
	//construtor
	Usuario (String nome){
		this.nome=nome;
	}
	
	//metodos get e set
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome=nome;
	}
	public long getCpf() {
		return cpf;
	}

	public void setCpf(long cpf2) {
		this.cpf = cpf2;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getProfissao() {
		return profissao;
	}

	public void setProfissao(String profissao) {
		this.profissao = profissao;
	}

}
