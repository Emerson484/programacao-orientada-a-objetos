package pratica7;
//Altere a classe principal da questão 4 para solicitar ao usuário as opções do método menu. Implemente cada opção.

import java.util.Scanner;
import java.util.ArrayList;
public class Principal {
	public static String menu(){
        return "Digite:\n" +
                "1 - Cadastrar produto \n" +
                "2 - Cadastrar livro \n" +
                "3 - Cadastrar livro didático \n" +
                "4 - Imprimir produtos \n"+
                "0 - para sair";
  }
	public static void main(String args[]) {
		Scanner teclado=new Scanner(System.in);
		int resposta=0;
		ArrayList <Produto> produtos=new ArrayList<>();
		
		do {
			System.out.println(menu());
			resposta=teclado.nextInt();
			teclado.nextLine();
			switch(resposta) {
			// "1 - Cadastrar produto \n" +
			case 1:{
				//pedir info
				System.out.println("digite o nome do produto");
				String nome=teclado.nextLine();
				System.out.println("digite o preco do produto");
				double preco=teclado.nextDouble();
				teclado.nextLine();
				
				// criar um novo objeto produto
				Produto produto=new Produto(nome,preco);
				produtos.add(produto); // adicionar alista de produtos
				
				break;
			}
			//"2 - Cadastrar livro \n" +
		    case 2:{
		    	//pedir info
		    	System.out.println("digite o nome do livro");
				String nome=teclado.nextLine();
				System.out.println("digite o preco do livro");
				double preco=teclado.nextDouble();
				teclado.nextLine();
				System.out.println("digite o nome do autor");
				String autor=teclado.nextLine();
				System.out.println("digite o numero de paginas");
				int numPaginas=teclado.nextInt();
				teclado.nextLine();
				// criar um novo objeto livro
				Livro livro=new Livro(nome,autor,numPaginas,preco);
				produtos.add(livro);//adicionar alista de produtos
			     break;
		    }
			case 3:{
				System.out.println("digite o nome do livro didatico");
				String nome=teclado.nextLine();
				System.out.println("digite o preco do livro didatico");
				double preco=teclado.nextDouble();
				teclado.nextLine();
				System.out.println("digite o nome do autor didatico");
				String autor=teclado.nextLine();
				System.out.println("digite o numero de paginas didatico");
				int numPaginas=teclado.nextInt();
				teclado.nextLine();
				System.out.println("digite a disciplina do livro didatico");
				String disciplina=teclado.nextLine();
				// criar um novo objeto livro
				LivroDidatico livroDidatico=new LivroDidatico(nome,autor,numPaginas,preco,disciplina);
				produtos.add(livroDidatico);//adicionar alista de produtos
				break;
			}
			// Imprimir produtos \n"+
			case 4:{
				for(Produto p:produtos) {
					System.out.println(p.toString());
					System.out.println("e caro?"+p.ehCaro()); 
					if(p instanceof Livro) { //verifica se e uma instancia de livro para usar o metodo ehGrande
						System.out.println("o livro e grande?"+((Livro)p).ehGrande());
					}
					
				}
				break;
			}
			case 0:{
				System.out.println("saindo...!");
				break;
			}
			default:{
				System.out.println("opcao invalida!");
			}
				
			}

		}while(resposta!=0);
		teclado.close();
	}

}
