package pratica2;

import java.util.Scanner;

public class TestarAluno {
	public static void main (String[] args) {
		Scanner scan = new Scanner(System.in);
	/*aluno1.matricula=12;
		aluno1.nome="joao";
		aluno1.nota1=5;
		aluno1.nota2=5;
		aluno1.notaTrabalho=5;*/
		
		 // Entrada de dados do aluno
        System.out.print("Digite a matrícula do aluno: ");
        int matricula = scan.nextInt();
        scan.nextLine(); 

        System.out.print("Digite o nome do aluno: ");
        String nome = scan.nextLine();

        System.out.print("Digite a nota da primeira prova: ");
        double nota1 = scan.nextDouble();

        System.out.print("Digite a nota da segunda prova: ");
        double nota2 = scan.nextDouble();

        System.out.print("Digite a nota do trabalho: ");
        double notaTrabalho = scan.nextDouble();

        // Criando objeto Aluno
        Aluno aluno1 = new Aluno();
        aluno1.matricula = matricula;
        aluno1.nome = nome;
        aluno1.nota1 = nota1;
        aluno1.nota2 = nota2;
        aluno1.notaTrabalho = notaTrabalho;

        // Exibir informações do aluno
		
		aluno1.calcularMediaFinal();
		aluno1.calcularFinal();
		scan.close();
	}

}
