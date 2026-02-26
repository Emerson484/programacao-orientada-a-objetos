package controle;
import java.util.ArrayList;
import modelo.Turma;
import modelo.Aluno;
//No pacote controle, criar uma classe ControleTurma que possui um atributo turmas do tipo ArrayList <Turma>.
public class ControleTurma {
	ArrayList <Turma> turmas=new ArrayList<>();

/* A classe ControleTurma deve conter 
 * métodos para:Cadastrar uma nova turma: recebe como parâmetro os dados da turma, instancia o objeto turma e o adiciona a lista;*/
	
	public void cadastrarTurma(int codigo,String disciplina) {
		Turma turma1=new Turma(codigo,disciplina); // cria o objeto turma com os parametros recebidos e adiciona a lista de turmas
		turmas.add(turma1);
	}
/*Pesquisar um turma através do código: recebe o código como parâmetro, verifica se alguma turma tem o código fornecido, se tiver devolve o 
 * objeto turma, caso contrário retorna nulo;
 */
    public Turma pesquisarTurma(int codigo) {
    	for(Turma t:turmas) {// percorre a lista turmas e se o codigo do elemento da lista que t assume for igual ao codigo do parametro retorna a
    		if(t.getCodigo()==codigo) { //turma
    			return t;
    		}
    	}
    	System.out.println("codigo nao encontrado");
    	return null;
    }
//Matricular um aluno em uma turma: recebe como parâmetro o aluno e o código da turma, encontra a turma e adiciona o aluno na turma.
      public void matricularAluno(Aluno alunoNovo,int codigo) {
    	  for(int i=0;i<turmas.size();i++) {
    		  if(turmas.get(i).getCodigo()==codigo) { //percorre a lista turmas e se o codigo dessa lista na posicao i for igual ao codigo do  			  
    			  turmas.get(i).matricular(alunoNovo);;//parametro o aluno e adicionado
    		  }
    	  }

      	 
      }
//Desmatricular um aluno de uma turma: recebe como parâmetro o aluno e o código da turma, encontra a turma e remover o aluno da turma.
       public void desmatricularAluno(Aluno alunoNovo,int codigo) {
    	   for(int i=0;i<turmas.size();i++) {
     		  if(turmas.get(i).getCodigo()==codigo) { //percorre a lista turmas e se o codigo dessa lista na posicao i for igual ao codigo do parametro		  
     			  turmas.get(i).desmatricular(alunoNovo);// entao usa o metodo desmatricular
     			  
     		  }
     	  }

       	 
       }
//Listar os alunos de uma turma: recebe com parâmetro o código da turma e retorna uma string contendo os nomes e matriculas dos alunos da turma.
        public String listarAlunos(int codigo) {
        	String listaAlunos="";
        	 for(int i=0;i<turmas.size();i++) {
        		  if(turmas.get(i).getCodigo()==codigo) { // percorre a lista turmas e verifica se o codigo existe
        		    for(Aluno a:turmas.get(i).getAlunos()) { //percorre a lista alunos pelo metodo get da classe Turma, e cada objeto aluno(a) vai usar o 
        		    	listaAlunos+=a.imprimir();// 	metodo imprimir que retorna nome e matricula e  a variavel listaAlunos vai receber esses valores
        		    }
        		  }
        	  }
        	 return listaAlunos;
        }
//Listar as turmas cadastradas: retorna uma string com os dados de todas as turmas cadastradas.
        public String listarTurmas() {
        	String listarTurmas="";
        	 for(int i=0;i<turmas.size();i++) { // percorre a lista
        		 listarTurmas+=turmas.get(i).imprimir()+"\n"; //a cada iteracao adiciona o codigo e a disciplina da turma a variavel ListaAlunos
        	     //pelometodo imprimir	  
        	  }
        	 return listarTurmas;
        }
    
}
