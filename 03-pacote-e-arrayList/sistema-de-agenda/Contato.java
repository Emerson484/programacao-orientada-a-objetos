package excerciciosRevisao;
/* O sistema de agenda deve manter uma lista de contatos. Um contato padrão
tem: nome, e-mail, telefone, endereço e data do aniversário. Porém o contato
pode ser enquadrado como de algum tipo específico: geral, cliente ou
fornecedor. Implemente o programa da agenda que deve manter um menu de
opções do programa: incluir contato (acrescenta numa lista de contatos), excluir
contato (retirar da lista), listar contatos, consulta dados de um contato e sair.*/

/* O sistema de agenda deve manter uma lista de contatos. Um contato padrão tem: nome, e-mail, telefone, endereço e data do aniversário. Porém 
 * o contato pode ser enquadrado como de algum tipo específico: geral, cliente ou fornecedor. 
 */



public class Contato {
	private String nome;
	private String email;
	private String endereco;
	private long telefone;
	private String dataAniversario;
	//private String tipo;
	
	
	
	public Contato(String nome, long telefone) {
		super();
		this.nome = nome;
		this.telefone = telefone;
	}

	public Contato(String nome, String email, String endereco, long telefone, String dataAniversario) {
		super();
		this.nome = nome;
		this.email = email;
		this.endereco = endereco;
		this.telefone = telefone;
		this.dataAniversario = dataAniversario;
		//this.tipo = tipo;
	}
	
	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public String getEndereco() {
		return endereco;
	}


	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}


	public long getTelefone() {
		return telefone;
	}


	public void setTelefone(long telefone) {
		this.telefone = telefone;
	}


	public String getDataAniversario() {
		return dataAniversario;
	}


	public void setDataAniversario(String dataAniversario) {
		this.dataAniversario = dataAniversario;
	}

    //metodo imprimir
	public void imprimir() {
		System.out.println("nome:"+nome+"\n");
		System.out.println("aniversario"+dataAniversario+"\n");
		System.out.println("endereco"+endereco+"\n");
		System.out.println("telefone"+telefone+"\n");
		System.out.println("email"+email+"\n");
		
	}

	//metodo para verificar tipo
	public boolean verificarTipo(String tipo) {
		if(tipo!="geral"&&tipo!="cliente"&&tipo!="fornecedor") {
			return false;
		}else {
			return true;
		}
	}

}
