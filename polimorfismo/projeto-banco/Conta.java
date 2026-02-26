package pratica8;

//Classe Conta
import java.util.ArrayList;
public abstract class Conta {
    // atributos
  private int numeroConta;
  private String cliente;
  private double saldo;
  private ArrayList <String> historico;
  private static int identificador;
  
  //Construtores
  public Conta (){
     numeroConta = ++identificador;
     historico = new ArrayList<>();
  }
  
  public Conta(String cliente){
      numeroConta = ++identificador;
      this.cliente=cliente;
      saldo = 0.0;
      historico = new ArrayList<>();
  }
  public Conta (String cliente, double saldo){
      numeroConta=++identificador; 
      this.cliente = cliente;
      this.saldo = saldo;   
      historico = new ArrayList<>();
  }
  
  // métodos
 
  public int getNumeroConta() {
      return numeroConta;
  }

  public ArrayList<String> getHistorico() {
	return historico;
}

public void setHistorico(ArrayList<String> historico) {
	this.historico = historico;
}

public String getCliente() {
      return cliente;
  }
  
  public void setCliente(String c){
      this.cliente = c;
  }

  public double getSaldo() {
      return saldo;
  }

  public void setSaldo(double saldo) {
      this.saldo = saldo;
  }
  
  public void depositar (double valor){
      if (valor > 0){
          setSaldo(getSaldo() + valor);
          historico.add("\nDepositou R$ "+valor);
      }
  }
  public boolean sacar(double valor) {
      if (getSaldo() >= valor && valor > 0){
          setSaldo(getSaldo() - valor);
          historico.add("\nSacou R$ "+valor);
          return true;
      }
      return false;
  }
  public double consultarSaldo() {
      return getSaldo();
  }
  
 
  public String mostrarHistorico(){
      String s = "";
      for(int i=0; i < historico.size(); i++)
          s = s + historico.get(i) + "\n";
      return s;
  }
  //Crie o método recuperarDadosConta na classe Conta para devolver os seguintes dados da conta: número e saldo.
  public String recuperarDadosConta() {
		  return "saldo:"+saldo+"\n"+
	             "numero da conta:"+numeroConta;
  }


/*Para saber o tipo da conta, crie o método getTipo em cada uma das classes (Conta, ContaCorrente e Poupanca) fazendo com que a classe Conta 
 * retorne a string “Conta”,  ContaCorrente devolva a string "Conta Corrente" e a ContaPoupança devolva a string "Conta Poupança":
 */
   public abstract String getTipo();
   /*7 Transforme a classe Conta em uma classe abstrata. O que é uma classe abstrata? Para que serve uma 
    classe abstrata? è uma classe que nao pode ser instanciada,porem as classes filhas dela podem.Uma classe abstrata serve quando queremos que
    as classes filhas tenham um determinado comportamento,onde nao especifiamos o comportamento e as classes filhas que devem determinar e pra isso
     precisamos inserir a palavra abstract no metodo da classe mae
     
    8 Comente o método getTipo() da ContaPoupanca , dessa forma ele herdará o método diretamente de Conta. Transforme o método getTipo() da classe
      Conta em abstrato. O que aconteceu? Qual é o problema com a classe ContaPoupanca? 
      Tanto a classe Conta como Conta poupanca vao dar erro pois a classe Conta poupanca deve implementar o metodo abstrato herdado de Conta,pois ao
      tornar o getTipo da classe mae abstrato as filhas devem criar seu proprio getTipo
    */
    /*  10 Para que ter o método getTipo na classe Conta se ele não faz nada? O que acontece se simplesmente apagarmos esse método da classe Conta 
     * e deixarmos o método getTipo nas filhas?
     * esse getTipo abstrato serve pra "obrigarmos" as classes filhas a implementar seu proprio getTipo e tambem serve pra ser herdado pelas filhas,
     * caso ele nao exista,vai dar erro ao menos que facamos o casting pra usar o metodo,entao ele serve pra ser usado sem fazer o casting    */
    
    /*11 Posso chamar um método abstrato de dentro de um outro método da própria classe abstrata? Por exemplo, crie o o seguinte método na classe 
     * Conta
     * pode sim,desde que a classe filha um getTipo
     */
	public String recuperarDadosConta1(){
		return "Numero: " + getNumeroConta() + 
		                "\nSaldo: " + getSaldo()+
		 				  "\nTipo: " + this.getTipo();
	}

}
