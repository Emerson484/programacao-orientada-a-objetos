package pratica6;
/*Criar uma classe principal com opções para criar procedimentos e consultas. Imprimir os dados dos
procedimentos e das consultas.*/
import java.util.Scanner;
import java.util.ArrayList;

public class Principal {
	public static String menu() {
		return  "escolha uma opcao"+"\n"
				+"1-criar procedimentos"+"\n"
				+"2-criar consultas"+"\n"
				+"3-imprimir dados dos procedimentos e consulta"+"\n"
				+"0-sair";
	}
	
	public static void main(String[]args) {
		Scanner teclado=new Scanner(System.in);
		ArrayList <Procedimento>procedimentos=new ArrayList<>();
		ArrayList <Consulta>consultas=new ArrayList<>();
		int opcao;
		
		do {
			System.out.println(menu());
			opcao=teclado.nextInt();
			teclado.nextLine();
			switch(opcao) {
			    //criar procedimentos
				case 1:{
					System.out.println("digite a descricao do procedimento");
					String descricao=teclado.nextLine();
					System.out.println("digite o valor do procedimento");
					double valor=teclado.nextDouble();
					teclado.nextLine();
					//criar objeto e setar valores
					Procedimento procedimento=new Procedimento();
					procedimento.setValor(valor);
					procedimento.setDescricaoProcedimento(descricao);
					//adicionar objeto a lista
					procedimentos.add(procedimento);
					break;
					
				}
				//2-criar consultas
                case 2:{
                	System.out.println("digite o nome do animal");
                	String animal=teclado.nextLine();
                	System.out.println("digite o nome do medico");
                	String medico=teclado.nextLine();
                	System.out.println("digite a descricao do procedimento");
                	String data=teclado.nextLine();
                	System.out.println("digite o valor da consulta");
                	double valorConsulta=teclado.nextDouble();
                	teclado.nextLine();
                	//criar objeto e setar valores
                	Consulta consulta=new Consulta(animal,medico,data,valorConsulta);
                	
                	
                	System.out.println("voce deseja adicionar procedimentos a essa consulta sim=1 e nao=0");
                	int resposta=teclado.nextInt();
                	teclado.nextLine();
                	while(resposta!=0) {
                		System.out.println("digite a descricao do procedimento");
    					String descricao=teclado.nextLine();
    					System.out.println("digite o valor do procedimento");
    					double valor=teclado.nextDouble();
    					teclado.nextLine();
    					// criar objeto
    					Procedimento p=new Procedimento(descricao,valor);
    					consulta.inserirProcedimento(p);
    					System.out.println("adicionar outro procedimentos a essa consulta sim=1 e nao=0");
    					resposta=teclado.nextInt();
                    	teclado.nextLine();
    					
                	}
                	consultas.add(consulta);
                	break;
				}
                //imprimir dados dos procedientos e consulta"
                case 3:{
                	for(Consulta c:consultas) {
                		System.out.println(c.imprimir());
                		/*for(Procedimento p:procedimentos) {
                			System.out.println(p.imprimir());
                		}*/
                	}
                	break;
					
				}
                case 0:{
                	System.out.println("saindo");
                	break;
				}
                default:{
                	System.out.println("opcao invalida");
                }
			}
			
		}while(opcao!=0);
		teclado.close();
	}

}
