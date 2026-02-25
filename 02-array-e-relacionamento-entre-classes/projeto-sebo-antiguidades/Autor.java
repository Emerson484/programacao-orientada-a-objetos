package pratica4;
/*Uma biblioteca deseja controlar os empréstimos de livros. Foi criado um diagrama de classe abaixo para 
representar a biblioteca. Cada empréstimo está relacionado a um usuário e a um único livro. Um usuário pode 
realizar vários empréstimos.
Implemente as classes livro, usuário e empréstimo de acordo com o diagrama.
l Defina atributos e métodos para as classes;
l Encapsule o estado dos objetos;
l Defina construtores;
l Defina os métodos set e get necessários;
l Escreva um programa principal que permita cadastrar livro, pesquisar livro pelo título e cadastrar cliente 
e realizar empréstimo.
*/


public class Autor {
	private String nome;
	private String sobrenome;
	private int anoNascimento;
	
	// construtor 
	Autor(String nome,String sobrenome,int anoNascimento){
		this.nome=nome;
		this.sobrenome=sobrenome;
		this.anoNascimento=anoNascimento;
	}
	
	// metodos get e set

	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getSobrenome() {
		return sobrenome;
	}
	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}
	public int getNomeNascimento() {
		return anoNascimento;
	}
	public void setNomeNascimento(int nomeNascimento) {
		this.anoNascimento = nomeNascimento;
	}
	
	

}
