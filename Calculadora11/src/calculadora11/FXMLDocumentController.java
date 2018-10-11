/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadora11;

import com.jfoenix.controls.JFXButton;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.Separator;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;


/**
 *
 * @author 02262101205
 */
public class FXMLDocumentController implements Initializable {
    
    private Label label;
    @FXML
    private Button btnsoma;
    @FXML
    private Button btndivisao;
    @FXML
    private Button btnsub;
    @FXML
    private Button btnmulti;
    @FXML
    private Label resultado;
    @FXML
    private TextField txt1;
    @FXML
    private TextField txt2;
    @FXML
    private Button btnlimpar;
    @FXML
    private Label histo;
    @FXML
    private Label calc;
    @FXML
    private Label copy;
    @FXML
    private ImageView img;
    @FXML
    private Pane painel;
    @FXML
    private Separator sepa;
    @FXML
    private Separator sepa2;
    @FXML
    private JFXButton btnmostrar;
    @FXML
    private Label historic;
 
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void soma(ActionEvent event) {
        
    Double num1 = Double.valueOf(Double.parseDouble(txt1.getText()));
    Double num2 = Double.valueOf(Double.parseDouble(txt2.getText()));
    
    Double somar = Double.valueOf(num1.doubleValue() + num2.doubleValue());
    



    resultado.setText(somar + "");
    }

    @FXML
    private void dividir(ActionEvent event) {
    Double num1 = Double.valueOf(Double.parseDouble(txt1.getText()));
    Double num2 = Double.valueOf(Double.parseDouble(txt2.getText()));
    

    Double dividir = Double.valueOf(num1.doubleValue() / num2.doubleValue());
    
    resultado.setText(dividir + "");

    }

    @FXML
    private void subtrair(ActionEvent event) {
    Double num1 = Double.valueOf(Double.parseDouble(txt1.getText()));
    Double num2 = Double.valueOf(Double.parseDouble(txt2.getText()));
    
    Double sub = Double.valueOf(num1.doubleValue() - num2.doubleValue());
    
    resultado.setText(sub + "");

    }

    @FXML
    private void multiplicar(ActionEvent event) {
    Double num1 = Double.valueOf(Double.parseDouble(txt1.getText()));
    Double num2 = Double.valueOf(Double.parseDouble(txt2.getText()));
    


    Double multiplicar = Double.valueOf(num1.doubleValue() * num2.doubleValue());
    

    resultado.setText(multiplicar + "");

    }

    @FXML
    private void limpar(ActionEvent event) {
    txt1.setText("");
    txt2.setText("");
    resultado.setText("");
    historic.setText("");
  }

    @FXML
    private void mostrar(ActionEvent event) {
        

        
    }

    }
    

