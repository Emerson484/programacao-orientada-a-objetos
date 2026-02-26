package pratica9.atividade2;
/*- Implementar a classe principal
 Permitir que o usuário cadastre diversos objetos tributáveis
 Utilize a classe CalculaTributo e mostre o valor total arrecadado com os
tributáveis.*/
import java.util.Scanner;
public class Principal {
	public static String menu(){
        return "Digite:\n" +
                "1 - Cadastrar tributavel consultoria"+"\n"+ 
                "2 - Cadastrar tributavel imovel" +"\n"+
                "3 - Cadastrar tributavel proffisional autonomo" +"\n"+
                "4 - mostrar o valor total arrecadado com os tributáveis" +"\n"+
                "0 - para sair";
    }
	public static void main(String[]args) {
		//criar objeto calculaTributo
		CalculaTributo calcularTributo =new CalculaTributo();
		

		Scanner teclado=new Scanner(System.in);
		int resposta=0;
		
		do {
			System.out.println(menu()); //imprimir menu
			resposta=teclado.nextInt();
			teclado.nextLine();
			
			switch(resposta) {
			//Cadastrar Cadastrar tributavel consultoria
			case 1:{
				//pedir info pra cadastrar tributavel
				System.out.println("digite a descricao");
				String descricao=teclado.nextLine();
				
				System.out.println("digite o valor do tributavel");
				double valor=teclado.nextDouble();
				teclado.nextLine();
				
				//criar objeto
				Consultoria consultoria=new Consultoria(descricao,valor);
				//adicionar objeto
				calcularTributo.adicionarTributo(consultoria);

				
			}
			break;
			
			// Cadastrar tributavel imovel
			case 2:{
				//pedir info pra cadastrar tributavel
				System.out.println("digite o endereco do imovel");
				String endereco=teclado.nextLine();
				
				System.out.println("digite o valor do imovel");
				double valorImovel=teclado.nextDouble();
				teclado.nextLine();
				
				System.out.println("digite o tamanho do imovel");
				double tamanhoImovel=teclado.nextDouble();
				teclado.nextLine();
				//criar objeto
				Imovel imovel=new Imovel(valorImovel,tamanhoImovel,endereco);
				//adicionar objeto
				calcularTributo.adicionarTributo(imovel);		
			}
			break;
            // Cadastrar tributavel proffisional autonomo			
			case 3:{
				//pedir info pra cadastrar tributavel
				System.out.println("digite o nome do profissional?");
				String nome=teclado.nextLine();
				
				System.out.println("digite o cpf");
				String cpf=teclado.nextLine();
				
				System.out.println("digite o endereco");
				String endereco=teclado.nextLine();
				
				System.out.println("digite a remuneracao");
				double remuneracao=teclado.nextDouble();
				teclado.nextLine();
				//criar objeto
				ProfissionalAutonomo autonomo=new ProfissionalAutonomo(nome,cpf,endereco,remuneracao);
				//adicionar objeto
				calcularTributo.adicionarTributo(autonomo);	
				
			}
			break;
			// mostrar o valor total arrecadado com os tributáveis
			case 4:{
				System.out.println(calcularTributo.calculaTotalTributo());
				
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


	

