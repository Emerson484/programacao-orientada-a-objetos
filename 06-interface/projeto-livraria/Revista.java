package pratica9;
/*de até 10%. Vamos alterar o projeto da livraria para adicionar os novos tipos de produtos
e) Criar a classe Revista com os atributos nome, descrição, valor e editora, métodos getters, setters e o
método aplicaDesconto*/

//Fazer as classes Livro e Revista implementarem a interface IProduto
public class Revista implements IPromocional,IProduto {
	 private String nome;
	 private String descricao;
	 private double valor;
	 private String editora;
	
	//construtor
	
	public Revista() {
		
	}
	public Revista(String nome, String descricao, double valor, String editora) {
		super();
		this.nome = nome;
		this.descricao = descricao;
		this.valor = valor;
		this.editora = editora;
	}
	//get e sets
	public String getEditora() {
		return editora;
	}
	public void setEditora(String editora) {
		this.editora = editora;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public double getValor() {
		return valor;
	}
	public void setValor(double valor) {
		this.valor = valor;
	}
	//alem disso uma revista podeter descontode até 10%. 
	public boolean aplicaDesconto(double porcentagem) {
		if(porcentagem>0.1) {
			return false;
		}else {
			 valor-=valor*porcentagem;
			 return true;
		}
		
	}
	
	
	

}
