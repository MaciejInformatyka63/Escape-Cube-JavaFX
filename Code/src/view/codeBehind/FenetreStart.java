package view.codeBehind;

import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;
import launch.Launcher;
import view.gestion.ManagerVue;

import java.io.IOException;

public class FenetreStart {

    @FXML
    Button boutonLancer;
    @FXML
    Button boutonExplications;
    @FXML
    Button boutonOptions;
    @FXML
    Button boutonQuitter;


    @FXML
    protected EventHandler quitter(){
        return null;
    }

    @FXML
    protected EventHandler lancer() {
        return new EventHandler() {
            @Override
            public void handle(Event event) {
                Stage stage = new Stage();
                Parent r = null;
                try {
                    r = FXMLLoader.load(getClass().getResource("FXML/Fenetre.fxml"));
                } catch (IOException e) {
                    e.printStackTrace();
                }
                Scene s = new Scene(r);
                stage.setScene(s);
                stage.show();
            }
        };
    }

    @FXML
    public void initialize() {
        boutonLancer.setOnMouseClicked(lancer());
        boutonQuitter.setOnMouseClicked(quitter());
    }
}
