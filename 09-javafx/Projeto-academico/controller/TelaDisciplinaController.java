
package controller;

import data.RepositorioDisciplina;
import java.io.IOException;
import java.net.URL;
import java.util.List;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.image.ImageView;
import javafx.scene.input.KeyEvent;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;
import model.Disciplina;

/**
 * FXML Controller class
 *
 * @author Emerson
 */
public class TelaDisciplinaController implements Initializable {
    private Stage stage;
    private Scene scene;
    private Parent root;
    @FXML
    private Button remover;
    @FXML
    private ImageView imageCadastrarDisciplina;
    @FXML
    private ImageView imageAtualizarDisciplina;
    @FXML
    private TextField textFieldPesquisarDisciplina;
    @FXML
    private TableView<Disciplina> tableDisciplina;
    @FXML
    private TableColumn<Disciplina,String> tableColumnDisciplinaId;
    @FXML
    private TableColumn<Disciplina,String> tableColumnDisciplinaNome;
    @FXML
    private TableColumn<Disciplina,String> tableColumnDisciplinaCh;
    @FXML
    private Button botaoPesquisar;
    @FXML
    private Button criacao;
    
    @FXML
    public void remocao(){
        System.out.println("dddddd");
    }
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        tableColumnDisciplinaId.setCellValueFactory(new PropertyValueFactory<>("id"));
        tableColumnDisciplinaNome.setCellValueFactory(new PropertyValueFactory<>("nome"));
        tableColumnDisciplinaCh.setCellValueFactory(new PropertyValueFactory<>("ch"));
    }    

    @FXML
    private void handleAbrirFormularioCadastrarDisciplina(MouseEvent event) {
    }

    @FXML
    private void handleAbrirFormularioAtualizarDisciplina(MouseEvent event) {
    }

    @FXML
    private void handlePesquisarDisciplina(KeyEvent event) {
    }

    @FXML
    private void pesquisar() {
        RepositorioDisciplina Repositorio= new RepositorioDisciplina();
        List<Disciplina> lista =Repositorio.getAllDisciplinas();
        tableDisciplina.getItems().setAll(lista);
    }

    @FXML
    public void criar(ActionEvent event) throws IOException,RuntimeException{
        Parent root = FXMLLoader.load (getClass().getResource("/fxml/telaCadastrarDisciplina.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
    
}
