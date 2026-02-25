//classe teste para testar metodos e atributos da classe conta
package pratica2;

public class TestarConta {
	public static void main(String[]args) {
		Conta c1=new Conta();
		
		c1.titular="Joao";
		c1.saldo=50.0;
		c1.sacar(5);
		c1.depositar(400);
		
		Conta c2 =new Conta();
		
		c2.titular="Carla";
		c2.saldo=500.0;
		c2.sacar(1000);
		
		
		
	}

}
