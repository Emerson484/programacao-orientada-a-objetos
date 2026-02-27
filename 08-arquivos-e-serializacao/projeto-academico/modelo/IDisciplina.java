package pratica_12.modelo;

//IDisciplina
import java.util.List;
public interface IDisciplina
{
  public List<Disciplina> getAllDisciplinas(); //retorna uma lista contendo as disciplinas existentes
  public void createDisciplina (Disciplina disciplina); //salva a disciplina
  public Disciplina readDisciplina(int id); //pesquisa uma disciplina pelo código e a retorna
  public void updateDisciplina(List <Disciplina> disciplinas); //atualiza os dados de uma disciplina e salva
  public void deleteDisciplina(int id ); // remove a disciplina
}

