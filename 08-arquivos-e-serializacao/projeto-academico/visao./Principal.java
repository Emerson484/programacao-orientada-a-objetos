package pratica_12.visao;



import java.util.List;
import java.util.Scanner;

import pratica_12.controle.ControleDisciplina;
import pratica_12.modelo.Disciplina;

public class Principal {
	public static String menu(){ 
		return "Digite:\n" + 
		"1 - Cadastrar disciplina \n" + 
		"2 - Pesquisar disciplina\n"+ 
		"3 - Listar disciplinas \n"+ 
		"4 - Atualizar disciplina \n"+ 
		"5 - Deletar disciplina \n"+ 
		"0 - para sair"; 
		} 
		public static void main(String[] args) { 
		ControleDisciplina cd = new ControleDisciplina(); int opcao; 
		Scanner teclado = new Scanner(System.in);
		
		do{ 
			System.out.println(menu());
		    opcao=teclado.nextInt();
		    teclado.nextLine();
		    
		switch (opcao){ 
		
		case 1:{ //cadastar disciplina 
			//pedir info
			System.out.println("digite o nome da disciplina");
			String nome=teclado.nextLine();
			
			System.out.println("digite o id da disciplina");
			int id=teclado.nextInt();
			teclado.nextLine();
			
			System.out.println("digite a carga horaria da disciplina");
			int cargaH=teclado.nextInt();
			teclado.nextLine();
			
			//usar metodo de controle disciplina pra cadastrar disciplina
			cd.cadastrarDisciplina(nome, id, cargaH);
			System.out.println("disciplina criada !");
		break; 
		} 
		case 2:{ //Pesquisar disciplina 
			System.out.println("digite o id da disciplina a ser pesquisada");
			int id=teclado.nextInt();
			teclado.nextLine();
			
			////usar metodo de controle disciplina pra pesquisar disciplina
			System.out.println(cd.pesquisarDisciplina(id));
		break; 
		} 
		case 3: {//Listar disciplinas 
			List<Disciplina>disciplinas=cd.listarDisciplina();
			System.out.println(disciplinas);
		break; 
		} 
		case 4: {//Atualizar disciplinas 
			System.out.println(cd.imprimir());
			System.out.println("disciplina atualizada!");
		break; 
		} 
		case 5: {//Deletar disciplinas 
			System.out.println("digite o id da disciplina a ser removido");
			int id=teclado.nextInt();
			teclado.nextLine();
			cd.removerDisciplina(id);
			System.out.println("disciplina deletada !");
		break; 
		} 
		case 0: {//sair
			System.out.println("saindo...");
			
		break; 
		} 
		} 
		
		}while (opcao!=0);
		
		teclado.close();

		}
}
