package modele.chronos;

import static java.lang.Thread.sleep;

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
