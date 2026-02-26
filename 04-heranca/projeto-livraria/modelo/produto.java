package pratica7.modelo;

public class Produto {
	//atributos
	private int codigo;
	private String nome;
	private double custo;
	private static int cont;
	
	//construtor da classe mae
	public Produto(String nome, double custo) {
		this.codigo = cont++;
		this.nome = nome;
		this.custo = custo;
	}
   //construtor vazio
	public Produto() {
		
	}
	//metodos get e set

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getCusto() {
		return custo;
	}

	public void setCusto(double custo) {
		this.custo = custo;
	}
	//Implementar método calcularPreco que retorna o preço de custo do produto mais 20%. 
    public double calcularPreco() {
    	return custo*1.2;
    }
    //Implementar na classe Produto o método toString que retorna uma string com os dados do produtos.
    public String toString () {
    	return  "nome: "+nome+"\n"+
                "codigo: "+codigo+"\n"+
    			"custo: "+custo;
    }
	
	
	

}
