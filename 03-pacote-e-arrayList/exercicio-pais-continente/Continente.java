package excerciciosRevisao;
import java.util.ArrayList;
//Escreva em Java uma classe Continente. Um continente possui um nome e é composto por um conjunto de países. Forneça os membros de classe a seguir: 

public class Continente {
	private String nome;
	private ArrayList<Pais>paises=new ArrayList<>();
	//private Pais[] paises=new Pais[10];
	
	//Construtor que inicialize o nome do continente; 
	public Continente(String nome) {
		this.nome=nome;
	}
	
	//Um método que permita adicionar países aos continentes; 
	public void adicionarPaises(Pais novoPais) {
		paises.add(novoPais);
		
	}
	//Um método que retorne a dimensão total do continente; 
	public double calcularDimensaoTotal() {
		double total=0;
		for(Pais p:paises) {
			total+=p.calcularDensidadePopul();
		}
		return total;
	}
	//Um método que retorne a população total do continente; 
	public double calcularPopulacaoTotal() {
		long popTotal=0;
		for(Pais p:paises) {
			popTotal+=p.getPopulacao();
		}
		return popTotal;
	}
	//Um método que retorne a densidade populacional do continente; 
	public double calcularDensidadePop() {
		double densidadePop=0;
		for(Pais p:paises) {
			densidadePop+=p.calcularDensidadePopul();
		}
		return (double)densidadePop;
	}
	//Um método que retorne o país com maior população no continente; 
	public String calcularMaiorPopul() {
		String nomeMaiorPop="";
		long numMaiorPop=0;
		for(Pais p:paises) {
			if(p.getPopulacao()>numMaiorPop) { // compara a populacao de um pais com a a variavel que armaneza o pais com maior populacao
				nomeMaiorPop=p.getNome(); //se for verdadeiro nomeMaior recebe o nome
				numMaiorPop=p.getPopulacao(); // e numMaior recebe esse numero,atualizando o valor para fazer a proxima verificacao	
			}
		}
		return nomeMaiorPop;
	}
	/*public Pais calcularMaiorPop() {
		Pais PaisMaiorPop=null;
		long numMaiorPop=0;
		for(Pais p:paises) {
			if(p.getPopulacao()>numMaiorPop) { // compara a populacao de um pais com a a variavel que armaneza o pais com maior populacao
				PaisMaiorPop=p;//o objeto PaisMaiorPop recebe os valores do pais com maior populacao
				numMaiorPop=p.getPopulacao();// e numMaior recebe esse numero,atualizando o valor para fazer a proxima verificacao	
			}
		}
		return PaisMaiorPop;
	}*/
	//Um método que retorne o país com menor população no continente; 
	public Pais calcularMenorPop() {
		Pais PaisMenorPop=null;
		long numMenorPop=100000;
		for(Pais p:paises) {
			if(p.getPopulacao()<numMenorPop) { // compara a populacao de um pais com a a variavel que armaneza o pais com maior populacao
				PaisMenorPop=p;//o objeto PaisMaiorPop recebe os valores do pais com maior populacao
				numMenorPop=p.getPopulacao();// e numMaior recebe esse numero,atualizando o valor para fazer a proxima verificacao	
			}
		}
		return PaisMenorPop;
	}
	//Um método que retorne o país de maior dimensão territorial no continente; 
	public Pais calcularMaiorDimensao() {
		Pais PaisMaiorDimensao=null;
		long numMaiorDimensao=0;
		for(Pais p:paises) {
			if(p.getDimensao()>numMaiorDimensao) {
				PaisMaiorDimensao=p;
				numMaiorDimensao=p.getDimensao();
			}
		}
		return PaisMaiorDimensao;
	}
	//Um método que retorne o país de menor dimensão territorial no continente*/
	public Pais calcularMenorDimensao() {
		Pais PaisMenorDimensao=null;
		long numMenorDimensao=100000;
		for(Pais p:paises) {
			if(p.getDimensao()<numMenorDimensao) {
				PaisMenorDimensao=p;
				numMenorDimensao=p.getDimensao();
			}
		}
		return PaisMenorDimensao;
	}

}
