package pratica_10.atividade1;

//Conta
public class Conta
{
  private static int cont=0;
  private int numero;
  private double saldo;
  
  public Conta (){
      this.numero=cont++;
      this.saldo=0;
  }

  public Conta (int numero, double saldo){
      this.numero=cont++;
      this.saldo=saldo;
  }
  
  /*12 - Reescreva o método sacar da classe Conta para garantir que não serão aceitos valores negativo, nem  saque acima do saldo. Utilize a exceção
  IllegalArgumentException . Lembre de enviar uma mensagem que esteja de acordo com o problema (Valor inválido, saldo insuficiente).*/

  public void sacar(double valor) {
      if (valor <= saldo){
    	  throw new IllegalArgumentException("valor de saque maior que o saldo ou saldo negativo");
      }
      if(valor<0) {
    	  throw new IllegalArgumentException("valor de saque negativo!");
      }
      saldo -= valor; //o saldo so vai ser atualizado caso nao ocorra nehuma excecao
  }
  
  //11 - Reescreva o método depositar da classe Conta para lançar a exceção 
  public void depositar(double valor){
      if (valor >0){
          saldo += valor;
      } else{
          throw new IllegalArgumentException("Valor de depósito inválido");
      }

  }    
  public int getNumero() {
      return numero;
  }

  /*public void setNumero(int numero) {
      this.numero = numero;
  }*/

  public double getSaldo() {
      return saldo;
  }
  
  @Override
  public String toString(){
      return "Numero: " + numero + 
              "\nSaldo: " + saldo;
  }
}
