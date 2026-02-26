package pratica8;
/*Implemente a classe principal AppBanco para testar as classes Conta, ContaCorrente e ContaPoupanca. 
Crie um lista de contas, cada referência na lista deve ser relativa a um dos objetos de cada classe concreta da hierarquia. Invoque os métodos de 
débito e crédito de cada objeto apontado
Percorra a lista e determine em tempo de execução qual é o tipo de cada conta:
Se for uma poupança, calcule seu rendimento através do método CalcularRendimento();
Se for uma conta corrente, apenas mostre seu saldo.*/
import java.util.ArrayList;
public class AppBanco { 
    public static void main(String[] args) {
        ArrayList <Conta> contas = new ArrayList<>();
        //contas criadas para testar se o instanceof e metodos funcionam
        ContaPoupanca poupanca=new ContaPoupanca("Emerson",100.0,1.2);//exemplo de uma pessoa pobre :)
        contas.add(poupanca);
        ContaCorrente corrente=new ContaCorrente("Isis",1000000,10);//exemplo de uma pessoa rica :(
        contas.add(corrente);
       // Conta conta=new Conta("Emerson137",900000000);// eu de uma realidade alternativa em que sou rico :)
       // contas.add(conta);
        
        //percorrer lista
        // nao precisava do instanceof,mas depois de fazer esse trabalho todo eu fiquei com preguica de mudar kkkkkkkkk
        for(Conta c:contas) {
        	if(c instanceof ContaPoupanca) {
         		//System.out.println(c.getTipo()); 
        		//System.out.println(((ContaPoupanca)c).getTipo());
        		System.out.println(((ContaPoupanca)c).consultarSaldo()); //o saldo  antes e 100
        		System.out.println(((ContaPoupanca)c).CalcularRendimento());// o saldo vai ser 120
        		((ContaPoupanca)c).depositar(50); 
        		System.out.println(((ContaPoupanca)c).consultarSaldo());//o saldo vai ser 150 pq nao considera o rendimento
        		System.out.println(((ContaPoupanca)c).sacar(10)); //o saldo vai ser 140
        		System.out.println(((ContaPoupanca)c).consultarSaldo());
        		System.out.println(((ContaPoupanca)c).recuperarDadosConta1());
        	}
        	if(c instanceof ContaCorrente) {
        		//System.out.println(c.getTipo());
        		System.out.println(((ContaCorrente) c).consultarSaldo()); //o saldo vai ser 1.000.000
        		((ContaCorrente) c).depositar(40000);//(troco de pao de Isis)
        		System.out.println(((ContaCorrente) c).consultarSaldo());//o saldo vai ser 1.039.990(por causa da taxa de 10)
        		System.out.println(((ContaCorrente) c).sacar(80000));//o saldo vai ser  959 980
        		System.out.println(((ContaCorrente) c).consultarSaldo());
        		System.out.println(((ContaCorrente) c).recuperarDadosConta1());
        	}
        	
        }

    }
}

