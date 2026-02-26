package pratica8.sistemaDePagamentos;
/*FuncionarioFixo: tem um salário fixo mensal e recebe um bônus de desempenho.
Atributo adicional: double bonus;
*/
public class FuncionarioFixo extends Funcionario {
	double bonus;
	
	// construtor
	FuncionarioFixo(String nome, int id, double salarioBase,double bonus){
		super(nome,id,salarioBase);
		this.bonus=bonus;
		
	}
	//gets sets

	public double getBonus() {
		return bonus;
	}


	public void setBonus(double bonus) {
		this.bonus = bonus;
	}
	//Implemente o método calcularPagamento() somando o salário base com o bônus.
	public double calcularPagamento() {
		return super.getSalarioBase()+bonus;
	}
    
	@Override
	public String toString() {
		return super.toString()+"\n"+
	           "funcionario fixo, bonus de :"+bonus;
	}
}
