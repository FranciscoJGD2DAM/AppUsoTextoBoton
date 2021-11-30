/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package appusotextoboton;

import campotextoboton.CampoTextoBoton;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author frang
 */
public class UsoTextoBotonController implements Initializable{

    private CampoTextoBoton campotextoboton;
    
    @FXML
    private CampoTextoBoton campoTextoArriba;
    @FXML
    private CampoTextoBoton campoTextoAbajo;
    @FXML
    private Label lblTexto;
   

    @FXML
    private void onActionArriba(ActionEvent event) {
        lblTexto.setText("Se ha guardado: "+ campoTextoArriba.getText());
    }

    @FXML
    private void onActinoAbajo(ActionEvent event) {
        lblTexto.setText("Se ha guardado: "+ campoTextoAbajo.getText());
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        campoTextoArriba.setTextBoton("Guardar");
        campoTextoAbajo.setTextBoton("Guardar");
    }
    
    
}
