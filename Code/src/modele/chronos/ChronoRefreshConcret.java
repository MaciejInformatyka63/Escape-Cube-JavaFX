package modele.chronos;

import javafx.application.Platform;
import modele.gestion.Deplaceur;

import static java.lang.Thread.sleep;

public class ChronoRefreshConcret extends ChronoRefresh{
    @Override
    public void beep() {
        for (Deplaceur d: super.getLesDeplaceurs()) {
            Platform.runLater(d::deplacer);
        }
    }

    public void run() {
        while(true) {
            try {
                sleep(1000 / 60);
                beep();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
