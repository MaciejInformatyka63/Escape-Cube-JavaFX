package modele.gestion;

import modele.chronos.ChronoBoutonCourt;

public class ObsTempsBoutonConcret extends ObsTempsBouton{
    @Override
    public void updatebouton() {
        Thread t = new Thread(new ChronoBoutonCourt());
        t.start();
    }

    @Override
    public void updatechrono() {
        boutonSujet.setAppuye(false);
    }
}
