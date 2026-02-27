
package academico;

import java.io.IOException;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 *
 * @author Emerson
 */
public class AppAcademico extends Application {
    
    @Override
   public void start(Stage stage) {
        try {
            Parent root = FXMLLoader.load (getClass().getResource("/fxml/telaInicialAcademico.fxml"));
            Scene scene = new Scene(root);
            
            stage.setTitle("Acadêmico");
            stage.setScene(scene);
            stage.setResizable(false);
            stage.show();
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }


    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
