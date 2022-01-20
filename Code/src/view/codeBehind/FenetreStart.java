package view.codeBehind;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import view.gestion.ManagerVue;

public class FenetreStart {

    @FXML
    Button boutonLancer;

    @FXML
    Button boutonQuitter;


    @FXML
    private EventHandler quitter(){
        return event -> ManagerVue.getStage().close();
    }

    private EventHandler lancer() {
        return (EventHandler<ActionEvent>) event -> ManagerVue.getM().startNiveau();
    }

    @FXML
    private void getExplications() {
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Explications");
        //alert.setContentText("Déplacement : Z Q S D \n\n Appuyer sur les boutons : Espace");
        alert.setContentText("But : Sortir du labyrinthe en appuyant sur tous les boutons !"+
                "\n\n"+"Commandes :" +
                "\n"+"-  Haut : Z" +
                "\n"+"-  Bas : S" +
                "\n"+"-  Gauche : Q" +
                "\n"+"-  Droite : D" +
                "\n"+"-  Appuyer sur les boutons : ESPACE");

        alert.showAndWait();
    }

    @FXML
    public void initialize() {
        boutonLancer.setOnAction(lancer());
        boutonQuitter.setOnMouseClicked(quitter());
    }
}
