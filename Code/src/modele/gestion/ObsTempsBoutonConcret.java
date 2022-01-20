package modele.gestion;

import modele.chronos.ChronoBoutonCourt;
import modele.chronos.ChronoBoutonLongueur;

/**
 * Classe concrète observant un bouton et un chrono
 */
public class ObsTempsBoutonConcret extends ObsTempsBouton{
    /**
     * Méthode lançant un chrono une fois le bouton appuyé et qui attache cet observateur au chrono
     */
    @Override
    public void updatebouton() {
        ChronoBoutonLongueur cbl=new ChronoBoutonCourt();
        Thread t = new Thread(cbl);
        t.start();
        cbl.attacher(this);
    }

    /**
     * Méthode qui désenclanche le bouton lorsque le chrono arrive à la fin
     */
    @Override
    public void updatechrono() {
        boutonSujet.setAppuye(false);
    }
}
