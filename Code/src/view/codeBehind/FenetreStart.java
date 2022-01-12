package view.codeBehind;

import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import launch.Launcher;
import view.gestion.ManagerVue;

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
    public void initialize() {
        boutonQuitter.setOnMouseClicked(quitter());
    }
}
