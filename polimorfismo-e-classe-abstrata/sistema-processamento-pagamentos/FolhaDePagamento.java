package pratica8.sistemaDePagamentos;
/*Crie uma classe FolhaPagamento que processa os pagamentos de uma lista de funcionários (ArrayList de Funcionario).


*/
import java.util.ArrayList;

public class FolhaPagamento {
	ArrayList <Funcionario> funcionarios=new ArrayList<>(); //lista de funcionarios
    
	//construtor
	FolhaPagamento(){
		
	}
	//A FolhaPagamento deve ter um método para adicionar funcionários
	public void adicionarFuncionarioFixo(String nome, int id, double salarioBase,double bonus) {
		FuncionarioFixo NovoFuncionario=new FuncionarioFixo(nome,id,salarioBase,bonus);
		funcionarios.add(NovoFuncionario);	
	}
	
	public void adicionarFreelancer(String nome, int id, double salarioBase,double horasTrabalhadas) {
		Freelancer NovoFuncionario=new Freelancer(nome,id,salarioBase,horasTrabalhadas);
		funcionarios.add(NovoFuncionario);
    }
	
	public void adicionarEstagiario(String nome, int id, double salarioBase) {
		Estagiario NovoFuncionario=new Estagiario(nome,id,salarioBase);
		funcionarios.add(NovoFuncionario);
	}
	
	//Um método para processar pagamento que retorna uma string contendo o nome, o id e o valor do pagamento de todos os funcionários	
	public String ProcessarPagamento() {
		String info="";
		for(Funcionario f:funcionarios) {
			info+=f.toString()+"\n"+ //criei um toString para cada tipo de funcionario e imprimi
			      "salario total :"+f.calcularPagamento(); //criei um calcularPagamento para cada tipo de funcionario e imprimi
		
			info+="\n"+"\n";// saltar linha pra quando for imprimir info do proximo funcionario
				  
		}
		return info;
	}
	/*Crie um método adicional detalharPagamento() que retorne uma descrição detalhada do cálculo de pagamento para cada funcionário, e 
	 * modifique a classe FolhaPagamento para exibir essas informações.
	 */
     public String detalharPagamento() {
    	 String info="";
    	 for(Funcionario f:funcionarios){
        	 info+=f.toString()+"\n";
        	 info+="calculo de pagamento:"+"\n";
        	 
        	 /* verifica qual a instancia do objeto Funcionario f para forcar a conversao, para que a classe mae tenha acesso aos atributos da classe
        	 filha(bonus e horas trabalhadas)*/
    		 if(f instanceof FuncionarioFixo) { 
 				info+="total:"+f.calcularPagamento()+" ,salario base: "+f.getSalarioBase()+" + bonus de :"+((FuncionarioFixo)f).bonus+"\n"+"\n";;

 			}
 			if(f instanceof Freelancer) { 
 				info+="total:"+f.calcularPagamento()+" ,salario base: "+f.getSalarioBase()+" vezes horas trabalhadas: "+((Freelancer)f).horasTrabalhadas+"\n"+"\n";;
    	    }
 			if(f instanceof Estagiario) { 
 				info+="  valor da bolsa :"+f.getSalarioBase()+"\n"+"\n";;
 		    }		
         }
    	 return info;
     }
}
