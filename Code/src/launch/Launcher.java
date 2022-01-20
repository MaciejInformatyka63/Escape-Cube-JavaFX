package launch;

import javafx.application.Application;
import javafx.stage.Stage;
import modele.gestion.Manager;
import view.gestion.ManagerVue;

public class Launcher extends Application {

    @Override
    public void start(Stage ps) throws Exception {

        ManagerVue mv = new ManagerVue(ps, new Manager());
    }
}
