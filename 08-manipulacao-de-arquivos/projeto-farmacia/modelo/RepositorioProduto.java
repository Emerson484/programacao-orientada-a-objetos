package pratica_11.modelo;

//importacoes 
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class RepositorioProduto {
	
 private final String nomeArquivo="produto.csv";
 File arquivo = new File (nomeArquivo);
 FileWriter fw = null;
 BufferedWriter bw = null;
 FileReader fr = null;
 BufferedReader br =null;
 
 /*Na classe RepositorioProduto, implementar o método salvarProduto que recebe como parâmetro um produto e armazena seus dados no arquivo na 
 ordem indicada abaixo. (Use as classe FileWriter e BufferedWriter)*/

 
  public void salvarProduto (Produto p) {
	  try {
		  fw= new FileWriter (arquivo,true);
		  bw = new BufferedWriter (fw);
		  bw.write(""+p.getCodigo());  
		  bw.write("\t"+p.getDescricao());// \t é tipo um tab, pra deixar espaco entre elementos
		  bw.write("\t"+(p.getValor())); /* como o metodo write so aceita String e char,colocamos "" pro java  ve que estamos juntando uma String 
		  e um double para automaricamente converter o double pra String*/
		 
		  bw.newLine();//pular linha
		//  101\tArroz\t5.99↵
		//  202\tFeijão\t8.49↵
	  }
	  catch(IOException e) { //tratar excecao
		   System.out.println(e.getMessage());
	  }
      finally { //fechar o BufferedWiter
    	  if(bw!=null) {
    		  try {
    			  bw.close();
    		  }
    		  catch(IOException e) { //tratar excecao
    			  System.out.println(e.getMessage());
    		  }
    		  
    	  }
      }
  }
 
  public List<Produto> listarProduto() {
      List<Produto> produtos = new ArrayList<>();
      try(Scanner sc = new Scanner(new FileReader(arquivo))) { 
    	  /*obs tava tendo problemas pra ler arquivos com o scanner pois ele separa os dados por espaco e isso causa alguns comportamentos inesperados
    	  entao delimitei os dados por meio de tabulacao(/t) e quebra de linha(//R);*/
    
    	  sc.useDelimiter("\t|\\R");
    	  	  
         while (sc.hasNext()){
             Produto p = new Produto();
             int codigo = sc.nextInt();
             String descricao = sc.next();
             double valor = (Double.parseDouble(sc.next()));
             p.setCodigo(codigo);
             p.setDescricao(descricao);
             p.setValor(valor);
             produtos.add(p);
         }
      }catch (FileNotFoundException ex){
          System.out.println("Erro na leitura do arquivo "+ nomeArquivo +ex.getMessage());
      }
      return produtos;
  }
  
  /*Na classe RepositorioProduto, implementar o método que recebe como parâmetro o código do produto, procura no arquivo se tem um produto com o 
    código informado e retorna o produto (use o método listarProduto())*/
    
    public Produto lerProduto(int codigoInformado) {
    	List <Produto> produtos=listarProduto(); //criei uma variavel do tipo lista pra receber a lista que o metodo listarProduto retorna
    	for(Produto p :produtos) {  //percorre a lista de produtos e verifica se codigo existe na lista
    		if(p.getCodigo()==codigoInformado) {
    			return p; //se encontrar retorna o produto
    		}
    	}
    	return null;  //se nao encontar retorna nulo

    	
    	
   }
   

}

