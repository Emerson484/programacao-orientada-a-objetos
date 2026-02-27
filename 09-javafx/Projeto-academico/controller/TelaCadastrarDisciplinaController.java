
package controller;

import data.RepositorioDisciplina;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import model.Disciplina;

/**
 * FXML Controller class
 *
 * @author Emerson
 */
public class TelaCadastrarDisciplinaController implements Initializable {

    @FXML
    private TextField textFieldIdDisciplina;
    @FXML
    private TextField textFielNomeDisciplina;
    @FXML
    private TextField textFieldCargaHorariaDisciplina;
    @FXML
    private Button buttonCadastarDisciplina;
    @FXML
    private Button buttonCancelarDisciplina;
    @FXML
    private Label labelStatusCadastroDisciplina;
    
     private Stage stage;
    private Scene scene;
    private Parent root;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void handleCadastrarDisciplina() {
   // String idStr = textFieldIdDisciplina.getText();
    String nome = textFielNomeDisciplina.getText(); // Atenção: pode haver um erro de digitação aqui
    String chStr = textFieldCargaHorariaDisciplina.getText();

    try {
      //  int id = Integer.parseInt(idStr);
        int ch = Integer.parseInt(chStr);

        // Verifica se o nome não está vazio
        if (nome.trim().isEmpty()) {
            System.out.println("Erro: O nome da disciplina não pode ser vazio.");
            // O ideal aqui é mostrar um Alert para o usuário
            return; // Interrompe a execução
        }

        Disciplina disciplina = new Disciplina( nome, ch);
        RepositorioDisciplina rd = new RepositorioDisciplina();
        rd.createDisciplina(disciplina);

        System.out.println("Disciplina cadastrada com sucesso!");

    } catch (NumberFormatException e) {
        System.out.println("Erro: ID e Carga Horária devem ser números válidos.");
        // Aqui você deve mostrar um Alert para o usuário informando o erro.
    }
      System.out.println("disciplina cadastrada");
}
    @FXML
     public void handleCancelarCadastroDisciplina(ActionEvent event) throws IOException{
        Parent root = FXMLLoader.load (getClass().getResource("/fxml/telaDisciplina.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
    
}
