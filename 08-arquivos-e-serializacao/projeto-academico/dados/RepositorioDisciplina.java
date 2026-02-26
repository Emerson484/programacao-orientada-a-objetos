package pratica_12.dados;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

import pratica_12.modelo.Disciplina;
import pratica_12.modelo.IDisciplina;

//RepositorioDisciplina
public class RepositorioDisciplina implements IDisciplina
{
  String arquivo="disciplina.ser";
  
  @Override
  public List<Disciplina> getAllDisciplinas(){
	  ArrayList <Disciplina> disciplinas= new ArrayList <>();
	  ObjectInputStream ois = null;
	  try(FileInputStream fis = new FileInputStream(arquivo) ){
		  ois = new ObjectInputStream(fis);		 
	       while(true) { /*o while itera indefinidadamente ate o readObject lanca a execao EOFExption(EndOFFileException,ou seja quando nao tiver 
	    	   mais nada pra ler),ao cair nessa excecao usamos break pra para o loop e seguir com o codigo*/
	    	   try {
	    		    
		            Disciplina disciplina = (Disciplina)ois.readObject(); //ler o aquivo binario e converte pra disciplina
		            disciplinas.add(disciplina);//adiciona a lista de disciplinas          
	    	   }
	    	  catch(EOFException e) {
		         
		          break; //ao cair nessa excecao para o while true
	      	  }    	 
		 }
	     ois.close(); 
	  }
	  catch(FileNotFoundException e) { //tratar excecoes
  		  System.out.println(e.getMessage());
  	  }
	  catch(IOException | ClassNotFoundException ex) {
	      System.out.println(ex.getMessage());
	  }
       return disciplinas;	       
	  }
	  
  @Override
  public void createDisciplina (Disciplina disciplina){
	  List <Disciplina> disciplinas;
	  disciplinas=getAllDisciplinas();
	  disciplinas.add(disciplina);
	  updateDisciplina(disciplinas);
		  
  }
  @Override
  public Disciplina readDisciplina(int id){
	  List <Disciplina> disciplinas;
	  disciplinas=getAllDisciplinas(); // disciplinas recebe todas as listas que o getAllDisciplinas retorna
	  for(Disciplina d:disciplinas) { //percorre lista de disciplinas
		  if(d.getId()==id) {  //se encontrar retorna o objeto
			  return d;		
		  }
	  }
	  return null; //senao encontrar retorna nulo
	  
  }
  @Override
  public void updateDisciplina(List <Disciplina> disciplinas){
	  try(FileOutputStream fos = new FileOutputStream (arquivo)){
		  ObjectOutputStream oos= new ObjectOutputStream(fos);
		  for(Disciplina d:disciplinas) {
			  oos.writeObject(d);
		  }
		  oos.close();
		
		  
	  }catch(IOException e) {
		  System.out.println(e.getMessage());
		  
	  }
  }
  @Override
  public void deleteDisciplina(int id ) {
	  List <Disciplina> disciplinas=getAllDisciplinas();
	  boolean removeu=false;
	  for(Disciplina d:disciplinas) {
		  if(d.getId()==id) {
			  disciplinas.remove(d);
			  removeu = true;
			  break;
		  }
	  }
	  if(removeu) {
		  updateDisciplina(disciplinas);
		 
	  }else {
		  throw new RuntimeException("disciplina não encontrada");
	  }
  }



}
