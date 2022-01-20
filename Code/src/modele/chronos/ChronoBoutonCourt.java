package modele.chronos;

import static java.lang.Thread.sleep;

/**
 * Classe permettant de garder un bouton appuyé pendant un court laps de temps
 */
public class ChronoBoutonCourt extends ChronoBoutonLongueur{

    /**
     * Notifie les Observateurs après que 18 secondes sont passées
     */
    @Override
    public void run() {
        try {
            sleep(18000);
            beep();
        }
        catch (Exception e) {
            return;
        }
    }
}
