package visao;

import controle.ControleTurma;
//Leia o código da classe AppAcademico abaixo. Coloque a classe mo pacote visao e complete as funcionalidades.

import javax.swing.JOptionPane;

import controle.ControleAluno;
import modelo.Aluno;


public class AppAcademico 
{
    public static String menu(){
        return "Digite:\n" +
                "1 - Cadastrar aluno \n" +
                "2 - Cadastrar turma \n"+
                "3 - Matricular aluno \n"+
                "4 - Listar alunos da turma\n"+
                "5 - Desmatricular aluno \n"+
                "6 - Listar alunos \n"+
                "7 - Listar turmas \n"+
                "0 - para sair";
    }

    public static void main(String[] args) {
        ControleTurma controleTurma = new ControleTurma();
        ControleAluno controleAluno = new ControleAluno();
        int op;
        
        op = Integer.parseInt(JOptionPane.showInputDialog(menu()));
        while (op!=0){
            switch(op){
                case 1: {//cadastrar aluno
                    String nome = JOptionPane.showInputDialog("Digite o nome do aluno");
                    controleAluno.cadastrarAluno(nome);
                    JOptionPane.showMessageDialog(null,"Aluno cadastrado com sucesso");
                    break;
                }
                case 2:{//cadastrar turma
                    int codigo = Integer.parseInt(JOptionPane.showInputDialog("Digite o código da turma"));
                    String disciplina = JOptionPane.showInputDialog("Digite o nome da disciplina");
                    controleTurma.cadastrarTurma(codigo, disciplina);
                    JOptionPane.showMessageDialog(null,"Turma cadastrada com sucesso");
                    break;
                }
                case 3:{//matricular aluno
                    int codigo = Integer.parseInt(JOptionPane.showInputDialog("Digite o código da turma"));
                    String nome = JOptionPane.showInputDialog("Digite o nome do aluno");
                    Aluno aluno = controleAluno.pesquisarAluno(nome);
                    controleTurma.matricularAluno(aluno, codigo);
                     JOptionPane.showMessageDialog(null, aluno.imprimir() + "\n matriculado com sucesso");
                    break;
                }
                case 4:{//listar alunos da turma
                	//pede o codigo e o usa no metodo para listar alunos
                    int codigo=Integer.parseInt(JOptionPane.showInputDialog("digite o codigo da turma"));
                    JOptionPane.showMessageDialog(null,controleTurma.listarAlunos(codigo));
                    break;
                }
                case 5: {//desmatricular
                	// pedir o codigo da turma
                	 int codigo=Integer.parseInt(JOptionPane.showInputDialog("digite o codigo da turma"));
                	 
                     // verificar se o aluno existe e armazenar na variavel
                     String nomeAluno=JOptionPane.showInputDialog("digite o nome do aluno");
                     Aluno aluno1=controleAluno.pesquisarAluno(nomeAluno);
                     
                     //desmatricular aluno
                     controleTurma.desmatricularAluno(aluno1, codigo);
                    break;
                }
                case 6: {//Listar alunos
                    JOptionPane.showMessageDialog(null,controleAluno.listarAlunos());
                    break;
                }
                case 7: {//Listar turmas
                	JOptionPane.showMessageDialog(null,controleTurma.listarTurmas());
                    break;
                }
                case 0:{
                	JOptionPane.showMessageDialog(null,"saindo!");
                }
            }
            op = Integer.parseInt(JOptionPane.showInputDialog(menu()));
        }
    }
}
