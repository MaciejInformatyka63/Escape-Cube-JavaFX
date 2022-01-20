package modele.chronos;

import javafx.application.Platform;
import modele.gestion.Deplaceur;

import static java.lang.Thread.sleep;

/**
 * Classe Concrétisant le fait de rafraîchir les objets à l'écran, et ce, à 60FPS
 */
public class ChronoRefreshConcret extends ChronoRefresh{

    /**
     * Notifie tous les Deplaceurs
     */
    @Override
    public void beep() {
        for (Deplaceur d: super.getLesDeplaceurs()) {
            Platform.runLater(d::deplacer);
        }
    }

    /**
     * Notifie tous les Deplaceurs toutes les 1/60 secondes
     */
    public void run() {
        while(true) {
            try {
                sleep(1000 / 60);
                beep();
            } catch (InterruptedException e) {
                return;
            }
        }
    }
}
