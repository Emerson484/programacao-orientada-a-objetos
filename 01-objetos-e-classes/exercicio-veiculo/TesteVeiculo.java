package pratica3;

public class testarVeiculo {
	public static void main (String[] args){
		Veiculo veiculo1=new Veiculo("vermelho","corolla");
		
		Veiculo veiculo2=veiculo1.Clone();
		
		System.out.println("objeto sem alteracoes");
		System.out.println(veiculo1);
		
		System.out.println("copia do objeto");
		System.out.println(veiculo2);
		
		veiculo1.setCor("azul");
		veiculo1.setModelo("toyota");
		
		System.out.println("objeto com alteracoes");
		System.out.println(veiculo1);
		
		System.out.println("copia do objeto(nao modifica)");
		System.out.println(veiculo2);
		
		
		
	}
}
