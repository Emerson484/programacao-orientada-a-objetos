package pratica9.atividade2;
/*5 - Criar a classe Profissional Autônomo, que tem os atributos nome, cpf, endereço,
remuneração.*/
public class ProfissionalAutonomo implements ITributavel{
	private String nome;
	private String cpf;
	private String endereco;
	private double remuneracao;
	
	//Implemente o construtor, set e get. Lembre que a remuneração podealterar.
    
	public ProfissionalAutonomo(String nome, String cpf, String endereco, double remuneracao) {
		this.nome = nome;
		this.cpf = cpf;
		this.endereco = endereco;
		this.remuneracao = remuneracao;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	public double getRemuneracao() {
		return remuneracao;
	}
	public void setRemuneracao(double remuneracao) {
		this.remuneracao = remuneracao;
	}
	/*Faça a classe implementar a interface tributável. Um profissional autônomo
	paga o INSS, 11% sobre a remuneração recebida até limite máximo do
	salário de contribuição ( teto - R$ 7.507,49)*/
	public String getTipoImposto() {
		return "INSS";
	}
	public double getAliquota() {
		return 0.11;
	}
	public double getValorImposto() {
		if(getRemuneracao()>7507.49) {
			return getAliquota()*7507.49;
		}else {
			return getRemuneracao()*getAliquota();
		}
		
	}
}
