//Classe Turma
package modelo;
import java.util.ArrayList;

public class Turma {
  private int codigo;
  private String disciplina;
  //private Aluno alunos[];
  ArrayList <Aluno> alunos;
  private static int cont=0;
  
  public Turma (int codigo, String disciplina){
     this.codigo=codigo;
     this.disciplina=disciplina;
     // alunos=new Aluno[10];
     alunos=new ArrayList<>();
  } 
  
  public void matricular(Aluno a){
     // if (cont<alunos.size()){
    	  //alunos[cont]=a;
           cont++;
          alunos.add(a);
         // cont++;
     // }
  }
  
  public String imprimir(){
      return getCodigo()+ " - " + getDisciplina() + "\nAlunos matriculados: " + getQtdAluno();
  }
  
  public int getQtdAluno(){
      return cont;
  }
   
  public int getCodigo() {
      return codigo;
  }

  public void setCodigo(int codigo) {
      this.codigo = codigo;
  }

  public String getDisciplina() {
      return disciplina;
  }

  public void setDisciplina(String disciplina) {
      this.disciplina = disciplina;
  }

  public ArrayList<Aluno> getAlunos() {
	  return alunos;
  }

  public void setAlunos(ArrayList <Aluno> alunos) {
      this.alunos=alunos;
  }
 // Na classe Turma, implemente o método desmatricular, que recebe como parâmetro um aluno e o remove da lista de alunos.
  public void desmatricular(Aluno aluno) {
	  for(int i=0;i<alunos.size();i++) {
		  if(alunos.get(i).equals(aluno)) {
			  alunos.remove(i);
		  }
	  }
  }
}
