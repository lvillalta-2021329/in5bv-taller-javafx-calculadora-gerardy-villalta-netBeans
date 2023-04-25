

/**
 *
 * @author Gerardy Villalta
 */
package org.in5bv.gerardyvillalta.system;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import org.in5bv.gerardyvillalta.bean.view.*;

public class Principal extends Application {
    public static void main (String [] args) {
        launch(args);
        
    }
    
    @Override
    public void start(Stage stage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("../view/FXMLCalculadoraView.fxml"));
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    
}
