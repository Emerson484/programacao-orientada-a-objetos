package teoricas3;

public class TesteFuncionario {
	public static void main(String[]args) {
		// criar o objeto
		Funcionario f1= new Funcionario("mateus","0123456789",100,20,"assistente","27/09/2020");
		
		// exibir nome e salario
		System.out.println("o nome = "+f1.getNome());
		System.out.println("o salario = "+f1.calcularSalario());
		
	}

}
