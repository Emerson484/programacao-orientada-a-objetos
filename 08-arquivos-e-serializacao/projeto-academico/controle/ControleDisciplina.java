package pratica_12.controle;

//ControleDisciplina
import java.util.ArrayList;
import java.util.List;

import pratica_12.dados.RepositorioDisciplina;
import pratica_12.modelo.Disciplina;
import pratica_12.modelo.IDisciplina;

public class ControleDisciplina
{
  IDisciplina repositorioDisciplina = new RepositorioDisciplina();
  
  public void cadastrarDisciplina (String nome, int id, int ch){
      Disciplina d = new Disciplina (nome, id, ch);
      repositorioDisciplina.createDisciplina(d);
      
  }
  
  public Disciplina pesquisarDisciplina (int id) {
      return repositorioDisciplina.readDisciplina(id) ;
  }
  
  public ArrayList<Disciplina> listarDisciplina() {
      return (ArrayList <Disciplina>)repositorioDisciplina.getAllDisciplinas();
  }
  
  public String imprimir(){
      String res="";
      ArrayList<Disciplina> disc = listarDisciplina();
      for (int i=0; i<disc.size(); i++){
          res += disc.get(i).imprimir() + "\n---------\n";
      }
      return res;
  }
  
  public void removerDisciplina (int id) {
      repositorioDisciplina.deleteDisciplina(id);
  }
  
  public void atualizarDisciplina (List <Disciplina> disciplinas){
      repositorioDisciplina.updateDisciplina(disciplinas);
  }

}

