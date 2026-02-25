package pratica2;

/*2 - Considere uma conta bancária. Uma classe Conta deve ter o nome do titular ( String ), o número ( int ),
 *  a agência ( String ), o saldo ( double ) e uma data de abertura ( String ). Além disso, ela deve saber
 *   fazer as seguintes ações: sacar, para retirar um valor do saldo; depositar, para adicionar um valor ao 
 *   saldo; calcular rendimento, para devolver o rendimento mensal dessa conta.
*/
/* - Vamos completar nossa classe conta bancária?
 * ⦁	Definir um construtor que não recebe parâmetro.
⦁	Definir um construtor que recebe como parâmetro o número da conta e nome do cliente
⦁	Definir um construtor que recebe como parâmetro o número da conta, o nome do cliente e o saldo da conta
⦁	Definir os métodos getters e setters necessários a classe Conta. É necessário criar setSaldo()?
⦁	Definir o método transferir - que recebe como parâmetro um conta e a quantia, então saca a quantia da conta
 (this) e deposita na outra conta.
⦁	Implementar o método imprimirConta que retorna uma string com os dados da Conta,Número,Cliente,Saldo:
⦁	Implementar o método ehIgual que recebe como parâmetro um outro objeto da classe conta, compara com a
 conta corrente e retorna:
true se os dados das contas forem iguais
false se os dados das contas forem diferentes 

 */

public class Conta {
    //Atributos
    private int numero;
    private String cliente;
    private double saldo;
    private String movimentacoes;
    
    //Construtores
    
    public Conta() {
    	this.numero=0;
    	this.cliente="";
    	this.saldo=0.0;
    	this.movimentacoes="extrato da conta:\n";
    }
    
     public Conta(int numero,String cliente) {
    	this.numero=numero;
    	this.cliente=cliente;
    	this.saldo=0.0;
    	this.movimentacoes="extrato da conta:\n";
    }
    
    public Conta(int numero,String cliente,double saldo) {
    	this.numero=numero;
    	this.cliente=cliente;
    	this.saldo=saldo;
    	this.movimentacoes="extrato da conta:\n";
    }
    
    //Métodos
    
    public String getCliente() {
    	return this.cliente;
    }
    
    public void setCliente(String cliente) {
    	this.cliente=cliente;
    }
    	
    
    public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public String getMovimentacoes() {
		return movimentacoes;
	}

	public void setMovimentacoes(String movimentacoes) {
		this.movimentacoes = movimentacoes;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
 /*Definir o método transferir - que recebe como parâmetro um conta e a quantia, então saca a quantia da conta
	 (this) e deposita na outra conta.*/
	
	public boolean transferir(Conta destino,double quantia) {
		if(this.sacar(quantia)) { // o this indica que e usado para se referir a conta origem
			destino.depositar(quantia);
			movimentacoes+="foi tranferido"+quantia+"para conta"+destino.numero+"\n";
			/*Em Java, você não precisa necessariamente escrever == true dentro de 
			um if quando a condição já é um valor booleano (verdadeiro ou falso).Se o valor dentro dos parênteses
			 já  for true, o if executa o código dentro do bloco.
             Se o valor dentro dos parênteses for false, o if ignora o código dentro do bloco.*/
			return true;
		}else {
			return false;
		}
/* quando criaemos o objeto conta1 ,vamos usar conta1.transferir(destino,100),nesse caso quem usa o metodo e a conta
 * de origem e os parametros sao da conta destino;		
 */
	}
	
	/*Implementar o método imprimirConta que retorna uma string com os dados da Conta:
		Número: 
		Cliente:
		Saldo:*/
	String imprimirConta() {
		String dados=" ";
		dados="o nome do cliente ="+cliente+"\n"+
				"o numero da conta ="+numero+"\n"+
				"o saldo e ="+saldo;
		return dados;
				
	}
	boolean sacar(double valor){
        boolean sacou=false;
        if (saldo >= valor){
            saldo = saldo - valor;
            movimentacoes+="saque de:"+valor+"\n";
            sacou=true;
        }
        return sacou;
    }

    

	void depositar(double valor){
        if ( valor>0 )
            saldo +=valor;
        movimentacoes+="deposito de:"+valor+"\n";
    } 
	/*Implementar o método ehIgual que recebe como parâmetro um outro objeto da classe conta, compara com a
	 conta corrente e retorna:
	true se os dados das contas forem iguais
	false se os dados das contas forem diferentes */
	boolean ehIgual(Conta Conta2) {
		if(this.numero==Conta2.numero&&
		   this.cliente.equals(Conta2.cliente)&& //em java == compara a referencia do objeto,nao o valor da string,
		   this.saldo==Conta2.saldo) { // por isso mesmo que tenham o mesmo texto vao sempre retornar flase pois sao
			return true; // objetos diferentes na memoria,por isso deve usar o metodo equals para comparar strings
		}else {
			return false;
		}
	}
/*⦁	Implemente o método extrato() que retorna uma String com toda a movimentação da conta (saques e depósitos). 
	⦁	Lembre de criar uma variável de instância (String) para guardar as movimentações e alterar os métodos 
	sacar e depositar para acrescentar uma linha na string com a operação realizada e o valor.
	⦁	Acrescente no main a opção de extrato.*/
    String extrato() {
    	return movimentacoes+"saldo :"+saldo;
    }
}




	
			
