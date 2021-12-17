package modele.chronos;

import static java.lang.Thread.sleep;

public class ChronoBoutonLent extends ChronoBoutonLongueur{
    @Override
    public void run() {
        try {
            sleep(180000);
        }
        catch (Exception e){

        }
    }
}
