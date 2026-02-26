package pratica_11;

//O programa abaixo solicita o nome e o número de matrícula de alunos e guarda os dados em um arquivo texto.
 

//Classe EscreverArquivoAluno
import java.io.FileWriter;
import java.io.BufferedWriter;
import javax.swing.JOptionPane;
import java.io.IOException;
import java.io.File;

public class EscreverArquivoAluno
{
  public static void main(String[] args) {
      String nome;
      long matricula;
      File arquivo = new File("aluno.txt");
      FileWriter fw=null;
      BufferedWriter bw = null;
      try{
          fw = new FileWriter(arquivo,true);
          bw = new BufferedWriter(fw);
          int op=1;
          while (op !=0){
              nome = JOptionPane.showInputDialog("Digite o nome do aluno");
              matricula = Long.parseLong(JOptionPane.showInputDialog("Digite a matricula do aluno"));
              bw.write (nome);
              bw.write ("\t " + matricula );
              bw.newLine();
              op = Integer.parseInt(JOptionPane.showInputDialog("Deseja cadastrar outro aluno?\n 1 - sim \n 0 - não"));
          }
                  
      }catch (IOException e){
          JOptionPane.showMessageDialog(null,e.getMessage());
      } finally {
          try {
              if (bw!=null)
                  bw.close();
          } catch (IOException e){
              JOptionPane.showMessageDialog(null,e.getMessage());
          }
        }
      
      /*
      try( FileReader fr = new FileReader(arquivo) ){
  	    BufferedReader br = new BufferedReader(fr);
  	    while( br.ready() ){       // verifica se br tem algo pronto pra ler e retorna true ou false
  	        String linha = br.readLine();  //le a proxima linha do arquivo      
  	        System.out.println(linha);    
  	    }    
  	    br.close();
  	 }catch(IOException ex){    
  	    ex.printStackTrace();
     }*/
      
      
      
    }
  }
	


//Explique o que acontece nas linhas 26 a 32
/*o bloco finally sempre sera executado para poder fechar o bufferedReader caso seje diferente de nulo,ou seja caso ele exista (nao fazemos isso no 
  try porque caso ocorra a execao no try o codigo e interrompido e bw nao seria fechado),alem disso ha um catch pra capturar execao do tipo IOException
pra caso ocorra algo inesperado na entrada ou saida de dados*/

/*Execute novamente o código com outros dados de aluno. Verifique como ficou o arquivo, os antigos dados continuam no arquivo? 
os antigos dados nao continuam,eles foram sobrescritos
*/

/*Altere o construtor do FileWriter para permitir inserir dados no fim do arquivo (append), execute novamente o programa e verifique o arquivo.
  O que aconteceu? 
 os dados antigos continuaram e os novos dados foram adicionados a ultima linha
 */

