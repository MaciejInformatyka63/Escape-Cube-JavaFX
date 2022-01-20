package modele.gestion;

import modele.chronos.ChronoBoutonCourt;
import modele.chronos.ChronoBoutonLongueur;

public class ObsTempsBoutonConcret extends ObsTempsBouton{
    @Override
    public void updatebouton() {
        ChronoBoutonLongueur cbl=new ChronoBoutonCourt();
        Thread t = new Thread(cbl);
        t.start();
        cbl.attacher(this);
    }

    @Override
    public void updatechrono() {
        boutonSujet.setAppuye(false);
    }
}
