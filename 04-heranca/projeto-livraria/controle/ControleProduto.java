/*
 - Uma livraria vende diferentes tipos de produtos e quer um sistema para controlar
suas vendas. Todo produto tem um código, um nome e um preço de custo. Um
produto pode ser do tipo livro ou papelaria. Para os produtos do tipo papelaria, é
importante saber a descrição e o fabricante. Para cada livro, é importante armazenar
o nome do autor e editora.package pratica7.controle;*/

//importacoes
import java.util.ArrayList;
import java.util.Scanner;

import pratica7.modelo.Produto;
import pratica7.modelo.Livro;
import pratica7.modelo.Papelaria;

public class ControleProduto {
	//No pacote controle, implementar a classe ControleProduto que tem como atributo uma lista de produtos
	ArrayList <Produto> produtos=new ArrayList<>();
	Scanner teclado=new Scanner(System.in);
	/*Esta classe deve conter métodos para:
	cadastrar um novo produto, este produto pode ser do tipo livro ou papelaria;*/
	
	//cadastrar produto livro
	public void cadastrarNovoProdutoLivro(String nome, double custo,String autor,String editora) { 
        // cria um objeto do tipo livro
		Livro novoLivro=new Livro(nome,custo,autor,editora);
		produtos.add(novoLivro);
		//imprimir codigo do produto
		System.out.println("o codigo e: "+novoLivro.getCodigo());
		
	}
	//cadastrar produto papelaria
	public void cadastrarNovoProdutoPapelaria(String nome, double custo,String descricao,String fabricante) { 
        // cria um objeto do tipo Papelaria
		Papelaria itemPapelaria=new Papelaria(nome ,custo,descricao,fabricante);
		produtos.add(itemPapelaria);
		//imprimir codigo do produto
				System.out.println("o codigo e: "+itemPapelaria.getCodigo());
		
	}
	
	//pesquisar através do código, recebe como parâmetro o código e retorna o produto
	public Produto pesquisarComCodigo(int codigoPesquisado) {
		for(Produto p:produtos) { //percorre a lista de produtos e verifica a existencia do produto atraves do codigo
			if(p.getCodigo()==codigoPesquisado){  
				return p;// se existir retorna o produto
			}	
		}
		return null; //caso nao exista retorna nulo
	}
	
	//pesquisar através do nome, recebe como parâmetro o nome do produto e retorna o produto 
	public Produto pesquisarNome(String nomePesquisado) {
		for(Produto p:produtos) {
			if(p.getNome().equals(nomePesquisado)) {//percorre a lista de produtos e verifica a existencia do produto atraves do nome
				return p; //se existir retorna o produto
			}
		}
		return null; //caso nao exista retorna nulo
			
	}
	//remover um produto, recebe com parâmetro o código do produto e remove da lista
	public void removerProduto(int codigoProduto) {
		for(Produto p:produtos) { //percorre a lista de produtos e verifica a existencia do produto atraves do codigo
			if(p.getCodigo()==codigoProduto) {
				produtos.remove(p);//se existir remove o produto
			}
			
		}	
	}
	//listar produtos que retorna um string com os dados de todos os produtos cadastrados.
	public String listarProdutos() {
		String listaProdutos="";
		listaProdutos+="os produtos sao:"+"\n";
		for(Produto p:produtos) { // percorre a lista de produtos e imprime as info com o toString
			listaProdutos+=p.toString();
		}
		return listaProdutos;
	}
}
