package launch;

import javafx.application.Application;
import javafx.stage.Stage;
import modele.gestion.Manager;
import view.gestion.ManagerVue;

/**
 * Classe qui lance l'Application
 */
public class Launcher extends Application {

    /**
     * Permet de lancer l'application en instanciant un ManagerVue
     * @param ps Stage de l'application
     * @throws Exception car appel au FXMLLoader
     */
    public void start(Stage ps) throws Exception {

        new ManagerVue(ps, new Manager());
    }
}
