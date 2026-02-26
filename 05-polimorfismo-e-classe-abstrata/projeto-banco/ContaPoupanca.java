package pratica8;
//A classe Poupanca, filha de Conta, deve possuir um atributo relacionado à variação (rendimento), com métodos getter, setter e construtor. 


public class ContaPoupanca extends Conta {
	//atributo
	private double rendimento; //20%=1,2
	
	//construtor
	public ContaPoupanca(String cliente, double saldo,double rendimento){
		super(cliente,saldo);
		this.rendimento=rendimento;
	}
   //metodos get e set
	public double getRendimento() {
		return rendimento;
	}
	public void setRendimento(double rendimento) {
		this.rendimento=rendimento;
	}
	//Crie também um método CalcularRendimento(), que informa o valor do saldo multiplicado pela taxa de rendimento.
    public double  CalcularRendimento() {
    	return super.getSaldo()*rendimento;
    }
    public String getTipo() {
 	   return "conta poupanca";
    }
}
