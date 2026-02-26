package excerciciosRevisao;
import java.util.Scanner;

import java.util.ArrayList;
/*Implemente o programa da agenda que deve manter um 
* menu de opções do programa: incluir contato (acrescenta numa lista de contatos), excluir contato (retirar da lista), listar contatos, consulta
*  dados de um contato e sair. */
public class Agenda {
	public static String menu() {
		return "1-incluir contato (acrescenta numa lista de contatos)"+"\n"+
				"2-excluir contato (retirar da lista)"+"\n"+
				"3-listar contatos"+"\n"+
				"4-consultar  dados de um contato"+"\n"+
				"0-sair"+"\n";
				
	}
	public static void main(String[]args) {
		Scanner teclado=new Scanner(System.in);
		ArrayList <Contato>contatos=new ArrayList<>();
		int opcao=0;
		
	//	System.out.println(menu());
		//opcao=teclado.nextInt();
	//	teclado.nextLine();
		
		do {
			System.out.println(menu());
			opcao=teclado.nextInt();
			teclado.nextLine();
			
			switch(opcao) {
			   //incluir contato (acrescenta numa lista de contatos)
				case 1:{
					//pedir info
					
			
					System.out.println("digite o nome do contato");
					String nome=teclado.nextLine();
					System.out.println("digite o numero do contato");
					long telefone=teclado.nextLong();
					teclado.nextLine();
					System.out.println("digite o tipo do contato");
					String tipo=teclado.nextLine();
					
					//criar objeto
					Contato NovoContato=new Contato(nome,telefone);
					
					//verifica se o tipo digitado existe e adiciona a lista
					if(NovoContato.verificarTipo(tipo)){
						System.out.println("tipo nao existe");
					}else {
						System.out.println("contato adicionado");
						contatos.add(NovoContato);
					}
					break;
				}
				//2-excluir contato (retirar da lista)
				case 2:{
					//pedir info
					System.out.println("digite o nome do contato");
					String nome=teclado.nextLine();
					
					// verificar se existe o contato percorrendo o vetor
					for(Contato c:contatos) {
						if(c.getNome().equals(nome)) {// se encontrar o nome do contato digitado ele sera removido
							contatos.remove(c);
							System.out.println("contato excluido");
							break;
						}else{
							System.out.println("contato nao existe");
						}
					}
					break;
				}
				//"3-listar contatos"
				case 3:{
					System.out.println("lista de contatos e");
					for(Contato c:contatos) {
						System.out.println(c.getNome()+"\n");
					}
					
					break;
				}
				//"4-consultar  dados de um contato"
				case 4:{
					System.out.println("qual contato vc quer consultar os dados?");
					String nome=teclado.nextLine();
					
					for(Contato c:contatos)
						if(c.getNome().equals(nome)) {
							System.out.println("contato encontrado,os dados sao:"+"\n");
							c.imprimir();
							
						}else {
							System.out.println("contato nao encontrado");
						}
					
					
					
					break;
				}
				case 0:{
					System.out.println("saindo...");
					break;
				}
				default:{
					System.out.println("opcao invalida!");
				}
			}
			
			
			
		}while(opcao!=0);
		teclado.close();
	}

	

}
