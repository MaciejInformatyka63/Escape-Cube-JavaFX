package view.gestion;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import modele.gestion.Manager;

import java.io.IOException;

/**
 * Classe gérant la cinématique de l'application
 */
public class ManagerVue {
    private static Stage stage;
    private static Manager m;

    /**
     * Constructeur de la classe ManagerVue
     * @param ps Stage de l'application
     * @param m Manager de l'application
     * @throws Exception Exception due à l'appel au FXMLLoader
     */
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

    /**
     * Getter de l'attribut m
     * @return attribut m
     */
    public static Manager getM(){
        return m;
    }

    /**
     * Setter de l'attribut stage
     * @return attribut stage
     */
    public static Stage getStage() {
        return stage;
    }

    /**
     * Méthode chargeant l'écran de fin du jeu
     */
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

    /**
     * Méthode qui permet de lancer un niveau en rechargeant la fenêtre avec les nouveaux éléments
     */
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
