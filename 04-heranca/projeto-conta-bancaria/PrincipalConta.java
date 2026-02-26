package pratica7;
/*Uma classe com método principal que tem uma lista de contas e permite executar as operações abaixo
*/
//importacoes
import java.util.Scanner;
import java.util.ArrayList;

public class PrincipalConta {
	public static String menu(){
        return "Digite:\n" +
                "1 - Cadastrar conta \n"+ //Deve solicitar o tipo de conta
                "2 - Depositar \n"+
                "3 - Sacar \n"+
                "4 - Consultar saldo\n"+
                "0 - para sair";
    }
	public static void main(String[]args) {
		Scanner teclado=new Scanner(System.in);
		ArrayList<Conta>contas=new ArrayList<>();//lista de contas
		int resposta=0;
		
		do {
			System.out.println(menu()); //imprimir menu
			resposta=teclado.nextInt();
			teclado.nextLine();
			
			switch(resposta) {
			//"1 - Cadastrar conta
			case 1:{
				
					//pedir info pra criar conta 
					System.out.println("digite o titular da conta");
					String titular=teclado.nextLine();
					//pergunta o tipo
					System.out.println("qual o seu tipo de conta voce deseja criar, normal ou conta especial?");
					String tipoConta=teclado.nextLine();
					
					if(tipoConta.equals("normal")) {// se escolher tipo normal cria um objeto Conta
						//criar objeto conta
						Conta contaNormal=new Conta(titular);
						//adicionar a lista de contas
						contas.add(contaNormal);
						//imprimir numero da conta
						System.out.println("o numero da conta e:"+contaNormal.getNumero());
					
				     }else if(tipoConta.equals("especial")) {// se escolher tipo especial cria um objeto ContaEspecial
					   //criar objeto ContaEspecial
					   ContaEspecial contaEspecial=new ContaEspecial(titular);
					   //adicionar a lista de contas
					   contas.add(contaEspecial);
					   //imprimir numero da conta
						System.out.println("o numero da conta e:"+contaEspecial.getNumero());
				      } else {
					     System.out.println("opcao invalida!");
				      }
				
				
				break;
			}
			//Depositar 
			case 2:{
				System.out.println("digite o titular da conta");
				String titular=teclado.nextLine();
				boolean contaEncontrada=false;
				
				//percorrer a lista para verificar se a conta existe
				for(Conta c:contas) {
					if(c.getTitular().equals(titular)) { //se encontrar pergunta o valor a ser depositado e usa o metodo depositar
						contaEncontrada=true; // a variavel recebe o valor verdadeiro
						System.out.println("quanto voce deseja depositar?");
						double depositar=teclado.nextDouble();
						c.depositar(depositar);
						break;//ao terminar de fazer o deposito ele para a verificacao
					}
				}
				if(contaEncontrada==false) { //caso a conta nao exista
					System.out.println("conta nao emcontrada");
				}
				
				break;
			}
			// - Sacar
			case 3:{
				//pedir info pra pesquisar conta 
				System.out.println("digite o titular da conta");
				String titular=teclado.nextLine();
				//perguntar tipo
				System.out.println("qual o seu tipo de conta, normal ou conta especial?");
				String tipoConta=teclado.nextLine();
				
				if(tipoConta.equals("normal")) { 
					// percorre lista de contas
					for(Conta c:contas) {
						if(c.getTitular().equals(titular)) { //verificar a existencia da conta
							// pergunta o valor e usa o metodo sacar
							System.out.println("quanto voce deseja sacar?");
							double saque=teclado.nextDouble();
							//nao precisa converter poque ja é do tipo conta,entao o metodo sacar é com 5% de taxa
							c.sacar(saque);
							System.out.println("saque realizado com sucesso");
					
						}
					}
			   }else if(tipoConta.equals("especial")) {

					// percorre lista de contas
					for(Conta c:contas) {
						if(c.getTitular().equals(titular)) { //verificar a existencia da conta
							// pergunta o valor e usa o metodo sacar
							System.out.println("quanto voce deseja sacar?");
							double saque=teclado.nextDouble();
							c.sacar(saque);
						    System.out.println("saque realizado com sucesso");
							
						}
					}
			   } else {
				   System.out.println("opcao invalida!");
			   }
				break;
			}
			// Consultar saldo
			case 4:{
				//pedir info
				System.out.println("digite o titular da conta");
				String titular=teclado.nextLine();
				
				for(Conta c:contas) {
					if(c.getTitular().equals(titular)) { //verifica se a conta existe
					    System.out.println("o saldo e:"+c.getSaldo());
						
					}
				}
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
