package pratica2;

/*2 - Considere uma conta bancária. Uma classe Conta deve ter o nome do titular ( String ), o número ( int ),
 *  a agência ( String ), o saldo ( double ) e uma data de abertura ( String ). Além disso, ela deve saber
 *   fazer as seguintes ações: sacar, para retirar um valor do saldo; depositar, para adicionar um valor ao 
 *   saldo; calcular rendimento, para devolver o rendimento mensal dessa conta.
a)	Crie o projeto Banco e defina a classe Conta com os atributos descritos acima e os seguintes métodos: 
⦁	sacar que recebe um valor como parâmetro e retira esse valor do saldo da conta 
⦁	depositar que recebe um valor como parâmetro e adiciona esse valor ao saldo da conta 
a)	Crie uma classe principal para testar a classe Conta;
b)	Não deve ser permitido deixar o saldo da conta negativo. Alterar o método sacar para retornar verdadeiro se o saque for realizado e falso caso contrário. Altere o main para informar ao cliente se o saque foi ou não realizado.
*/

public class Conta {
	String titular;
	int numero;
	String agencia;
	Double saldo;
	String dataAbertura;
	
	boolean sacar(double saque) {
		if(saldo>=saque) {
			saldo=saldo-saque;
			System.out.println("o saque realizado, ficou"+saldo);
		    return true;
		}else {
		    System.out.println("saque nao realizado");
			return false;
		}
	}
	
	void depositar(double deposito) {
		saldo=saldo+deposito;
		System.out.println("o saldo ficou"+saldo);
		
	}
	/*double calcularRendimento() {
		return saldo*0.01;
	}*/

}
