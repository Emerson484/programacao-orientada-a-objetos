package pratica3;
/*1 - Altere a classe Veiculo para:
- Definir uma atributo de classe que controla a quantidade de veículos criados. 
- Definir construtores (pelo menos dois construtores).
- Definir os métodos get e set necessários.  
- Criar o método clone - o objeto clona a si próprio, para isto, ele cria um novo objeto da classe Veículo com os mesmos valores de atributos e retorna sua referência.
*/

public class Veiculo {
	private int quantidadeVeiculos;
	private String cor;
	private String modelo;
	
	// construtores
	public Veiculo() {
	}
    public Veiculo(int quantidadeVeiculos,String cor,String modelo) {
    	this.quantidadeVeiculos=quantidadeVeiculos;
    	this.cor=cor;
    	this.modelo=modelo;
    	quantidadeVeiculos+=1;
    }
    public Veiculo(String cor, String modelo) {
		this.cor = cor;
		this.modelo = modelo;
	}
    
    //metodos get e set
	public String getCor() {
    	return this.cor;
    }
    public void setCor(String cor) {
    	this.cor=cor;
    }
	public int getQuantidadeVeiculos() {
		return quantidadeVeiculos;
	}
	public void setQuantidadeVeiculos(int quantidadeVeiculos) {
		this.quantidadeVeiculos = quantidadeVeiculos;
	}
	
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	int quantidadeVeiculos() {
		return quantidadeVeiculos;
	}
	/* Criar o método clone - o objeto clona a si próprio, para isto, ele cria um novo objeto da classe Veículo
	 *  com os mesmos valores de atributos e retorna sua referência.
	 */
	public Veiculo Clone() {
		return new Veiculo( this.cor, this.modelo);
	}
	public String toString() {
		return "cor:" +cor+"\n"+"modelo"+modelo+"\n";
	}
}
