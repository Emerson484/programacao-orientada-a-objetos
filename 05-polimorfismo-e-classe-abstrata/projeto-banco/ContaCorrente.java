package pratica8;
/* Crieaclasse ContaCorrente e façacom que ela seja filha da classe
 Conta. A classe ContaCorrente deve incluir um atributo que
 represente a taxa cobrada por cada transação de sacar/debitar, com getter,
 setter e construtor..*/



//classe
public class ContaCorrente extends Conta {
	//atributos
	private double taxaMovimentacao;
	
	//construtor
	ContaCorrente(String cliente,double saldo,double taxaMovimentacao){
		super(cliente,saldo);
		this.taxaMovimentacao=taxaMovimentacao;
	}
	
	//metodos get e set
	public double getTaxaMovimentacao() {
		return taxaMovimentacao;
	}
	public void setTaxaMovimentacao(double taxaMovimentacao) {
		this.taxaMovimentacao=taxaMovimentacao;
	}
   // Sobrescreva os métodos de saque e débito para descontar o valor de tal taxa a cada transação bem sucedida	
   @Override
   public void depositar(double valor) {
	   if(valor>0) {
		   super.setSaldo(super.getSaldo()+valor-taxaMovimentacao);//soma valor depositado ao saldo
		  // super.setSaldo(super.getSaldo()-valor*taxaMovimentacao); //calcula a taxa sobre o valor do saldo e subtrai do saldo
		   super.getHistorico().add("deposito de :"+valor+"taxa de: "+taxaMovimentacao);
	   }
   }
   @Override
   public boolean sacar(double valor) {
	   if(super.getSaldo()>=valor && super.getSaldo()>0) {
		   super.setSaldo(super.getSaldo()-valor-taxaMovimentacao);// nao pode += //primeiro desconta o valor sacado depois desconta o valor da taxa 
		  // super.setSaldo(super.getSaldo()-valor*taxaMovimentacao);//depois calcula a taxa sobre o valor sacado e subtrai do saldo
		   super.getHistorico().add("saque de :"+valor+"taxa de: "+taxaMovimentacao);
		   return true;
	   }else {
		   return false;
	   }
   }
   public String getTipo() {
	   return "conta corrente";
   }

}
