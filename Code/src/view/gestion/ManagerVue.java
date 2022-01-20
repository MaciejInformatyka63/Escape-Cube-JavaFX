package view.gestion;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import modele.gestion.Manager;

import java.io.IOException;


public class ManagerVue {
    private static Stage stage;
    private static Manager m;

    public ManagerVue(Stage ps, Manager m) throws Exception{
        stage=ps;
        this.m=m;
        Parent r = FXMLLoader.load(getClass().getResource("/FXML/FenetreStart.fxml"));
        Scene s = new Scene(r);
        s.getStylesheets().add(getClass().getResource("/CSS/FenetreStartStyle.css").toExternalForm());
        stage.setScene(s);
        stage.setTitle("Menu");
        stage.show();
    }

    public static Manager getM(){
        return m;
    }

    public static Stage getStage() {
        return stage;
    }

    public static void chargerFin(){
        try {
            Parent r = FXMLLoader.load(m.getClass().getResource("/FXML/FenetreFin.fxml"));
            Scene s = new Scene(r);
            s.getStylesheets().add(m.getClass().getResource("/CSS/FenetreStartStyle.css").toExternalForm());
            stage.setScene(s);
            stage.setTitle("Fin du jeu");
            stage.show();
        } catch (Exception e) {
            e.printStackTrace();
            return;
        }
    }

    public static void quitterJeu(){
        stage.close();
    }

    public static void lancerNiveau() {
        Parent r;
        try {
             r = FXMLLoader.load(m.getClass().getResource("/FXML/Fenetre.fxml"));
        } catch (IOException e) {
            e.printStackTrace();
            return;
        }
        Scene s = new Scene(r);
        stage.setScene(s);
        stage.setTitle("Niveau "+ (ManagerVue.getM().getIndiceNiveauEnCours()+1) );
        stage.show();
    }
}
