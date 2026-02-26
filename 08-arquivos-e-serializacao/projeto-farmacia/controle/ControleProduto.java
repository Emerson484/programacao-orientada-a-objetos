package pratica_11.controle;

import java.util.List;
import pratica_11.modelo.Produto;
import pratica_11.modelo.RepositorioProduto;

public class ControleProduto
{
    RepositorioProduto rp = new RepositorioProduto();
    
    public void cadastraProduto (int codigo, String descricao, double valor){
     //criar o objeto produto e chamar o método do repositório para salvar o produto
    	Produto p= new Produto();
    	p.setCodigo(codigo);
    	p.setDescricao(descricao);
    	p.setValor(valor);
    	rp.salvarProduto(p);
    }
    
    public List<Produto> listarProduto(){
        //retorna uma lista com todos os produtos
    	return rp.listarProduto();
    }
    
    public Produto pesquisarProduto (int codigo){
        //retorna o produto com o código indicado
    	return rp.lerProduto(codigo);
    }
}  
