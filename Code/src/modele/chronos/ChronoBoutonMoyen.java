package modele.chronos;

import static java.lang.Thread.sleep;

/**
 *  * Classe permettant de garder un bouton appuyé pendant un laps de temps moyen
 */
public class ChronoBoutonMoyen extends ChronoBoutonLongueur{
    /**
     * Notifie les Observateurs après que 120 secondes sont passées
     */
    @Override
    public void run() {
        try {
            sleep(120000);
            beep();
        }
        catch (Exception e){
            return;
        }
    }
}
