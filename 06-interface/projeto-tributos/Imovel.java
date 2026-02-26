package pratica9.atividade2;
/*4 - Criar a classe Imóvel que tem como atributos o valor, o tamanho e o endereço.
 Implemente o construtor, set e get.
 Faça a classe implementar a interface tributável. Quem tem imóvel precisa
pagar o IPTU que corresponde a 1% do valor do bem.*/
public class Imovel implements ITributavel {
	private double valor;
	private double tamanho;
	private String endereco;
	
	public Imovel(double valor, double tamanho, String endereco) {
		this.valor = valor;
		this.tamanho = tamanho;
		this.endereco = endereco;
	}
	public double getValor() {
		return valor;
	}
	public void setValor(double valor) {
		this.valor = valor;
	}
	public double getTamanho() {
		return tamanho;
	}
	public void setTamanho(double tamanho) {
		this.tamanho = tamanho;
	}
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	@Override
	public String getTipoImposto(){
		return "Iptu";
	}
	@Override
	public double getAliquota(){
		return 0.01;
	}
	@Override
	public double getValorImposto(){
		return getValor()*getAliquota();
	}

}
