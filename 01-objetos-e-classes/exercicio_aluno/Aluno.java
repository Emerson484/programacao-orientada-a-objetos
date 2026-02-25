package pratica2;
/*5 - Escreva uma classe cujos objetos representam alunos matriculados em uma disciplina. Cada objeto dessa
 *  classe deve guardar os seguintes dados do aluno: matrícula, nome, 2 notas de prova e 1 nota de trabalho. 
 *  Escreva os seguintes métodos para esta classe:
⦁	calcularMedia - calcula a média final do aluno (cada prova tem peso 4 e o trabalho tem peso 2)
⦁	calcularFinal - calcula quanto o aluno precisa para a prova final (retorna zero se ele não for para a 
final) Escreva um programa principal para testar a classe Aluno
*/

public class Aluno {
	int matricula;
	String nome;
	double nota1;
	double nota2;
	double notaTrabalho;
	
	double calcularMediaFinal(){
		double media= ((nota1*4)+(nota2*4)+(notaTrabalho*2))/10;
		
		return media;
	}
	double calcularFinal() {
		double media=calcularMediaFinal();
		System.out.println("a media foi de :"+ media);
	    //(0.7*mediaFinal)+(0.3*final)=7
		if(media>=7) {
			return 0;
		}else {
			double quantoPrecisa= (7-(0.7*media))/0.3;
			System.out.println("o aluno precisa de"+quantoPrecisa);
			return quantoPrecisa;
		}
	
	}
	
}
