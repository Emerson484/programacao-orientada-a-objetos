package pratica7;
/*Uma subclasse da classe Conta para representar uma conta corrente de um cliente especial (ContaEspecial). 
 */
public class ContaEspecial extends Conta {

	//construtor
	public ContaEspecial(String titular){
		super(titular);
	
	}
	//Escrever o método sacar: Clientes especiais pagam taxas de operação  de apenas 0,1% do valor sacado.
	//@override
	public void sacar(double valor) {
	super.setSaldo(super.getSaldo()-valor);//subtrai o valor sacado do saldo do cliente
	super.setSaldo(super.getSaldo()-valor*0.001); // calculei a taxa de operacao e subtrai do saldo do cliente
	}

}
