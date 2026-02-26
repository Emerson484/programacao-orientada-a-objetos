package pratica8.sistemaDePagamentos;
/*Implemente a classe principal, que
 *  permita cadastrar diferentes tipos de funcionários (fixos e freelancers) e adicioná-los à folha de pagamento e calcular o pagamento de cada um
 */

//importacoes
import java.util.Scanner;

public class Principal {
	public static String menu(){
        return "Digite:\n" +
                "1 - Cadastrar funcionario"+"\n"+ 
                "2 - calcular pagamento" +"\n"+
                "3 - detalhar pagamento" +"\n"+
                "0 - para sair";
    }
	public static void main(String[]args) {
		//criar objeto para folha de pagamento
		FolhaPagamento folhaPagamento1=new FolhaPagamento();
		Scanner teclado=new Scanner(System.in);
		int resposta=0;
		
		do {
			System.out.println(menu()); //imprimir menu
			resposta=teclado.nextInt();
			teclado.nextLine();
			
			switch(resposta) {
			//Cadastrar funcionario
			case 1:{
				//pedir info pra cadastrar funcionario
				System.out.println("digite o nome do funcionario");
				String nome=teclado.nextLine();
				
				System.out.println("digite o salario base do funcionario");
				double salarioBase=teclado.nextDouble();
				teclado.nextLine();
				
				System.out.println("digite o id do funcionario");
				int id=teclado.nextInt();
				teclado.nextLine();
				
				//perguntar tipo
				System.out.println("o funcionario e fixo, freelancer ou estagiario?");
				String tipoFuncionario=teclado.nextLine();
				
				if(tipoFuncionario.equals("fixo")) {
					System.out.println("qual o bonus do funcionario");
					double bonus=teclado.nextDouble();
					teclado.nextLine();
					//adicionar a folha de pagamento
					folhaPagamento1.adicionarFuncionarioFixo(nome, id, salarioBase, bonus);
					
				}else if(tipoFuncionario.equals("freelancer")) {
					System.out.println("digite as horas trabalhadas do funcionario");
					double horasTrabalhadas=teclado.nextDouble();
					teclado.nextLine();
					//adicionar a folha de pagamento
					folhaPagamento1.adicionarFreelancer(nome, id, salarioBase, horasTrabalhadas);
					
				}else if(tipoFuncionario.equals("estagiario")) {
					//adicionar a folha de pagamento
					folhaPagamento1.adicionarEstagiario(nome, id, salarioBase);
					
				}
				
				else {
					System.out.println("tipo invalido");
				}
				
			}
			break;
			//calcular pagamento
			case 2:{
				System.out.println(folhaPagamento1.ProcessarPagamento());
				
				
					
				
			
			}
			break;
			//detalharPagamento	
			case 3:{
				System.out.println(folhaPagamento1.detalharPagamento());
				
			}
			break;
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
