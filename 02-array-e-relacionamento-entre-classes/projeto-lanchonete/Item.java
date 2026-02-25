package pratica4;

public class Item {
	Produto produto;
	int quantidade;
	
	// construtor com produto como parametro
	Item (Produto produto){
		this.produto=produto;
		//this.quantidade=0;
	}
	
	
	public void setQuantidade(int quantidade){ 
	//Só atualiza a quantidade do item se tiver a quantidade indicada no estoque do produto 
		if(produto.getEstoque()>=quantidade) {
			this.quantidade=quantidade;
			produto.comprarProduto(quantidade);
		}else {
			System.out.println("quantidade maior que o estoque");
		}
	     
	    }
	    public int getQuantidade(){
	    	return quantidade;
	    	
	       
	    }
	    public Produto getProduto(){
	    	return produto;
	        
	    }
	    public double calcularSubTotal(){//quantidade x preço do produto
	        return  produto.getValor()*quantidade;
	    }

}
/*⦁	Criar a classe Item. Um item representa um produto e sua quantidade em um pedido. 
⦁	Defina um construtor que recebe como parâmetro um produto
⦁	Defina os métodos abaixo*/
