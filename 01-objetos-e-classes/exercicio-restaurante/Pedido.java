package pratica2;

import java.util.ArrayList; // pecas especifica de montar que obedece as instrucoes
import java.util.List; // instrucoes de um jogo de montar pecas

public class Pedido {
	List<Produto> produtos; /* list é usado para declarar o nome da variavel,assim a gente declarou um atributo
	chamado produtos que é uma lista de objetos produtos*/
	List<Integer> quantidades;/* integer é uma classe dos inteiros e usamos integer ao inves de int pois as 
	listas em java (list) so armazena objetos e integer e a versao objeto dos inteiros*/
	
	/* construtor para criar novos objetos da classe pedido e inicaiar atributos do objeto,nesse caso iniciamos
	 o array list produtos e quantidades como  listas vazia e inicia os atributos produtos e quantidades como 
	 instancias  de array list*/
	public Pedido(){
		produtos=new ArrayList<>(); // arralist é usado  para a lista em si
		quantidades= new ArrayList<>();
	}
	
	public void adicionarPedido(Produto Produto,int quantidade) {
		produtos.add(Produto); /*cada produto(objeto) que criar vai ser adicionado no array de objetos produtos
		,como por exemplo,hamburguer,coxinha,cachorro-quente*/
		quantidades.add(quantidade);
	}
	public double calcularTotal() {
		double total=0;
		
		for(int i=0;i<produtos.size();i++) {
			total+=produtos.get(i).preco*quantidades.get(i);/*primeiro o comando produtos.get(i).preco vai 
			acessar o indice i do array produtos e depois o atributo precos da posicao i*/
		}
		return total;
	}
	
}
