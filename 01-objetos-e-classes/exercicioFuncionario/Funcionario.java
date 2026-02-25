package teoricas3;
/*1 - Crie uma classe que representa os funcionários de uma empresa. Um funcionário deve saber seu
nome, cpf, horas trabalhadas, valor da hora trabalhada, cargo e data de admissão. Além disso, um
funcionário sabe fazer o cálculo do seu salário com base nas horas trabalhadas e o valor da hora.
 Encapsule o estado dos objetos;
 Defina construtores;
 Defina métodos setters e getters necessários;
 Escreva um programa principal para testar a classe funcionário.*/

public class Funcionario {
	private String nome;
	private String cpf;
	private double horasTrabalhadas;
	private double valorHoraTrabalhada;
	private String cargo;
	private String dataAdimissao;
	
	// construtor com parametros 
	public Funcionario(String nome, String cpf, double horasTrabalhadas, double valorHoraTrabalhada, String cargo,
		String dataAdimissao) {
		this.nome = nome;
		this.cpf = cpf;
		this.horasTrabalhadas = horasTrabalhadas;
		this.valorHoraTrabalhada = valorHoraTrabalhada;
		this.cargo = cargo;
		this.dataAdimissao = dataAdimissao;
	}
	//construtor sem parametros
	public Funcionario() {
		
	}
	// metodo para calcular salario
	public double calcularSalario() {
		double salario=0;
		salario=horasTrabalhadas*valorHoraTrabalhada;
		return salario;
	}
	// metodos get e set
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome=nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public double getHorasTrabalhadas() {
		return horasTrabalhadas;
	}

	public void setHorasTrabalhadas(double horasTrabalhadas) {
		this.horasTrabalhadas = horasTrabalhadas;
	}

	public double getValorHoraTrabalhada() {
		return valorHoraTrabalhada;
	}

	public void setValorHoraTrabalhada(double valorHoraTrabalhada) {
		this.valorHoraTrabalhada = valorHoraTrabalhada;
	}

	public String getCargo() {
		return cargo;
	}

	public void setCargo(String cargo) {
		this.cargo = cargo;
	}

	public String getDataAdimissao() {
		return dataAdimissao;
	}

	public void setDataAdimissao(String dataAdimissao) {
		this.dataAdimissao = dataAdimissao;
	}

}
