package pratica4;
/*
⦁	Criar o projeto
⦁	Criar a classe Produto conforme o código abaixo. Analise o código da classe Produto.
*/
public class Produto {
    private int codigo;
    private String nome;
	private String descricao;
    private String tipo;
    private double valor;
    private int estoque;
    private static int numProdutos=0;
   
    public int getCodigo() {
		return codigo;
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
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public double getValor() {
		return valor;
	}
	public void setValor(double valor) {
		this.valor = valor;
	}
	public int getEstoque() {
		return estoque;
	}
	
	public static int getNumProdutos() {
		return numProdutos;
	}
	public static void setNumProdutos(int numProdutos) {
		Produto.numProdutos = numProdutos;
	}
	
	public Produto(String nome){
       this.nome=nome;
       codigo = numProdutos++;
}
public Produto(String nome, double valor){
       this.nome=nome;
       this.valor=valor;
       codigo = numProdutos++;
}
 public Produto(String nome, double valor, int quantidade){
       this.nome=nome;
       this.valor=valor;
       this.estoque=quantidade;
       codigo = numProdutos++;
}
 
    public double getPreco(){
		return valor *2;
    }
    public boolean venderProduto(int qtd){
        boolean temProduto=false;
		if (estoque >= qtd){
            estoque = estoque - qtd;
            temProduto=true;
		}
        return temProduto;
    }
    public void comprarProduto(int qtd) {
        estoque -= qtd; // Reduz o estoque ao comprar (adicionar item ao pedido)
    }

public String imprimir (){
        return codigo + " - " + nome;
}
}



//Explique a diferença entre o atributo numProdutos e demais atributos da classe.

/*o codigo e um numero pra identificar o produto,o nome e o nome de um produto,a descricao sao os detalhes
 * do produto,o tipo e categoria,se e lanche ou bebida,o valor e o preco do produto,o estoque e a quantidade
 * disponivel daquele produto na lanchonete para vender e numProdudos e um atributo que pertence a classe e
 * conta quantos produtos foram criados,cada vez que  um produto novo é criado o  numProdutos é incrementado
 * e codigo recebe esse valor,sendo um valor unico 
 */

//⦁	Criar outros métodos get e set que julgar necessários.
/* nao coloquei o metodo set pro estoque pois ja tem um metodo para modifica-lo, assim como nao criei um metodo
 * set pro codigo,pois ja ha uma logica para gera lo.
 */

