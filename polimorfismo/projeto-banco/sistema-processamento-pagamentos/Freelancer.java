package pratica8.sistemaDePagamentos;
/*Freelancer: é pago por hora e pode ter um número variável de horas trabalhadas.
Atributo adicional: double horasTrabalhadas;

*/
public class Freelancer extends Funcionario{
	double horasTrabalhadas;
	
	//construtor
	Freelancer(String nome, int id, double salarioBase,double horasTrabalhadas){
		super(nome,id,salarioBase);
		this.horasTrabalhadas=horasTrabalhadas;
		
	}
	//gets e sets

	public double getHorasTrabalhadas() {
		return horasTrabalhadas;
	}

	public void setHorasTrabalhadas(double horasTrabalhadas) {
		this.horasTrabalhadas = horasTrabalhadas;
	}

	//Implemente o método calcularPagamento() multiplicando o número de horas trabalhadas pela taxa horária (salarioBase neste caso).
	public double calcularPagamento() {
		return horasTrabalhadas*super.getSalarioBase();
	}
	@Override
	public String toString() {
		return super.toString()+"\n"+
	           "funcionario freelancer, horas trabalhadas :"+horasTrabalhadas;
	}

}
