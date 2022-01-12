package launch;

import javafx.application.Application;
import javafx.stage.Stage;
import modele.gestion.Manager;
import view.gestion.ManagerVue;

public class Launcher extends Application {
    private static Manager m;
    private static ManagerVue mv;

    @Override
    public void start(Stage ps) throws Exception {

        mv = new ManagerVue(ps, new Manager());
    }
}
