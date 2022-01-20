package modele.chronos;

import static java.lang.Thread.sleep;

public class ChronoBoutonCourt extends ChronoBoutonLongueur{

    /**
     * Notifie les Observateurs après que 15 secondes sont passées
     */
    @Override
    public void run() {
        try {
            sleep(15000);
            beep();
        }
        catch (Exception e) {
            return;
        }
    }
}
