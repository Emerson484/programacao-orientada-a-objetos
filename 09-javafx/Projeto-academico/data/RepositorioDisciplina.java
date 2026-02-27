/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package data;

import java.io.ObjectInputStream;
import java.io.FileInputStream;
import java.util.ArrayList;
import java.io.EOFException;
import java.util.List;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.File;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import model.Disciplina;
import model.IDisciplina;

/**
 *
 * @author Emerson
 */
public class RepositorioDisciplina implements IDisciplina
{
    private final String arquivo="disciplina.ser";
    private final String arquivoIdDisciplina = "idDisciplina.dat";
    
    @Override
    public List<Disciplina> getAllDisciplinas(){
        ArrayList <Disciplina> disciplinas = new ArrayList();
        FileInputStream fluxo;
        ObjectInputStream lerObj = null;
        try {
            
            fluxo = new FileInputStream(arquivo);
            while (fluxo.available()>0){
                lerObj = new ObjectInputStream (fluxo);
                Disciplina d = (Disciplina) lerObj.readObject();
                disciplinas.add(d);
            }
            lerObj.close();
       }catch (EOFException e){
            System.out.println("Erro de fim de arquivo");
       }
        catch (FileNotFoundException e){
            System.out.println ("Erro ao listar as disciplinas");
        }
        catch (IOException | ClassNotFoundException ex){
            System.out.println("Erro ao listar as disciplinas");
        }
        return disciplinas;
    }

    @Override
    public void createDisciplina(Disciplina disciplina) {
        FileOutputStream fluxo;
        disciplina.setId(controleIdDisciplina());
        try {
            fluxo = new FileOutputStream(arquivo, true);
            ObjectOutputStream gravarObj = new ObjectOutputStream(fluxo);
            gravarObj.writeObject(disciplina);
            gravarObj.close();
        } catch (FileNotFoundException e){
            System.out.println("Erro no cadastro da disciplina");
        }
        catch (IOException ex){
            System.out.println ("Erro no cadastro da disciplina");
        }
    }

    @Override
    public Disciplina readDisciplina(int id) {
       ArrayList <Disciplina> disciplinas = (ArrayList<Disciplina>) getAllDisciplinas();
       Disciplina d=null;
         for (int i=0; i<disciplinas.size(); i++){
             if (id == disciplinas.get(i).getId()){
                 d=disciplinas.get(i);
                 break;
             }
         }
         return d;
    }

    @Override
    public void updateDisciplina(Disciplina disciplina) {
        deleteDisciplina(disciplina);
        createDisciplina(disciplina);
        /*ArrayList <Disciplina> disciplinas;
        boolean achou=false;
        disciplinas = (ArrayList<Disciplina>) getAllDisciplinas();
        Disciplina d = readDisciplina(disciplina.getId());
        for (int i=0; i<disciplinas.size(); i++){
             if (disciplina.getId()== disciplinas.get(i).getId()){
                 disciplinas.remove(i);
                 disciplinas.add(disciplina);
                 atualizarArquivoDisciplina(disciplinas);
                 achou=true;
                 break;
             }
        }
        if (!achou){
             throw new RuntimeException("Disciplina não encontrado");
        } */
    }

    @Override
    public void deleteDisciplina(Disciplina disciplina) {
         ArrayList <Disciplina> disciplinas;
         boolean achou=false;
         disciplinas = (ArrayList<Disciplina>) getAllDisciplinas();
         for (int i=0; i<disciplinas.size(); i++){
             if (disciplina.getId()== disciplinas.get(i).getId()){
                 disciplinas.remove(i);
                 atualizarArquivoDisciplina(disciplinas);
                 achou=true;
                 break;
             }
         }
        if (!achou){
             throw new RuntimeException("Disciplina não encontrada");
        }
    }
    
    private void atualizarArquivoDisciplina(ArrayList<Disciplina> disciplinas){
        FileOutputStream fluxo;
            try {
                fluxo = new FileOutputStream(arquivo);
                ObjectOutputStream gravarObj = null;
                for (int i=0; i<disciplinas.size(); i++){
                    gravarObj = new ObjectOutputStream(fluxo);
                    gravarObj.writeObject(disciplinas.get(i));
                }
                gravarObj.close();
            }
            catch (FileNotFoundException e){
                System.out.println("Erro ao atualizar a disciplina");
            }
            catch (IOException ex){
                System.out.println ("Erro ao atualizar a disciplina");
            }
    }
    
    private int controleIdDisciplina(){
        File arqId = new File(arquivoIdDisciplina);
        int id =0;
        try { 
            if (!arqId.exists()){
                arqId.createNewFile();
                atualizaId (id,arqId);
            }
            FileInputStream fis = new FileInputStream (arqId);
            DataInputStream dis = new DataInputStream (fis);
            id = dis.readInt();
            dis.close();
            atualizaId (id,arqId);
        } catch (FileNotFoundException ex) {
            System.out.println ("Erro id disciplina não encontrado");
        } catch (IOException ex) {
            System.out.println ("Erro arquivo idDisciplina");
        }   
        return id;
    }
    
    private void atualizaId(int id, File arqId) throws FileNotFoundException, IOException{
        FileOutputStream fos = new FileOutputStream (arqId);
        DataOutputStream dos = new DataOutputStream (fos);
        id++;
        dos.writeInt(id);
        dos.close();
    }
}
