package pratica9;
/*  Alterar a classe CarrinhoCompra para manipular IProduto. Como IProduto 
 * não conheceaplicaDesconto, o código não compila. Comente o método aplicarDesconto paraaclassecompilar. 
 */

//Classe CarrinhoCompras
import java.util.ArrayList;
public class CarrinhoCompras {
  ArrayList <IProduto> produtos = new ArrayList<>(); // lista de Objetos que implementam a interface IProduto
  
  public void adicionar(IProduto l){
      produtos.add(l);
  }
  
 // Descomentar o método aplicarDesconto da classe CarrinhoCompra e alterá-lo parareceberumIPromocional 
  public boolean aplicarDesconto (IPromocional p, double desconto){
	  return p.aplicaDesconto(desconto); 
  } 

  /*public boolean aplicarDesconto (IProduto l, double desconto){
	      return l.aplicaDesconto(desconto);
  }*/
  
  public double getTotal (){
      double total =0;
      for (IProduto l: produtos){
          total += l.getValor();
      }
      return total;
  }  
}
