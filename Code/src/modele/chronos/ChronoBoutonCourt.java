package modele.chronos;

import static java.lang.Thread.sleep;

public class ChronoBoutonCourt extends ChronoBoutonLongueur{
    @Override
    public void run() {
        try {
            sleep(60000);
            beep();
        }
        catch (Exception e) {

        }
    }
}
