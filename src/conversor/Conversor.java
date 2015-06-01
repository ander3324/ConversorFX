/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conversor;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;

/**
 *
 * @author ander
 */
public class Conversor extends Application {
    
    @Override
    public void start(Stage stage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("frmConversor.fxml"));
        
        Scene scene = new Scene(root);
        
        stage.setScene(scene);
        
        //Titulo de la ventana:
        stage.setTitle("Conversor JavaFX");
        
        //Tamaño fijo:
        stage.setResizable(false);
        
        //Obtener icono:
        stage.getIcons().add(new Image(Conversor.class.getResourceAsStream("conversor.png"))); 
        
        stage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
