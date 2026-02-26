/*Defina uma classe Java para representar um país. Um país é representado
através dos atributos: código (ex.: BRA), nome (ex.: Brasil), população (ex.:
193.946.886) e a sua dimensão em Km2 (ex.: 8.515.767,049); e dos seguintes
métodos:
Construtor que inicialize o código, o nome, a população e a dimensão do país;
 Métodos de acesso (getter/setter) para as propriedades código, nome,
população e dimensão do país;
 Um método que permita verificar se dois objetos representam o mesmo país.
Dois países são iguais se tiverem o mesmo código;
 Um método que retorne a densidade populacional do país
(população/dimensão);*/

package excerciciosRevisao;
/*Defina uma classe Java para representar um país. Um país é representado através dos atributos: código (ex.: BRA), nome (ex.: Brasil), população
 *  (ex.: 193.946.886) e a sua dimensão em Km2 (ex.: 8.515.767,049); e dos seguintes métodos: 
 */


public class Pais {
	private String codigo;
	private String nome;
	private long populacao;
	private long dimensao;
	
	// Construtor que inicialize o código, o nome, a população e a dimensão do país; 
	public Pais(String codigo,String nome,long populacao, long dimencao) {
		this.codigo=codigo;
		this.nome=nome;
		this.populacao=populacao;
		this.dimensao=dimencao;
		
	}
	public Pais() {
		
	}
	//Métodos de acesso (getter/setter) para as propriedades código, nome, população e dimensão do país; 
	public String getCodigo() {
		return codigo;
	}
	public void setCodigo(String codigo) {
		this.codigo=codigo;
	}
	public String getNome() {
		return nome;
	}
	public  void setNome(String nome) {
		this.nome=nome;
	}
	public long getPopulacao() {
		return populacao;
	}
	public void setPopulacao(long populacao) {
		this.populacao=populacao;	
	}
	public long getDimensao() {
		return dimensao;
	}
	public void setDimencao(long dimencao) {
		this.dimensao=dimencao;
	}
	//Um método que permita verificar se dois objetos representam o mesmo país. Dois países são iguais se tiverem o mesmo código; 
    public boolean ehIgual(Pais outroPais) {
    	if(this.codigo.equals(outroPais.codigo)) {//p1.ehIgual(Pais outroPais);
    		return true;
    	}else {
    		return false;
    	}
    }
    //Um método que retorne a densidade populacional do país (população/dimensão);
	public double calcularDensidadePopul() {
		return populacao/dimensao;
	}
}
