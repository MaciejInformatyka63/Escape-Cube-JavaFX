package view.codeBehind;

import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.stage.Stage;
import modele.gestion.Manager;
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
        return event -> ManagerVue.getStage().close();
    }

    protected EventHandler lancer() {
        return new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                ManagerVue.getM().startNiveau();
                /*Stage stage = ManagerVue.getStage();
                Parent r = null;
                try {
                    r = FXMLLoader.load(getClass().getResource("/FXML/Fenetre.fxml"));
                } catch (IOException e) {
                    e.printStackTrace();
                }
                Scene s = new Scene(r);
                stage.setScene(s);
                stage.setTitle("Niveau "+ ManagerVue.getM().getIndiceNiveauEnCours());
                stage.show();*/
            }
        };
    }

    @FXML
    protected void getExplications(ActionEvent event) {
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Explications");
        alert.setContentText("cf. Contexte");

        alert.showAndWait();
    }

    @FXML
    public void initialize() {
        boutonLancer.setOnAction(lancer());
        boutonQuitter.setOnMouseClicked(quitter());
    }
}
