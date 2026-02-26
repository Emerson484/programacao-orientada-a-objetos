package pratica7.visao;


/*Implemente a classe Livraria no pacote visao. O programa deve ter um atributo do tipo ControleProduto e permitir a realização das seguintes 
 * operações:
1 - 
2 - Cadastrar papelaria  
3 - Pesquisar produto por código (solicita o código do produto e, caso exista, mostra os dados completos do produto)  
3 - Pesquisar produto por nome (solicita o nome do produto e, caso exista, mostra os dados completos do produto)
4 - Listar produtos
0 - Sair do programa
*/
//importacoes
import pratica7.controle.ControleProduto;
import pratica7.modelo.Livro;
import pratica7.modelo.Papelaria;
import pratica7.modelo.Produto;
import java.util.Scanner;

public class Livraria {
	public static String menu(){
        return "Digite:\n" +
                "1 - Cadastrar livro"+"\n"+ 
                "2 - cadastrar papelaria"+ "\n"+
                "3 - Pesquisar produto por código" +"\n"+
                "4 - Pesquisar produto por nome"+"\n"+
                "5 - Listar produtos"+"\n"+
                "0 - para sair";
    }
	public static void main(String[]args) {
		ControleProduto controle=new ControleProduto();//lista de ControleProduto
		Scanner teclado=new Scanner(System.in);
		//ArrayList<Produto>produtos=new ArrayList<>();
		int resposta=0;
		
		do {
			System.out.println(menu()); //imprimir menu
			resposta=teclado.nextInt();
			teclado.nextLine();
			
			switch(resposta) {
			//Cadastrar livro
			case 1:{
				//pedir info pra criar livro
				System.out.println("digite o nome do produto");
				String nome=teclado.nextLine();
				
				System.out.println("digite o custo do produto");
				double custo=teclado.nextDouble();
				teclado.nextLine();
				
				System.out.println("digite o autor do livro");
				String autor=teclado.nextLine();
				
				System.out.println("qual a editora do livro?");
				String editora=teclado.nextLine();
				
				//usar o controle e metodo dele pra criar novo objeto livro
				controle.cadastrarNovoProdutoLivro(nome, custo, autor, editora);
			    break;
			}
			//cadastrar papelaria
			case 2:{
				//pedir info pra criar livro
				System.out.println("digite o nome do produto");
				String nome=teclado.nextLine();
				
				System.out.println("digite o custo do produto");
				double custo=teclado.nextDouble();
				teclado.nextLine();
				
				System.out.println("digite a descricao do produto");
				String descricao=teclado.nextLine();
			
				System.out.println("digite o fabricante do produto?");
				String fabricante=teclado.nextLine();
				
				//usar o controle pra criar novo objeto livro
				controle.cadastrarNovoProdutoPapelaria(nome, custo, descricao, fabricante);						
				break;
			}
			// Pesquisar produto por código (solicita o código do produto e, caso exista, mostra os dados completos do produto)
			case 3:{
				//pedir codigo
				System.out.println("digite o codigo do produto que deseja pesquisar:");
				int codigo=teclado.nextInt();
				//criar um objeto pra receber as informacoes do objeto que o metodo retorna(caso exista)
				Produto p=controle.pesquisarComCodigo(codigo);
				
				if(p!=null) {
					System.out.println(p.toString());
				}else {
					System.out.println("produto nao existe!");
				}
				
				break;
			}
			//4 - Pesquisar produto por nome
			case 4:{
				System.out.println("digite o nome do produto que deseja pesquisar:");
				String nomeProcurar=teclado.nextLine();
				//criar um objeto pra receber as informacoes do objeto que o metodo retorna(caso exista)
				Produto p=controle.pesquisarNome(nomeProcurar);		
				
				if(p!=null) {
					System.out.println(p.toString());
				}else {
					System.out.println("produto nao existe!");
				}
				
				break;
			}
			//Listar produtos
			case 5:{
			
				System.out.println(controle.listarProdutos());
				break;
			}
			case 0:{
				System.out.println("saindo");
				break;
			}
			default:{
				System.out.println("opcao invalida");
				break;
			}
			
			
		  }	
		}while(resposta!=0);
		teclado.close();
	}

}
