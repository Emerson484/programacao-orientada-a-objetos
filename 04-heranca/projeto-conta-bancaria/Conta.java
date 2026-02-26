/*1 - Implementar em Java:
a) Uma classe Conta que representa uma conta bancária. Com as seguintes
responsabilidades:
 Atributos: nome do titular, número e saldo
 Construtores
 Métodos getters e setters necessários
 Métodos depositar que recebe como parâmetro um valor e soma ao saldo. O
valor tem que ser positivo
 Método sacar que recebe como parâmetro um valor positivo e subtrai do saldo.
Para cada saque será debitada também uma taxa de operação equivalente à
0,5% do valor sacado
b) Uma subclasse da classe Conta para representar uma conta corrente de um
cliente especial (ContaEspecial). Escrever o método sacar: Clientes
especiais pagam taxas de operação de apenas 0,1% do valor sacado.
c) Uma classe com método principal que tem uma lista de contas e permite
executar as operações abaixo*/

package pratica7;
/*1 - Implementar em Java:
Uma classe Conta que representa uma conta bancária. Com as seguintes responsabilidades:
Atributos: nome do titular, número e saldo 
Construtores
Métodos getters e setters necessários
*/

public class Conta {
	//atributos
	private String titular;
	private int numero;
	private double saldo;
	private static int cont=0;
	
	//construtor
	public Conta(String titular) {
		super();
		this.titular = titular;
		this.numero =cont++ ;
		//this.saldo = saldo;
	}
	
	//Métodos getters e setters necessários

	public String getTitular() {
		return titular;
	}

	public void setTitular(String titular) {
		this.titular = titular;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public double getSaldo() {
		return saldo;
	}
    
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
    //Métodos depositar que recebe como parâmetro um valor e soma ao saldo. O valor tem que ser positivo
	public void depositar(double valor) {
		if(valor>0) {
			saldo+=valor;
		}
		
	}
	
	/*Método sacar que recebe como parâmetro um valor positivo e subtrai do saldo. Para cada saque será debitada também uma taxa de operação
	equivalente à 0,5% do valor sacado*/
	public void sacar (double valor) {
		if(valor>0 && valor<=saldo) {
			saldo-=valor;
			saldo-=valor*0.005; //a cada saque e discontado 0,5% do valor debitado
		}
		
		
	}

	
	
	

}
