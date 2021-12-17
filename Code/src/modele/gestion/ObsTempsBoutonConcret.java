package modele.gestion;

public class ObsTempsBoutonConcret extends ObsTempsBouton{
    @Override
    public void updatebouton() {

    }

    @Override
    public void updatechrono() {
        boutonSujet.setAppuyé(false);
    }
}
