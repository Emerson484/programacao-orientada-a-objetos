/*Você foi contratado(a) para desenvolver um sistema de processamento de
pagamentos para uma empresa. Existem diferentes tipos de funcionários, como
funcionários fixos e freelancers, que recebem de maneiras distintas. A empresa
precisa de um sistema que calcule o pagamento de cada funcionário de acordo com
suas regras.*/
  package pratica8.sistemaDePagamentos;
//Adicione um novo tipo de funcionário, Estagiario, que recebe uma bolsa auxílio fixa sem bônus ou horas extras. 

public class Estagiario extends Funcionario{
	//construtor
	Estagiario(String nome, int id, double salarioBase){
		super(nome,id,salarioBase);
	}
	
//	Implemente o métodocalcularPagamento() somando o valor da bolsa  (neste caso, salário base)
	public double calcularPagamento() {
		return super.getSalarioBase();
	}

	@Override
	public String toString() {
		return super.toString()+"\n"+
	           "funcionario estagiario";
	}
}
