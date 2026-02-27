
package model;

/**
 *
 * @author Emerson
 */

import java.util.List;

public interface IDisciplina {
    public List<Disciplina> getAllDisciplinas();
    public void createDisciplina (Disciplina disciplina);
    public Disciplina readDisciplina(int id);
    public void updateDisciplina(Disciplina disciplina);
    public void deleteDisciplina(Disciplina disciplina);
}

