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
