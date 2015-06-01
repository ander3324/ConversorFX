/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conversor;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyEvent;

/**
 *
 * @author ander
 */
public class frmConversorController implements Initializable {
    
    @FXML
    private TextField txfC;
    @FXML
    private TextField txfF;
    @FXML
    private Button btnConvertir;
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
       
    }    

    @FXML
    private void limpiar_KeyPressed(KeyEvent event) {
        if(txfC.isFocused() && !txfF.getText().isEmpty())
            txfF.clear();
        else if(txfF.isFocused() && !txfC.getText().isEmpty())
            txfC.clear();
    }

    @FXML
    private void convertir_Action(ActionEvent event) {
        Temperatura t = new Temperatura();
        
        if(!txfC.getText().isEmpty()){
            t.setTemp(Float.parseFloat(txfC.getText()));
            txfF.setText(String.valueOf(t.convertir_C_a_F()));
        }
        else if(!txfF.getText().isEmpty()){
            t.setTemp(Float.parseFloat(txfF.getText()));
            txfC.setText(String.valueOf(t.convertir_F_a_C()));
        }
    }
    
}
