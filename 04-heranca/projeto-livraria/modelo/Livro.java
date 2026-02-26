package pratica7.modelo;

public class Livro extends Produto{
	//atributos
	private String autor;
	private String editora;
	
	//construtor com atributos da classe mae e filha
	public Livro( String nome, double custo,String autor,String editora){
		super(nome,custo);
		this.autor=autor;
		this.editora=editora;
	}
	//construtor vazio da classe filha
	public Livro(){
		super();
	}
	//metodos get e set
	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public String getEditora() {
		return editora;
	}

	public void setEditora(String editora) {
		this.editora = editora;
	}
	//Implementar o método calcularPreco nas classes Livro e Papelaria. Os livros são vendido com 50% de acréscimo ao preço de custo 
	public double calcularPreco() {
    	return super.getCusto()*1.5;
    }
	/*Implementar nas classe filhas de produto o método toString que retorna os dados do produto, os dados específicos de cada classe
      e o valor de venda, esse método deve chamar o toString da classe Produto. */
    public String toString() {
    	return super.toString()+"\n"+
               "autor: "+autor+"\n"+
    		   "editora: "+editora+"\n"+
               "valor de venda: "+calcularPreco();
    }
}
