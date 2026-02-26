package pratica_10.atividade1;
/*13 - Altere a classe principal para criar uma lista de contas e implemente as seguintes funções do menu abaixo. Lembre de tratar as exceções 
  lançadas pelos métodos sacar e depositar.  */

//importacoes
import java.util.ArrayList;
import java.util.Scanner;

public class Principal {
	public static String menu(){ //menu com opcoes pra conta
		  return "Digite:\n" +
		          "1 - Criar conta \n" +
		          "2 - Depositar \n"+
		          "3 - Sacar \n"+
		          "4 - Consultar saldo\n"+
		          "0 - para sair";
		}
	public static void main(String[] args) {
		ArrayList <Conta> contas=new ArrayList<>();//lista de contas
		Scanner teclado=new Scanner(System.in); 
		int resposta=0;
		
		do {
			System.out.println(menu()); //imprimir menu 
			resposta=teclado.nextInt(); //armazenar resposta
			teclado.nextLine();
					
			switch(resposta) {
			//Criar conta
			case 1:{
				//criar ojeto Conta
				Conta NovaConta= new Conta();
				//adicionar a lista
				contas.add(NovaConta);
				System.out.println("conta criada com sucesso");
				System.out.println("numero: "+NovaConta.getNumero());
				break;
		    //Depositar 
			}case 2:{
				System.out.println("digite o numero da conta"); //pedir numero da conta
				int numeroConta=teclado.nextInt();
				teclado.nextLine();
				
				for(Conta c:contas) { //percorrer lista de contas
					if(c.getNumero()==numeroConta) {  //se o numero existir na lista pedimos o valor e usamos o metodo de depositar
						System.out.println("digite o valor a ser depositado na conta");
						double valorDepositar=teclado.nextDouble();
						try {
							c.depositar(valorDepositar);
						}
						catch(IllegalArgumentException e){
							System.out.println(e.getMessage()); //imprime a mensagem que definimos ao lancar com o throw
							/*System.out.println(e.fillInStackTrace());// mostra rastreamento completo da excecao,incluindo as linhas de codigo onde
							ela ocorreu*/
							//System.out.println(e.toString());// imprime o tipo de excecao mais a mensagem
							break; // usei esse break pra pular a linha de baixo,pois caso ocorra a excecao o deposito nao sera realizado
						}
						
						System.out.println("deposito realizado com sucesso");
					}
				}
				break;
			// Sacar
			}case 3:{
				System.out.println("digite o numero da conta"); //pedir numero da conta
				int numeroConta=teclado.nextInt();
				teclado.nextLine();
				
				for(Conta c:contas) { //percorrer lista de contas
					if(c.getNumero()==numeroConta) {  //se o numero existir na lista pedimos o valor e usamos o metodo de sacar
						System.out.println("digite o valor a ser sacado na conta");
						double valorSacar=teclado.nextDouble();
						try {
							c.sacar(valorSacar);
						}catch(IllegalArgumentException e) {
							System.out.println(e.getMessage());
							break;
						}
						
						System.out.println("saque realizado com sucesso");
						
					}
				}
				
				break;
		    //Consultar saldo
			}case 4:{
				System.out.println("digite o numero da conta"); //pedir numero da conta
				int numeroConta=teclado.nextInt();
				teclado.nextLine();
				
				for(Conta c:contas) { //percorrer lista de contas
					if(c.getNumero()==numeroConta) {  //se o numero existir na lista imprimimos o saldo
						System.out.println(c.getSaldo());
						
					}
				}
				
				break;
			//para sair
			}case 0:{
				System.out.println("saindo...");
				break;
			}
			
			default:{
				System.out.println("opcao invalida!");
				break;
			}
			
			
			
			}
			
		}while(resposta!=0);  //enquanto o usuario nao digitar 0 o do while vai ficar repetindo o bloco de codigo
		teclado.close(); //fechar teclado
	

	}

}
