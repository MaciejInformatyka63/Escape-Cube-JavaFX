package view.gestion;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import modele.gestion.Manager;


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
        stage.show();
    }

    public static Manager getM(){
        return m;
    }

    public static Stage getStage() {
        return stage;
    }

    public static void chargerFin(){
        Object o = new Object();
        try {
            Parent r = FXMLLoader.load(m.getClass().getResource("/FXML/FenetreFin.fxml"));
            stage.setScene(new Scene(r));
            stage.show();
        } catch (Exception e) {
            e.printStackTrace();
            return;
        }
    }

    public static void quitterJeu(){
        stage.close();
    }
}
