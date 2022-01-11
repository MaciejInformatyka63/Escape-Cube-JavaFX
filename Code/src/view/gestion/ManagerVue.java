package view.gestion;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.awt.event.KeyEvent;

public class ManagerVue {
    Stage stage;
    public ManagerVue(Stage ps) throws Exception{
        stage=ps;
        Parent r = FXMLLoader.load(getClass().getResource("/FXML/FenetreStart.fxml"));
        Scene s = new Scene(r);
        stage.setScene(s);
        stage.show();
    }

    public void quitterJeu(){
        stage.close();
    }
}
