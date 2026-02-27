
package controller;

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
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author Emerson
 */
public class telaInicialAcademicosController implements Initializable {
    @FXML
    private Button botaoAluno;
    
    @FXML
    private Button botaoDisciplina;
     
    @FXML
    private Button botaoTurma;
    
    private Stage stage;
    private Scene scene;
    private Parent root;
    
    public void ONActionAluno(){
        System.out.println("aluno");
    }
    public void ONActionDisciplina(ActionEvent event) throws IOException{
        Parent root = FXMLLoader.load (getClass().getResource("/fxml/telaDisciplina.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
    
    public void ONActionTurma(ActionEvent event) throws IOException,RuntimeException{
        Parent root = FXMLLoader.load (getClass().getResource("/fxml/telaCadastrarDisciplina.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
