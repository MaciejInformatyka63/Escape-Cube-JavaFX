package modele.chronos;

import static java.lang.Thread.sleep;

public class ChronoBoutonLent extends ChronoBoutonLongueur{
    /**
     * Notifie les Observateurs après que 180 secondes sont passées
     */
    @Override
    public void run() {
        try {
            sleep(180000);
            beep();
        }
        catch (Exception e){
            return;
        }
    }
}
