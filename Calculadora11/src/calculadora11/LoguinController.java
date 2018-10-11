/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadora11;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXTextField;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author 02262101205
 */
public class LoguinController implements Initializable {

    @FXML
    private JFXTextField login;
    @FXML
    private JFXTextField senha;
    @FXML
    private Label user;
    @FXML
    private Label pass;
    @FXML
    private JFXButton btnlogar;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
        // TODO
    }    

    @FXML
    private void logar(ActionEvent event) throws IOException {
         abrirTela("/br/edu/ifro/view/login.fxml", "login", 523, 657);
    }
 
      private void abrirTela(String caminho, String titulo, int wigth, int height) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader();
        fxmlLoader.setLocation(getClass().getResource(caminho));
        Scene scene = new Scene(fxmlLoader.load(),wigth,height);
        Stage stage = new Stage();
        stage.setTitle(titulo);
        stage.setScene(scene);
        stage.show();  
    } 
}
