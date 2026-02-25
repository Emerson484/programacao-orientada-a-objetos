package pratica4;

public class Emprestimo {
	private long codigo;
	private static long gerarCodigo=0;
	private String data_emprestimo;
	private String data_Devolucao;
	private Usuario usuario;
	private Livro livro;
	
	// construtor
	Emprestimo(String data_emprestimo,String data_Devolucao,Usuario usuario,Livro livro){
		codigo=gerarCodigo++;
		this.data_emprestimo=data_emprestimo;
		this.data_Devolucao=data_Devolucao;
		this.usuario=usuario;
		this.livro=livro;
	}
	// metodos get e set
	public long getCodigo() {
		return codigo;
	}
	
	public String getData_emprestimo() {
		return data_emprestimo;
	}
	public void setData_emprestimo(String data_emprestimo) {
		this.data_emprestimo = data_emprestimo;
	}
	public String getData_Devolucao() {
		return data_Devolucao;
	}
	public void setData_Devolucao(String data_Devolucao) {
		this.data_Devolucao = data_Devolucao;
	}
	

	

}
