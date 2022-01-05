package modele.chronos;

import static java.lang.Thread.sleep;

public class ChronoBoutonMoyen extends ChronoBoutonLongueur{
    @Override
    public void run() {
        try {
            sleep(120000);
            beep();
        }
        catch (Exception e){

        }
    }
}
