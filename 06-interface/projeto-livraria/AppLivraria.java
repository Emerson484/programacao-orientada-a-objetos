/*interface. 1 - Uma livraria precisa desenvolver um sistema para controle de vendas. Ela vende livros físicos, miniLivros
e ebooks. Sobre os livros é necessário saber nome, descrição, autor, ISBN, valor. Um livro físico precisa ser
impresso, por isso possui uma taxa de impressão que é 5% do valor do livro. Um ebook possui um
característica especifica, a marca d’água que é a forma de identificar discretamente o nome e e-mail do
dono daquele livro digital. Um ebook pode ter desconto de no máximo 30%, enquanto o livro físico pode
ter desconto de até 15%. Um um minilivro representa um livro mais enxuto e não tem desconto*/

package pratica9;

//Classe AppLivraria
public class AppLivraria {
  public static void main(String[] args) {
      CarrinhoCompras carrinho = new CarrinhoCompras();
      LivroFisico fisico = new LivroFisico() ;
      fisico.setNome("Java como programar");
      fisico.setValor(200);
      carrinho.adicionar(fisico);
      
      Ebook ebook = new Ebook();
      ebook.setNome("Java");
      ebook.setValor(55.5);
      carrinho.adicionar(ebook);

      System.out.println("Total do carrinho R$: " + carrinho.getTotal());
      
      Revista revista=new Revista();
      revista.setNome("algum nome ai");
      revista.setValor(100);
      carrinho.adicionar(revista);
  
     /* Salvar o projeto e Executar. O que aconteceu? Qual mudança precisou ser feita na classe principal?j) Alterar a classe principal para também
       adicionar revista ao carrinho 
      */
      
     /* como alteramos CarrinhoCompras pra trabalhar com Iproduto(que nao possui aplica desconto),o metodo aplicaDesconto se torna imconpativel.dessa
       forma,um jeito de resolver seria verificar se o Iproduto é uma instancia de um objeto que possui o aplicaDesconto,como Livro e Revista e fazer a
      * conversao
      public boolean aplicarDesconto (IProduto l, double desconto){
	  if(l instanceof Livro) {
		 return ((Livro)l).aplicaDesconto(desconto);	
	  }
	  else if(l instanceof Revista) {
		  return((Revista)l).aplicaDesconto(desconto);
	  }else {
		  return false;
	  }
  }
      */
  }
}
