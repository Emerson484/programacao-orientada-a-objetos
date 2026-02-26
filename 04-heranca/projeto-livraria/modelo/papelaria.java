package pratica7.modelo;

public class Papelaria extends Produto {
	private String descricao;
	private String fabricante;
	
	//construtor com atributos da classe mae e filha
	public Papelaria(String nome, double custo,String descricao,String fabricante){
		super(nome,custo);
		this.descricao=descricao;
		this.fabricante=fabricante;
	}
	//construtor vazio da classe filha
	public Papelaria(){
		super();
	}
    //metodos get e set
	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public String getFabricante() {
		return fabricante;
	}

	public void setFabricante(String fabricante) {
		this.fabricante = fabricante;
	}
	//Implementar o método calcularPreco nas classes Livro e Papelaria. os produtos do tipo papelaria tem 100% de acréscimo.
	public double calcularPreco() {
	    	return super.getCusto()*2;
	}
	/*Implementar nas classe filhas de produto o método toString que retorna os dados do produto, os dados específicos de cada classe
    e o valor de venda, esse método deve chamar o toString da classe Produto. */
    public String toString() {
	   	return super.toString()+"\n"+
	              "descricao: "+descricao+"\n"+
	   		      "fabricante: "+fabricante+"\n"+
	              "valor de venda: "+calcularPreco();
   }
}
