package pratica4;

import java.util.Scanner;

public class Biblioteca {

	public static void main(String[] args) {
		Scanner teclado=new Scanner (System.in);
		int qtdLivros = 0,codigo,anoNascimento,contUsuarios=0,codigoEmp=0,contLivro=0,contEmp=0,opcao=0;
		long issn = 0;
		String titulo,editora = null,nome,sobrenome,pesquisar,usuarioNome,resposta,dataEmp,dataDev,resposta2;
		Livro[] livros=new Livro[10];
		Usuario[] usuarios=new Usuario[10];
		Emprestimo[] emprestimos=new Emprestimo[10];
		Usuario user = null;
		Livro book = null;
		
		do {
		   System.out.println("seja bem vindo(a) a biclioteca");
		   System.out.println("1- cadastrar livros");
		   System.out.println("2-pesquisar livro pelo titulo");
		   System.out.println("3- cadastar cliente ");
		   System.out.println("4- realizar emprestimo");
		   System.out.println("0- sair");
		   System.out.println("escolha uma opcao");
		   opcao=teclado.nextInt();
		   teclado.nextLine();
		   System.out.println();
		   
		   switch(opcao) {
			   case 1:
				   //cadastrar livro
					
					System.out.println("quantos livros voce deseja cadastar?");
					qtdLivros=teclado.nextInt();
					teclado.nextLine();
					
					for(int i=0;i<qtdLivros;i++) {
						// pedir as informacoes pro usuario
						System.out.println("qual o nome do autor?");
						nome=teclado.nextLine();
						
						System.out.println("qual o sobrenome do autor?");
						sobrenome=teclado.nextLine();
						
						System.out.println("qual a data de nascimento do autor?");
						anoNascimento=teclado.nextInt();
						teclado.nextLine();
						
						System.out.println("qual ocodigo do livro?");
						codigo=teclado.nextInt();
						teclado.nextLine();
						
						System.out.println("qual o titulo do livro?");
						titulo=teclado.nextLine();
						
						System.out.println("qual a editora do livro?");
						editora=teclado.nextLine();
						
						System.out.println("qual o issn do livro?");
						issn=teclado.nextLong();
						teclado.nextLine();
						
						System.out.println("livro cadastrado com sucesso!"+"\n");
						
						// criar os objetos
						Autor autor1=new Autor(nome,sobrenome,anoNascimento);
						
						Livro livro1=new Livro(codigo,titulo,autor1);
						livros[contLivro]=livro1;
						contLivro++;
						livro1.setEditora(editora);
						livro1.setIssn(issn);
					}
				  break;
				  
			   case 2:
				 //pesquisar livro pelo titulo
					System.out.println("qual o titulo do livro que voce deseja pesquisar?");
					pesquisar=teclado.nextLine();
					
					/*aqui usei o metodo equals pois em java == compara a referencia do objeto e nao o valor das strings
					entao mesmo sendo textos iguais vai retornar falso por serem objetos diferentes*/
					
					/* tambem coloquei uma condicao a mais pois algumas posicoes do vetor podem ficar nulas a depender da
					 *  quantidadede livros escolhida*/
					   boolean EncontrarLivro=false;
					   for(int i=0;i<qtdLivros;i++) {
						 if(livros[i]!=null && livros[i].getTitulo().equals(pesquisar)) {
							   System.out.println("livro encontrado: "+livros[i].getTitulo()+"\n");
							   EncontrarLivro=true;
						 }
				
					   }
					   if(!EncontrarLivro) {
							 System.out.println("livro nao encontrado: ");
						 }
					   
				   break;
			   
		   
				case 3:
					  
					 //cadastrar cliente
					   System.out.println("qual e o seu nome?");
					   usuarioNome=teclado.nextLine();
					   
					   System.out.println("qual e o seu cpf?");
					   long cpf=teclado.nextLong();
					   teclado.nextLine();
					   
					   System.out.println("qual e o seu endereco?");
					   String endereco=teclado.nextLine();
					   
					   System.out.println("qual e o suprofissao?");
					   String profissao=teclado.nextLine();
					   
					   //criar objeto
					   Usuario Usuario1=new Usuario(usuarioNome);
					   Usuario1.setCpf(cpf);
					   Usuario1.setEndereco(endereco);
					   Usuario1.setProfissao(profissao);
					   
					   usuarios[contUsuarios]=Usuario1;
					   contUsuarios++;
					   System.out.println("cliente cadatrado!"+"\n");
					   break;
		
				case 4:
					// realizar emprestimos
					
					//verificar se o cliente tem cadastro
					System.out.println("qual e o seu nome de usuario?");
					resposta=teclado.nextLine();
					
					boolean usuarioEncontrado=false;
					for(int i=0;i<usuarios.length;i++) {
						if(usuarios[i] !=null && usuarios[i].getNome().equals(resposta)) {
							System.out.println("usuario encontrado!"+"\n");
							user=usuarios[i];
							usuarioEncontrado=true;
							break;
						}
						
					}
					if(!usuarioEncontrado) {
				    	 System.out.println("usuario nao encontrado!"+"\n");
				     }
					
					// perguntar qual livro
					System.out.println("qual livro voce deseja?");
					resposta2=teclado.nextLine();
					
					boolean livroEncontrado=false;
					for(int i=0;i<livros.length;i++) {
						if(livros[i]!=null && livros[i].getTitulo().equals(resposta2)) {
							livroEncontrado=true;
							System.out.println("livro encontrado"+"\n");
							book=livros[i];
							break;
						}
					}
					if(!livroEncontrado) {
						System.out.println("livro nao encontrado"+"\n");
					}
					
					//adicionei a verificacao se existe usuario e livro e so depois cria o objeto emprestimo
					// informacoes referentes ao emprestimo
					if(usuarioEncontrado==true && livroEncontrado==true) {
						System.out.println("data do emprestimo: ");
						dataEmp=teclado.nextLine();
						
						System.out.println("data da devolucao");
						dataDev=teclado.nextLine();
				
					    //criar o objeto
					    Emprestimo emprestimo1= new Emprestimo(dataEmp,dataDev,user,book);
					    emprestimos[contEmp]=emprestimo1;
						contEmp++;
					
						System.out.println("emprestimo feito com sucesso!"+"\n");  
						
								
					}else {
						System.out.println("nao foi possivel fazer o emprestimo!"+"\n");  
					}
							
					   break;
					   
				case 0:
					System.out.println("saindo do sistema"); 
					break;
				   
				    default:
				    	 System.out.println("opcao invalida");
				}
						   
		}while(opcao!=0);
		
		teclado.close();
	}

}
